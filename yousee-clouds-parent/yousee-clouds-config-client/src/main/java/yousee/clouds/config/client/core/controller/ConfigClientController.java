package yousee.clouds.config.client.core.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yousee.clouds.common.core.bean.R;

@RestController(value = "configClientController")
@RequestMapping("/config/client")
@RefreshScope
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping(value = "/profile")
    public R profile() {

        return R.ok().data(this.profile).remark("测试文件配置接口");
    }
}
