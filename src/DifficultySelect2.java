import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DifficultySelect2 implements ActionListener {
    JFrame frame = new JFrame();
    JLayeredPane layer = new JLayeredPane();
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    ImageIcon back = new ImageIcon("back.png");
    JLabel bb = new JLabel(back);
    ImageIcon ebut = new ImageIcon("Easy.png");
    ImageIcon mbut = new ImageIcon("med.png");
    ImageIcon hbut = new ImageIcon("hard.png");
    ImageIcon dsl = new ImageIcon("difficulty select.png");
    JButton bbutton = new JButton("<--");
    JButton ebutton = new JButton("Easy");
    JButton mbutton = new JButton("Medium");
    JButton hbutton = new JButton("Hard");
    JLabel eb = new JLabel(ebut);
    JLabel mb = new JLabel(mbut);
    JLabel hb = new JLabel(hbut);
    JLabel ds = new JLabel(dsl);

    JLabel label = new JLabel("Difficulty Select");
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    JLabel bglabel = new JLabel(bg);
    DifficultySelect2() {
        //bg img
        bglabel.setBounds(0,-5,1600,900);
        frame.add(bglabel);
        //Title
        ds.setBounds(500,30,600,100);
        ds.setOpaque(true);
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
        //bbutton.setBounds(10,10,50,30);
        bbutton.addActionListener(this);
        bbutton.setBackground(Color.GREEN);
        bbutton.setBounds(10,10,50,30);
        bb.setBounds(10,10,50,30);
        bb.setOpaque(true);
        //Easy
        bglabel.add(ebutton);
        ebutton.setVisible(true);
        ebutton.setFocusable(false);
        ebutton.setBounds(200,230,200,100);
        ebutton.addActionListener(this);
        ebutton.setBackground(Color.GREEN);
        eb.setBounds(200,230,200,100);
        eb.setOpaque(true);
        //Medium
        bglabel.add(mbutton);
        mbutton.setVisible(true);
        mbutton.setFocusable(false);
        mbutton.setBounds(700,420,200,100);
        mbutton.addActionListener(this);
        mbutton.setBackground(Color.GREEN);
        mb.setOpaque(true);
        mb.setBounds(700,420,200,100);
        //Hard
        bglabel.add(hbutton);
        hbutton.setVisible(true);
        hbutton.setFocusable(false);
        hbutton.setBounds(1200,600,200,100);
        hbutton.addActionListener(this);
        hbutton.setBackground(Color.GREEN);
        hb.setOpaque(true);
        hb.setBounds(1200,600,200,100);
        //LayeredPane
        layer.setBounds(0,0,1600,900);
        layer.add(bglabel, JLayeredPane.DEFAULT_LAYER);
        layer.add(eb, JLayeredPane.DRAG_LAYER);
        layer.add(mb, JLayeredPane.DRAG_LAYER);
        layer.add(hb, JLayeredPane.DRAG_LAYER);
        layer.add(ds, JLayeredPane.DRAG_LAYER);
        layer.add(bb, JLayeredPane.DRAG_LAYER);
        frame.add(layer);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bbutton) {
            frame.dispose();
            LanguageSelect lang= new LanguageSelect();
        }
        if (e.getSource() == ebutton) {
            frame.dispose();
            MainPagecpp m= new MainPagecpp();
        }
        if (e.getSource() == mbutton) {
            frame.dispose();
            MainPagecpp m= new MainPagecpp();
        }
        if (e.getSource() == hbutton) {
            frame.dispose();
            MainPagecpp m= new MainPagecpp();
        }
    }

}
