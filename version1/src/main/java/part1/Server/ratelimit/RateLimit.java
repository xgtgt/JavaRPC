package part1.Server.ratelimit;

/**
 * @Author: xgt
 * @CreateTime: 2024-09-19
 * @Description: 限流器接口
 */
public interface RateLimit {
    //获取访问许可
    boolean getToken();
}
