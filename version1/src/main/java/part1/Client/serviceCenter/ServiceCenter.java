package part1.Client.serviceCenter;

import java.net.InetSocketAddress;

/**
 * @Author: xgt
 * @CreateTime: 2024-09-15
 * @Description:
 */
//服务中心接口
public interface ServiceCenter {
    //  查询：根据服务名查找地址
    InetSocketAddress serviceDiscovery(String serviceName);
    //判断是否可重试
    boolean checkRetry(String serviceName) ;
}
