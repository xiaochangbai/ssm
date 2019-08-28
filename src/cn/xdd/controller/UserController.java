package cn.xdd.controller;

import cn.xdd.service.UserService;
import cn.xdd.service.impl.UserServiceImpl;
import cn.xdd.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author xchb
 * @version 1.0
 * @ClassName UserController
 * @description null
 * @createTime 2019年08月26日 21:11
 */
@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public void findAll(HttpServletResponse response) throws IOException {
        System.out.println(userService);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("<h1 style='color:green'>"+new Date()+"</h1>");
        response.getWriter().println(userService.findAll());
    }

    @RequestMapping("/insert")
    public String insert(User user, ModelMap modelMap){
        try {
            if(user==null||user.getName()==null||user.getPwd()==null){
                modelMap.addAttribute("msg","<h1 style='color:red'>插入数据异常</h1>");
                return "/index.jsp";
            }
            int effect=userService.insert(user);
            if(effect>0){
                modelMap.addAttribute("msg","<h1 style='color:green'>插入成功，影响行数："+effect+"</h1>");
            }else {
                modelMap.addAttribute("msg","<h1 style='color:red'>插入失败</h1>");
            }
        }catch (Exception e){
            modelMap.addAttribute("msg","<h1 style='color:red'>用户名已存在</h1>");
        }
        return "/index.jsp";
    }
}
