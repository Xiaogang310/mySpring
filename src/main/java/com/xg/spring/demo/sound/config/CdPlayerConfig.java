package com.xg.spring.demo.sound.config;

import com.xg.spring.demo.sound.CompactDisc;
import com.xg.spring.demo.sound.MediaPlayer;
import com.xg.spring.demo.sound.autoscan.CdPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * CdPlayerConfig
 *
 * @author : Gang
 * @date : 2019/2/1
 */
@Configuration
public class CdPlayerConfig {

    private CompactDisc cd(){
        return new BeatlesCd("1", "Beatles");
    }

    @Bean
    public MediaPlayer player(){
        return new CdPlayer(this.cd());
    }

}
