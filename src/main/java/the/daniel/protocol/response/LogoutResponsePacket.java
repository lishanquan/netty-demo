package the.daniel.protocol.response;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.LOGOUT_RESPONSE;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 11:47
 */
@Data
public class LogoutResponsePacket extends Packet {

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return LOGOUT_RESPONSE;
    }

}
