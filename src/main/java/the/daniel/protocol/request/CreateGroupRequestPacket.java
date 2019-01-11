package the.daniel.protocol.request;

import lombok.Data;
import the.daniel.protocol.Packet;

import java.util.List;

import static the.daniel.protocol.command.Command.CREATE_GROUP_REQUEST;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 11:38
 */
@Data
public class CreateGroupRequestPacket extends Packet{

    private List<String> userIdList;

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_REQUEST;
    }
}
