package com.wjx.dubbo.service;

import com.wjx.dubbo.pojo.User;

/**
 * 单纯的提供一个接口，暴露出来
 * 
 * 注意:使用之前先   maven install 到本地仓库，
 * 在实现服务 和 web服务里面依赖service就可以使用里面的方法了
 * 
 * @Title:  HelloService.java   
 * @Package com.wjx.dubbo.service   
 * @Description: 
 * @author: wjx     
 * @date:   2018年11月3日 上午1:08:57   
 * @version V1.0
 */
public interface HelloService {

	String sayHello(String name);

	User getUser(User user);
}
