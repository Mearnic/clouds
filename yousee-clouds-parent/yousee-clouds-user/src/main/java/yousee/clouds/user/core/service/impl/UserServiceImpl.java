package yousee.clouds.user.core.service.impl;

import org.springframework.stereotype.Service;
import yousee.clouds.user.core.bean.User;
import yousee.clouds.user.core.mapper.UserMapper;
import yousee.clouds.user.core.service.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList(Map<String, Object> paramter) {
        return userMapper.queryUserList(paramter);
    }
}
