
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        try {
            simulateProcess();
        } catch (Exception e) {
            logger.error("An unexpected error occurred: {}", e.getMessage());
        }

        logger.info("Application finished.");
    }

    private static void simulateProcess() {
        int value = 0;

        if (value == 0) {
            logger.warn("Value is zero. This might lead to division error.");
        }

        // This will cause ArithmeticException
        int result = 10 / value;
        logger.info("Result: {}", result);
    }
}
