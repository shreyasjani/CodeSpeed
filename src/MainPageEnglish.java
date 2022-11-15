import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.Random;


public class MainPageEnglish implements ActionListener {

    JFrame frame = new JFrame();
    JLayeredPane layer = new JLayeredPane();
    ImageIcon image = new ImageIcon("CS_logo.jpeg");
    ImageIcon back = new ImageIcon("back.png");
    JLabel bb = new JLabel(back);
    ImageIcon bg = new ImageIcon("bgimgcs.jpeg");
    JLabel bglabel = new JLabel(bg);
    JLabel scoreLabel = new JLabel();
    JButton stbutton = new JButton("Start");
    JLabel timelabel = new JLabel();
    JButton button = new JButton("Finish");
    ImageIcon start = new ImageIcon("score.png");
    ImageIcon finish = new ImageIcon("finish.png");
    JLabel st = new JLabel(start);
    JLabel fn = new JLabel(finish);
    JTextField textField2 = new JTextField();
    JTextArea textArea = new JTextArea();

    JTextArea textArea2 = new JTextArea();
    JButton bbutton = new JButton("<--");
    JScrollPane sp = new JScrollPane(textArea);
    //Object for random no. generation
    Random random = new Random();

    public int counter = 0;
    public int score = 0;




    //Timer code
    public int elapsedtime=0;
    int seconds=0;
    int minutes=0;
    int hours=0;
    boolean started =false;
    String seconds_string = String.format("%02d",seconds);
    String minutes_string = String.format("%02d",minutes);
    String hours_string = String.format("%02d",hours);
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedtime+=1000;
            hours=(elapsedtime/3600000);
            minutes=(elapsedtime/60000)%60;
            seconds=(elapsedtime/1000)%60;
            seconds_string = String.format("%02d",seconds);
            minutes_string = String.format("%02d",minutes);
            hours_string = String.format("%02d",hours);
            timelabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
        }
    });
    MainPageEnglish(){

        //frame.dispose(LanguageSelect);
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
        button.setBounds(1300,650,200,100);
        button.addActionListener(this);
        button.setBackground(Color.GREEN);
        fn.setBounds(1300,650,200,100);
        fn.setOpaque(true);
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
        //Timer
        timelabel.setOpaque(true);
        timelabel.setHorizontalAlignment(JTextField.CENTER);
        timelabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
        timelabel.setBounds(1200,10,200,100);
        timelabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timelabel.setBorder(BorderFactory.createBevelBorder(1));
        bglabel.add(timelabel);
        stbutton.setBounds(1000,650,200,100);
        stbutton.setFocusable(false);
        stbutton.addActionListener(this);
        st.setOpaque(true);
        st.setBounds(750,650,200,100);
        bglabel.add(stbutton);
        //TextArea
        //bglabel.add(textArea);
        textArea.setBounds(790,120,700,500);
        textArea.setAlignmentY(0.0f);
        textArea.setVisible(true);
        textArea.setBackground(Color.darkGray);
        textArea.setFont(new Font("Verdana",Font.PLAIN,20));
        textArea.setForeground(Color.white);
        textArea.setCaretColor(Color.white);
        textArea.addKeyListener(keyListener);
        textArea.setMargin(new Insets(10,10,10,10));
        //textArea.setLineWrap(true);
        //textArea.setWrapStyleWord(true);
        bglabel.add(sp);
        sp.setBounds(790,120,700,500);
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //textArea.setText(textArea.getText()+ string);
        //TextField
//        bglabel.add(textField2);
//        textField2.setVisible(true);
//        textField2.setBounds(50,80,650,650);
//        textField2.setAlignmentY(0.0f);
        //Textfile
        bglabel.add(textArea2);
        textArea2.setVisible(true);
        textArea2.setBounds(50,80,650,650);
        textArea2.setAlignmentY(0.0f);
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);
        textArea2.setMargin(new Insets(10,10,10,10));
        //Score Label
        scoreLabel.setBounds(1000,650,200,100);
        scoreLabel.setForeground(Color.white);
        scoreLabel.setBackground(Color.BLACK);
        scoreLabel.setOpaque(true);
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);
        scoreLabel.setFont(new Font("Verdana",Font.PLAIN,30));
        bglabel.add(scoreLabel);
        //random integer generation
        int x;


        try{
            String a = "";


                //eng texts
                x =random.nextInt(5);
                switch(x)
                {
                    case 0:{
                        a="eng code.txt";
                        break;}

                    case 1:{
                        a="eng2.txt";
                        break;
                    }
                    case 2:{
                        a="eng4.txt";
                        break;
                    }
                    case 3:{
                        a="eng3.txt";
                        break;
                    }
                    case 4:{
                        a="eng5.txt";
                        break;
                    }
                }


            BufferedReader reader = new BufferedReader(new FileReader(a));
            StringBuilder stringBuilder = new StringBuilder();
            char[] buffer = new char[10];
            while (reader.read(buffer) != -1) {
                stringBuilder.append(new String(buffer));
                buffer = new char[10];
            }
            reader.close();

            String content = stringBuilder.toString();
            textArea2.setText(content);

        }

        catch(Exception e){
            System.out.println("Exception: "+e);
        }
        textArea2.setFocusable(false);
        textArea2.setFont(new Font("Verdana",Font.PLAIN,15));
        textArea2.setBackground(new Color(200,200,200));
        //LayeredPane
        layer.setBounds(0,0,1600,900);
        layer.add(bglabel, JLayeredPane.DEFAULT_LAYER);
        layer.add(textArea2, JLayeredPane.DRAG_LAYER);
        //layer.add(textArea, JLayeredPane.DRAG_LAYER);
        layer.add(sp, JLayeredPane.DRAG_LAYER);
        layer.add(st, JLayeredPane.DRAG_LAYER);
        layer.add(fn, JLayeredPane.DRAG_LAYER);
        layer.add(bb, JLayeredPane.DRAG_LAYER);
        layer.add(scoreLabel, JLayeredPane.DRAG_LAYER);
        //layer.add(crl, JLayeredPane.DRAG_LAYER);
        //layer.add(cds, JLayeredPane.DRAG_LAYER);
        frame.add(layer);

    }
    KeyListener keyListener = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            timer.start();
            if(e.getKeyChar() == KeyEvent.VK_BACK_SPACE && counter > 0){
                counter--;
            }else{
                if(textArea2.getText().charAt(counter) == e.getKeyChar()){
                    score++;
                }else{
                    if (score > 0){
                        score--;
                    }
                }


                scoreLabel.setText(score +" ("+ textArea2.getText().charAt(counter)+ " | "+ e.getKeyChar() + ") " );
                //System.out.println(e.getKeyChar());
                //counter++;
                if(e.getKeyChar() != KeyEvent.VK_ENTER){
                    counter++;
                }else{
                    counter+=2;
                    score++;
                }
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e){
        }
    };




    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button) {
            String yourChoice = e.getActionCommand();

            try{

                BufferedWriter bw = new BufferedWriter(new FileWriter("saveFile.txt",true));

                bw.append(""+score);
                bw.newLine();
                bw.append(""+elapsedtime);
                bw.newLine();

                bw.close();
            }
            catch(Exception err){}

            frame.dispose();
            StatsPage st= new StatsPage();
        }

        if (e.getSource() == bbutton) {
            frame.dispose();
            DifficultySelect4 d= new DifficultySelect4();
        }
        if(e.getSource()==stbutton) {
            timer.start();
        }
    }

}
