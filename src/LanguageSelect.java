import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanguageSelect implements ActionListener {
    JFrame frame = new JFrame();
    JButton bbutton = new JButton("<--");
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
        frame.setBackground(Color.BLACK);
        frame.add(label);
        //Back
        frame.add(bbutton);
        bbutton.setVisible(true);
        bbutton.setFocusable(false);
        bbutton.setBounds(10,10,50,30);
        bbutton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bbutton) {
            frame.dispose();
            LaunchPage l= new LaunchPage();
        }
    }

}
