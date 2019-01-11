package the.daniel.client.console;

import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Daniel
 * @Date: 2019/1/11 11:24
 */
public interface ConsoleCommand {

    void exec(Scanner scanner, Channel channel);

}
