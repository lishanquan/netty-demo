package the.daniel.client.console;

import io.netty.channel.Channel;
import the.daniel.protocol.request.QuitGroupRequestPacket;

import java.util.Scanner;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 17:58
 */
public class QuitGroupConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        QuitGroupRequestPacket quitGroupRequestPacket = new QuitGroupRequestPacket();

        System.out.print("输入 groupId，退出群聊：");
        String groupId = scanner.next();

        quitGroupRequestPacket.setGroupId(groupId);
        channel.writeAndFlush(quitGroupRequestPacket);
    }

}
