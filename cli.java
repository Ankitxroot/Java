package demo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cli {
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		int number,temp;
		Scanner sc= new Scanner(System.in);
		Socket s= new Socket("localhost",1342);
		//In Java, to send data via the socket, you get an OutputStream (1) from it, and write to the OutputStream (you output some data)."
		Scanner sc1= new Scanner(s.getInputStream());
		System.out.println("Enter any number");
		number= sc.nextInt();
		PrintStream p= new PrintStream(s.getOutputStream());
		p.println(number);
		temp=sc1.nextInt();
		System.out.println(temp);	
	}
}