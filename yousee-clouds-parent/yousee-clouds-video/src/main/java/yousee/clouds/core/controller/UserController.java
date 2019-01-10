package yousee.clouds.core.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import netscape.javascript.JSObject;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import yousee.clouds.bean.R;

import javax.annotation.Resource;
import java.util.Map;

@RestController(value = "userController")
@RequestMapping("/user")
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${yousee.clouds.server.user-url}")
    private String userUrl;

    @GetMapping(value = "/queryUserList")
    public R queryUserList() {

        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());


        HttpEntity<String> formEntity = new HttpEntity<>("{}", headers);

        return restTemplate.postForObject(userUrl, formEntity, R.class);
    }
}
