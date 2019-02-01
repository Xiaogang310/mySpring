package com.xg.spring.demo;

import com.xg.spring.demo.sound.autoscan.CdPlayerAutoScanConfig;
import com.xg.spring.demo.sound.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CdPlayerConfigAutoScanTest
 *
 * @author : Gang
 * @date : 2019/2/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerAutoScanConfig.class )
public class CdPlayerConfigAutoScanTest {

    @Autowired
    private MediaPlayer player;

    @Test
    public void play(){
        player.play();
    }
}
