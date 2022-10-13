import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanguageSelect implements ActionListener {
    JFrame frame = new JFrame();
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    ImageIcon cbut = new ImageIcon("c.png");
    ImageIcon cppbut = new ImageIcon("Cpp.png");
    ImageIcon javbut = new ImageIcon("java.png");
    ImageIcon engbut = new ImageIcon("English.png");
    ImageIcon langsel = new ImageIcon("language select.png");
    JButton bbutton = new JButton("<--");
    JButton cbutton = new JButton("C");
    JButton cpbutton = new JButton("C++");
    JButton jabutton = new JButton("Java");
    JButton ebutton = new JButton("English");
    JLabel label = new JLabel("Language Select");
    JLabel bglabel = new JLabel(bg);
    JLabel cb = new JLabel(cbut);
    JLabel cppb = new JLabel(cppbut);
    JLabel jab = new JLabel(javbut);
    JLabel engb = new JLabel(engbut);
    JLabel lsl = new JLabel(langsel);
    JLayeredPane layer = new JLayeredPane();
    LanguageSelect() {
        //bg img
        bglabel.setBounds(0,-5,1600,900);
        frame.add(bglabel);
        //Title
        lsl.setBounds(500,30,600,100);
        lsl.setOpaque(true);
        //label.setBackground(Color.GREEN);
        //label.setHorizontalAlignment(JLabel.CENTER);
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
        //C
        bglabel.add(cbutton);
        cbutton.setVisible(true);
        cbutton.setFocusable(false);
        cbutton.setBounds(200,300,200,100);
        cbutton.addActionListener(this);
        cbutton.setBackground(Color.GREEN);
        cb.setBounds(200,300,200,100);
        cb.setOpaque(true);
        //C++
        bglabel.add(cpbutton);
        cpbutton.setVisible(true);
        cpbutton.setFocusable(false);
        cpbutton.setBounds(200,500,200,100);
        cpbutton.addActionListener(this);
        cpbutton.setBackground(Color.GREEN);
        cppb.setOpaque(true);
        cppb.setBounds(200,500,200,100);
        //Java
        bglabel.add(jabutton);
        jabutton.setVisible(true);
        jabutton.setFocusable(false);
        jabutton.setBounds(1200,300,200,100);
        jabutton.addActionListener(this);
        jabutton.setBackground(Color.GREEN);
        jab.setOpaque(true);
        jab.setBounds(1200,300,200,100);
        //English
        bglabel.add(ebutton);
        ebutton.setVisible(true);
        ebutton.setFocusable(false);
        ebutton.setBounds(1200,500,200,100);
        ebutton.addActionListener(this);
        ebutton.setBackground(Color.GREEN);
        engb.setOpaque(true);
        engb.setBounds(1200,500,200,100);
        //Layered Pane
        layer.setBounds(0,0,1600,900);
        layer.add(bglabel, JLayeredPane.DEFAULT_LAYER);
        layer.add(cb, JLayeredPane.DRAG_LAYER);
        layer.add(cppb, JLayeredPane.DRAG_LAYER);
        layer.add(jab, JLayeredPane.DRAG_LAYER);
        layer.add(engb, JLayeredPane.DRAG_LAYER);
        layer.add(lsl, JLayeredPane.DRAG_LAYER);
        frame.add(layer);
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
