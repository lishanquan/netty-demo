package the.daniel.client.console;

import io.netty.channel.Channel;
import the.daniel.protocol.request.MessageRequestPacket;

import java.util.Scanner;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 13:50
 */
public class SendToUserConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.print("发送消息给某个用户：");

        String toUserId = scanner.next();
        String message = scanner.next();
        channel.writeAndFlush(new MessageRequestPacket(toUserId, message));
    }

}
