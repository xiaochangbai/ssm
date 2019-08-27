package cn.xdd.dao.impl;

import cn.xdd.po.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author xchb
 * @version 1.0
 * @ClassName UserDao
 * @description null
 * @createTime 2019年08月26日 17:32
 */
@Component
public class UserDaoImpl {
    @Autowired
    private SqlSessionTemplate sqlSession;


    /**
     * 查询所有用户
     * @return
     */
    public List<User> findAll(){
        return sqlSession.selectList("cn.xdd.dao.impl.UserDaoImpl.findAll");
    }

    /**
     * 插入单个用户
     * @param user
     * @return
     */
    public int insert(User user){
        return sqlSession.insert("cn.xdd.dao.impl.UserDaoImpl.insert",user);
    }

    /**
     * 根据id删除多个用户
     * @param list
     * @return
     */
    public int deleteByIds(List<Integer> list){
        return sqlSession.delete("cn.xdd.dao.impl.UserDaoImpl.deleteByIds",list);
    }

}
