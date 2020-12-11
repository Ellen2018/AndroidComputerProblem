package com.ellen.androidcomputerproblem.answer.proxy.staticproxy;

public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("保存!");
    }

}
