import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanguageSelect implements ActionListener {
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    JButton bbutton = new JButton("<--");
    JButton cbutton = new JButton("C");
    JButton cpbutton = new JButton("C++");
    JButton jabutton = new JButton("Java");
    JButton ebutton = new JButton("English");
    JLabel label = new JLabel("Language Select");
    LanguageSelect() {
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
        //C
        frame.add(cbutton);
        cbutton.setVisible(true);
        cbutton.setFocusable(false);
        cbutton.setBounds(100,300,150,130);
        cbutton.addActionListener(this);
        cbutton.setBackground(Color.GREEN);
        //C++
        frame.add(cpbutton);
        cpbutton.setVisible(true);
        cpbutton.setFocusable(false);
        cpbutton.setBounds(100,500,150,130);
        cpbutton.addActionListener(this);
        cpbutton.setBackground(Color.GREEN);
        //Java
        frame.add(jabutton);
        jabutton.setVisible(true);
        jabutton.setFocusable(false);
        jabutton.setBounds(500,300,150,130);
        jabutton.addActionListener(this);
        jabutton.setBackground(Color.GREEN);
        //English
        frame.add(ebutton);
        ebutton.setVisible(true);
        ebutton.setFocusable(false);
        ebutton.setBounds(500,500,150,130);
        ebutton.addActionListener(this);
        ebutton.setBackground(Color.GREEN);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bbutton) {
            frame.dispose();
            LaunchPage l= new LaunchPage();
        }
        if (e.getSource() == cbutton) {
            frame.dispose();
            DifficultySelect ds= new DifficultySelect();
        }
        if (e.getSource() == cpbutton) {
            frame.dispose();
            DifficultySelect ds= new DifficultySelect();
        }
        if (e.getSource() == jabutton) {
            frame.dispose();
            DifficultySelect ds= new DifficultySelect();
        }
        if (e.getSource() == ebutton) {
            frame.dispose();
            DifficultySelect ds= new DifficultySelect();
        }
    }

}
