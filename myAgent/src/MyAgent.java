import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

public class MyAgent {

    public  static   void premain(String agentops , Instrumentation inst){
        System.out.println("MyAgent.premain() was called.");
        inst.addTransformer(new MyTransformer());
    }
}
