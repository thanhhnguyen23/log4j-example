import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass {
    private static Logger log = LoggerFactory.getLogger(MyClass.class);

    public static void doSomething() {
        log.info("a test message");
    }
}
