package com.rocket.queue.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 配置参数绑定
 */
@Service
public class ParamConfigService {
    @Value("${rocket.group}")
    public String rocketGroup ;
    @Value("${rocket.topic}")
    public String rocketTopic ;
    @Value("${rocket.tag}")
    public String rocketTag ;
}
