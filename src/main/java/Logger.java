import java.time.Instant;

public class Logger {

    private static Logger logger = null;
    private static int i = 0;

    private Logger() {
    }

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void info(String logString) {
        System.out.println("[" + Instant.now() + " " + i++ + "] INFO: " + logString);
    }
}
