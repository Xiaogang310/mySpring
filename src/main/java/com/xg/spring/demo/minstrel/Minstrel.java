package com.xg.spring.demo.minstrel;

import java.io.PrintStream;

/**
 * Minstrel
 *
 * @author : Gang
 * @date : 2019/2/1
 */
public class Minstrel {

    private final PrintStream ps;

    public Minstrel(PrintStream ps){
        this.ps = ps;
    }

    public void singBeforeQuest(){
        this.ps.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest(){
        this.ps.println("Tee hee hee, the brave knight did embark on a quest");
    }

}

