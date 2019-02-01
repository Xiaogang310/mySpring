package com.xg.spring.demo.sound.autoscan;

import com.xg.spring.demo.sound.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * SgtPeppers
 *
 * @author : Gang
 * @date : 2019/2/1
 */
@Component
public class SgtPeppers implements CompactDisc {

    private final String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private final String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + this.title + " by " + this.artist);
    }
}
