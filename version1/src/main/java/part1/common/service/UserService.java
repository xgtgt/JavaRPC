package part1.common.service;


import part1.common.pojo.User;

/**
 * @Author: xgt
 * @CreateTime: 2024-09-12
 * @Description:
 * @Version: 1.0
 */
public interface UserService {
    // 客户端通过这个接口调用服务端的实现类
    User getUserByUserId(Integer id);
    //新增一个功能
    Integer insertUserId(User user);
}
