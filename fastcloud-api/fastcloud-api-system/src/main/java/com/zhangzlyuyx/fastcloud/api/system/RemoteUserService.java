package com.zhangzlyuyx.fastcloud.api.system;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import com.zhangzlyuyx.fastcloud.common.core.constant.SecurityConstants;
import com.zhangzlyuyx.fastcloud.common.core.constant.ServiceNameConstants;
import com.zhangzlyuyx.fastcloud.common.core.domain.R;
import com.zhangzlyuyx.fastcloud.api.system.domain.SysUser;
import com.zhangzlyuyx.fastcloud.api.system.factory.RemoteUserFallbackFactory;
import com.zhangzlyuyx.fastcloud.api.system.model.LoginUser;

/**
 * 用户服务
 * 
 * @author ruoyi
 */
@FeignClient(name = ServiceNameConstants.SYSTEM_SERVICE_NAME_CONFIG, path = ServiceNameConstants.SYSTEM_SERVICE_PATH_CONFIG, contextId = "remoteUserService", fallbackFactory = RemoteUserFallbackFactory.class)
public interface RemoteUserService
{
    /**
     * 通过用户名查询用户信息
     *
     * @param username 用户名
     * @param source 请求来源
     * @return 结果
     */
    @GetMapping("/user/info/{username}")
    public R<LoginUser> getUserInfo(@PathVariable("username") String username, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);

    /**
     * 注册用户信息
     *
     * @param sysUser 用户信息
     * @param source 请求来源
     * @return 结果
     */
    @PostMapping("/user/register")
    public R<Boolean> registerUserInfo(@RequestBody SysUser sysUser, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
