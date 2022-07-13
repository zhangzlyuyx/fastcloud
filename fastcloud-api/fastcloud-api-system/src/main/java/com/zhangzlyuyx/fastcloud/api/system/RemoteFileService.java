package com.zhangzlyuyx.fastcloud.api.system;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.zhangzlyuyx.fastcloud.common.core.constant.ServiceNameConstants;
import com.zhangzlyuyx.fastcloud.common.core.domain.R;
import com.zhangzlyuyx.fastcloud.api.system.domain.SysFile;
import com.zhangzlyuyx.fastcloud.api.system.factory.RemoteFileFallbackFactory;

/**
 * 文件服务
 * 
 * @author ruoyi
 */
@FeignClient(name = ServiceNameConstants.FILE_SERVICE_NAME_CONFIG, path = ServiceNameConstants.FILE_SERVICE_PATH_CONFIG, contextId = "remoteFileService", fallbackFactory = RemoteFileFallbackFactory.class)
public interface RemoteFileService
{
    /**
     * 上传文件
     *
     * @param file 文件信息
     * @return 结果
     */
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public R<SysFile> upload(@RequestPart(value = "file") MultipartFile file);
}
