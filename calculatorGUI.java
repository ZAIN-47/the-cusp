import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

public class calculatorGUI
{
    static ArrayList<Integer> n = new ArrayList<>();// for concatting nums
    static int w = 400;// height
    static int h = 550;// width
    static ArrayList<String> calc = new ArrayList<>(); // array of eq
    static ArrayList<String> tc = new ArrayList<>(); // array after dm in bodmas
    static String[] cal; // array for calculation

    static JLabel eq = new JLabel(" ");
    static JLabel ans = new JLabel(" ");

    static JButton b1 = new JButton("1");
    static JButton b2 = new JButton("2");
    static JButton b3 = new JButton("3");
    static JButton b4 = new JButton("4");
    static JButton b5 = new JButton("5");
    static JButton b6 = new JButton("6");
    static JButton b7 = new JButton("7");
    static JButton b8 = new JButton("8");
    static JButton b9 = new JButton("9");
    static JButton b0 = new JButton("0");
    static JButton bp = new JButton("+");
    static JButton bm = new JButton("-");
    static JButton bi = new JButton("*");
    static JButton bd = new JButton("/");
    static JButton be = new JButton("=");
    static JButton bac = new JButton("AC");
    static JButton bc = new JButton("←");
    static JButton bdc = new JButton(".");
    static JButton bdz = new JButton("00");
    static JButton mr = new JButton("MORE");

    static Color lb = new Color(255, 205, 145);
    static Color lp = new Color(240, 190, 130);

    static JPanel pn = new JPanel();
    static JPanel pbr = new JPanel();
    static JPanel pbt = new JPanel();
    static JPanel pr = new JPanel();

    static JFrame f = new JFrame(" CALCULATOR ");

    public static void main(String[] args) 
    {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(w, h);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(new Color(201, 219, 226));
        f.setResizable(false);
        f.setLayout(null);

        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);
        b7.setFocusable(false);
        b8.setFocusable(false);
        b9.setFocusable(false);
        b0.setFocusable(false);
        bp.setFocusable(false);
        bm.setFocusable(false);
        bi.setFocusable(false);
        bd.setFocusable(false);
        bdc.setFocusable(false);
        bdz.setFocusable(false);
        bc.setFocusable(false);
        be.setFocusable(false);
        bac.setFocusable(false);
        mr.setFocusable(false);

        b1.setBorderPainted(false);
        b2.setBorderPainted(false);
        b3.setBorderPainted(false);
        b4.setBorderPainted(false);
        b5.setBorderPainted(false);
        b6.setBorderPainted(false);
        b7.setBorderPainted(false);
        b8.setBorderPainted(false);
        b9.setBorderPainted(false);
        b0.setBorderPainted(false);
        bp.setBorderPainted(false);
        bm.setBorderPainted(false);
        bi.setBorderPainted(false);
        bd.setBorderPainted(false);
        bdc.setBorderPainted(false);
        bdz.setBorderPainted(false);
        bc.setBorderPainted(false);
        be.setBorderPainted(false);
        bac.setBorderPainted(false);
        mr.setBorderPainted(false);

        b1.addActionListener(e -> click(b1.getText()));
        b2.addActionListener(e -> click(b2.getText()));
        b3.addActionListener(e -> click(b3.getText()));
        b4.addActionListener(e -> click(b4.getText()));
        b5.addActionListener(e -> click(b5.getText()));
        b6.addActionListener(e -> click(b6.getText()));
        b7.addActionListener(e -> click(b7.getText()));
        b8.addActionListener(e -> click(b8.getText()));
        b9.addActionListener(e -> click(b9.getText()));
        b0.addActionListener(e -> click(b0.getText()));
        bp.addActionListener(e -> click(bp.getText()));
        bm.addActionListener(e -> click(bm.getText()));
        bi.addActionListener(e -> click(bi.getText()));
        bd.addActionListener(e -> click(bd.getText()));
        bdc.addActionListener(e -> click(bdc.getText()));
        bdz.addActionListener(e -> click(bdz.getText()));
        bc.addActionListener(e -> backspace());
        be.addActionListener(e -> click(be.getText()));
        bac.addActionListener(e -> click(bac.getText()));
        mr.addActionListener(e -> click(mr.getText()));

