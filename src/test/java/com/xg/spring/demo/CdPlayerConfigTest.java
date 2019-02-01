package com.xg.spring.demo;

import com.xg.spring.demo.sound.CompactDisc;
import com.xg.spring.demo.sound.MediaPlayer;
import com.xg.spring.demo.sound.config.CdPlayerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CdPlayerConfigTest
 *
 * @author : Gang
 * @date : 2019/2/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdPlayerConfigTest {

    @Autowired
    private MediaPlayer player;

    @Test
    public void play(){
        this.player.play();
    }
}
