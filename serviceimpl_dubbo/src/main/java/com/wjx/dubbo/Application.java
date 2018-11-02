package com.wjx.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 启动提供者也就是 dubbo 里面的  provider
 * 这里采用SpringBoot启动
 * dubbo-provider.xml 是dubbo和zookeeper的配置文件
 * 
 * @Title:  Application.java   
 * @Package com.wjx.dubbo   
 * @Description: 
 * @author: wjx     
 * @date:   2018年11月3日 上午1:10:50   
 * @version V1.0
 */
@SpringBootApplication
@ImportResource({ "classpath:dubbo-provider.xml" })
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
