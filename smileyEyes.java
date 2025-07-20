import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class smileyEyes 
{
    static JPanel p1 = new JPanel();
    static JPanel p2 = new JPanel();
    static JPanel p3 = new JPanel();
    static JPanel p4 = new JPanel();
    static JPanel p5 = new JPanel();
    static JPanel p6 = new JPanel();
    static JPanel p7 = new JPanel();
    static JPanel p8 = new JPanel();
    static JPanel p9 = new JPanel();
    static JPanel p10 = new JPanel();

    static JLabel png = new JLabel();
    static JLabel txt = new JLabel();

    static ImageIcon top = new ImageIcon("smiley top 300.png");
    static ImageIcon bottom = new ImageIcon("smiley bottom 300.png");
    static ImageIcon left = new ImageIcon("smiley left 300.png");
    static ImageIcon right = new ImageIcon("smiley right 300.png");
    static ImageIcon topl = new ImageIcon("smiley top left 300.png");
    static ImageIcon topr = new ImageIcon("smiley top right 300.png");
    static ImageIcon bottoml = new ImageIcon("smiley bottom left 300.png");
    static ImageIcon bottomr = new ImageIcon("smiley bottom right 300.png");
    static ImageIcon cross = new ImageIcon("smiley crosseyed 300.png");
    static ImageIcon def = new ImageIcon("smiley default 300.png");
    static ImageIcon blank = new ImageIcon("smiley blank 300.png");

    static JFrame f = new JFrame(" SMILEY EYES ");
    public static void main(String[] args) 
    {
        Color bg = new Color(4, 86, 115);
        p1.setBounds(0, 200, 266, 266);
        p1.setBackground(bg);
        p1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                png.setIcon(topl);
            }
            public void mouseExited(MouseEvent e) {
                
                png.setIcon(def);
            }
            public void mousePressed(MouseEvent e)
            {
                png.setIcon(blank);
            }
            public void mouseReleased(MouseEvent e)
            {
                png.setIcon(topl);
            }
        });

        p2.setBounds(266, 200, 266, 296);
        p2.setBackground(bg);
        p2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                png.setIcon(top);
            }
            public void mouseExited(MouseEvent e) {
                png.setIcon(def);
            }
            public void mousePressed(MouseEvent e)
            {
                png.setIcon(blank);
            }
            public void mouseReleased(MouseEvent e)
            {
                png.setIcon(top);
            }
        });

        p3.setBounds(532, 200, 266, 266);
        p3.setBackground(bg);
        p3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                png.setIcon(topr);
            }
            public void mouseExited(MouseEvent e) {
                png.setIcon(def);
            }
            public void mousePressed(MouseEvent e)
            {
                png.setIcon(blank);
            }
            public void mouseReleased(MouseEvent e)
            {
                png.setIcon(topr);
            }
        });

        p4.setBounds(0, 466, 296, 266);
        p4.setBackground(bg);
        p4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                png.setIcon(left);
            }
            public void mouseExited(MouseEvent e) {
                png.setIcon(def);
            }
            public void mousePressed(MouseEvent e)
            {
                png.setIcon(blank);
            }
            public void mouseReleased(MouseEvent e)
            {
                png.setIcon(left);
            }
        });

        p5.setBounds(296, 496, 211, 211);
        p5.setBackground(bg);
        p5.setLayout(new java.awt.BorderLayout());
        p5.add(png, java.awt.BorderLayout.CENTER);
        png.setSize(100, 100);
        png.setHorizontalAlignment(JLabel.CENTER);
        png.setVisible(true);
        png.setIcon(def);
        //png.setText("pappu");
        //png.setFont(null);
        p5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                png.setIcon(cross);
            }
            public void mouseExited(MouseEvent e) {
                png.setIcon(def);
            }
            public void mousePressed(MouseEvent e)
            {
                png.setIcon(blank);
            }
            public void mouseReleased(MouseEvent e)
            {
                png.setIcon(cross);
            }
        });

        p6.setBounds(502, 466, 296, 266);
        p6.setBackground(bg);
        p6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                png.setIcon(right);
            }

            public void mouseExited(MouseEvent e) {
                png.setIcon(def);
            }
            public void mousePressed(MouseEvent e)
            {
                png.setIcon(blank);
            }
            public void mouseReleased(MouseEvent e)
            {
                png.setIcon(right);
            }
            
        });

        p7.setBounds(0, 732, 266, 266);
        p7.setBackground(bg);
        p7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                png.setIcon(bottoml);
            }

            public void mouseExited(MouseEvent e) {
                png.setIcon(def);
            }
            public void mousePressed(MouseEvent e)
            {
                png.setIcon(blank);
            }
            public void mouseReleased(MouseEvent e)
            {
                png.setIcon(bottoml);
            }
            
        });

        p8.setBounds(266, 703, 266, 295);
        p8.setBackground(bg);
        p8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                png.setIcon(bottom);
            }

            public void mouseExited(MouseEvent e) {
                png.setIcon(def);
            }
            public void mousePressed(MouseEvent e)
            {
                png.setIcon(blank);
            }
            public void mouseReleased(MouseEvent e)
            {
                png.setIcon(bottom);
            }
            
        });

        p9.setBounds(532, 732, 266, 266);
        p9.setBackground(bg);
        p9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                png.setIcon(bottomr);
            }

            public void mouseExited(MouseEvent e) {
                png.setIcon(def);
            }
            public void mousePressed(MouseEvent e)
            {
                png.setIcon(blank);
            }
            public void mouseReleased(MouseEvent e)
            {
                png.setIcon(bottomr);
            }
            
        });


        p10.setBounds(0, 0, 800, 200);
        p10.setBackground(new Color(181, 189, 196));
        p10.setLayout(null);
        txt.setBounds(25, 75, 800, 58);
        p10.add(txt);
        txt.setForeground(new Color(100,100,100));
        txt.setText(
                "<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MOVE THE CURSOR<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;AROUND THE SMILEY FACE INSIDE THE WINDOW<html>");
        txt.setFont(new Font("Arial Black",Font.BOLD,23));





        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 1000);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6);
        f.add(p7);
        f.add(p8);
        f.add(p9);
        f.add(p10);
    }

}