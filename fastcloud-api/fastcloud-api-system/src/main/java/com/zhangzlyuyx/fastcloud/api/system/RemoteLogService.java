package com.zhangzlyuyx.fastcloud.api.system;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import com.zhangzlyuyx.fastcloud.common.core.constant.SecurityConstants;
import com.zhangzlyuyx.fastcloud.common.core.constant.ServiceNameConstants;
import com.zhangzlyuyx.fastcloud.common.core.domain.R;
import com.zhangzlyuyx.fastcloud.api.system.domain.SysLogininfor;
import com.zhangzlyuyx.fastcloud.api.system.domain.SysOperLog;
import com.zhangzlyuyx.fastcloud.api.system.factory.RemoteLogFallbackFactory;

/**
 * 日志服务
 * 
 * @author ruoyi
 */
@FeignClient(name = ServiceNameConstants.SYSTEM_SERVICE_NAME_CONFIG, path = ServiceNameConstants.SYSTEM_SERVICE_PATH_CONFIG, contextId = "remoteLogService", fallbackFactory = RemoteLogFallbackFactory.class)
public interface RemoteLogService
{
    /**
     * 保存系统日志
     *
     * @param sysOperLog 日志实体
     * @param source 请求来源
     * @return 结果
     */
    @PostMapping("/operlog")
    public R<Boolean> saveLog(@RequestBody SysOperLog sysOperLog, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);

    /**
     * 保存访问记录
     *
     * @param sysLogininfor 访问实体
     * @param source 请求来源
     * @return 结果
     */
    @PostMapping("/logininfor")
    public R<Boolean> saveLogininfor(@RequestBody SysLogininfor sysLogininfor, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
