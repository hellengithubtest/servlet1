package servlets;

import java.util.TimerTask;

public class ScheduledTask extends TimerTask {
    private String text = "hello world";

    public void setText(String text) {
        String before = this.text;
        this.text = before.concat(text);
    }
    @Override
    public void run() {
        System.out.println(text);
    }
}
