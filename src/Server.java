import java.io.IOException;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(1342);
		Socket ss = server.accept();
		Scanner in  = new Scanner(ss.getInputStream());
		int num = in.nextInt();
		
		int temp = num*2;
		
		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(temp);
	}
}
