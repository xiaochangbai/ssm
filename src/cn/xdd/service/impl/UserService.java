package cn.xdd.service.impl;

import cn.xdd.dao.impl.UserDaoImpl;
import cn.xdd.po.User;
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
public class UserService {
    @Autowired
    private UserDaoImpl userDaoImpl;

    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll(){
        return userDaoImpl.findAll();
    }

    /**
     * 插入用户
     * @param user
     * @return
     */
    public int insert(User user){
        return userDaoImpl.insert(user);
    }

    /**
     * 根据ids删除多个用户
     * @param list
     * @return
     */
    public int deleteByIds(List<Integer> list){
        return userDaoImpl.deleteByIds(list);
    }

    /**
     * spring transaction manage
     */
    public void test(){
        userDaoImpl.insert(new User(UUID.randomUUID().toString().substring(1,5),"1234124"));
        List<Integer> list=new ArrayList<>();
        list.add(143);
        userDaoImpl.deleteByIds(list);
    }
}
