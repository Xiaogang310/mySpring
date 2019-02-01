package com.xg.spring.demo;

import com.xg.spring.demo.knight.Knight;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * DemoApplication
 * @author : Gang
 * @date : 2019/2/1
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();

		context.close();
	}

}

