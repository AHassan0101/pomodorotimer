import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PTimer extends JFrame {
    public static final int N = 60;

    int m =  0;
    int s = 0;
    JTextField t = new JTextField(m + " : " + s);
    public PTimer(JFrame f, int mins, int seconds){
        this.setTime(mins, seconds);
        JTextField t = new JTextField(m + " : " + s);
        t.setBounds(170, 50, 200, 90);
        t.setFont(new Font("Calibri", Font.PLAIN, 59));
        this.setVisible(true);
        f.add(t);
    }

    public void setTime(int m, int s) {
        this.m = m;
        this.s = s;
    }

    private class ClockListener implements ActionListener {

        private int minutes;
        private int seconds;

        private String minute;
        private String second;

        @Override
        public void actionPerformed(ActionEvent e) {
            NumberFormat formatter = new DecimalFormat("00");
            if (seconds == N) {
                //change made
                seconds = m;
                minutes--;
            }

            if (minutes == N) {
                minutes = s;

            }
            minute = formatter.format(minutes);
            second = formatter.format(seconds);
            t.setText(String.valueOf( minute + ":" + second));
            //----------------
            seconds--;
        }

    }
}

