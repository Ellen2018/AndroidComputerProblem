package com.ellen.androidcomputerproblem.answer.observer;

import com.ellen.problem.observer.basic.Observer;


/**
 * 这是观察者
 */
public class Student implements Observer<Teacher> {


    @Override
    public void update(Teacher teacher) {
        System.out.println("学号为："+stuId+",观察到老师的音量变为:"+teacher.getVoice());
    }

    public Student(String stuId) {
        this.stuId = stuId;
    }

    /**
     * 学号
     */
    private String stuId;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }
}
