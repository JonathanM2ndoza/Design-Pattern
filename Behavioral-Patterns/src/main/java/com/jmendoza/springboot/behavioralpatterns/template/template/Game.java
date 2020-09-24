package com.jmendoza.springboot.behavioralpatterns.template.template;

import org.springframework.stereotype.Component;

@Component
public abstract class Game {
    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

    //template method
    public final void play() {

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
