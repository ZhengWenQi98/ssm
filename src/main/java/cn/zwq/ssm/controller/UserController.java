package cn.zwq.ssm.controller;

import cn.zwq.ssm.entity.User;
import cn.zwq.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*查询所有用户*/
    @RequestMapping("/queryAllUser")
    public List<User> queryAllUser() {
        return userService.queryAllUser();
    }

    /*根据用户id查询用户*/
    @RequestMapping("/queryUserByUid/{uid}")
    public User queryUserByUid(@PathVariable("uid") Integer uid) {
        return userService.queryUserByUid(uid);
    }

    /*根据用户id修改用户信息*/
    @RequestMapping("/updateUserByUid")
    public boolean updateUserByUid(User user) {
        try {
            userService.updateUserByUid(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /*添加用户*/
    @RequestMapping("/addUser")
    public Boolean addUser(User user) {
        try {
            userService.addUser(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /*根据用户id删除用户*/
    @RequestMapping("/deleteUserByUids")
    public Boolean deleteUserByUids(Integer[] uids) {
        try {
            userService.deleteUserByUids(uids);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}