        b1.setFont(new Font("Impact", Font.PLAIN, 18));
        b2.setFont(new Font("Impact", Font.PLAIN, 18));
        b3.setFont(new Font("Impact", Font.PLAIN, 18));
        b4.setFont(new Font("Impact", Font.PLAIN, 18));
        b5.setFont(new Font("Impact", Font.PLAIN, 18));
        b6.setFont(new Font("Impact", Font.PLAIN, 18));
        b7.setFont(new Font("Impact", Font.PLAIN, 18));
        b8.setFont(new Font("Impact", Font.PLAIN, 18));
        b9.setFont(new Font("Impact", Font.PLAIN, 18));
        b0.setFont(new Font("Impact", Font.PLAIN, 18));
        bp.setFont(new Font("Impact", Font.PLAIN, 18));
        bm.setFont(new Font("Impact", Font.BOLD, 18));
        bi.setFont(new Font("Impact", Font.PLAIN, 36));
        bd.setFont(new Font("Impact", Font.PLAIN, 18));
        bdc.setFont(new Font("Impact", Font.PLAIN, 18));
        bdz.setFont(new Font("Impact", Font.PLAIN, 18));
        bc.setFont(new Font("Impact", Font.BOLD, 25));
        be.setFont(new Font("Impact", Font.PLAIN, 18));
        bac.setFont(new Font("Impact", Font.PLAIN, 18));
        mr.setFont(new Font("Impact", Font.PLAIN, 18));

        b1.setBackground(new Color(201, 209, 216));
        b2.setBackground(new Color(201, 209, 216));
        b3.setBackground(new Color(201, 209, 216));
        b4.setBackground(new Color(201, 209, 216));
        b5.setBackground(new Color(201, 209, 216));
        b6.setBackground(new Color(201, 209, 216));
        b7.setBackground(new Color(201, 209, 216));
        b8.setBackground(new Color(201, 209, 216));
        b9.setBackground(new Color(201, 209, 216));
        bdz.setBackground(new Color(201, 209, 216));
        b0.setBackground(new Color(201, 209, 216));
        bdc.setBackground(new Color(201, 209, 216));

        bc.setBackground(lb);
        bp.setBackground(lb);
        bm.setBackground(lb);
        bi.setBackground(lb);
        bd.setBackground(lb);
        be.setBackground(lb);
        bac.setBackground(lb);
        mr.setBackground(lb);

        pn.setBounds(7, 207, 270, 297);
        pn.setBackground(new Color(181, 189, 196));
        pn.setBorder(new EmptyBorder(10, 10, 10, 10));
        pn.setLayout(new GridLayout(4, 4, 10, 10));

        pbr.setBounds(285, 200, 90, 304);
        pbr.setBackground(lp);
        pbr.setBorder(new EmptyBorder(3, 10, 10, 10));
        pbr.setLayout(new GridLayout(4, 1, 10, 10));

        pbt.setBounds(7, 132, 368, 68);
        pbt.setBackground(lp);
        pbt.setBorder(new EmptyBorder(10, 10, 10, 10));
        pbt.setLayout(new GridLayout(1, 4, 10, 10));

        pr.setBounds(7, 10, 368, 116);
        pr.setBackground(new Color(201, 219, 226));
        pr.setBorder(new EmptyBorder(10, 10, 10, 10));
        pr.setLayout(new GridLayout(2, 1, 10, 10));
        pr.setBorder(BorderFactory.createLineBorder(new Color(171, 189, 196), 2));

        ans.setBackground(new Color(201, 219, 226));
        eq.setBackground(new Color(201, 219, 226));
        eq.setFont(new Font("Impact", Font.PLAIN, 18));
        ans.setFont(new Font("Impact", Font.PLAIN, 18));
        eq.setText("");

