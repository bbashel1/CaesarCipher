import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(1222);
		System.out.println("waiting");
		ss.accept();
		System.out.println("Connected!");
	}
}