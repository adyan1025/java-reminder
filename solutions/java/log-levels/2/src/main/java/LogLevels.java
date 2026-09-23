public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split("]: ");
        return arr[1].strip();
    }

    public static String logLevel(String logLine) {
        int openBracketIndex = logLine.indexOf("[");
        int closedBracketIndex = logLine.indexOf("]");
        return logLine.substring(openBracketIndex + 1, closedBracketIndex).toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        return message + " (" + logLevel + ")";
    }
}
