package the.daniel.attribute;

import io.netty.util.AttributeKey;
import the.daniel.session.Session;

/**
 * @Author: Daniel
 * @Date: 2019/1/10 16:43
 */
public interface Attributes {

    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");

}
