package cn.zwq.ssm.service.impl;

import cn.zwq.ssm.entity.User;
import cn.zwq.ssm.mapper.UserMapper;
import cn.zwq.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public User queryUserByUid(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public void updateUserByUid(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertSelective(user);
    }

    /*根据用户id删除用户*/
    @Override
    public void deleteUserByUids(Integer[] uids) {
        /*Stream流+方法引用+lambda表达式简化删除代码*/
        Stream.of(uids).forEach(userMapper::deleteByPrimaryKey);
    }
}