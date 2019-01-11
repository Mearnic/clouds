package yousee.clouds.video.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yousee.clouds.common.core.bean.R;
import yousee.clouds.video.core.feign.UserFeignService;

import javax.annotation.Resource;
import java.util.Map;

@RestController(value = "userController")
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserFeignService userFeignService;

    @GetMapping(value = "/queryUserList")
    public R queryUserList(@RequestBody Map<String, Object> paramter) {
        return userFeignService.queryUserList(paramter);
    }

}
