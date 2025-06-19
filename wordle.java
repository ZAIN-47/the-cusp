package practice;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class wordle
{
	static char[][] in = new char[5][2];

	public static void main(String args[])
	{
		String w = getword().toLowerCase();
		Scanner sc = new Scanner(System.in);
        int a = 1;

        System.out.println("""




        *************************************************************""");

        System.out.println("\u001b[33m" + "WELCOME TO MAKESHIFT WORDLE" + "\u001b[0m");
        System.out.println("\u001b[34m" + "made by " + "\u001b[31m" + "ZAIN"+"\u001b[0m");
        System.out.println("""
        *************************************************************




        """);
		String inp = " ";
		boolean p = true;
        while (p) {
            System.out.println("no of guesses left: "+(7-a));
			System.out.println("enter a five letter word");
			inp = sc.nextLine().toLowerCase();
			while (inp.length() != 5) {
				System.out.println("that was not a five letter word, enter a five letter word");
				inp = sc.nextLine().toLowerCase();
			}

			for (int i = 0; i < 5; i++) {
				in[i][0] = inp.charAt(i);
				in[i][1] = 'w';
			}
			p = cc(inp, w);

			if (a == 6)
				p = false;
            a++;
            
		}
        System.out.println("the word was " +"\u001b[45m" + "\u001b[30m" + w + "\u001b[0m");
        System.out.println("""

        *************************************************************""");

        System.out.println("\u001b[32m" + "THANKYOU FOR PLAYING" + "\u001b[0m");
		System.out.println("""
*************************************************************

				""");
		sc.close();
	}

	public static boolean cond(int n) 
	{
		boolean a = true;
		if (in[0][1] == 'r' && in[1][1] == 'r' && in[2][1] == 'r' && in[3][1] == 'r' && in[4][1] == 'r')
			a = false;
		if (n > 6)
		{
			a = false;
		}
		return a;
	}
	
	public static void prnt(char a, char c)
	{
		if(c=='g')
			g(a);
		else if(c=='y')
			y(a);
		else if(c=='w')
			w(a);
		else
		System.out.println("error");
	}
	public static ArrayList<Character> hangman(String a,String w, ArrayList<Character> word)
	{
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == w.charAt(i)) {
				word.set(i, a.charAt(i));
			}
		}
		return word;
	}
	public static void gr(String inp,String wrd)
	{
		for (int i = 0; i < 5; i++) {
			if (inp.charAt(i) == wrd.charAt(i))
				in[i][1] = 'g';
		}
	}

	public static void ye(String inp, String w) 
	{
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (inp.charAt(i) == w.charAt(j) && in[i][1] == 'w') {
					in[i][1] = 'y';
				}
			}
		}
	}

	public static boolean cc(String inp,String w) 
	{
		for (int i = 0; i < in.length; i++)
		{
			gr(inp, w);
		}
		for (int i = 0; i < in.length; i++)
		{
			ye(inp, w);
		}
		int a = 0;
		while (a<5) 
		{
			prnt(in[a][0], in[a][1]);
			a++;
		}
		System.out.println();
		if (in[0][1] == 'g' && in[1][1] == 'g' && in[2][1] == 'g' && in[3][1] == 'g' && in[4][1] == 'g')
			return false;
		return true;
	}

	public static void g(char a)
	{
		System.out.print("\u001b[32m" + a + "\u001b[0m");
	}
	public static void y(char a)
	{
		System.out.print("\u001b[33m" + a + "\u001b[0m");
	}
	public static void w(char a)
	{
		System.out.print("\u001b[0m" + a);
	}
	public static String getword()
	{
		try (BufferedReader r = new BufferedReader(new FileReader("D:\\file handeling\\wordle.txt"))) {
			String a;
			ArrayList<String> l = new ArrayList<>();
			while ((a = r.readLine()) != null) {
				l.add(a);
			}

			Random ra = new Random();
			int x = ra.nextInt(l.size());
			String w = l.get(x);
			return w;

		} catch (FileNotFoundException e) {
			System.out.println("couldnt locate file");
			return "0";
		} catch (IOException e) {
			System.out.println("error");
			return "0";
		}

	}

	public static void rep()
	{

	}
}