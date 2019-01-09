package yousee.clouds.core.service.impl;

import org.springframework.stereotype.Service;
import yousee.clouds.core.bean.User;
import yousee.clouds.core.mapper.UserMapper;
import yousee.clouds.core.service.UserService;

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
