package cn.zwq.ssm.mapper;

import cn.zwq.ssm.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper  {

    //查询全部用户
    @Select("select * from users")
    List<User> selectAll();

    //根据id查询用户
    @Select("select *  from users where uid = #{uid}")
    User selectByPrimaryKey(Integer uid);

    //根据id修改用户
    void updateByPrimaryKeySelective(User user);

    //保存用户
    void insertSelective(User user);

    //根据id删除用户
    @Delete("delete from users where uid = #{uid}")
    void deleteByPrimaryKey(Integer uid);
}