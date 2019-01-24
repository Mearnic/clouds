package yousee.clouds.video.core.feign;

import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import yousee.clouds.common.core.bean.R;
import yousee.clouds.video.core.feign.fail.UserFeignFallbackFactory;
import yousee.clouds.video.system.feign.FeignConfiguration;

import java.util.Map;

@FeignClient(name = "yousee-clouds-user", configuration = FeignConfiguration.class, fallbackFactory = UserFeignFallbackFactory.class)
public interface UserFeignService {

    @RequestLine("POST /user/queryUserList")
    public R queryUserList(@RequestBody Map<String, Object> paramter);
}
