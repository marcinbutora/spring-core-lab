package com.training.inqoo.springcorelab;

import org.springframework.stereotype.Component;

@Component
public class MainBean {
    public void getMBThirdBean(MBThirdBean mbThirdBean){
        mbThirdBean.message();
    }
}
