import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//implement runnable
public class Main implements ActionListener{

        public static void main(String[] args) {

        JFrame f = new JFrame(); //creating instance of JFrame

        JLabel timer = new JLabel("00 : 00");
        timer.setBounds(170, 50, 200, 90);
        timer.setFont(new Font("Calibri", Font.PLAIN, 59));

        JLabel timer_txt = new JLabel("Choose study time");
        timer_txt.setBounds(195, 170, 150, 60);

        JButton timer_15 = new JButton("15");
        timer_15.setBounds(40, 220, 100, 60);
        timer_15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.setText("15 : 00");
                timer.setForeground(Color.GREEN);
                //--------------
                PTimer pt = new PTimer(f, 15, 00);
            }
        });

        JButton timer_20 = new JButton("20");
        timer_20.setBounds(200, 220, 100, 60);
        timer_20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.setText("20 : 00");
                timer.setForeground(Color.GREEN);
            }
        });

        JButton timer_25 = new JButton("25");
        timer_25.setBounds(350, 220, 100, 60);
        timer_25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.setText("25 : 00");
                timer.setForeground(Color.GREEN);
            }
        });

        JLabel break_txt = new JLabel("Choose break time");
        break_txt.setBounds(195, 370, 150, 60);

        JButton break_5 = new JButton("5");
        break_5.setBounds(40, 420, 100, 60);
        break_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.setText("05 : 00");
                timer.setForeground(Color.RED);
            }
        });

        JButton break_15 = new JButton("15");
        break_15.setBounds(200, 420, 100, 60);
        break_15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.setText("15 : 00");
                timer.setForeground(Color.RED);
            }
        });

        JButton break_30 = new JButton("30");
        break_30.setBounds(350, 420, 100, 60);
        break_30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.setText("30 : 00");
                timer.setForeground(Color.RED);
            }
        });

/*
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Clock clock = new Clock(f);
                clock.start();
            }
        });
*/
        f.add(timer);

        f.add(timer_txt);
        f.add(timer_15);
        f.add(timer_20);
        f.add(timer_25);

        f.add(break_txt);
        f.add(break_5);
        f.add(break_15);
        f.add(break_30);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Ayub Pomodoro timer");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
