package com.ndt.sms.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;


/**
 * @Author ser7en
 * @Date 2018-10-09 16:22
 * @version：
 * @Desc：
 */
@Component
public class RedisService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private CountDownLatch latch;

    /**
     * 向通道发送消息的方法
     * @param channel
     * @param message
     */
    public void sendChannelMess(String channel, String message) {
        try {
            stringRedisTemplate.convertAndSend(channel, message);
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
