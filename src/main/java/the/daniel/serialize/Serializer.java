package the.daniel.serialize;


import the.daniel.serialize.impl.JSONSerializer;

/**
 * @Author: Daniel
 * @Date: 2019/1/10 16:55
 */
public interface Serializer {

    Serializer DEFAULT = new JSONSerializer();

    /**
     * 序列化算法
     */
    byte getSerializerAlgorithm();

    /**
     * java对象转换成二进制
     */
    byte[] serialize(Object object);

    /**
     * 二进制转换成java对象
     */
    <T> T deserialize(Class<T> clazz, byte[] bytes);

}
