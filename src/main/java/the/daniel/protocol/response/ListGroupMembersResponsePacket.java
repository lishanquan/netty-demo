package the.daniel.protocol.response;

import lombok.Data;
import the.daniel.protocol.Packet;
import the.daniel.session.Session;

import java.util.List;

import static the.daniel.protocol.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

/**
 * @Author: Daniel
 * @Date: 2019/1/12 7:48
 */
@Data
public class ListGroupMembersResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private List<Session> sessionList;

    @Override
    public Byte getCommand() {
        return LIST_GROUP_MEMBERS_RESPONSE;
    }

}
