package thrift.annotation.client;

import com.facebook.nifty.client.FramedClientConnector;
import com.facebook.swift.service.ThriftClientManager;
import thrift.annotation.server.HelloService;
import thrift.annotation.server.User;

import java.net.InetSocketAddress;
import java.util.concurrent.ExecutionException;

public class ClientMain {

    public static void main(String [] args) throws ExecutionException, InterruptedException {
        ThriftClientManager clientManager = new ThriftClientManager();
        FramedClientConnector connector = new FramedClientConnector(new InetSocketAddress("localhost",9988));

        User user = new User();
        user.setName("bfy,");
        user.setEmail("bfylu001@gmail.com");


        HelloService helloService = clientManager.createClient(connector, HelloService.class).get();
        String hi = helloService.sayHello(user);
        System.out.println(hi);
    }
}
