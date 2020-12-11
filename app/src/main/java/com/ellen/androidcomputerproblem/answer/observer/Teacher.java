package com.ellen.androidcomputerproblem.answer.observer;

import com.ellen.problem.observer.basic.Subject;

/**
 * 被观察者
 */
public class Teacher extends Subject<Teacher> {

    /**
     * 音量大小
     */
    private int voice;

    public Teacher(int voice) {
        this.voice = voice;
    }

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        int oldVoice = this.voice;
        this.voice = voice;
        if(this.voice != oldVoice) {
            //只要音量更改，那么直接出发被观察的更新
            statusChange(this);
        }
    }
}
