package com.xg.spring.demo.sound.config;

import com.xg.spring.demo.sound.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * BeatlesCd
 *
 * @author : Gang
 * @date : 2019/2/1
 */
@Component
public class BeatlesCd implements CompactDisc {

    private final String title;
    private final String artist;

    public BeatlesCd(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this.title + " by " + this.artist);
    }
}
