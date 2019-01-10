package the.daniel.protocol.request;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.LOGIN_REQUEST;

/**
 * @Author: Daniel
 * @Date: 2019/1/10 17:06
 */
@Data
public class LoginRequestPacket extends Packet {

    private String userName;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
