package com.ndt.sms.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * @Author ser7en
 * @Date 2018-10-09 16:27
 * @version：
 * @Desc：
 */
@Slf4j
@Component
public class RedisReceiver {

    private CountDownLatch latch;

    @Autowired
    public RedisReceiver(CountDownLatch latch) {
        this.latch = latch;
    }


    /**
     *  收到通道的消息之后执行的方法
     * @param message
     */
    public void receiveMessage(String message) {
        //这里是收到通道的消息之后执行的方法
        log.info("msg: " + message);

        latch.countDown();
    }
}
