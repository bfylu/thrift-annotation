package thrift.annotation.server;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.codec.ThriftStruct;

/**
 * @author bfy
 * @version 1.0.0
 *
 * 通过注解标注User.java，完成数据结构的定义，其中@ThriftStruct标注在类上，
 * @ThriftStruct标注对象对应Thrift IDL中的struct 类型，@ThriftField用来标注属性，对应
 * Thrift IDL中的属性定义
 */
@ThriftStruct
public final class User {
    private String name;

    private String email;

    @ThriftField(1)
    public String getName() {
        return name;
    }
    @ThriftField
    public void setName(String name) {
        this.name = name;
    }
    @ThriftField(2)
    public String getEmail() {
        return email;
    }
    @ThriftField
    public void setEmail(String email) {
        this.email = email;
    }
}
