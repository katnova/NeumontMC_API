package Controllers;

public class Zeitsterung {
    /**
     * Take a long in ms and convert it to a Days:Hours:Minutes:Seconds string.
     *
     * @param millis Milliseconds to convert to format.
     * @return String with formatted human readable time.
     */
    public String convertMillisToStdDHMSFormat(long millis) {
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        return days + ":" + (hours % 24) + ":" + (minutes % 60) + ":" + (seconds % 60);
    }
}
