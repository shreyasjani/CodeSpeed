import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Crpage implements ActionListener {
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    JButton bbutton = new JButton("<--");
    JLabel label = new JLabel("Credits");
    JLabel t = new JLabel("Tavion Fernandes");
    JLabel sw = new JLabel("Swaraj Dusane");
    JLabel o = new JLabel("Ojas Golatkar");
    JLabel sh = new JLabel("Shreyas Jani");
    Crpage(){
        //Frame
        frame.setTitle("CodeSpeed");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setIconImage(image.getImage());
        //Title
        label.setBounds(300,100,300,100);
        label.setOpaque(true);
        label.setFont(new Font(null,Font.PLAIN,32));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.GREEN);
        frame.add(label);
        //Tavion
        t.setBounds(300,210,300,100);
        t.setOpaque(true);
        t.setFont(new Font(null,Font.PLAIN,18));
        t.setBackground(Color.CYAN);
        t.setHorizontalAlignment(JLabel.CENTER);
        frame.add(t);
        //Swaraj
        sw.setBounds(300,320,300,100);
        sw.setOpaque(true);
        sw.setFont(new Font(null,Font.PLAIN,18));
        sw.setBackground(Color.CYAN);
        sw.setHorizontalAlignment(JLabel.CENTER);
        frame.add(sw);
        //Ojas
        o.setBounds(300,430,300,100);
        o.setOpaque(true);
        o.setFont(new Font(null,Font.PLAIN,18));
        o.setBackground(Color.CYAN);
        o.setHorizontalAlignment(JLabel.CENTER);
        frame.add(o);
        //Shreyas
        sh.setBounds(300,540,300,100);
        sh.setOpaque(true);
        sh.setFont(new Font(null,Font.PLAIN,18));
        sh.setBackground(Color.CYAN);
        sh.setHorizontalAlignment(JLabel.CENTER);
        frame.add(sh);
        //Back
        frame.add(bbutton);
        bbutton.setVisible(true);
        bbutton.setFocusable(false);
        bbutton.setBounds(10,10,50,30);
        bbutton.addActionListener(this);
        bbutton.setBackground(Color.GREEN);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bbutton) {
            frame.dispose();
            LaunchPage l= new LaunchPage();
        }
    }
}
