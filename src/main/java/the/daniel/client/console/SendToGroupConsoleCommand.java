package the.daniel.client.console;

import io.netty.channel.Channel;
import the.daniel.protocol.request.GroupMessageRequestPacket;

import java.util.Scanner;

/**
 * @Author: Daniel
 * @Date: 2019/1/12 8:41
 */
public class SendToGroupConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.print("发消息给某个群组：");
        String groupId = scanner.next();
        String message = scanner.next();
        channel.writeAndFlush(new GroupMessageRequestPacket(groupId, message));
    }

}
