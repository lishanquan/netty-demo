package the.daniel.serialize.impl;

import com.alibaba.fastjson.JSON;
import the.daniel.serialize.Serializer;
import the.daniel.serialize.SerializerAlgorithm;

/**
 * @Author: Daniel
 * @Date: 2019/1/10 17:00
 */
public class JSONSerializer implements Serializer{

    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
