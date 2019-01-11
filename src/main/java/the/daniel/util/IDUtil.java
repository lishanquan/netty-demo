package the.daniel.util;

import java.util.UUID;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 14:37
 */
public class IDUtil {

    public static String randomId(){
        return UUID.randomUUID().toString().split("-")[0];
    }

}
