package part1.common.Message;

import lombok.AllArgsConstructor;

/**
 * @Author: xgt
 * @CreateTime: 2024-09-15
 * @Description:
 * @Version: 1.0
 */
@AllArgsConstructor
public enum MessageType {
    REQUEST(0),RESPONSE(1);
    private int code;
    public int getCode(){
        return code;
    }
}