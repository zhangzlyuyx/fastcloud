package com.zhangzlyuyx.fastcloud.gateway.config.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import com.zhangzlyuyx.fastcloud.core.constant.FastCloudConstants;

/**
 * 验证码配置
 * 
 * @author ruoyi
 */
@Configuration
@RefreshScope
@ConfigurationProperties(prefix = "security.captcha")
@ConditionalOnExpression(FastCloudConstants.GATEWAY_CAPTCHA_ENABLE_CONFIG)
public class CaptchaProperties {
	/**
	 * 验证码开关
	 */
	private Boolean enabled;

	/**
	 * 验证码类型（math 数组计算 char 字符）
	 */
	private String type;

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}