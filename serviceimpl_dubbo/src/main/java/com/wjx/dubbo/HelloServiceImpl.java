package com.wjx.dubbo;

import org.springframework.stereotype.Service;

import com.wjx.dubbo.pojo.User;
import com.wjx.dubbo.service.HelloService;

@Service("helloServiceImpl") // 此注解的作用创建这个对象，然后作为服务提供者发布出去，相当于在xml文件里面配置的<dubbo:service ...
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {
		return "this is name:" + name;
	}

	@Override
	public User getUser(User user) {
		user.setId(1);
		user.setAge("22");
		user.setName("this is name ," + user.getName());
		return user;
	}

}
