package the.daniel.server.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import the.daniel.protocol.request.LogoutRequestPacket;
import the.daniel.protocol.response.LogoutResponsePacket;
import the.daniel.util.SessionUtil;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 14:53
 */
public class LogoutRequestHandler extends SimpleChannelInboundHandler<LogoutRequestPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutRequestPacket logoutRequestPacket) throws Exception {
        SessionUtil.unBindSession(ctx.channel());
        LogoutResponsePacket logoutResponsePacket = new LogoutResponsePacket();
        logoutResponsePacket.setSuccess(true);
        ctx.channel().writeAndFlush(logoutResponsePacket);
    }

}
