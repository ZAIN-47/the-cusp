import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class carMoves {
    static int w = 800;
    static int h = 800;

    static JLabel png = new JLabel();
    static JLabel txt = new JLabel(" use W or A or S or D");

    static JPanel p = new JPanel();

    static ImageIcon carn = new ImageIcon("carN.png");
    static ImageIcon cars = new ImageIcon("carS.png");
    static ImageIcon care = new ImageIcon("carE.png");
    static ImageIcon carw = new ImageIcon("carW.png");

    static JFrame f = new JFrame(" CAR MOVES ");
    public static void main(String[] args) 
    {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(w, h);
        f.setLocationRelativeTo(null);
        f.setBackground(new Color(30, 30, 90));
        f.setResizable(false);
        p.setBounds(0, 0, w, h);
        p.setBackground(new Color(10, 10, 10));
        p.setLayout(null);
        
        p.add(png);
        png.setBounds((w/2) -50, (h/2) -100, 200, 200);;
        png.setSize(200, 200);
        png.setVisible(true);
        
        png.setIcon(carn);
        
        p.add(txt, java.awt.BorderLayout.CENTER);
        txt.setText("<html>&nbsp;To move the car, Use<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;W<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;A &nbsp;&nbsp;&nbsp;S&nbsp;&nbsp;&nbsp;&nbsp;D</html>");
        txt.setBounds(w/2-200, -100, 400, 600);
        txt.setFont(new Font("MV Boli", Font.BOLD, 25));
        txt.setForeground(new Color(50, 50, 50));
        txt.setHorizontalAlignment(JLabel.CENTER);
        
        p.setVisible(true);
        
        
        f.addKeyListener( new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                char a=e.getKeyChar();
                System.out.println(png.getX() + " " + png.getY()+ " "+ e.getKeyChar());
                if (a == 'w')
                {
                    png.setIcon(carn);
                    if(png.getY()>-10)
                    png.setLocation(png.getX(), png.getY() - 40);
                    
                }
                else if (a == 's')
                {
                    png.setIcon(cars);
                    if(png.getY()< h-230)
                    png.setLocation(png.getX(), png.getY() + 40);
                }
                else if (a == 'a')
                {
                    png.setIcon(carw);
                    if(png.getX()>0)
                    png.setLocation(png.getX() - 40, png.getY());
                }
                else if (a == 'd')
                {
                    png.setIcon(care);
                    if(png.getX()<w-230)
                    png.setLocation(png.getX()+40,png.getY() );
                }
            }
            
        });
        
        png.setLocation((w/2)-50, (h/2)-100);
        f.setLayout(null);
        f.add(p);
        f.setVisible(true);
        
    }

}
