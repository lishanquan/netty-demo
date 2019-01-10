package the.daniel.protocol.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.MESSAGE_REQUEST;

/**
 * @Author: Daniel
 * @Date: 2019/1/10 17:08
 */
@Data
@NoArgsConstructor
public class MessageRequestPacket extends Packet {

    private String toUserId;

    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }

}
