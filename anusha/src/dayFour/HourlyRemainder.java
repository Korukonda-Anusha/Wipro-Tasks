package dayFour;
import java.util.Timer;
import java.util.TimerTask;

public class HourlyRemainder {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Reminder: 1 hour passed!");
            }
        };

        // 1 hour = 3600000 milliseconds
        timer.scheduleAtFixedRate(task, 0, 3600000);

        System.out.println("Reminder set for every 1 hour...");
    }
}

