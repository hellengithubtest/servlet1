package servlets;

import java.util.TimerTask;

public class ScheduledTask extends TimerTask {
    private String text = "hello world ";
    public ScheduledTask(String string) {
        this.text.concat(string);
    }
    @Override
    public void run() {
        System.out.println(text);
    }
}
