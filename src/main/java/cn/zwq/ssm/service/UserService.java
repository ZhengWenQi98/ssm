package cn.zwq.ssm.service;

import cn.zwq.ssm.entity.User;

import java.util.List;

public interface UserService {
    /*查询所有用户*/
    List<User> queryAllUser();

    /*根据用户id查询用户*/
    User queryUserByUid(Integer uid);

    /*根据用户id修改用户信息*/
    void updateUserByUid(User user);

    /*添加用户*/
    void addUser(User user);

    /*根据用户id删除用户*/
    void deleteUserByUids(Integer[] uids);
}