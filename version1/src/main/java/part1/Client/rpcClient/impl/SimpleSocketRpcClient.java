package part1.Client.rpcClient.impl;

import part1.Client.rpcClient.RpcClient;
import part1.common.Message.RpcRequest;
import part1.common.Message.RpcResponse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @Author: xgt
 * @CreateTime: 2024-09-14
 * @Description:
 * @Version: 1.0
 */
public class SimpleSocketRpcClient implements RpcClient {

    private String host;
    private int port;
    public SimpleSocketRpcClient(String host,int port){
        this.host=host;
        this.port=port;
    }
    @Override
    public part1.common.Message.RpcResponse sendRequest(RpcRequest request) {
        try {
            Socket socket=new Socket(host, port);
            ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());

            oos.writeObject(request);
            oos.flush();

            part1.common.Message.RpcResponse response=(RpcResponse) ois.readObject();
            return response;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
