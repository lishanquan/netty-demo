package the.daniel.server.handler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import the.daniel.protocol.request.CreateGroupRequestPacket;
import the.daniel.protocol.response.CreateGroupResponsePacket;
import the.daniel.util.IDUtil;
import the.daniel.util.SessionUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 14:23
 */
public class CreateGroupRequestHandler extends SimpleChannelInboundHandler<CreateGroupRequestPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, CreateGroupRequestPacket createGroupRequestPacket) throws Exception {
        List<String> userIdList = createGroupRequestPacket.getUserIdList();

        //1.创建一个channel分组
        ChannelGroup channelGroup = new DefaultChannelGroup(ctx.executor());

        //2.筛选出待加入群聊的用户的channel和userName
        List<String> userNameList = new ArrayList<>();
        for (String userId : userIdList){
            Channel channel = SessionUtil.getChannel(userId);
            if (null != channel){
                channelGroup.add(channel);
                userNameList.add(SessionUtil.getSession(channel).getUserName());
            }
        }

        //3.组织群聊创建结果的响应
        String groupId = IDUtil.randomId();
        CreateGroupResponsePacket createGroupResponsePacket = new CreateGroupResponsePacket();
        createGroupResponsePacket.setSuccess(true);
        createGroupResponsePacket.setGroupId(groupId);//跟channelGroup对象id怎么关联？
        createGroupResponsePacket.setUserNameList(userNameList);

        //4.给每个客户端发送拉群通知
        channelGroup.writeAndFlush(createGroupResponsePacket);

        System.out.print("群创建成功，id为[" + createGroupResponsePacket.getGroupId() + "], ");
        System.out.println("群里面有：" + createGroupResponsePacket.getUserNameList());

        //5.保存群组相关的信息
        SessionUtil.bindChannelGroup(groupId, channelGroup);
    }

}
