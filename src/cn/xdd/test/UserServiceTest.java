package cn.xdd.test;

import cn.xdd.service.impl.UserServiceImpl;
import cn.xdd.dao.UserDao;
import cn.xdd.po.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author xchb
 * @version 1.0
 * @ClassName UserDaoTest
 * @description null
 * @createTime 2019年08月26日 17:55
 */
public class UserServiceTest {

    @Test
    public void testFindAll(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService= (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        List<User> list=userService.findAll();
        list.forEach(System.out::println);
    }

    @Test
    public void test2(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService= (UserServiceImpl) beanFactory.getBean("userServiceImpl");
        userService.test();
    }
}
