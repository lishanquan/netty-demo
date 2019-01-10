package the.daniel.protocol.response;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.LOGIN_RESPONSE;

/**
 * @Author: Daniel
 * @Date: 2019/1/10 17:13
 */
@Data
public class LoginResponsePacket extends Packet {

    private String userId;

    private String userName;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
