package cn.newbeedaly.springbootorderserviceconsumer.service.impl;

import cn.newbeedaly.springbootinterface.bean.UserAddress;
import cn.newbeedaly.springbootinterface.service.OrderSerice;
import cn.newbeedaly.springbootinterface.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderSerice {

  // @Resource
  // @Reference(url = "127.0.0.1:20882") // dubbo直连
  @Reference // 注册中心发现服务
  UserService userService;

  @Override
  public List<UserAddress> initOrder(String userId) {

    System.out.println("用户id:"+userId);
    List<UserAddress> addressList = userService.getUserAddressList(userId);

    for(UserAddress userAddress:addressList){
      System.out.println(userAddress.getUserAddress());
    }

   return addressList;

  }

}
