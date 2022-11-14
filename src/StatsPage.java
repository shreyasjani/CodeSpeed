import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatsPage implements ActionListener {
    //int score =new MainPage().score;
    //int elapsedtime = new MainPage().elapsedtime;
    //String seconds_string =new MainPage().seconds_string;
    //String minutes_string =new MainPage().minutes_string;
    //String hours_string = new MainPage().hours_string;
    JFrame frame = new JFrame();
    JLayeredPane layer = new JLayeredPane();
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    ImageIcon play = new ImageIcon("play.png");
    ImageIcon bes = new ImageIcon("bestscore.png");
    ImageIcon bet = new ImageIcon("besttime.png");
    ImageIcon cusc = new ImageIcon("currenttscore.png");
    ImageIcon cut = new ImageIcon("currenttime.png");
    ImageIcon mainm = new ImageIcon("main menu.png");
    ImageIcon progress = new ImageIcon("progress.png");
    JLabel bglabel = new JLabel(bg);
    JLabel pr = new JLabel(progress);
    JLabel pa = new JLabel(play);
    JLabel mm = new JLabel(mainm);
    JButton button = new JButton("Main Menu");
    JButton bbutton = new JButton("Play Again");
    JLabel bs = new JLabel(bes);
    JLabel cs = new JLabel(cusc);
    JLabel bt = new JLabel(bet);
    JLabel ct = new JLabel(cut);
    JLabel label = new JLabel("Progress");
    JLabel gr = new JLabel("Graph");
    JLabel bsc = new JLabel("672");
    JLabel bst = new JLabel("00:00:49");
    JLabel csc = new JLabel();
    JLabel cst = new JLabel();

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
        mm.setBounds(1300,680,200,100);
        mm.setOpaque(true);
        //Back
        bglabel.add(bbutton);
        bbutton.setVisible(true);
        bbutton.setFocusable(false);
        bbutton.setBounds(100,680,200,100);
        bbutton.addActionListener(this);
        bbutton.setBackground(Color.GREEN);
        pa.setOpaque(true);
        pa.setBounds(100,680,200,100);
        //Title
        pr.setBounds(500,30,600,100);
        pr.setOpaque(true);
        //label.setFont(new Font(null,Font.PLAIN,32));
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBackground(Color.GREEN);
        //bglabel.add(label);
        //Best Score
        bs.setBounds(400,240,300,100);
        bs.setOpaque(true);
//        bs.setFont(new Font(null,Font.PLAIN,18));
//        bs.setBackground(Color.CYAN);
//        bs.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(bs);
        //Current Score
        cs.setBounds(400,360,300,100);
        cs.setOpaque(true);
//        cs.setFont(new Font(null,Font.PLAIN,18));
//        cs.setBackground(Color.CYAN);
//        cs.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(cs);
        //Best Time
        bt.setBounds(400,480,300,100);
        bt.setOpaque(true);
//        bt.setFont(new Font(null,Font.PLAIN,18));
//        bt.setBackground(Color.CYAN);
//        bt.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(bt);
        //Current Time
        ct.setBounds(400,600,300,100);
        ct.setOpaque(true);
//        ct.setFont(new Font(null,Font.PLAIN,18));
//        ct.setBackground(Color.CYAN);
//        ct.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(ct);
        //Graph Label
//        gr.setBounds(800,140,700,500);
//        gr.setOpaque(true);
//        gr.setFont(new Font(null,Font.PLAIN,18));
//        gr.setBackground(Color.CYAN);
//        gr.setHorizontalAlignment(JLabel.CENTER);
//        bglabel.add(gr);
        //LayeredPane
        layer.setBounds(0,0,1600,900);
        layer.add(bglabel, JLayeredPane.DEFAULT_LAYER);
        layer.add(mm, JLayeredPane.DRAG_LAYER);
        layer.add(pa, JLayeredPane.DRAG_LAYER);
        layer.add(pr, JLayeredPane.DRAG_LAYER);
        //layer.add(ds, JLayeredPane.DRAG_LAYER);
        frame.add(layer);
        //Results
        //Best Score
        bsc.setBounds(700,240,300,100);
        bsc.setOpaque(true);
        bsc.setFont(new Font(null,Font.PLAIN,24));
        bsc.setBackground(Color.BLACK);
        bsc.setForeground(Color.WHITE);
        bsc.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(bsc);
        //Current Score
        csc.setBounds(700,360,300,100);
        csc.setOpaque(true);
        csc.setFont(new Font(null,Font.PLAIN,24));
        csc.setBackground(Color.BLACK);
        csc.setForeground(Color.WHITE);
        csc.setHorizontalAlignment(JLabel.CENTER);
        //csc.setText("hi");
        bglabel.add(csc);
        //Best Time
        bst.setBounds(700,480,300,100);
        bst.setOpaque(true);
        bst.setFont(new Font(null,Font.PLAIN,24));
        bst.setBackground(Color.BLACK);
        bst.setForeground(Color.WHITE);
        bst.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(bst);
        //Current Time
        cst.setBounds(700,600,300,100);
        cst.setOpaque(true);
        cst.setFont(new Font(null,Font.PLAIN,24));
        //cst.setText(hours_string+":"+minutes_string+":"+seconds_string);
        cst.setBackground(Color.BLACK);
        cst.setForeground(Color.WHITE);
        cst.setHorizontalAlignment(JLabel.CENTER);
        bglabel.add(cst);

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
