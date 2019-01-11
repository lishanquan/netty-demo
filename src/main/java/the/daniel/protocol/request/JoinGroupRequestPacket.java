package the.daniel.protocol.request;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.JOIN_GROUP_REQUEST;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 16:51
 */
@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_REQUEST;
    }
}
