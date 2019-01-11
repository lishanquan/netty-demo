package the.daniel.protocol.request;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.LOGOUT_REQUEST;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 11:43
 */
@Data
public class LogoutRequestPacket extends Packet {

    @Override
    public Byte getCommand() {
        return LOGOUT_REQUEST;
    }

}
