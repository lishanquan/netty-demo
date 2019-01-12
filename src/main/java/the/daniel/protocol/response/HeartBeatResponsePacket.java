package the.daniel.protocol.response;

import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.HEART_BEAT_RESPONSE;

/**
 * @Author: Daniel
 * @Date: 2019/1/13 0:02
 */
public class HeartBeatResponsePacket extends Packet {

    @Override
    public Byte getCommand() {
        return HEART_BEAT_RESPONSE;
    }

}
