package the.daniel.client.console;

import io.netty.channel.Channel;
import the.daniel.protocol.request.LogoutRequestPacket;

import java.util.Scanner;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 13:53
 */
public class LogoutConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        LogoutRequestPacket logoutRequestPacket = new LogoutRequestPacket();
        channel.writeAndFlush(logoutRequestPacket);
    }

}
