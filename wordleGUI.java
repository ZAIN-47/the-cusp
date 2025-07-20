import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Random;

public class wordleGUI 
{
    static int ln = 0;// letter number
    static int gn = 0;// guess number
    static int victorytoggle=0;
    static int width = 800;
    static int height = 800;

    static String word = getword();
    static String guess = "";

    static JLabel[][] xy = new JLabel[6][5]; // panels for gameplay

    static Color defgreen = new Color(19,255,150); //default colors
    static Color defred = new Color(229,101,101);
    static Color defgrey=new Color(80,80,80);
    static Color defyellow=new Color(200,200,0);

    static JPanel gamep = new JPanel(); //panel for main gameplay

    static JLabel qwe = new JLabel(); // panels for keyboard
    static JLabel asd = new JLabel();
    static JLabel zxc= new JLabel();

    static JButton q = new JButton("Q"); //adding each button for the onscreen keyboard
    static JButton w = new JButton("W");
    static JButton e = new JButton("E");
    static JButton r = new JButton("R");
    static JButton t = new JButton("T");
    static JButton y = new JButton("Y");
    static JButton u = new JButton("U");
    static JButton i = new JButton("I");
    static JButton o = new JButton("O");
    static JButton p = new JButton("P");
    static JButton a = new JButton("A");
    static JButton s = new JButton("S");
    static JButton d = new JButton("D");
    static JButton f = new JButton("F");
    static JButton g = new JButton("G");
    static JButton h = new JButton("H");
    static JButton j = new JButton("J");
    static JButton k = new JButton("K");
    static JButton l = new JButton("L");
    static JButton z = new JButton("Z");
    static JButton x = new JButton("X");
    static JButton c = new JButton("C");
    static JButton v = new JButton("V");
    static JButton b = new JButton("B");
    static JButton n = new JButton("N");
    static JButton m = new JButton("M");
    static JButton ntr = new JButton("TRY");
    static JButton bxps = new JButton("DEL");

    static JFrame frame = new JFrame(" WORDLE "); //main frame

    public static void main(String args[])
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setBackground(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(181, 199, 206));// seting up the frame

        qwe.setBackground(new Color(201, 219, 226));
        qwe.setBounds(0, 4 * height / 6, width, height / 12);
        qwe.setOpaque(true);
        qwe.setLayout(new GridLayout(1, 10, 5, 2));
        qwe.setBorder(new EmptyBorder(1, 10, 10, 20)); //setting up the top part of the keyboard

        asd.setBackground(new Color(201, 219, 226));
        asd.setBounds(0, 3 * height / 4 - 1, width, height / 12);
        asd.setOpaque(true);
        asd.setLayout(new GridLayout(1, 9, 5, 2));
        asd.setBorder(new EmptyBorder(1, 33, 10, 40)); // setting up the middle part of the keyboard

        zxc.setBackground(new Color(201, 219, 226));
        zxc.setBounds(0, 10 * height / 12 - 1, width, height / 12);
        zxc.setOpaque(true);
        zxc.setLayout(new GridLayout(1, 7, 5, 2));
        zxc.setBorder(new EmptyBorder(1, 0, 10, 20));// setting up the bottom part of the keyboard

        gamep.setBackground(new Color(201, 219, 226));
        gamep.setBounds(width / 2 - width / 4, 10 * height / 165, width / 2, 100 * height / 175);
        gamep.setOpaque(true);
        gamep.setLayout(new GridLayout(6, 5, 10, 10));
        gamep.setBorder(new EmptyBorder(25, 25, 25, 25)); // setting up the main panel for gameplay

