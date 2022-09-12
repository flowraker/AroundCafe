package com.example.demo.common.config;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync(mode = AdviceMode.ASPECTJ)
public class AsyncConfig extends AsyncConfigurerSupport {

    @Override
    @Bean(name = "paymentThread")
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(30);
        executor.setMaxPoolSize(30);
        executor.setQueueCapacity(Integer.MAX_VALUE);
        executor.setThreadNamePrefix("PAYMENT_THREAD_");
        executor.initialize();
        return executor;
    }
}
