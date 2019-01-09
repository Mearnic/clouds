package yousee.clouds.core.service;

import org.springframework.stereotype.Service;
import yousee.clouds.core.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> queryUserList(Map<String, Object> paramter);
}
