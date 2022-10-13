import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage implements ActionListener {
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    JLabel bglabel = new JLabel(bg);
    JButton stbutton = new JButton("Start");
    JLabel timelabel = new JLabel();
    JButton button = new JButton("Finish");
    JButton bbutton = new JButton("<--");
    int elapsedtime=0;
    int seconds=0;
    int minutes=0;
    int hours=0;
    boolean started =false;
    String seconds_string = String.format("%02d",seconds);
    String minutes_string = String.format("%02d",minutes);
    String hours_string = String.format("%02d",hours);
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedtime+=1000;
            hours=(elapsedtime/3600000);
            minutes=(elapsedtime/60000)%60;
            seconds=(elapsedtime/1000)%60;
            seconds_string = String.format("%02d",seconds);
            minutes_string = String.format("%02d",minutes);
            hours_string = String.format("%02d",hours);
            timelabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
        }
    });
    MainPage(){
        //bg img
        bglabel.setBounds(0,0,1600,900);
        frame.add(bglabel);
        //Frame
        frame.setTitle("CodeSpeed");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setSize(1600, 900);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
        //Finish
        bglabel.add(button);
        button.setVisible(true);
        button.setFocusable(false);
        button.setBounds(1300,650,200,100);
        button.addActionListener(this);
        button.setBackground(Color.GREEN);
        //Back
        bglabel.add(bbutton);
        bbutton.setVisible(true);
        bbutton.setFocusable(false);
        bbutton.setBounds(10,10,50,30);
        bbutton.addActionListener(this);
        bbutton.setBackground(Color.GREEN);
        //Timer
        timelabel.setOpaque(true);
        timelabel.setHorizontalAlignment(JTextField.CENTER);
        timelabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
        timelabel.setBounds(1200,50,200,100);
        timelabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timelabel.setBorder(BorderFactory.createBevelBorder(1));
        bglabel.add(timelabel);
        stbutton.setBounds(1000,650,200,100);
        stbutton.setFocusable(false);
        stbutton.addActionListener(this);
        bglabel.add(stbutton);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button) {
            frame.dispose();
            StatsPage st= new StatsPage();
        }
        if (e.getSource() == bbutton) {
            frame.dispose();
            DifficultySelect d= new DifficultySelect();
        }
        if(e.getSource()==stbutton) {
            timer.start();
        }
    }

}
