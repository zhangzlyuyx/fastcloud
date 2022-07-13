package com.zhangzlyuyx.fastcloud.core.constant;

public class FastCloudConstants {

	public static final String FASTCLOUD = "fastcloud";
	
	public static final String COMMON_LOG_ENABLE_CONFIG = "${fastcloud.common.log.enable:true}";
	
	public static final String COMMON_DATASCOPE_ENABLE_CONFIG = "${fastcloud.common.datascope.enable:true}";
	
	public static final String COMMON_REDIS_ENABLE_CONFIG = "${fastcloud.common.redis.enable:true}";
	
	public static final String COMMON_SECURITY_ENABLE_CONFIG = "${fastcloud.common.security.enable:true}";
	
	public static final String COMMON_SECURITY_MAPPERBASEPACKAGES_CONFIG = "${fastcloud.common.security.mapperBasePackages:mybatis.mapper-basePackages}";
	
	public static final String COMMON_SWAGGER_ENABLE_CONFIG = "${fastcloud.common.swagger.enable:true}";

	public static final String GATEWAY_SWAGGER_ENABLE_CONFIG = "${fastcloud.gateway.swagger.enable:true}";
	
	public static final String GATEWAY_CAPTCHA_ENABLE_CONFIG = "${fastcloud.gateway.captcha.enable:true}";
	
	public static final String GATEWAY_AUTH_ENABLE_CONFIG = "${fastcloud.gateway.auth.enable:true}";
}
