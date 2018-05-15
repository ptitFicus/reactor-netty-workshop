package io.spring.workshop.reactornetty.http;

import org.junit.Test;
import reactor.netty.DisposableServer;

import static org.junit.Assert.assertNotNull;

/**
 * Learn how to create HTTP server and client
 *
 * @author Violeta Georgieva
 * @see <a href="http://next.projectreactor.io/docs/netty/snapshot/api/reactor/netty/http/server/HttpServer.html">HttpServer javadoc</a>
 * @see <a href="http://next.projectreactor.io/docs/netty/snapshot/api/reactor/netty/http/client/HttpClient.html">HttpClient javadoc</a>
 */
public class HttpEchoPathParamTests {

    @Test
    public void echoPathParamTest() {
        // TODO
        // Task 1:
        // 1.1. Prepare the HTTP server
        // 1.2. Configure the port to which this server should bind
        // 1.3. Start the server in a blocking fashion and wait for it
        //      to finish initializing
        DisposableServer server = null;

        assertNotNull(server);

        // TODO
        // Task 2:
        // 2.1. Close the underlying channel opened by the HTTP server
    }
}
