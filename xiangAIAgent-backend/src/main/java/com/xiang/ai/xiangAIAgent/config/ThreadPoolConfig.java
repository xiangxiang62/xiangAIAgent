package com.xiang.ai.xiangAIAgent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池配置
 */
@Configuration
public class ThreadPoolConfig {

    @Bean
    public ThreadPoolExecutor threadPoolExecutor() {
        return new ThreadPoolExecutor(
            10,                    // 核心线程数
            20,                    // 最大线程数
            60L,                   // 空闲线程存活时间
            TimeUnit.SECONDS,      // 时间单位
            new ArrayBlockingQueue<>(100),  // 阻塞队列容量
            new ThreadPoolExecutor.CallerRunsPolicy()  // 拒绝策略
        );
    }
}