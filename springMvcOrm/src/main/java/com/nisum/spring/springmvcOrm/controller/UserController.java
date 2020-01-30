package com.nisum.spring.springmvcOrm.controller;

import com.nisum.spring.springmvcOrm.domain.User;

import com.nisum.spring.springmvcOrm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;


    @RequestMapping(value="/registrationPage", method = RequestMethod.GET)
    public String showRegistrationPage(){
        return "userReg";
    }


    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user")User user, ModelMap modelMap){
        int res = service.save(user);
        modelMap.addAttribute("result", "User created with Id " + res);
        return "userReg";
    }

    public UserService getUserService() {
        return service;
    }

    public void setUserService(UserService userService) {
        this.service = userService;
    }

    @RequestMapping(value="/getUsers", method = RequestMethod.GET)
    public String getUsers(ModelMap model){
        List<User> users = service.getUsers();
        model.addAttribute("users", users);
        return "displayUsers";
    }

    @RequestMapping("validateEmail")
    public @ResponseBody String validateEmail(@RequestParam("id") int id){
            User user = service.getUser(id);
            String message="";
            if(user!=null){
                message = id + " already exists";
            }
            return message;
    }

}
