package com.ndt.sms.service.impl;

import com.ndt.sms.common.Const;
import com.ndt.sms.mq.RedisService;
import com.ndt.sms.service.PublisherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ser7en
 * @Date 2018-10-09 16:38
 * @version：
 * @Desc：
 */
@Service
@Slf4j
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private RedisService redisService;

    @Override
    public String pushMsg(String params) {
        //直接使用convertAndSend方法即可向指定的通道发布消息
        redisService.sendChannelMess(Const.CHANNEL,params);
        return "success";
    }
}
