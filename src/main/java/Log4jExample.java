import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.sql.SQLException;

public class Log4jExample {

    /* Get actual class name to be printed on */
    final static Logger log = LoggerFactory.getLogger(Log4jExample.class.getName());

    public static void main(String[] args)throws IOException, SQLException {
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
        log.trace("Trace message");
        log.info("Info message");
        log.debug("Debug message");
        log.warn("Warn message");
        log.error("Error message");
    }
}
