import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Clock extends JFrame {


    private static final int N = 60;
    private static final String stop = "Stop";
    private static final String start = "Start";
    private final ClockListener cl = new ClockListener();
    private final Timer t = new Timer(1000, cl);
    private final JTextField tf = new JTextField(8);

    public Clock() {
        t.setInitialDelay(0);

        JPanel panel = new JPanel();
        tf.setHorizontalAlignment(JTextField.RIGHT);
        tf.setEditable(false);
        panel.add(tf);
        final JToggleButton b = new JToggleButton(stop);
        b.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (b.isSelected()) {
                    t.stop();
                    b.setText(start);
                } else {
                    t.start();
                    b.setText(stop);
                }
            }
        });
        panel.add(b);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setTitle("Timer");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void start() {
        t.start();
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
                seconds = 00;
                minutes++;
            }

            if (minutes == N) {
                minutes = 00;

            }
            minute = formatter.format(minutes);
            second = formatter.format(seconds);
            tf.setText(String.valueOf( minute + ":" + second));
            seconds++;
        }

    }
}
