import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class CalculateYears {
    public static void main(String[] args) {
        Function<Integer,String>addCeros= x-> x<10? "0"+x:String.valueOf(x);

        TriFunction<Integer,Integer,Integer,LocalDate> parseDate=
                (year,month,day)->LocalDate.parse
                (year+"-"
                +addCeros.apply(month)+"-"+addCeros.apply(day));

        TriFunction<Integer,Integer,Integer,Integer> calculateAge=
            (day,month,year)->Period.between(parseDate.apply(day,month,year),
            LocalDate.now()).getYears();

        System.out.println(calculateAge.apply(2005,8,20));
    }
    @FunctionalInterface
    interface TriFunction<T,U,V,R>{
        R apply(T t, U u, V v);
    }
}