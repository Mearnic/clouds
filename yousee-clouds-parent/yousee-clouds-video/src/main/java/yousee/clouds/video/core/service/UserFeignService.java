package yousee.clouds.video.core.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import yousee.clouds.common.core.bean.R;
import yousee.clouds.video.system.feign.FeignConfiguration;

import java.util.Map;

@FeignClient(name = "yousee-clouds-user",configuration = FeignConfiguration.class)
public interface UserFeignService {

    @RequestMapping(value = "/userFeign",method = RequestMethod.POST)
    public R queryUserList(@RequestBody Map<String,Object> paramter);
}
