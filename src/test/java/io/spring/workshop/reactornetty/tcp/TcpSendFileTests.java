package io.spring.workshop.reactornetty.tcp;

import org.junit.jupiter.api.Test;
import reactor.netty.Connection;
import reactor.netty.DisposableServer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Learn how to create TCP server and client
 *
 * @author Violeta Georgieva
 * @see <a href="https://projectreactor.io/docs/netty/release/api/reactor/netty/tcp/TcpServer.html">TcpServer javadoc</a>
 * @see <a href="https://projectreactor.io/docs/netty/release/api/reactor/netty/tcp/TcpClient.html">TcpClient javadoc</a>
 */
public class TcpSendFileTests {

    @Test
    public void sendFileTest() {
        // TODO
        // Task 1:
        // 1.1. Prepare the TCP server
        // 1.2. Configure the port to which this server should bind
        // 1.3. Start the server in a blocking fashion and wait for it
        //      to finish initializing
        //
        // Task 3:
        // 3.1. Enable SSL configuration with self singed certificate.
        // 3.3. Apply a wire logger configuration
        //
        // Task 4:
        // 4.1. Attach an IO handler to react on connected client
        // 4.2. When receive an object, transform it to string
        //      (this will be name of the requested file)
        // 4.3. As a response send the requested file to the client
        DisposableServer server = null;

        assertNotNull(server);

        // TODO
        // Task 5:
        // 5.1. Prepare the TCP client
        // 5.2. Obtain the server's address and provide it as an address to which this
        //      client should connect
        // 5.3. Block the client and return a Connection
        //
        // Task 7:
        // 7.1. Apply an SSL configuration customization via a preconfigured SslContext,
        //      use SslContextBuilder for building SslContext, as a trust manager
        //      use InsecureTrustManagerFactory
        // 7.3. Apply a wire logger configuration
        Connection client = null;

        assertNotNull(client);

        // TODO
        // Task 2:
        // 2.1. Close the underlying channel opened by the TCP server

        // TODO
        // Task 6:
        // 6.1. Close the underlying channel opened by the TCP client
    }
}
