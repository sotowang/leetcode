package 常用算法.Socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * @auther: sotowang
 * @date: 2020/4/8 21:38
 */
public class ServerSocketExample {
    private ServerSocket serverSocket;
    private Socket socket;
    private void runServer() {
        try {
            serverSocket = new ServerSocket(8080);
            socket = serverSocket.accept();
            Reader reader = new InputStreamReader(socket.getInputStream());

            char[] c = new char[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = reader.read(c)) != -1) {
                sb.append(new String(c, 0, len));
            }
            System.out.println("Receive from client message=: " + sb);
            reader.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ServerSocketExample().runServer();
    }
}
