package cn.newbeedaly.springbootuserserviceprovider.service.impl;

import cn.newbeedaly.springbootinterface.bean.UserAddress;
import cn.newbeedaly.springbootinterface.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 *  1. 将服务提供者注册到注册中心，暴露服务
 *      1).导入dubbo(2.6.2)和操作zookeeper客户端(curator)
 *
 *  2. 让服务消费者去注册中心订阅服务提供者的服务地址
 *
 */
@Service // 暴露服务
@Component
public class UserServiceImpl implements UserService {

  @Override
  public List<UserAddress> getUserAddressList(String userId) {

    System.out.println("UserServiceImpl --- 1 ----");

    UserAddress userAddress1 = new UserAddress(1,"1","北京市海淀区中关村软件园亚信科技","李乾坤","16601108888","N");
    UserAddress userAddress2 = new UserAddress(1,"1","广东省广州市越秀区中山六路","李乾坤","16601108880","Y");
    return Arrays.asList(userAddress1,userAddress2);
  }
}
