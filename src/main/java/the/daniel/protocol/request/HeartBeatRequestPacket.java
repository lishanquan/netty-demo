package the.daniel.protocol.request;

import the.daniel.protocol.Packet;

import static the.daniel.protocol.command.Command.HEART_BEAT_REQUEST;

/**
 * @Author: Daniel
 * @Date: 2019/1/13 0:00
 */
public class HeartBeatRequestPacket extends Packet {

    @Override
    public Byte getCommand() {
        return HEART_BEAT_REQUEST;
    }

}
