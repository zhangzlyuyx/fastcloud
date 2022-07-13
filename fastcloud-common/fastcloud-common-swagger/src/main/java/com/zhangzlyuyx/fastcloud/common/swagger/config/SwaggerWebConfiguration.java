package com.zhangzlyuyx.fastcloud.common.swagger.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.zhangzlyuyx.fastcloud.core.constant.FastCloudConstants;

/**
 * swagger 资源映射路径
 * 
 * @author ruoyi
 */
@Configuration
@ConditionalOnExpression(FastCloudConstants.COMMON_SWAGGER_ENABLE_CONFIG)
public class SwaggerWebConfiguration implements WebMvcConfigurer
{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        /** swagger-ui 地址 */
        registry.addResourceHandler("/swagger-ui/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
    }
}