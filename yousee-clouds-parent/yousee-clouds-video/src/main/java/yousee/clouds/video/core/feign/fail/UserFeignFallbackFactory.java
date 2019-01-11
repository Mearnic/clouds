package yousee.clouds.video.core.feign.fail;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import yousee.clouds.common.core.bean.R;
import yousee.clouds.video.core.feign.UserFeignService;

public class UserFeignFallbackFactory implements FallbackFactory<UserFeignService>{


    @Override
    public UserFeignService create(Throwable throwable) {

        return paramter -> R.error();
    }
}
