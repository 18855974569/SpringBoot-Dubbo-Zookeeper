package com.wjx.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wjx.dubbo.pojo.User;
import com.wjx.dubbo.service.HelloService;


/**
 * 测试controller
 * 
 * @Title:  HelloController.java   
 * @Package com.wjx.dubbo   
 * @Description: 
 * @author: wjx     
 * @date:   2018年11月3日 上午1:15:14   
 * @version V1.0
 */
@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("hello")
	@ResponseBody
	public User sayHello(String name) {
		//测试接口sayHello
		String data = helloService.sayHello(name);
		User user = new User();
		user.setName(data);
		//测试接口getUser
		User u = helloService.getUser(user);
		return u;
	}
}
