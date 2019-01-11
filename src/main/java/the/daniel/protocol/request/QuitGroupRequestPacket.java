package the.daniel.protocol.request;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.QUIT_GROUP_REQUEST;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 17:37
 */
@Data
public class QuitGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return QUIT_GROUP_REQUEST;
    }

}
