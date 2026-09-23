public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split("]: ");
        return arr[1].strip();
    }

    public static String logLevel(String logLine) {
        if (logLine.toLowerCase().contains("info")) {
            return "info";
        }
        else if (logLine.toLowerCase().contains("warning")) {
            return "warning";
        }
        else if (logLine.toLowerCase().contains("error")) {
            return "error";
        }
        else {
            return "";
        }
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        return message + " (" + logLevel + ")";
        
    }
}
