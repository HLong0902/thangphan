package com.fpt.thangphan.recruitment.Controller;


import com.fpt.thangphan.recruitment.configuration.Permission;
import com.fpt.thangphan.recruitment.sevice.UploadTextService;
import com.fpt.thangphan.recruitment.storage.StorageService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
public class LoginController {
    @Autowired
    private Map<String, String> loginData;


    @Autowired
    private UploadTextService uploadTextService;

    @Autowired
    private StorageService storageService;

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @Permission
    @PostMapping("/login")
    public ModelAndView login(@RequestParam(value = "password", required = false) String pass,
                              @RequestParam(value = "username", required = false) String username,
                              HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", "");
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }

    @GetMapping(value = {"/logout", "/log-out"})
    public ModelAndView logout(HttpServletRequest request) {

        loginData.remove(request.getRemoteAddr());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView();
//        Users users = new Users();
//        modelAndView.addObject("user", users);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public ModelAndView createNewUser(@Valid Users users, BindingResult bindingResult) {
//        ModelAndView modelAndView = new ModelAndView();
//        Users usersExists = userService.findUserByEmail(users.getEmail());
//        if (usersExists != null) {
//            bindingResult
//                    .rejectValue("email", "error.users",
//                            "There is already a users registered with the email provided");
//        }
//        if (bindingResult.hasErrors()) {
//            modelAndView.setViewName("registration");
//        } else {
//            userService.saveUser(users);
//            modelAndView.addObject("successMessage", "Users has been registered successfully");
//            modelAndView.addObject("user", new Users());
//            modelAndView.setViewName("registration");
//
//        }
//        return modelAndView;
//    }

    @Permission
    @RequestMapping(value = "/admin/home", method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        Users users = userService.findUserByEmail(auth.getName());
//        modelAndView.addObject("userName", "Welcome " + users.getName() + " " + users.getLastName() + " (" + users.getEmail() + ")");
        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }

    void checkLogin(String username, String password, HttpServletRequest request) {

    }

    @ExceptionHandler(Exception.class)
    public Object handleEx(Exception exc) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }
}