package the.daniel.protocol.response;

import lombok.Data;
import the.daniel.protocol.Packet;
import the.daniel.session.Session;

import static the.daniel.protocol.command.Command.GROUP_MESSAGE_RESPONSE;

/**
 * @Author: Daniel
 * @Date: 2019/1/12 8:37
 */
@Data
public class GroupMessageResponsePacket extends Packet {

    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {
        return GROUP_MESSAGE_RESPONSE;
    }

}
