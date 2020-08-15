package com.stark1307.day03annotationinjection;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
//    @Autowired
//    @Qualifier("userDao")
    @Resource(name="userDao")
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserService: ");
        userDao.save();
    }
}
