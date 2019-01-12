package the.daniel.protocol.request;

import lombok.Data;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.LIST_GROUP_MEMBERS_REQUEST;

/**
 * @Author: Daniel
 * @Date: 2019/1/12 7:45
 */
@Data
public class ListGroupMembersRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return LIST_GROUP_MEMBERS_REQUEST;
    }

}
