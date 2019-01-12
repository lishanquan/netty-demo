package the.daniel.client.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import the.daniel.protocol.response.GroupMessageResponsePacket;
import the.daniel.session.Session;

/**
 * @Author: Daniel
 * @Date: 2019/1/12 8:56
 */
public class GroupMessageResponseHandler extends SimpleChannelInboundHandler<GroupMessageResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GroupMessageResponsePacket groupMessageResponsePacket) throws Exception {
        String fromGroupId = groupMessageResponsePacket.getFromGroupId();
        Session fromUser = groupMessageResponsePacket.getFromUser();
        String message = groupMessageResponsePacket.getMessage();
        System.out.println("收到群[" + fromGroupId + "]中[" + fromUser + "]发来的消息：" + message);
    }

}
