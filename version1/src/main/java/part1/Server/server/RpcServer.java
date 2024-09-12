package part1.Server.server;

/**
 * @Author: xgt
 * @CreateTime: 2024-09-13
 * @Description:
 * @Version: 1.0
 */
public interface RpcServer {
    //开启监听
    void start(int port);
    void stop();
}
