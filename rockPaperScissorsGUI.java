import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Random;

public class rockPaperScissorsGUI 
{
    static int choice = 0;                                             // 1 for rock, 2 for paper, 3 for scissors
    static int computerChoice = 0;                                     // 1 for rock, 2 for paper, 3 for scissors. Randomly generated
    static int k = 0;                                                  // counter for rounds played
    static int comp = 0;                                               // computer's score
    static int user = 0;                                               // user's score
    

    static JLabel intro = new JLabel("Welcome to Rock Paper Scissors!"); // label for introduction
    static JFrame introFrame = new JFrame("Rock Paper Scissors GUI"); // frame for introduction
    static JPanel introPanel = new JPanel();                           // panel for introduction
    static ImageIcon hr = new ImageIcon("hand rock.png");     // rock image
    static ImageIcon hp = new ImageIcon("hand paper.png");    // paper image
    static ImageIcon hs = new ImageIcon("hand scissors.png"); // scissors image
    static JPanel p = new JPanel();                                    // panel for user
    static JPanel pc = new JPanel();                                   // panel for computer
    static JPanel tp = new JPanel();                                   // top panel
    static JLabel l = new JLabel();                                    // label for user choice
    static JLabel lc = new JLabel();                                   // label for computer choice
    static JLabel ps = new JLabel("Your score " + user);               // label for player's score
    static JLabel cs = new JLabel("Computer's score " + comp);         // label for computer's score
    static JLabel r= new JLabel();                                     // label for results of each round
    static JButton brc = new JButton();                                // button for rock
    static JButton bsc = new JButton();                                // button for scissors
    static JButton bpc = new JButton();                                // button for paper
    static JButton bgo = new JButton("GO");                       // button to begin the round
    static JFrame f = new JFrame("Rock Paper Scissors GUI");     // main frame of the game
    public static void main(String[] args) 
    {

        intro();                                                       // play the intro screen

        pc.setBackground(new Color(153, 51, 102));               // panel for computer choice
        pc.setBounds(950, 0, 400, 900);

        p.setBackground(new Color(102, 102, 153));               // panel for user choice
        p.setBounds(0, 0, 400, 900);


        tp.setBackground(new Color(137, 219, 236));              // panel for results of each round
        tp.setBounds(0,0, 1350, 200);
        
        l.setForeground(new Color(200, 200, 200));               // label for user choice
        l.setBounds(100, 200, 500, 500);
        l.setFont(new Font("comic sans", Font.BOLD, 25)); 

        lc.setForeground(new Color(200, 200, 200));              // label for computer choice
        lc.setBounds(100, 200, 500, 500);
        lc.setFont(new Font("comic sans", Font.BOLD, 25));

        ps.setForeground(new Color(200, 200, 200));              // label for player's score
        ps.setBounds(100, 200, 500, 500);
        ps.setFont(new Font("comic sans", Font.BOLD, 25));

        cs.setForeground(new Color(200, 200, 200));              // label for computer's score
        cs.setBounds(100, 200, 500, 500);
        cs.setFont(new Font("comic sans", Font.BOLD, 25));
        r.setForeground(new Color(200, 200, 200));

        r.setText("pick your hand and push go");                 // label for results of each round
        r.setForeground(new Color(17, 17, 69));
        r.setBounds(800, 800, 130, 20);
        r.setVerticalAlignment(JLabel.BOTTOM);
        r.setHorizontalAlignment(JLabel.LEFT);
        r.setFont(new Font("comic sans", Font.BOLD, 30));   // Set text color


        brc.setBounds(500, 225, 150, 50);            // button for rock
        brc.setSize(150, 50);
        brc.setText("ROCK");
        brc.setBackground(new Color(255, 153, 51));
        brc.setForeground(Color.WHITE);
        brc.setFocusable(false);
        brc.addActionListener(e -> bclick(1));

        bpc.setBounds(500, 450, 150, 50);            // button for paper
        bpc.setSize(150, 50);
        bpc.setText("PAPER");
        bpc.setBackground(new Color(255, 153, 51));
        bpc.setForeground(Color.WHITE);
        bpc.setFocusable(false);
        bpc.addActionListener(e -> bclick(2));

        bsc.setBounds(500, 675, 150, 50);            // button for scissors
        bsc.setSize(150, 50);
        bsc.setText("SCISSORS");
        bsc.setBackground(new Color(255, 153, 51));
        bsc.setForeground(Color.WHITE);
        bsc.setFocusable(false);
        bsc.addActionListener(e -> bclick(3));

        bgo.setBounds(750, 450, 150, 50);            // button to begin the round
        bgo.setSize(150, 50);
        bgo.setText("GO");
        bgo.setBackground(new Color(186, 0, 0));
        bgo.setForeground(Color.WHITE);
        bgo.setFocusable(false);
        bgo.addActionListener(e -> compc());

        pc.setLayout(null);
        p.setLayout(null);
        pc.add(cs);                                                  //add computer's score to computer's panel
        cs.setVerticalAlignment(JLabel.TOP);
        cs.setHorizontalAlignment(JLabel.LEFT);
        p.add(ps);                                                   //add player's score to player's panel
        ps.setVerticalAlignment(JLabel.TOP);
        ps.setHorizontalAlignment(JLabel.LEFT);
        tp.add(r);                                                   //add results label to the top panel

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1350, 900);
        f.setVisible(true);
        f.setResizable(false);
        f.setBackground(null);
        f.setLayout(null);
        f.getContentPane().setBackground(new Color(103, 103, 205));
        f.add(brc);
        f.add(bsc);
        f.add(bpc);
        f.add(bgo);
        f.add(l);
        pc.add(lc);
        f.add(p, new Dimension(400, 900));
        f.add(pc, new Dimension(400, 900));
        f.add(tp, new Dimension(1350, 200));
    }
    
    public static void bclick(int a)
    {
        l.setText("Your choice");
        l.setHorizontalTextPosition(JLabel.CENTER);
        l.setVerticalTextPosition(JLabel.TOP);
        bgo.setBackground(new Color(109,185,102));               // Change button color to indicate selection
        if (a == 1) {
            System.out.println("You chose ROCK");
            choice = 1;
            l.setIcon(hr);                                             // show rock image
            
        } else if (a == 2) {
            System.out.println("You chose PAPER");
            choice = 2;
            l.setIcon(hp);                                             // show paper image
        } else if (a == 3) {
            System.out.println("You chose SCISSORS");
            choice = 3;
            l.setIcon(hs);                                             // show scissors image
        }
    }
    public static void compc()
    {

        int a = ran(3);
        lc.setText("computer's choice");
        lc.setHorizontalTextPosition(JLabel.CENTER);
        lc.setVerticalTextPosition(JLabel.TOP);
        if( choice == 0)                                               // if user has not selected a hand
        {
            r.setText("Please select your hand first");
            r.setSize(50,30);
            return;
        }
        else if (a == 1) 
        {
            System.out.println("The computer chose ROCK");
            lc.setIcon(hr);
        } 
        else if (a == 2) 
        {
            System.out.println("The computer chose PAPER");
            lc.setIcon(hp);
        } 
        else if (a == 3) 
        {
            System.out.println("The computer chose SCISSORS");
            lc.setIcon(hs);
        }
        RPS(a);
        choice = 0;                                                    // Reset user's choice for the next round
        computerChoice = 0;                                            // Set computer's choice for the next round
        bgo.setBackground(new Color(186, 0, 0));
    }
    
    public static void RPS(int a)
    {
        int c = a;
        if (c == 1 && choice == 1) 
        {
            r.setText("its a tie");
        } 
        else if (c == 2 && choice == 2) 
        {
            r.setText("its a tie");
        } 
        else if (c == 3 && choice == 3) 
        {
            r.setText("its a tie");
        } 
        else if (c == 1 && choice == 2) 
        {
            k++;
            user++;
            r.setText("you won this round!!");
            ps.setText("Your score " + user);
        } 
        else if (c == 1 && choice == 3) 
        {
            k++;
            comp++;
            r.setText("you lost this round :(");
            cs.setText("Computer's score " + comp);
        } 
        else if (c == 2 && choice == 1) 
        {
            k++;
            comp++;
            r.setText("you lost this round :(");
            cs.setText("Computer's score " + comp);
        } 
        else if (c == 2 && choice == 3) 
        {
            k++;
            user++;
            r.setText("you won this round!!");
            ps.setText("Your score " + user);
        } 
        else if (c == 3 && choice == 1) 
        {
            k++;
            user++;
            r.setText("you won this round!!");
            ps.setText("Your score " + user);
        } 
        else if (c == 3 && choice == 2) 
        {
            k++;
            comp++;
            r.setText("you lost this round :(");
            cs.setText("Computer's score " + comp);
        } 
        else
            System.out.println("error");
    }
    
    static int ran(int b)
    {
        Random random=new Random();
        int a= random.nextInt(b);
        return a+1;
    }
    public static void intro()
    {
        introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        introFrame.setSize(1350, 900);
        introFrame.setVisible(true);
        introFrame.setResizable(false);
        introFrame.setBackground(null);
        introFrame.setLayout(null);
        introPanel.setLayout(null);
        intro.setText("Welcome to Rock Paper Scissors!");
        intro.setBounds(455,425,500,30);
        intro.setForeground(new Color(17, 17, 69));
        intro.setFont(new Font("comic sans", Font.BOLD, 25));             
        introPanel.setBounds(0, 0, 1350, 900);
        introPanel.setBackground(new Color(102, 102, 153));
        introFrame.add(introPanel);        // set default close operation
        
        introPanel.add(intro);
        introFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            try 
            {
                Thread.sleep(1000); // wait for 1 second before showing the main game interface
            } 
            catch (InterruptedException e) 
            {
                System.out.println("TIMER INTERRUPTED");
            }
        introFrame.setVisible(false); // hide the introduction frame


    }
}
