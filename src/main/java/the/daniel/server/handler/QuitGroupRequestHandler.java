package the.daniel.server.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import the.daniel.protocol.request.QuitGroupRequestPacket;
import the.daniel.protocol.response.QuitGroupResponsePacket;
import the.daniel.util.SessionUtil;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 17:42
 */
public class QuitGroupRequestHandler extends SimpleChannelInboundHandler<QuitGroupRequestPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, QuitGroupRequestPacket quitGroupRequestPacket) throws Exception {
        //1.获取到对应ChannelGroup,然后将当前用户的channel移除
        String groupId = quitGroupRequestPacket.getGroupId();
        ChannelGroup channelGroup = SessionUtil.getChannelGroup(groupId);
        channelGroup.remove(ctx.channel());

        //2.组织退出群聊响应发送给客户端
        QuitGroupResponsePacket quitGroupResponsePacket = new QuitGroupResponsePacket();
        quitGroupResponsePacket.setSuccess(true);
        quitGroupResponsePacket.setGroupId(groupId);
        ctx.channel().writeAndFlush(quitGroupResponsePacket);
    }

}
