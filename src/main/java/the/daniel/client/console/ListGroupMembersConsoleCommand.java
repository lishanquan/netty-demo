package the.daniel.client.console;

import io.netty.channel.Channel;
import the.daniel.protocol.request.ListGroupMembersRequestPacket;

import java.util.Scanner;

/**
 * @Author: Daniel
 * @Date: 2019/1/12 7:44
 */
public class ListGroupMembersConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.print("输入 groupId，获取群成员列表：");
        String groupId = scanner.next();

        ListGroupMembersRequestPacket listGroupMembersRequestPacket = new ListGroupMembersRequestPacket();
        listGroupMembersRequestPacket.setGroupId(groupId);
        channel.writeAndFlush(listGroupMembersRequestPacket);
    }

}
