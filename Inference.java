import java.util.List;
import java.util.function.Function;

public class Inference {
    public static void main(String[] args) {
        Function<Integer,String>functionConverter=
                number->"al doble"+(number*2);

        List<String> alumnos=ReferenceOperator.getList("Pedro","Juan","teemo");
        alumnos.forEach(System.out::println);
    }
}
