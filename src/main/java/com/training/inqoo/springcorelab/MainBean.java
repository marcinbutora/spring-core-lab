package com.training.inqoo.springcorelab;

import org.springframework.stereotype.Component;

@Component
public class MainBean {

    private final MBThirdBean mbThirdBean;

    public MainBean(MBThirdBean mbThirdBean) {
        this.mbThirdBean = mbThirdBean;
        mbThirdBean.message();
    }

}
