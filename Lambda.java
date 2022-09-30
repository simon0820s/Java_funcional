import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        List<String> cursos=ReferenceOperator.getList("Java","Funcional");
        cursos.forEach(curso-> System.out.println(curso));
        usarZero(()->2);
        UsarPredicado(text->text.isEmpty());
        UsarBifunction((x,y) -> x*y);
        UsarBifunction((x,y)->{
            System.out.println("x+y="+(x+y));
            return (x+y);
        });
        usarNada(()->{
            System.out.println("Hi Bro");
        });
    }
    static void usarZero(ZeroArgumentos zeroArgumentos){
    }
    static void UsarPredicado(Predicate<String>predicado){

    }
    static void UsarBifunction(BiFunction<Integer,Integer,Integer> Operacion){

    }
    static void usarNada(Nada nada){

    }
    @FunctionalInterface
    interface ZeroArgumentos{
        int get();
    }
    @FunctionalInterface
    interface Nada{
        void nada();
    }
}
