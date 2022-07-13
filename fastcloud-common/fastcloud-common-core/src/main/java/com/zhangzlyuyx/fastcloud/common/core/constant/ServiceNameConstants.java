package com.zhangzlyuyx.fastcloud.common.core.constant;

/**
 * 服务名称
 * 
 * @author ruoyi
 */
public class ServiceNameConstants
{
    /**
     * 认证服务的serviceid
     */
    public static final String AUTH_SERVICE = "auth";
    
    public static final String AUTH_SERVICE_NAME_CONFIG = "${feign.client.config." + AUTH_SERVICE + ".name:" + AUTH_SERVICE + "}";
    
    public static final String AUTH_SERVICE_PATH_CONFIG = "${feign.client.config." + AUTH_SERVICE + ".path:}";

    /**
     * 系统模块的serviceid
     */
    public static final String SYSTEM_SERVICE = "system";
    
    public static final String SYSTEM_SERVICE_NAME_CONFIG = "${feign.client.config." + SYSTEM_SERVICE + ".name:" + SYSTEM_SERVICE + "}";
    
    public static final String SYSTEM_SERVICE_PATH_CONFIG = "${feign.client.config." + SYSTEM_SERVICE + ".path:}";

    /**
     * 文件服务的serviceid
     */
    public static final String FILE_SERVICE = "file";
    
    public static final String FILE_SERVICE_NAME_CONFIG = "${feign.client.config." + FILE_SERVICE + ".name:" + FILE_SERVICE + "}";
    
    public static final String FILE_SERVICE_PATH_CONFIG = "${feign.client.config." + FILE_SERVICE + ".path:}";
}
