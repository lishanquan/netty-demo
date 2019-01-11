package the.daniel.protocol.response;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.QUIT_GROUP_RESPONSE;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 17:39
 */
@Data
public class QuitGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return QUIT_GROUP_RESPONSE;
    }

}
