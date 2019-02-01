package com.xg.spring.demo.quest;

import java.io.PrintStream;

/**
 * SlayDragonQuest
 *
 * @author : Gang
 * @date : 2019/2/1
 */
public class SlayDragonQuest implements Quest {

    private final PrintStream ps;

    public SlayDragonQuest(PrintStream ps){
        this.ps = ps;
    }

    @Override
    public void embark() {
        this.ps.println("embark slay dragon.");
    }
}
