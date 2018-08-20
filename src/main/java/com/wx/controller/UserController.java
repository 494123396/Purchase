package com.wx.controller;


import com.wx.pojo.User;
import com.wx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public ModelAndView login(User user, HttpSession session){
        User loginUser = userService.login(user);
        ModelAndView mv=null;
        System.out.println("haha");
        if (loginUser==null){
           mv=new ModelAndView("/login.jsp");
            mv.addObject("erro","用户不存在");
        }else {
            session.setAttribute("user",user);
            mv=new ModelAndView("/main.jsp");
        }

        return mv;

    }


    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.removeAttribute("user");
      return "/login.jsp";
    }

}
