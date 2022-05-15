package threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javafx.application.Platform;
import javafx.scene.control.Label;
public class Clock extends Thread {
    private Label clock;
    private int zn;
    public Clock(Label clock, int zn) {
       // setDaemon(true);
        this.clock=clock;
        this.zn = zn;
    }

    @Override
    public void run() {
        boolean condition = true;
        while (condition) {
        	Date date = new Date();
        	DateFormat df = new SimpleDateFormat("HH:mm:ss");
        	
        	if(zn == 1) {
        		df.setTimeZone(TimeZone.getTimeZone("Europe/London"));
        	} else if (zn == 2) {
            	df.setTimeZone(TimeZone.getTimeZone("Europe/Kiev"));
        	} else if (zn == 3) {
            	df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

        	} else if (zn == 4) {
            	df.setTimeZone(TimeZone.getTimeZone("Europe/Madrid"));

        	} else if (zn == 5) {
            	df.setTimeZone(TimeZone.getTimeZone("America/Bogota"));

        	} else if (zn == 6) {
            	df.setTimeZone(TimeZone.getTimeZone("America/Anchorage"));//alaska

        	} else if(zn == 7) {
            	df.setTimeZone(TimeZone.getTimeZone("America/Denver"));

        	}

            Platform.runLater(()->{
                clock.setText(df.format(date));
            }

            );
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
