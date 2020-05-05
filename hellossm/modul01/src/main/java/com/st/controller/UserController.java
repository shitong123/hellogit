package com.st.controller;


import com.alibaba.fastjson.JSON;
import com.st.bean.User;
import com.st.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

//    @RequestMapping("/delete.do")
//    public ModelAndView deleteA(int ids){
//        ModelAndView mv=new ModelAndView();
//        mv.addObject("id",ids);
//        mv.setViewName("index");
//        System.out.println(ids);
//        return mv;
//    }

    @PostMapping("/user")
    public Object addUser(@RequestBody User user) {
        try {
            userService.addUser(user);
            return JSON.toJSON("success");
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSON("fail");
        }

    }
    @DeleteMapping("/user/{id}")
     public Object deleteUser(@PathVariable int id){
        try {
            userService.deleteUser(id);
            return JSON.toJSON("success");
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSON("fail");
        }
    }

    @PutMapping("/user/{id}")
    public Object updateUser(@PathVariable int id,@RequestBody User user){
        try {
            user.setId(id);
            userService.updateUser(user);
            return  JSON.toJSON("success");
//            return JSON.toJSONString("success");
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSON("fail");
        }
    }

    @GetMapping("/user")
    public String selectUsers(){
        List<User> users = userService.selectUsers();
        return JSON.toJSONString(users);
    }

    @GetMapping("/user/{id}")
    public String selectUserById(@PathVariable int id){
        User user = userService.selectUserById(id);
        return  JSON.toJSONString(user);
    }

}
