package yousee.clouds.user.core.service;

import yousee.clouds.user.core.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> queryUserList(Map<String, Object> paramter);
}
