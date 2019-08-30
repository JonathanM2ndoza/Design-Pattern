package com.jmendoza.springboot.templatepattern.impl;

import com.jmendoza.springboot.templatepattern.template.Game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cricket")
public class Cricket extends Game {
    @Override
    protected void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    protected void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

}
