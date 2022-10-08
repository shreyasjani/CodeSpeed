import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class DifficultySelect implements ActionListener {
    JFrame frame = new JFrame();
    JButton bbutton = new JButton("<--");
    JButton ebutton = new JButton("Easy");
    JButton mbutton = new JButton("Medium");
    JButton hbutton = new JButton("Hard");

    JLabel label = new JLabel("Difficulty Select");
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    DifficultySelect() {
        //Title
        label.setBounds(300,100,100,100);
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        //Frame
        frame.setTitle("CodeSpeed");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.add(label);
        frame.setIconImage(image.getImage());
        //Back
        frame.add(bbutton);
        bbutton.setVisible(true);
        bbutton.setFocusable(false);
        bbutton.setBounds(10,10,50,30);
        bbutton.addActionListener(this);
        bbutton.setBackground(Color.GREEN);
        //Easy
        frame.add(ebutton);
        ebutton.setVisible(true);
        ebutton.setFocusable(false);
        ebutton.setBounds(100,200,150,130);
        ebutton.addActionListener(this);
        ebutton.setBackground(Color.GREEN);
        //Medium
        frame.add(mbutton);
        mbutton.setVisible(true);
        mbutton.setFocusable(false);
        mbutton.setBounds(300,400,150,130);
        mbutton.addActionListener(this);
        mbutton.setBackground(Color.GREEN);
        //Hard
        frame.add(hbutton);
        hbutton.setVisible(true);
        hbutton.setFocusable(false);
        hbutton.setBounds(500,600,150,130);
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
