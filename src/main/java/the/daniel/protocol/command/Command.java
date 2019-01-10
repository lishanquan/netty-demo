package the.daniel.protocol.command;

/**
 * @Author: Daniel
 * @Date: 2019/1/10 17:04
 */
public interface Command {

    Byte LOGIN_REQUEST = 1;

    Byte LOGIN_RESPONSE = 2;

    Byte MESSAGE_REQUEST = 3;

    Byte MESSAGE_RESPONSE = 4;

}
