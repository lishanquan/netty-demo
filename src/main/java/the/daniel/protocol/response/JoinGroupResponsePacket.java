package the.daniel.protocol.response;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.JOIN_GROUP_RESPONSE;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 16:56
 */
@Data
public class JoinGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_RESPONSE;
    }

}
