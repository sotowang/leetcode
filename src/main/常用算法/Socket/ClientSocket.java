package 常用算法.Socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

/**
 * @auther: sotowang
 * @date: 2020/4/8 21:51
 */
public class ClientSocket {
    static String host = "127.0.01.1";
    static int port = 8080;
    static Socket client;

    private static void runClient() {
        try {
            client = new Socket(host, port);
            Writer writer = new OutputStreamWriter(client.getOutputStream());
            writer.write("hello from client");
            writer.flush();
            writer.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ClientSocket.runClient();
    }
}
