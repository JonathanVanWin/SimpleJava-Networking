import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException{
		Scanner in = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1", 1322); //Random port chosen
		Scanner sc = new Scanner(s.getInputStream());//Get from server
		System.out.println("Enter number:");
		int number = in.nextInt();
		PrintStream p =new PrintStream(s.getOutputStream());
		p.println(number);
		
		int temp = sc.nextInt();
		System.out.println(temp);
		
	}

}
