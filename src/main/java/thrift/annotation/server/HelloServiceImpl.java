package thrift.annotation.server;


public class HelloServiceImpl implements HelloService {
    public String sayHello(User user) {
        return "hello," + user.getName() + user.getEmail();
    }
}
