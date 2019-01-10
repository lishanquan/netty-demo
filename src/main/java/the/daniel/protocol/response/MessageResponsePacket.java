package the.daniel.protocol.response;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.MESSAGE_RESPONSE;

/**
 * @Author: Daniel
 * @Date: 2019/1/10 17:15
 */
@Data
public class MessageResponsePacket extends Packet {

    private String fromUserId;

    private String fromUserName;

    private String message;

    @Override
    public Byte getCommand() {
        return MESSAGE_RESPONSE;
    }
}
