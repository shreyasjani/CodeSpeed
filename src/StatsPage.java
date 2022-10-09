import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatsPage implements ActionListener {
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    JLabel bglabel = new JLabel(bg);
    JButton button = new JButton("Main Menu");
    JButton bbutton = new JButton("Play Again");
    JLabel bs = new JLabel("Best Score : ");
    JLabel cs = new JLabel("Current Score : ");
    JLabel bt = new JLabel("Best Time : ");
    JLabel ct = new JLabel("Current Time : ");
    JLabel label = new JLabel("Progress");
    JLabel gr = new JLabel("Graph");
    StatsPage(){
        //bg img
        bglabel.setBounds(0,0,1600,900);
        frame.add(bglabel);
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
        //Finish
        bglabel.add(button);
        button.setVisible(true);
        button.setFocusable(false);
        button.setBounds(1300,680,200,100);
        button.addActionListener(this);
        button.setBackground(Color.GREEN);
        //Back
        bglabel.add(bbutton);
        bbutton.setVisible(true);
        bbutton.setFocusable(false);
        bbutton.setBounds(100,680,200,100);
        bbutton.addActionListener(this);
        bbutton.setBackground(Color.GREEN);
        //Title
        label.setBounds(500,30,600,100);
        label.setOpaque(true);
        label.setFont(new Font(null,Font.PLAIN,32));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBackground(Color.GREEN);
        bglabel.add(label);
        //Best Score
        bs.setBounds(100,140,300,100);
        bs.setOpaque(true);
        bs.setFont(new Font(null,Font.PLAIN,18));
        bs.setBackground(Color.CYAN);
        bs.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(bs);
        //Current Score
        cs.setBounds(100,260,300,100);
        cs.setOpaque(true);
        cs.setFont(new Font(null,Font.PLAIN,18));
        cs.setBackground(Color.CYAN);
        cs.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(cs);
        //Best Time
        bt.setBounds(100,380,300,100);
        bt.setOpaque(true);
        bt.setFont(new Font(null,Font.PLAIN,18));
        bt.setBackground(Color.CYAN);
        bt.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(bt);
        //Current Time
        ct.setBounds(100,500,300,100);
        ct.setOpaque(true);
        ct.setFont(new Font(null,Font.PLAIN,18));
        ct.setBackground(Color.CYAN);
        ct.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(ct);
        //Graph Label
        gr.setBounds(800,140,700,500);
        gr.setOpaque(true);
        gr.setFont(new Font(null,Font.PLAIN,18));
        gr.setBackground(Color.CYAN);
        gr.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(gr);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button) {
            frame.dispose();
            LaunchPage l= new LaunchPage();
        }
        if (e.getSource() == bbutton) {
            frame.dispose();
            MainPage m= new MainPage();
        }
    }
}
