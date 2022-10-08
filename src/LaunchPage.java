import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.black;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    JLabel label = new JLabel("CodeSpeed");
    JLabel bglabel = new JLabel(bg);
    JButton button = new JButton("Start");
    JButton opbutton = new JButton("Options");
    JButton crbutton = new JButton("Credits");

    LaunchPage() {
        //bg img
        //bglabel.setBounds(0,-5,800,800);
        //frame.add(bglabel);
        //Title
        label.setBounds(100,100,600,100);
        label.setOpaque(true);
        label.setFont(new Font(null,Font.PLAIN,32));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.GREEN);
        frame.add(label);
        //Start button
        frame.add(button);
        button.setVisible(true);
        button.setFocusable(false);
        button.setBounds(300,400,150,100);
        button.addActionListener(this);
        button.setBackground(Color.GREEN);
        //Frame
        frame.setTitle("CodeSpeed");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
        //Credits Page
        crbutton.setVisible(true);
        crbutton.setFocusable(false);
        crbutton.setBounds(300,500,150,100);
        crbutton.addActionListener(this);
        frame.add(crbutton);
        crbutton.setBackground(Color.GREEN);
        //Options Button
        opbutton.setVisible(true);
        opbutton.setFocusable(false);
        opbutton.setBounds(300,600,150,100);
        opbutton.addActionListener(this);
        frame.add(opbutton);
        opbutton.setBackground(Color.GREEN);

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
        if(e.getSource()==opbutton) {
            frame.dispose();
            Crpage cr = new Crpage();
        }
    }
}
