package com.xiang.ai.xiangAIAgent.app;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoveAppTest {

    @Resource
    private LoveApp loveApp;


    @Test
    void doChatWithReport() {
        String chatId = UUID.randomUUID().toString();
        // 第一轮
        String message = "你好，我是程序员鱼皮，我想让另一半（编程导航）更爱我，但我不知道该怎么做";
        LoveApp.LoveReport loveReport = loveApp.doChatWithReport(message, chatId);
        Assertions.assertNotNull(loveReport);
    }

    @Test
    void doChatWithReportList() {
        String chatId = UUID.randomUUID().toString();
        List<LoveApp.LoveReport> loveReports = loveApp.doChatWithReportList("你好，我是程序员鱼皮，我想让另一半（编程导航）更爱我，但我不知道该怎么做", chatId);
        Assertions.assertTrue(true);
    }

    @Test
    void doChatWithMap() {
        String chatId = UUID.randomUUID().toString();
        Map<String, Object> objectMap = loveApp.doChatWithMap("你好，我是程序员鱼皮，我想让另一半（编程导航）更爱我，但我不知道该怎么做", chatId);
        Assertions.assertTrue(true);
    }

    @Test
    void doChatWithArrayStr() {
        String chatId = UUID.randomUUID().toString();
        loveApp.doChatWithArrayStr("你好，我是程序员鱼皮，我想让另一半（编程导航）更爱我，但我不知道该怎么做", chatId)
        Assertions.assertTrue(true);
    }
}
