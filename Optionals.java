import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        List<String>names=new LinkedList<>();
        if(names!=null){

        }
        Optional<List<String>>optionalNames=getOptionalNames();
        if (optionalNames.isPresent()){

        }
        optionalNames.ifPresent(namesValue->namesValue.forEach(System.out::println));
    }
    static List<String>getNames(){
        List<String>list=new LinkedList<>();

        return list;
    }
    static Optional<List<String>>getOptionalNames(){
        List<String>nameList=new LinkedList<>();
        return Optional.of(new LinkedList<>());
    }
}
