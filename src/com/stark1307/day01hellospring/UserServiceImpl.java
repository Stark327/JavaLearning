package com.stark1307.day01hellospring;

/**
 * @author
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void service() {
        userDao.login();
        System.out.println("service");
    }
}
