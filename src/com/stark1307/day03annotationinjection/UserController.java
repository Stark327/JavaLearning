package com.stark1307.day03annotationinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author
 */
@Controller("userController")
public class UserController {
//    @Resource(name="userService")
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    public void execute() {
        userService.save();
    }
}
