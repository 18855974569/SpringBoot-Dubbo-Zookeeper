package com.wjx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动consumer服务
 * 
 * @Title:  Application.java   
 * @Package com.wjx.dubbo   
 * @Description: 
 * @author: wjx     
 * @date:   2018年11月3日 上午1:14:48   
 * @version V1.0
 */
@SpringBootApplication
@ImportResource({ "classpath:dubbo-consumer.xml" })
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
