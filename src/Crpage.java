import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Crpage implements ActionListener {
    JFrame frame = new JFrame();
    ImageIcon tav = new ImageIcon("tavion.png");
    ImageIcon swa = new ImageIcon("swaraj.png");
    ImageIcon shr = new ImageIcon("shreyas.png");
    ImageIcon oja = new ImageIcon("ojas.png");
    JLayeredPane layer = new JLayeredPane();
    ImageIcon back = new ImageIcon("back.png");
    JLabel bb = new JLabel(back);
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    JLabel bglabel = new JLabel(bg);
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    JButton bbutton = new JButton("<--");
    JLabel label = new JLabel("Credits");
    JLabel t = new JLabel(tav);
    JLabel sw = new JLabel(swa);
    JLabel o = new JLabel(oja);
    JLabel sh = new JLabel(shr);
    ImageIcon credits = new ImageIcon("credit heading.png");
    JLabel crh = new JLabel(credits);
    Crpage(){
        //bg img
        bglabel.setBounds(0,-5,1600,900);
        frame.add(bglabel);
        //Frame
        frame.setTitle("CodeSpeed");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(1600, 900);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
        //Title
        //label.setBounds(500,30,600,100);
        //label.setOpaque(true);
        //label.setFont(new Font(null,Font.PLAIN,32));
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBackground(Color.GREEN);
        //bglabel.add(label);
        crh.setOpaque(true);
        crh.setBounds(500,30,600,100);
        //Tavion
        t.setBounds(650,240,300,100);
        t.setOpaque(true);
//        t.setFont(new Font(null,Font.PLAIN,18));
//        t.setBackground(Color.CYAN);
//        t.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(t);
        //Swaraj
        sw.setBounds(650,360,300,100);
        sw.setOpaque(true);
//        sw.setFont(new Font(null,Font.PLAIN,18));
//        sw.setBackground(Color.CYAN);
//        sw.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(sw);
        //Ojas
        o.setBounds(650,480,300,100);
        o.setOpaque(true);
//        o.setFont(new Font(null,Font.PLAIN,18));
//        o.setBackground(Color.CYAN);
//        o.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(o);
        //Shreyas
        sh.setBounds(650,600,300,100);
        sh.setOpaque(true);
//        sh.setFont(new Font(null,Font.PLAIN,18));
//        sh.setBackground(Color.CYAN);
//        sh.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(sh);
        //Back
        bglabel.add(bbutton);
        bbutton.setVisible(true);
        bbutton.setFocusable(false);
        bbutton.addActionListener(this);
        bbutton.setBackground(Color.GREEN);
        bbutton.setBounds(10,15,50,30);
        bb.setBounds(10,10,50,30);
        bb.setOpaque(true);
        //LayeredPane
        layer.setBounds(0,0,1600,900);
        layer.add(bglabel, JLayeredPane.DEFAULT_LAYER);
        layer.add(crh, JLayeredPane.DRAG_LAYER);
        layer.add(bb, JLayeredPane.DRAG_LAYER);
        frame.add(layer);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bbutton) {
            frame.dispose();
            LaunchPage l= new LaunchPage();
        }
    }
}
