package cn.xdd.test;

import cn.xdd.service.impl.UserService;
import cn.xdd.dao.impl.UserDaoImpl;
import cn.xdd.po.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
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
        UserService userService= (UserService) applicationContext.getBean("userService");
        List<User> list=userService.findAll();
        list.forEach((e)-> System.out.println(e));
    }

    @Test
    public void test2(){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) beanFactory.getBean("userService");
        userService.test();
    }
}
