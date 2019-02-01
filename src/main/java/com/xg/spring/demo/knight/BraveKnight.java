package com.xg.spring.demo.knight;

import com.xg.spring.demo.quest.Quest;

/**
 * BraveKnight
 *
 * @author : Gang
 * @date : 2019/2/1
 */
public class BraveKnight implements Knight{

    private final Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        this.quest.embark();
    }
}
