package yousee.clouds.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import yousee.clouds.core.bean.User;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    @Select("select user_name as userName,pass_word as passWord from user")
    List<User> queryUserList(Map<String, Object> paramter);
}
