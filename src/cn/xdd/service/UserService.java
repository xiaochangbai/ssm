package cn.xdd.service;

import cn.xdd.po.User;

import java.util.List;

/**
 * @author xchb
 * @version 1.0
 * @ClassName UserService
 * @description null
 * @createTime 2019年08月28日 10:51
 */
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 插入用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 根据ids删除多个用户
     * @param list
     * @return
     */
    int deleteByIds(List<Integer> list);
}
