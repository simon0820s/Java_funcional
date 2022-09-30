import java.util.function.Function;

public class Compose{
    public static void main(String[] args) {
        Function<Integer,Integer>multiplicar = x->x*2;
        Function<Integer,Integer>addMulti=
                multiplicar.compose(y->{
                    System.out.println("Hi is composed");
                    return y+1;
                });
    }
}
