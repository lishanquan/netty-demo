package the.daniel.client.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import the.daniel.protocol.response.JoinGroupResponsePacket;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 16:55
 */
public class JoinGroupResponseHandler extends SimpleChannelInboundHandler<JoinGroupResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, JoinGroupResponsePacket joinGroupResponsePacket) throws Exception {
        if (joinGroupResponsePacket.isSuccess()){
            System.out.println("加入群[" + joinGroupResponsePacket.getGroupId() + "]成功!");
        } else {
            System.out.println("加入群[" + joinGroupResponsePacket.getGroupId() + "]失败，原因为：" + joinGroupResponsePacket.getReason());
        }
    }

}