        pn.add(b1);
        pn.add(b2);
        pn.add(b3);
        pn.add(b4);
        pn.add(b5);
        pn.add(b6);
        pn.add(b7);
        pn.add(b8);
        pn.add(b9);
        pn.add(bdz);
        pn.add(b0);
        pn.add(bdc);

        pbr.add(bp);
        pbr.add(bm);
        pbr.add(bi);
        pbr.add(bd);

        pbt.add(bac);
        pbt.add(bc);
        pbt.add(be);
        pbt.add(mr);

        pr.add(eq);
        pr.add(ans);

        f.add(pn);
        f.add(pbr);
        f.add(pbt);
        f.add(pr);
        f.setVisible(true);
    }
    public static void click(String a) 
    {
        if (eq.getForeground() == Color.GRAY) 
        {
            eq.setForeground(Color.BLACK);
            eq.setFont(new Font("Impact", Font.PLAIN, 18));
            eq.setText("");
        } 
        else if (a == "AC") 
        {
            if (eq.getText() == "") 
            {
                ans.setText("");
            } 
            else 
            {
                eq.setText("");
            }
        }
        if(a == "1") 
        {
            eq.setText(eq.getText() + " 1");
            addd(a);
        } 
        else if (a == "2") 
        {
            eq.setText(eq.getText() + " 2");
            addd(a);
        } 
        else if (a == "3") 
        {
            eq.setText(eq.getText() + " 3");
            addd(a);
        } 
        else if (a == "4") 
        {
            eq.setText(eq.getText() + " 4");
            addd(a);
        } 
        else if (a == "5") 
        {
            eq.setText(eq.getText() + " 5");
            addd(a);
        } 
        else if (a == "6") 
        {
            eq.setText(eq.getText() + " 6");
            addd(a);
        } 
        else if (a == "7") 
        {
            eq.setText(eq.getText() + " 7");
            addd(a);
        } 
        else if (a == "8") 
        {
            eq.setText(eq.getText() + " 8");
            addd(a);
        } 
        else if (a == "9") 
        {
            eq.setText(eq.getText() + " 9");
            addd(a);
        } 
        else if(a=="00")
        {
            addd(a);
        }
        else if (a == "0") 
        {
            eq.setText(eq.getText() + " 0");
            addd(a);
        } 
        else if (a == "+") 
        {
            if (n.isEmpty() && calc.isEmpty())
            {
                System.out.println("nope");
            }
            else
            {
                eq.setText(eq.getText() + " + ");
                addd(a);
            }
        } 
        else if (a == "-") 
        {
            if (n.isEmpty() && calc.isEmpty())
            {
                System.out.println("nope");
            }
            else
            {
                eq.setText(eq.getText() + " - ");
                addd(a);
            }
        } 
        else if (a == "/") 
        {
            if (n.isEmpty() && calc.isEmpty())
            {
                System.out.println("nope");
            }
            else
            {
                eq.setText(eq.getText() + " / ");
                addd(a);
            }
        } 
        else if (a == "*") 
        {
            if (n.isEmpty() && calc.isEmpty())
            {
                System.out.println("nope");
            }
            else
            {
                eq.setText(eq.getText() + " * ");
                addd(a);
            }
        } 
        else if (a == ".") 
        {
            eq.setText(eq.getText() + " .");
        } 
        else if (a == "=") 
        {
            String b = eq.getText();
            if (eq.getText() == "" || eq.getForeground() == Color.GRAY) 
            {
                try 
                {
                    eq.setOpaque(true);
                    eq.setBackground(new Color(201, 219, 0));
                    System.out.println("red");
                    eq.setText(b);
                    eq.paintImmediately(eq.getBounds());
                    Thread.sleep(200);
                    System.out.println("back");
                    eq.setBackground(new Color(201, 219, 226));
                    eq.paintImmediately(eq.getBounds());

                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                }
                eq.setForeground(Color.BLACK);
                eq.setText(b);
                eq.paintImmediately(eq.getBounds());
            } 
            else 
            {
                addd(a);
                eq.setFont(new Font("Impact", Font.PLAIN, 13));
                eq.setForeground(Color.GRAY);
            }
        }
        else if(a=="AC")
        {
            n.clear();
            tc.clear();
            calc.clear();
        }
        else if (a == "bc")
        {
            backspace();
        }

    }

    public static void addd(String a)
    {
        switch (a) 
        {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
                if (n.isEmpty()) 
                {
                    n.add(Integer.parseInt(a));
                } 
                else 
                {

                    int t = n.get(0);
                    t = t * 10;
                    t = t + Integer.parseInt(a);
                    n.set(0, t);
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                calc.add(String.valueOf(n.get(0)));
                calc.add(a);
                n.clear();
                break;
            case "=":
                calc.add(String.valueOf(n.get(0)));
                answer();
                break;
            case "bc":
                backspace();
                break;
        }
    }
    
    public static void answer()
    {
        //for(int i=0;i<)
        cal = new String[calc.size()];
        for (int j = 0; j < calc.size(); j++) 
        {
            cal[j] = calc.get(j);
        }
        print(cal);
        for (int i = 1; i < cal.length; i += 2) 
        {
            switch (cal[i]) 
            {
                case "+":
                case "-":
                    if (tc.isEmpty()) 
                    {
                        tc.add(cal[i - 1]);
                    }
                    tc.add(cal[i]);
                    tc.add(cal[i + 1]);
                    break;
                case "*":
                    if (tc.isEmpty() == false)
                    {    
                        tc.remove(tc.size() - 1);
                    }
                    tc.add(String.valueOf(Integer.parseInt(cal[i - 1]) * Integer.parseInt(cal[i + 1])));
                    cal[i+1] = String.valueOf(Integer.parseInt(cal[i - 1]) * Integer.parseInt(cal[i + 1]));
                    break;
                case "/":
                    if (tc.isEmpty() == false)
                    {    
                        tc.remove(tc.size() - 1);
                    }
                    tc.add(String.valueOf(Integer.parseInt(cal[i - 1]) / Integer.parseInt(cal[i + 1])));
                    cal[i+1] = String.valueOf(Integer.parseInt(cal[i - 1]) / Integer.parseInt(cal[i + 1]));
                    break;
            }
        }
        System.out.println();
        
        System.out.println();
        printl(tc);
        int result = Integer.parseInt(tc.get(0));
        if (tc.size() > 1) 
        {

            for(int x=1;x<tc.size();x+=2)
            {
                if (tc.get(x) == "+")
                result += Integer.parseInt(tc.get(x + 1));
                else if (tc.get(x) == "-")
                result -= Integer.parseInt(tc.get(x + 1));
                else
                System.out.println("error");
            }
        }
        System.out.println(result);
        ans.setText(String.valueOf(result));
        n.clear();
        tc.clear();
        calc.clear();
    }

    public static void printl(ArrayList<String>a)
    {
        String[] b = new String[a.size()];
        for(int x=0;x<+a.size();x++)
        {
            b[x] = a.get(x);
        }
        print(b);
    }
    public static void print(String[] a)
    {
        for (int j = 0; j < a.length; j++) 
        {
            System.out.print(a[j] + "  , ");
        }
    }
    
    
    

    public static void backspace()
    {
        if (n.isEmpty()) 
        {
            calc.remove(calc.size() - 1);
            int t = Integer.parseInt(calc.get(calc.size() - 1));
            n.add(t);
            calc.remove(calc.size() - 1);
        } 
        else if (n.isEmpty() == false) 
        {
            int t = n.get(0);
            t = t / 10;
            n.set(0, t);
            if(n.get(0)==0)
            {
                n.clear();
            }
        }
        
        eq.setText(eq.getText().substring(0,eq.getText().length()-2));
    }
}
