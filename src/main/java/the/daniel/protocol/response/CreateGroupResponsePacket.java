package the.daniel.protocol.response;

import lombok.Data;
import the.daniel.protocol.Packet;

import java.util.List;

import static the.daniel.protocol.command.Command.CREATE_GROUP_RESPONSE;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 11:45
 */
@Data
public class CreateGroupResponsePacket extends Packet {

    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_RESPONSE;
    }

}
