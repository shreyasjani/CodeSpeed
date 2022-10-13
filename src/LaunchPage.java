import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.black;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JLayeredPane layer = new JLayeredPane();
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    ImageIcon start = new ImageIcon("start.png");
    ImageIcon options = new ImageIcon("options.png");
    ImageIcon credits = new ImageIcon("credits.png");
    ImageIcon cdstitle = new ImageIcon("code speed.png");
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    JLabel label = new JLabel("CodeSpeed");
    JLabel bglabel = new JLabel(bg);
    JButton button = new JButton("Start");
    JButton opbutton = new JButton("Options");
    JButton crbutton = new JButton("Credits");
    JLabel st = new JLabel(start);
    JLabel opt = new JLabel(options);
    JLabel crl = new JLabel(credits);
    JLabel cds = new JLabel(cdstitle);
    JPanel panel = new JPanel();

    LaunchPage() {
        //bg img
        bglabel.setBounds(0,0,1600,900);
        frame.add(bglabel);
        //Title
        //label.setBounds(500,30,600,100);
        //label.setOpaque(true);
        //label.setFont(new Font(null,Font.PLAIN,32));
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBackground(Color.GREEN);
        //bglabel.add(label);
        cds.setOpaque(true);
        cds.setBounds(500,30,600,100);
        //Start button
        bglabel.add(button);
        button.setVisible(true);
        button.setFocusable(false);
        button.setBounds(700,250,200,100);
        button.addActionListener(this);
        button.setBackground(Color.GREEN);
        st.setBounds(700,250,200,100);
        st.setOpaque(true);
        bglabel.add(st);
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
        //Credits Page
        crbutton.setVisible(true);
        crbutton.setFocusable(false);
        crbutton.setBounds(700,400,200,100);
        crbutton.addActionListener(this);
        bglabel.add(crbutton);
        crbutton.setBackground(Color.GREEN);
        crl.setBounds(700,400,200,100);
        crl.setOpaque(true);
        //Options Button
        opbutton.setVisible(true);
        opbutton.setFocusable(false);
        opbutton.setBounds(700,550,200,100);
        opbutton.addActionListener(this);
        bglabel.add(opbutton);
        opbutton.setBackground(Color.GREEN);
        opt.setBounds(700,550,200,100);
        opt.setOpaque(true);
        //Layered Pane
        layer.setBounds(0,0,1600,900);
        layer.add(bglabel, JLayeredPane.DEFAULT_LAYER);
        layer.add(st, JLayeredPane.DRAG_LAYER);
        layer.add(opt, JLayeredPane.DRAG_LAYER);
        layer.add(crl, JLayeredPane.DRAG_LAYER);
        layer.add(cds, JLayeredPane.DRAG_LAYER);
        frame.add(layer);
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
