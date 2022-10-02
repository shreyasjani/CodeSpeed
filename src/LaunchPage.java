import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.black;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("CodeSpeed");
    JButton button = new JButton("Start");
    JButton crbutton = new JButton("Credits");
    LaunchPage() {
        //Title
        label.setBounds(300,100,300,100);
        label.setOpaque(true);
        label.setFont(new Font(null,Font.PLAIN,32));
        label.setBackground(Color.GREEN);
        frame.add(label);
        //Start button
        frame.add(button);
        button.setVisible(true);
        button.setFocusable(false);
        button.setBounds(300,400,150,100);
        button.addActionListener(this);
        //Frame
        frame.setTitle("CodeSpeed");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setBackground(black);
        frame.setVisible(true);
        //Credits Page
        crbutton.setVisible(true);
        crbutton.setFocusable(false);
        crbutton.setBounds(300,600,150,100);
        crbutton.addActionListener(this);
        frame.add(crbutton);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button) {
            frame.dispose();
            LanguageSelect lang= new LanguageSelect();
        }
        if(e.getSource()==crbutton) {
            frame.dispose();
            Crpage cr= new Crpage();
        }
    }
}
