package cn.xdd.service.impl;

import cn.xdd.dao.UserDao;
import cn.xdd.dao.UserDao;
import cn.xdd.po.User;
import cn.xdd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author xchb
 * @version 1.0
 * @ClassName UserService
 * @description null
 * @createTime 2019年08月26日 22:01
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> findAll(){
        return userDao.findAll();
    }

    /**
     * 插入用户
     * @param user
     * @return
     */
    @Override
    public int insert(User user){
        return userDao.insert(user);
    }

    /**
     * 根据ids删除多个用户
     * @param list
     * @return
     */
    @Override
    public int deleteByIds(List<Integer> list){
        return userDao.deleteByIds(list);
    }

    /**
     * spring transaction manage
     */
    public void test(){
        userDao.insert(new User(UUID.randomUUID().toString().substring(1,5),"1234124"));
        List<Integer> list=new ArrayList<>();
        list.add(143);
        userDao.deleteByIds(list);
    }
}
