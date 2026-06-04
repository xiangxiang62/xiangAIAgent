package com.xiang.ai.xiangAIAgent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.ai.autoconfigure.vectorstore.pgvector.PgVectorStoreAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(exclude = PgVectorStoreAutoConfiguration.class)
@EnableAsync // 开启异步调用
@MapperScan("com.xiang.ai.xiangAIAgent.mapper")
@EnableAspectJAutoProxy(exposeProxy = true) // 开启 AOP
public class XiangAIAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiangAIAgentApplication.class, args);
    }

}
