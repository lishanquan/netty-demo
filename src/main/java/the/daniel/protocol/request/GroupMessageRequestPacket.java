package the.daniel.protocol.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.GROUP_MESSAGE_REQUEST;

/**
 * @Author: Daniel
 * @Date: 2019/1/12 8:34
 */
@Data
@NoArgsConstructor
public class GroupMessageRequestPacket extends Packet {

    private String toGroupId;

    private String message;

    public GroupMessageRequestPacket(String toGroupId, String message) {
        this.toGroupId = toGroupId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return GROUP_MESSAGE_REQUEST;
    }

}
