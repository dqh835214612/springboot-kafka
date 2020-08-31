package com.example.deng;

import com.example.deng.zookeeper.zkApi.ZkApi;
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
    void createNode () {
        String path = "/config0";
        String data = "123";
        boolean node = zkApi.createNode(path, data);
        if (node) {
            System.out.println("节点创建成功");
        }else {
            System.out.println("节点创建失败");
        }
    }

    @Test
    void updateNode () {
        String path = "/config0";
        String data = "1234";
        zkApi.updateNode(path,data);
    }

}
