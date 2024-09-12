package part1.common.Message;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xgt
 * @CreateTime: 2024-09-12
 * @Description: 返回信息格式
 * @Version: 1.0
 */
@Data
@Builder
public class RpcResponse implements Serializable {
    //状态信息
    private int code;
    private String message;
    //具体数据
    private Object data;
    //构造成功信息
    public static RpcResponse sussess(Object data){
        return RpcResponse.builder().code(200).data(data).build();
    }
    //构造失败信息
    public static RpcResponse fail(){
        return RpcResponse.builder().code(500).message("服务器发生错误").build();
    }
}