                                                                    // setting up each button on the keyboard
        q.setBackground(null);
        q.setFocusable(false);
        q.addActionListener(e -> click(q.getText()));
        q.setFont(new Font("Monaco", Font.BOLD, 18));
        q.setBorderPainted(false);
        w.setBackground(null);
        w.setFocusable(false);
        w.addActionListener(e -> click(w.getText()));
        w.setFont(new Font("Monaco", Font.BOLD, 18));
        w.setBorderPainted(false);
        e.setBackground(null);
        e.setFocusable(false);
        e.addActionListener(e -> click("E"));
        e.setFont(new Font("Monaco", Font.BOLD, 18));
        e.setBorderPainted(false);
        r.setBackground(null);
        r.setFocusable(false);
        r.addActionListener(e -> click(r.getText()));
        r.setFont(new Font("Monaco", Font.BOLD, 18));
        r.setBorderPainted(false);
        t.setBackground(null);
        t.setFocusable(false);
        t.addActionListener(e -> click(t.getText()));
        t.setFont(new Font("Monaco", Font.BOLD, 18));
        t.setBorderPainted(false);
        y.setBackground(null);
        y.setFocusable(false);
        y.addActionListener(e -> click(y.getText()));
        y.setFont(new Font("Monaco", Font.BOLD, 18));
        y.setBorderPainted(false);
        u.setBackground(null);
        u.setFocusable(false);
        u.addActionListener(e -> click(u.getText()));
        u.setFont(new Font("Monaco", Font.BOLD, 18));
        u.setBorderPainted(false);
        i.setBackground(null);
        i.setFocusable(false);
        i.addActionListener(e -> click(i.getText()));
        i.setFont(new Font("Monaco", Font.BOLD, 18));
        i.setBorderPainted(false);
        o.setBackground(null);
        o.setFocusable(false);
        o.addActionListener(e -> click(o.getText()));
        o.setFont(new Font("Monaco", Font.BOLD, 18));
        o.setBorderPainted(false);
        p.setBackground(null);
        p.setFocusable(false);
        p.addActionListener(e -> click(p.getText()));
        p.setFont(new Font("Monaco", Font.BOLD, 18));
        p.setBorderPainted(false);
        a.setBackground(null);
        a.setFocusable(false);
        a.addActionListener(e -> click(a.getText()));
        a.setFont(new Font("Monaco", Font.BOLD, 18));
        a.setBorderPainted(false);
        s.setBackground(null);
        s.setFocusable(false);
        s.addActionListener(e -> click(s.getText()));
        s.setFont(new Font("Monaco", Font.BOLD, 18));
        s.setBorderPainted(false);
        d.setBackground(null);
        d.setFocusable(false);
        d.addActionListener(e -> click(d.getText()));
        d.setFont(new Font("Monaco", Font.BOLD, 18));
        d.setBorderPainted(false);
        f.setBackground(null);
        f.setFocusable(false);
        f.addActionListener(e -> click(f.getText()));
        f.setFont(new Font("Monaco", Font.BOLD, 18));
        f.setBorderPainted(false);
        g.setBackground(null);
        g.setFocusable(false);
        g.addActionListener(e -> click(g.getText()));
        g.setFont(new Font("Monaco", Font.BOLD, 18));
        g.setBorderPainted(false);
        h.setBackground(null);
        h.setFocusable(false);
        h.addActionListener(e -> click(h.getText()));
        h.setFont(new Font("Monaco", Font.BOLD, 18));
        h.setBorderPainted(false);
        j.setBackground(null);
        j.setFocusable(false);
        j.addActionListener(e -> click(j.getText()));
        j.setFont(new Font("Monaco", Font.BOLD, 18));
        j.setBorderPainted(false);
        k.setBackground(null);
        k.setFocusable(false);
        k.addActionListener(e -> click(k.getText()));
        k.setFont(new Font("Monaco", Font.BOLD, 18));
        k.setBorderPainted(false);
        l.setBackground(null);
        l.setFocusable(false);
        l.addActionListener(e -> click(l.getText()));
        l.setFont(new Font("Monaco", Font.BOLD, 18));
        l.setBorderPainted(false);
        z.setBackground(null);
        z.setFocusable(false);
        z.addActionListener(e -> click(z.getText()));
        z.setFont(new Font("Monaco", Font.BOLD, 18));
        z.setBorderPainted(false);
        x.setBackground(null);
        x.setFocusable(false);
        x.addActionListener(e -> click(x.getText()));
        x.setFont(new Font("Monaco", Font.BOLD, 18));
        x.setBorderPainted(false);
        c.setBackground(null);
        c.setFocusable(false);
        c.addActionListener(e -> click(c.getText()));
        c.setFont(new Font("Monaco", Font.BOLD, 18));
        c.setBorderPainted(false);
        v.setBackground(null);
        v.setFocusable(false);
        v.addActionListener(e -> click(v.getText()));
        v.setFont(new Font("Monaco", Font.BOLD, 18));
        v.setBorderPainted(false);
        b.setBackground(null);
        b.setFocusable(false);
        b.addActionListener(e -> click(b.getText()));
        b.setFont(new Font("Monaco", Font.BOLD, 18));
        b.setBorderPainted(false);
        n.setBackground(null);
        n.setFocusable(false);
        n.addActionListener(e -> click(n.getText()));
        n.setFont(new Font("Monaco", Font.BOLD, 18));
        n.setBorderPainted(false);
        m.setBackground(null);
        m.setFocusable(false);
        m.addActionListener(e -> click(m.getText()));
        m.setFont(new Font("Monaco", Font.BOLD, 18));
        m.setBorderPainted(false);
        bxps.setBackground(null);
        bxps.setFocusable(false);
        bxps.addActionListener(e -> click("bxps"));
        bxps.setFont(new Font("Monaco", Font.BOLD, 18));
        bxps.setBorderPainted(false);
        ntr.setBackground(null);
        ntr.setFocusable(false);
        ntr.addActionListener(e -> click("ntr"));
        ntr.setFont(new Font("Monaco", Font.BOLD, 18));
        ntr.setBorderPainted(false);

