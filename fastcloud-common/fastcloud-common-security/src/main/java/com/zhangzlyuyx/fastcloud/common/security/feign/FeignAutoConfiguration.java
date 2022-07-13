package com.zhangzlyuyx.fastcloud.common.security.feign;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zhangzlyuyx.fastcloud.core.constant.FastCloudConstants;

import feign.RequestInterceptor;

/**
 * Feign 配置注册
 *
 * @author ruoyi
 **/
@Configuration
@ConditionalOnExpression(FastCloudConstants.COMMON_SECURITY_ENABLE_CONFIG)
public class FeignAutoConfiguration
{
    @Bean
    public RequestInterceptor requestInterceptor()
    {
        return new FeignRequestInterceptor();
    }
}
