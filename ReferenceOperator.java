import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ReferenceOperator {
    public static void main(String[] args) {
        List<String>profesores=getList("simon","Juan","Pacho");
        profesores.forEach(System.out::println);
    }
    public static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}