                                //adding each key to its respective keyboard panel
        qwe.add(q);
        qwe.add(w);
        qwe.add(e);
        qwe.add(r);
        qwe.add(t);
        qwe.add(y);
        qwe.add(u);
        qwe.add(i);
        qwe.add(o);
        qwe.add(p);

        asd.add(a);
        asd.add(s);
        asd.add(d);
        asd.add(f);
        asd.add(g);
        asd.add(h);
        asd.add(j);
        asd.add(k);
        asd.add(l);

        zxc.add(bxps);
        zxc.add(z);
        zxc.add(x);
        zxc.add(c);
        zxc.add(v);
        zxc.add(b);
        zxc.add(n);
        zxc.add(m);
        zxc.add(ntr);

        frame.addKeyListener(new KeyAdapter() // adding corresponding event to each key on the keyboard
        {
            @Override
            public void keyPressed(KeyEvent e) 
            {
                char inp = Character.toUpperCase(e.getKeyChar());

                if (inp >= 'A' && inp <= 'Z') 
                {
                    click(String.valueOf(inp));
                }
                else if (e.getKeyCode() == KeyEvent.VK_ENTER) 
                {
                    click("ntr");
                }
                else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) 
                {
                    click("bxps");
                }
            }
        });

        for (int i = 0; i < 6; i++)   // adding a 5*6 grid of panels for gameplay
        {
            for (int j = 0; j < 5; j++)
            {
                xy[i][j] = new JLabel();
                xy[i][j].setBackground(new Color(100,100,100));
                xy[i][j].setOpaque(true);
                xy[i][j].setVerticalAlignment(JLabel.CENTER);
                xy[i][j].setHorizontalAlignment(JLabel.CENTER);
                xy[i][j].setFont(new Font("Monaco", Font.BOLD, 25));
                xy[i][j].setText(" " );
                xy[i][j].setForeground(new Color(200,200,200));
                gamep.add(xy[i][j]);
            }
        }
        frame.add(qwe); //adding the keyboard panels to the frame
        frame.add(asd);
        frame.add(zxc);
        frame.add(gamep); //adding gameplay panel to the frame
        frame.setVisible(true);
    }

    public static void click(String a)
    {
        if(gn<6 && victorytoggle == 0)
        {
            if (a.equals("bxps")) //backspace
            {
                if (ln > 0 || ln == 5) 
                {
                    ln--;
                }
                xy[gn][ln].setText(" "); //remove most recent letter on gamep
                guess = guess.substring(0, ln); //remove last char form guess
            } 
            else if (a.equals("ntr") && ln == 5) // enter is pressed AND guess is a 5letter word
            {
                wordle(); //checl guess
                gn++; //guess number increases
                ln = 0; //letter no is back to zero
                guess = ""; // empty the string for next guess
            } 
            else 
            {
                if (ln == 5) 
                {
                    //nothing happens if word is already 5 letter
                } 
                else if (a.equals("bxps") == false && a.equals("ntr") == false) // add input to guess if input is not backspace or enter 
                {
                    xy[gn][ln].setText(a);
                    guess = guess + a;
                    ln++;
                }
            }
            System.out.println("\u001b[32m" + guess + "\u001b[0m");
            System.out.println("\u001b[36m" + gn + " " + ln + "\u001b[0m");
        }
        if (a.equals("ntr") && ln == 0 && gn == 6 && gamep.getBackground()!=defgreen && victorytoggle==0) //if pressed enter AND letter no =0 AND guess no=6 AND game panel background not alaready green AND victory toggle =0 meaning we havent won yet
            {
                JPanel endPanel = new JPanel();
                endPanel.setBackground(new Color(50, 50, 50, 230)); //a is for alpha transparency and rgb are for red green blue
                endPanel.setBounds(0, 0, width, height);
                endPanel.setLayout(new BorderLayout());

                JLabel gameOverLabel = new JLabel("Game Over", JLabel.CENTER);
                gameOverLabel.setFont(new Font("Monaco", Font.BOLD, 48));
                gameOverLabel.setForeground(Color.WHITE);

                JLabel correctWordLabel = new JLabel("Correct word: " + word.toUpperCase(), JLabel.CENTER);
                correctWordLabel.setFont(new Font("Monaco", Font.PLAIN, 28));
                correctWordLabel.setForeground(Color.LIGHT_GRAY);

                endPanel.add(gameOverLabel, BorderLayout.CENTER);
                endPanel.add(correctWordLabel, BorderLayout.SOUTH);

                JPanel blocker = new JPanel();// panel to block on screen inputs
                blocker.setOpaque(false);
                blocker.addMouseListener(new java.awt.event.MouseAdapter() {});
                frame.setGlassPane(blocker);
                blocker.setVisible(true);
                frame.add(endPanel);
                frame.setComponentZOrder(endPanel, 0);
                frame.revalidate();
                frame.repaint();
            } 
    }

    public static void wordle()
    {
        if(gn<6) //if no guesses is less that 6
        {

            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(guess.charAt(i)==word.charAt(j) && i==j) //if letter is present and is in the correct place
                    {
                        xy[gn][i].setBackground(defgreen); // change panel color to green in gamep
                        xy[gn][i].setForeground(defgrey);
                        
                        chngBtnClr2(guess.toLowerCase().charAt(i), defgreen); //change button color to green
                    }
                    else if(guess.charAt(i)==word.charAt(j) && j!=i && xy[gn][i].getBackground() != defgreen) //if letter is present but in the wrong place
                    {
                        xy[gn][i].setBackground(defyellow); //change panel color to yellow in gamep
                        xy[gn][i].setForeground(defgrey);
                        xy[gn][i].setOpaque(true);
                        
                        chngBtnClr2(guess.toLowerCase().charAt(i), defyellow); //change button color to green
                    }
                    else if(!word.contains(String.valueOf(guess.charAt(i))))
                    {
                        xy[gn][i].setBackground(defgrey); //change panel color to grey in gamep
                        xy[gn][i].setForeground(new Color(220, 220, 220));
                        chngBtnClr2(guess.toLowerCase().charAt(i), defgrey);// change button color to grey
                    }
                }
            }
            
            if (guess.equals(word)) // corrct guess
            {
                gamep.setBackground(new Color(150,255,150));
                JPanel endPanel = new JPanel();
                endPanel.setBackground(new Color(50, 50, 50, 230));
                endPanel.setBounds(0, 0, width, height);
                endPanel.setLayout(new BorderLayout());
                
                JLabel gameOverLabel = new JLabel("YOU WINN!!!", JLabel.CENTER);
                gameOverLabel.setFont(new Font("Monaco", Font.BOLD, 48));
                gameOverLabel.setForeground(Color.WHITE);

                JLabel correctWordLabel = new JLabel("THE WORD WAS " + word.toUpperCase(), JLabel.CENTER);
                correctWordLabel.setFont(new Font("Monaco", Font.PLAIN, 28));
                correctWordLabel.setForeground(Color.LIGHT_GRAY);

                endPanel.add(gameOverLabel, BorderLayout.CENTER);
                endPanel.add(correctWordLabel, BorderLayout.SOUTH);

                JPanel blocker = new JPanel();
                blocker.setOpaque(false);
                blocker.addMouseListener(new java.awt.event.MouseAdapter() {});
                frame.setGlassPane(blocker);
                blocker.setVisible(true);
                frame.add(endPanel);
                frame.setComponentZOrder(endPanel, 0);
                frame.revalidate();
                frame.repaint();
                victorytoggle=1;
            }
        }
        else if(gamep.getBackground()!=defgreen)
        {
            gamep.setBackground(defgreen);
        }
    }


    public static void chngBtnClr2(char bu,Color cl)
    {
        if(bu=='a')
        {
            if(cl== defgreen) //if new color is green, just change the color
                a.setBackground(cl);
            else if(cl==defyellow && a.getBackground() != defgreen) //if new color is yellow, only change color if its not already green
            {
                a.setBackground(cl);
            }
            else if(cl==defgrey && a.getBackground() != defyellow &&a.getBackground() != defgreen) //if new color is grey, only change the color if its not already yellow or green
            {
                a.setBackground(cl);
            }
        }
        else if(bu=='b' && b.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                b.setBackground(cl);
            else if(cl==defyellow && b.getBackground() != defgreen)
            {
                b.setBackground(cl);
            }
            else if(cl==defgrey && b.getBackground() != defyellow &&b.getBackground() != defgreen)
            {
                b.setBackground(cl);
            }
        }
        else if(bu=='c' && c.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                c.setBackground(cl);
            else if(cl==defyellow && c.getBackground() != defgreen)
            {
                c.setBackground(cl);
            }
            else if(cl==defgrey && c.getBackground() != defyellow &&c.getBackground() != defgreen)
            {
                c.setBackground(cl);
            }
        }
        else if(bu=='d' && d.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                d.setBackground(cl);
            else if(cl==defyellow && d.getBackground() != defgreen)
            {
                d.setBackground(cl);
            }
            else if(cl==defgrey && d.getBackground() != defyellow &&d.getBackground() != defgreen)
            {
                d.setBackground(cl);
            }
        }
        else if(bu=='e' && e.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                e.setBackground(cl);
            else if(cl==defyellow && e.getBackground() != defgreen)
            {
                e.setBackground(cl);
            }
            else if(cl==defgrey && e.getBackground() != defyellow &&e.getBackground() != defgreen)
            {
                e.setBackground(cl);
            }
        }
        else if(bu=='f' && f.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                f.setBackground(cl);
            else if(cl==defyellow && f.getBackground() != defgreen)
            {
                f.setBackground(cl);
            }
            else if(cl==defgrey && f.getBackground() != defyellow &&f.getBackground() != defgreen)
            {
                f.setBackground(cl);
            }
        }
        else if(bu=='g' && g.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                g.setBackground(cl);
            else if(cl==defyellow && g.getBackground() != defgreen)
            {
                g.setBackground(cl);
            }
            else if(cl==defgrey && g.getBackground() != defyellow &&g.getBackground() != defgreen)
            {
                g.setBackground(cl);
            }
        }
        else if(bu=='h' && h.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                h.setBackground(cl);
            else if(cl==defyellow && h.getBackground() != defgreen)
            {
                h.setBackground(cl);
            }
            else if(cl==defgrey && h.getBackground() != defyellow &&h.getBackground() != defgreen)
            {
                h.setBackground(cl);
            }
        }
        else if(bu=='i' && i.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                i.setBackground(cl);
            else if(cl==defyellow && i.getBackground() != defgreen)
            {
                i.setBackground(cl);
            }
            else if(cl==defgrey && i.getBackground() != defyellow &&i.getBackground() != defgreen)
            {
                i.setBackground(cl);
            }
        }
        else if(bu=='j' && j.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                j.setBackground(cl);
            else if(cl==defyellow && j.getBackground() != defgreen)
            {
                j.setBackground(cl);
            }
            else if(cl==defgrey && j.getBackground() != defyellow &&j.getBackground() != defgreen)
            {
                j.setBackground(cl);
            }
        }
        else if(bu=='k' && k.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                k.setBackground(cl);
            else if(cl==defyellow && k.getBackground() != defgreen)
            {
                k.setBackground(cl);
            }
            else if(cl==defgrey && k.getBackground() != defyellow &&k.getBackground() != defgreen)
            {
                k.setBackground(cl);
            }
        }
        else if(bu=='l' && l.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                l.setBackground(cl);
            else if(cl==defyellow && l.getBackground() != defgreen)
            {
                l.setBackground(cl);
            }
            else if(cl==defgrey && l.getBackground() != defyellow &&l.getBackground() != defgreen)
            {
                l.setBackground(cl);
            }
        }
        else if(bu=='m' && m.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                m.setBackground(cl);
            else if(cl==defyellow && m.getBackground() != defgreen)
            {
                m.setBackground(cl);
            }
            else if(cl==defgrey && m.getBackground() != defyellow &&m.getBackground() != defgreen)
            {
                m.setBackground(cl);
            }
        }
        else if(bu=='n' && n.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                n.setBackground(cl);
            else if(cl==defyellow && n.getBackground() != defgreen)
            {
                n.setBackground(cl);
            }
            else if(cl==defgrey && n.getBackground() != defyellow &&n.getBackground() != defgreen)
            {
                n.setBackground(cl);
            }
        }
        else if(bu=='o' && o.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                o.setBackground(cl);
            else if(cl==defyellow && o.getBackground() != defgreen)
            {
                o.setBackground(cl);
            }
            else if(cl==defgrey && o.getBackground() != defyellow &&o.getBackground() != defgreen)
            {
                o.setBackground(cl);
            }
        }
        else if(bu=='p' && p.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                p.setBackground(cl);
            else if(cl==defyellow && p.getBackground() != defgreen)
            {
                p.setBackground(cl);
            }
            else if(cl==defgrey && p.getBackground() != defyellow &&p.getBackground() != defgreen)
            {
                p.setBackground(cl);
            }
        }
        else if(bu=='q' && q.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                q.setBackground(cl);
            else if(cl==defyellow && q.getBackground() != defgreen)
            {
                q.setBackground(cl);
            }
            else if(cl==defgrey && q.getBackground() != defyellow &&q.getBackground() != defgreen)
            {
                q.setBackground(cl);
            }
        }
        else if(bu=='r' && r.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                r.setBackground(cl);
            else if(cl==defyellow && r.getBackground() != defgreen)
            {
                r.setBackground(cl);
            }
            else if(cl==defgrey && r.getBackground() != defyellow &&r.getBackground() != defgreen)
            {
                r.setBackground(cl);
            }
        }
        else if(bu=='s' && s.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                s.setBackground(cl);
            else if(cl==defyellow && s.getBackground() != defgreen)
            {
                s.setBackground(cl);
            }
            else if(cl==defgrey && s.getBackground() != defyellow &&s.getBackground() != defgreen)
            {
                s.setBackground(cl);
            }
        }
        else if(bu=='t' && t.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                t.setBackground(cl);
            else if(cl==defyellow && t.getBackground() != defgreen)
            {
                t.setBackground(cl);
            }
            else if(cl==defgrey && t.getBackground() != defyellow &&t.getBackground() != defgreen)
            {
                t.setBackground(cl);
            }
        }
        else if(bu=='u' && u.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                u.setBackground(cl);
            else if(cl==defyellow && u.getBackground() != defgreen)
            {
                u.setBackground(cl);
            }
            else if(cl==defgrey && u.getBackground() != defyellow &&u.getBackground() != defgreen)
            {
                u.setBackground(cl);
            }
        }
        else if(bu=='v' && v.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                v.setBackground(cl);
            else if(cl==defyellow && v.getBackground() != defgreen)
            {
                v.setBackground(cl);
            }
            else if(cl==defgrey && v.getBackground() != defyellow &&v.getBackground() != defgreen)
            {
                v.setBackground(cl);
            }
        }
        else if(bu=='w' && w.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                w.setBackground(cl);
            else if(cl==defyellow && w.getBackground() != defgreen)
            {
                w.setBackground(cl);
            }
            else if(cl==defgrey && w.getBackground() != defyellow &&w.getBackground() != defgreen)
            {
                w.setBackground(cl);
            }
        }
        else if(bu=='x' && x.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                x.setBackground(cl);
            else if(cl==defyellow && x.getBackground() != defgreen)
            {
                x.setBackground(cl);
            }
            else if(cl==defgrey && x.getBackground() != defyellow &&x.getBackground() != defgreen)
            {
                x.setBackground(cl);
            }
        }
        else if(bu=='y' && y.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                y.setBackground(cl);
            else if(cl==defyellow && y.getBackground() != defgreen)
            {
                y.setBackground(cl);
            }
            else if(cl==defgrey && y.getBackground() != defyellow &&y.getBackground() != defgreen)
            {
                y.setBackground(cl);
            }
        }
        else if(bu=='z' && z.getBackground() !=defgreen)
        {
            if(cl== defgreen)
                z.setBackground(cl);
            else if(cl==defyellow && z.getBackground() != defgreen)
            {
                z.setBackground(cl);
            }
            else if(cl==defgrey && z.getBackground() != defyellow &&z.getBackground() != defgreen)
            {
                z.setBackground(cl);
            }
        }
    }

    public static void chngBtntxt(char bu,Color cl)
    {
        if(bu=='a' && a.getBackground() !=defgreen )
        {
            a.setForeground(cl);
        }
        else if(bu=='b' && b.getBackground() !=defgreen )
        {
            b.setForeground(cl);
        }
        else if(bu=='c' && c.getBackground() !=defgreen )
        {
            c.setForeground(cl);
        }
        else if(bu=='d' && d.getBackground() !=defgreen )
        {
            d.setForeground(cl);
        }
        else if(bu=='e' && e.getBackground() !=defgreen )
        {
            e.setForeground(cl);
        }
        else if(bu=='f' && f.getBackground() !=defgreen )
        {
            f.setForeground(cl);
        }
        else if(bu=='g' && g.getBackground() !=defgreen )
        {
            g.setForeground(cl);
        }
        else if(bu=='h' && h.getBackground() !=defgreen )
        {
            h.setForeground(cl);
        }
        else if(bu=='i' && i.getBackground() !=defgreen )
        {
            i.setForeground(cl);
        }
        else if(bu=='j' && j.getBackground() !=defgreen )
        {
            j.setForeground(cl);
        }
        else if(bu=='k' && k.getBackground() !=defgreen )
        {
            k.setForeground(cl);
        }
        else if(bu=='l' && l.getBackground() !=defgreen )
        {
            l.setForeground(cl);
        }
        else if(bu=='m' && m.getBackground() !=defgreen )
        {
            m.setForeground(cl);
        }
        else if(bu=='n' && n.getBackground() !=defgreen )
        {
            n.setForeground(cl);
        }
        else if(bu=='o' && o.getBackground() !=defgreen )
        {
            o.setForeground(cl);
        }
        else if(bu=='p' && p.getBackground() !=defgreen )
        {
            p.setForeground(cl);
        }
        else if(bu=='q' && q.getBackground() !=defgreen )
        {
            q.setForeground(cl);
        }
        else if(bu=='r' && r.getBackground() !=defgreen )
        {
            r.setForeground(cl);
        }
        else if(bu=='s' && s.getBackground() !=defgreen )
        {
            s.setForeground(cl);
        }
        else if(bu=='t' && t.getBackground() !=defgreen )
        {
            t.setForeground(cl);
        }
        else if(bu=='u' && u.getBackground() !=defgreen )
        {
            u.setForeground(cl);
        }
        else if(bu=='v' && v.getBackground() !=defgreen )
        {
            v.setForeground(cl);
        }
        else if(bu=='w' && w.getBackground() !=defgreen )
        {
            w.setForeground(cl);
        }
        else if(bu=='x' && x.getBackground() !=defgreen )
        {
            x.setForeground(cl);
        }
        else if(bu=='y' && y.getBackground() !=defgreen )
        {
            y.setForeground(cl);
        }
        else if(bu=='z' && z.getBackground() !=defgreen )
        {
            z.setForeground(cl);
        }
    }
    public static String getword() //  function to get and return a random word from wordleGUI.txt
	{
		try (BufferedReader r = new BufferedReader(new FileReader("wordleGUI.txt")))
        {
			String a;
			ArrayList<String> l = new ArrayList<>();
			while ((a = r.readLine()) != null) 
            {
				l.add(a);
			}

			Random ra = new Random();
			int x = ra.nextInt(l.size());
			String w = l.get(x);
			return w;
		} 
        catch (FileNotFoundException e) 
        {
			System.out.println("couldnt locate file");
			return "0";
		} 
        catch (IOException e) 
        {
			System.out.println("error");
			return "0";
		}
	}
}
