package the.daniel.server.handler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import the.daniel.protocol.request.ListGroupMembersRequestPacket;
import the.daniel.protocol.response.ListGroupMembersResponsePacket;
import the.daniel.session.Session;
import the.daniel.util.SessionUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Daniel
 * @Date: 2019/1/12 7:55
 */
public class ListGroupMembersRequestHandler extends SimpleChannelInboundHandler<ListGroupMembersRequestPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ListGroupMembersRequestPacket listGroupMembersRequestPacket) throws Exception {
        //1.通过groupId，获取ChannelGroup
        String groupId = listGroupMembersRequestPacket.getGroupId();
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);

        //2.遍历ChannelGroup，获取群成员对应Session
        List<Session> sessionList = new ArrayList<>();
        for (Channel channel : channelGroup){
            Session session = SessionUtil.getSession(channel);
            sessionList.add(session);
        }

        //3.组织获取成员列表响应写回客户端
        ListGroupMembersResponsePacket listGroupMembersResponsePacket = new ListGroupMembersResponsePacket();
        listGroupMembersResponsePacket.setSuccess(true);
        listGroupMembersResponsePacket.setGroupId(groupId);
        listGroupMembersResponsePacket.setSessionList(sessionList);
        ctx.channel().writeAndFlush(listGroupMembersResponsePacket);
    }

}
