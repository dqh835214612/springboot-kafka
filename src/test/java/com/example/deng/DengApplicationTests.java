package com.example.deng;

import com.example.deng.zookeeper.zkApi.ZkApi;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DengApplicationTests {

    @Autowired
    private ZkApi zkApi;

    @Test
    void contextLoads() {
    }

    @Test
    void createNode() {
        String path = "/config0";
        String data = "123";
        boolean node = zkApi.createNode(path, data);
        if (node) {
            System.out.println("节点创建成功");
        } else {
            System.out.println("节点创建失败");
        }
    }

    @Test
    void getNode() {
        String path = "/FirstZnode";
        Watcher watcher = new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println("【Watcher监听事件】={}" + watchedEvent.getState());
                System.out.println("【监听路径为】={}" + watchedEvent.getPath());
                System.out.println("【监听的类型为】={}" + watchedEvent.getType());

            }
        };
        String data = zkApi.getData(path, watcher);
        System.out.println(data);
    }

    @Test
    void updateNode() {
        String path = "/config0";
        String data = "1234";
        zkApi.updateNode(path, data);
    }

}
