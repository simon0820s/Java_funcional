import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArguments {
    private boolean isHelp;

    public boolean isHelp() {
        return isHelp;
    }
}
class CLIArgumentsUtils{

    static void showHelp(CLIArguments arguments){

        Consumer<CLIArguments> consumerHelper=CLIArguments ->{
            if(CLIArguments.isHelp()){
                System.out.println("El manuel ha sido solicitado");
            }
        };
        consumerHelper.accept(arguments);
    }
    static  CLIArguments generateCLI(){
        Supplier<CLIArguments> generator=()->new CLIArguments();
        return generator.get();
    }
}
