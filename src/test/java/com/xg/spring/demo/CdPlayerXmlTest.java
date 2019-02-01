package com.xg.spring.demo;

import com.xg.spring.demo.sound.CompactDisc;
import com.xg.spring.demo.sound.MediaPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CdPlayerXmlTest
 *
 * @author : Gang
 * @date : 2019/2/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:cd.xml")
public class CdPlayerXmlTest {

    @Autowired
    private MediaPlayer player;

    @Test
    public void play(){
        this.player.play();
    }
}
