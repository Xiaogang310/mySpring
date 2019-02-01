package com.xg.spring.demo.sound.autoscan;

import com.xg.spring.demo.sound.CompactDisc;
import com.xg.spring.demo.sound.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CdPlayer
 *
 * @author : Gang
 * @date : 2019/2/1
 */
@Component
public class CdPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CdPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        this.cd.play();
    }
}
