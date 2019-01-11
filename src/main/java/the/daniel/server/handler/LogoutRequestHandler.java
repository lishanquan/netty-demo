package the.daniel.server.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import the.daniel.protocol.response.LogoutResponsePacket;
import the.daniel.util.SessionUtil;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 14:53
 */
public class LogoutRequestHandler extends SimpleChannelInboundHandler<LogoutRequestHandler> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutRequestHandler logoutRequestHandler) throws Exception {
        SessionUtil.unBindSession(ctx.channel());
        LogoutResponsePacket logoutResponsePacket = new LogoutResponsePacket();
        logoutResponsePacket.setSuccess(true);
        ctx.channel().writeAndFlush(logoutResponsePacket);
    }

}
