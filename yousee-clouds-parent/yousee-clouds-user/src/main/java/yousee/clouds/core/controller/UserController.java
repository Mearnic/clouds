package yousee.clouds.core.controller;

import org.springframework.web.bind.annotation.*;
import yousee.clouds.bean.R;
import yousee.clouds.core.bean.User;
import yousee.clouds.core.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController(value = "userController")
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping(value = "/queryUserList")
    public R queryUserList(@RequestBody Map<String,Object> paramter) {
        List<User> users = userService.queryUserList(paramter);

        return R.ok().data(users).remark("测试restfull接口");
    }
}
