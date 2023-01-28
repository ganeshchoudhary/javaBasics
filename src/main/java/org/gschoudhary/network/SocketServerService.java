package org.gschoudhary.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class SocketServerService {
    public static void VerySimpleServer(int serverPort) {

        try {
            ServerSocket serverSock = new ServerSocket(8080);
            serverSock.accept();

        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream sockInput = null;
        OutputStream sockOutput = null;
        Socket sock = null;
        ServerSocket serverSock = new ServerSocket(8080);

        while (true) {
            try {
                // This method call, accept(), blocks and waits
                // (forever if necessary) until some other program
                // opens a socket connection to our server.  When some
                // other program opens a connection to our server,
                // accept() creates a new socket to represent that
                // connection and returns.

                sock = serverSock.accept();
                System.err.println("Server : Have accepted new socket.");

                // From this point on, no new socket connections can
                // be made to our server until we call accept() again.

                sockInput = sock.getInputStream();
                sockOutput = sock.getOutputStream();
                handleConnection(sockInput, sockOutput);

            } catch (IOException e) {
                e.printStackTrace(System.err);
            }


        }
    }

    private static void handleConnection(InputStream sockInput, OutputStream sockOutput) throws IOException {
        System.out.println("handle");
        sockOutput.write("testing from server".getBytes(StandardCharsets.UTF_8));
        sockOutput.flush();
        sockOutput.close();
    }
}
