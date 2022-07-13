package com.zhangzlyuyx.fastcloud.common.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.zhangzlyuyx.fastcloud.common.core.constant.SecurityConstants;
import com.zhangzlyuyx.fastcloud.core.constant.FastCloudConstants;
import com.zhangzlyuyx.fastcloud.api.system.RemoteLogService;
import com.zhangzlyuyx.fastcloud.api.system.domain.SysOperLog;

/**
 * 异步调用日志服务
 * 
 * @author ruoyi
 */
@Service
@ConditionalOnExpression(FastCloudConstants.COMMON_LOG_ENABLE_CONFIG)
public class AsyncLogService
{
    @Autowired
    private RemoteLogService remoteLogService;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveSysLog(SysOperLog sysOperLog)
    {
        remoteLogService.saveLog(sysOperLog, SecurityConstants.INNER);
    }
}
