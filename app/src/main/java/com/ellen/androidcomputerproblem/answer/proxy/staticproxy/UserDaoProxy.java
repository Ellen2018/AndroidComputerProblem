package com.ellen.androidcomputerproblem.answer.proxy.staticproxy;

/**
 * 静态代理
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(IUserDao iUserDao) {
        this.target = iUserDao;
    }

    @Override
    public void save() {
        System.out.println("开启事务");//扩展了额外功能
        target.save();
        System.out.println("提交事务");
    }
}
