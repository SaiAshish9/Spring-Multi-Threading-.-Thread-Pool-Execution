package com.spring.MultiThreadingAndThreadPool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {

    @Bean(name ="taskExecutor")
    public Executor taskExecutor(){
        ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2); // 2 threads
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(100); // at a time 100 tasks can wait at blocking queue
        executor.setThreadNamePrefix("userThread-");
        executor.initialize();
        return executor;
    }
}
