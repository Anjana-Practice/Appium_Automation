package utils;


import org.apache.log4j.Logger;
import listeners.LogListener;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.ThreadContext;

public class Log {

    private static Logger logger = Logger.getLogger(LogListener.class);

    public static void setTestCaseName(String testCaseName) {
        DOMConfigurator.configure("log4j.xml");
        ThreadContext.put("testCaseName", testCaseName);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

    public static void trace(String message) {
        logger.trace(message);
    }

    public static Logger getLogger() {
        return logger;
    }
}
