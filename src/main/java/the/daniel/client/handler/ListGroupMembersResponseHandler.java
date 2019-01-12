package the.daniel.client.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import the.daniel.protocol.response.ListGroupMembersResponsePacket;

/**
 * @Author: Daniel
 * @Date: 2019/1/12 8:05
 */
public class ListGroupMembersResponseHandler extends SimpleChannelInboundHandler<ListGroupMembersResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ListGroupMembersResponsePacket listGroupMembersResponsePacket) throws Exception {
        System.out.println("群[" + listGroupMembersResponsePacket.getGroupId() + "]中的人包括：" + listGroupMembersResponsePacket.getSessionList());
    }

}
