package thrift.annotation.server;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.service.ThriftMethod;
import com.facebook.swift.service.ThriftService;

/**
 * @author bfy
 * @version 1.0.0
 * 接口
 * 通过@ThriftService注解定义Thrift服务接口，对应Thrift IDL中的serveice定义，
 * @ThriftMethod注解标注在方法定义上，对应于Thrift IDL service 中的方法定义。
 * 其中方法参数需要使用@ThriftField来标注。
 */
@ThriftService("HelloService")
public interface HelloService {

    @ThriftMethod
    public String sayHello(@ThriftField(name = "user") User user);
}
