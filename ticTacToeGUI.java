import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;


public class ticTacToeGUI 
{
    static boolean gameOver = false;
    static int[][] tally = new int[3][3];
    static int width = 800;
    static int height = 800;
    static int num = 0;
    static JLabel[][] l = new JLabel[3][3];
    static JPanel endPanel=null;
    static JPanel p2=new JPanel();
    static JPanel p1=new JPanel();
    static ImageIcon x = new ImageIcon("x.png");
    static ImageIcon o = new ImageIcon("o.png");
    static JPanel[][] panels = new JPanel[3][3];
    static JFrame f=new JFrame(" TIC TAC TOE ");
    public static void main(String[] args) 
        {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(width,height);
        f.setResizable(false);
        f.setBackground(null);
        f.setLayout(null);
        f.getContentPane().setBackground(new Color(200,200,230));
        p2.setLayout(null);
        p2.setBounds(40,40,width -100,height -100);
        p2.setBackground(new Color(102, 102, 153));
        p2.setBorder(new EmptyBorder(10, 10, 10, 10));
        p1.setBackground(new Color(102, 102, 153));
        p1.setLayout(new GridLayout(3, 3, 10,10));
        p1.setBounds(0, 0, width - 100, height - 100);
        p1.setOpaque(false);
        p2.setOpaque(false);
        p2.add(p1);
        for(int i=0;i<3;i++)
        {
            for(int j=0; j<3;j++)
            {
                tally[i][j] =5;
                final int row = i;
                final int col = j;
                l[i][j] = new JLabel();
                p1.add(panels[i][j]);
                panels[i][j]=new JPanel();
                panels[i][j].setBackground(new Color(180,180,210));
                panels[i][j].add(l[i][j]);
                panels[i][j].addMouseListener(new MouseAdapter() 
                {
                    @Override
                    public void mousePressed(MouseEvent e)
                    {
                        if(num==0 && l[row][col].getIcon() == null && gameOver == false)
                        {
                            l[row][col].setIcon(x);
                            num=1;
                            tally[row][col] = 1;
                        }
                        else if(num==1 && l[row][col].getIcon() == null && gameOver == false)
                        {
                            l[row][col].setIcon(o);
                            num=0;
                            tally[row][col] = 0;
                        }
                        check();
                    }
                });
            }
        }
        f.add(p2);
        f.setVisible(true);
    }
    public static void check()
    {

        if(gameOver==false)
        {
            if(tally[0][0] == tally[1][1] && tally[1][1] == tally[2][2] && tally[0][0] != 5)
            {
                if(tally[0][0] == 1)
                {
                    gameOver = true;
                    endscreen(" X wins!");
                }
                else
                {
                    gameOver = true;
                    endscreen( " O wins!");
                }
            }
            if(tally[0][2] == tally[1][1] && tally[1][1] == tally[2][0] && tally[0][2] != 5)
            {
                if(tally[0][2] == 1)
                {
                    gameOver = true;
                    endscreen(" X wins!");
                }
                else
                {
                    gameOver = true;
                    endscreen( " O wins!");
                }
            }
            for(int i=0;i<3;i++)
            {
                if(tally[i][0] == tally[i][1] && tally[i][1] == tally[i][2] && tally[i][0] != 5)
                {
                    if(tally[i][0] == 1)
                    {
                        gameOver = true;
                        endscreen(" X wins!");
                    }
                    else
                    {
                        gameOver = true;
                        endscreen( " O wins!");
                    }
                }
            }
            int t=0;
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(tally[i][j] == 5)
                    {
                        t++;
                    }
                }
            }
            if(t == 0 && gameOver == false)
            {
                endscreen(" It's a draw!");
                gameOver = true;
            }
        }
    }
    public static void resetGame()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0; j<3;j++)
            {
                tally[i][j] = 5;
                l[i][j].setIcon(null);
            }
        }
        num = 0;
        gameOver = false;
        f.remove(endPanel);
        f.repaint();
        f.revalidate();
    }
    public static void endscreen(String s)
    {
        endPanel = new JPanel();
        endPanel.setBackground(new Color(50, 50, 50, 230));
        endPanel.setBounds(0, 0, width, height);
        endPanel.setLayout(new BorderLayout());
        JButton restartButton = new JButton("Restart");
        restartButton.setFont(new Font("Monaco", Font.BOLD, 24));
        restartButton.setForeground(Color.WHITE);
        restartButton.setBackground(new Color(102, 102, 153));
        restartButton.addActionListener(e -> {
            for(int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tally[i][j] = 5;
                    l[i][j].setIcon(null);
                }
            }
            endPanel.setVisible(false);
            endPanel.removeAll();
            resetGame();
            f.revalidate();
            f.repaint();
        });
        endPanel.add(restartButton, BorderLayout.SOUTH);
        endPanel.setBorder(new LineBorder(Color.WHITE, 2));
        
        JLabel gameOverLabel = new JLabel(s, JLabel.CENTER);
        gameOverLabel.setFont(new Font("Monaco", Font.BOLD, 48));
        gameOverLabel.setForeground(Color.WHITE);
        endPanel.add(gameOverLabel, BorderLayout.CENTER);
        f.add(endPanel);
        f.setComponentZOrder(endPanel, 0);
        f.revalidate();
        f.repaint();
    }
}
