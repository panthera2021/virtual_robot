package android.util;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Log {
    public static int i(String tag, String msg) {
        Logger logger = java.util.logging.Logger.getLogger(tag);
        LogRecord logRecord = new LogRecord(Level.INFO, msg);
        logRecord.setSourceClassName(tag);
        logger.log(logRecord);
        return 0;
    }

    public static int w(String tag, String msg) {
        Logger logger = java.util.logging.Logger.getLogger(tag);
        LogRecord logRecord = new LogRecord(Level.WARNING, msg);
        logRecord.setSourceClassName(tag);
        logger.log(logRecord);
        return 0;
    }
}
