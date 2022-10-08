import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class DifficultySelect implements ActionListener {
    JFrame frame = new JFrame();
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    JButton bbutton = new JButton("<--");
    JButton ebutton = new JButton("Easy");
    JButton mbutton = new JButton("Medium");
    JButton hbutton = new JButton("Hard");

    JLabel label = new JLabel("Difficulty Select");
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    JLabel bglabel = new JLabel(bg);
    DifficultySelect() {
        //bg img
        bglabel.setBounds(0,-5,1600,900);
        frame.add(bglabel);
        //Title
        label.setBounds(500,100,600,100);
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        label.setHorizontalAlignment(JLabel.CENTER);
        //Frame
        frame.setTitle("CodeSpeed");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.setSize(1600, 900);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.getContentPane().setBackground(Color.BLACK);
        bglabel.add(label);
        frame.setIconImage(image.getImage());
        //Back
        bglabel.add(bbutton);
        bbutton.setVisible(true);
        bbutton.setFocusable(false);
        bbutton.setBounds(10,10,50,30);
        bbutton.addActionListener(this);
        bbutton.setBackground(Color.GREEN);
        //Easy
        bglabel.add(ebutton);
        ebutton.setVisible(true);
        ebutton.setFocusable(false);
        ebutton.setBounds(200,230,200,130);
        ebutton.addActionListener(this);
        ebutton.setBackground(Color.GREEN);
        //Medium
        bglabel.add(mbutton);
        mbutton.setVisible(true);
        mbutton.setFocusable(false);
        mbutton.setBounds(700,420,200,130);
        mbutton.addActionListener(this);
        mbutton.setBackground(Color.GREEN);
        //Hard
        bglabel.add(hbutton);
        hbutton.setVisible(true);
        hbutton.setFocusable(false);
        hbutton.setBounds(1200,600,200,130);
        hbutton.addActionListener(this);
        hbutton.setBackground(Color.GREEN);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bbutton) {
            frame.dispose();
            LanguageSelect lang= new LanguageSelect();
        }
        if (e.getSource() == ebutton) {
            frame.dispose();
            LaunchPage l= new LaunchPage();
        }
        if (e.getSource() == mbutton) {
            frame.dispose();
            LaunchPage l= new LaunchPage();
        }
        if (e.getSource() == hbutton) {
            frame.dispose();
            LaunchPage l= new LaunchPage();
        }
    }

}
