package part1.Server;

import part1.Server.provider.ServiceProvider;
import part1.Server.server.RpcServer;
import part1.Server.server.impl.SimpleRPCRPCServer;
import part1.common.service.Impl.UserServiceImpl;
import part1.common.service.UserService;

/**
 * @Author: xgt
 * @CreateTime: 2024-09-13
 * @Description:
 * @Version: 1.0
 */
public class TestServer {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.provideServiceInterface(userService);

        RpcServer rpcServer = new SimpleRPCRPCServer(serviceProvider);
        rpcServer.start(9999);
    }
}
