package cn.newbeedaly.springbootorderserviceconsumer.controller;

import cn.newbeedaly.springbootinterface.bean.UserAddress;
import cn.newbeedaly.springbootinterface.service.OrderSerice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {

  @Resource
  OrderSerice orderSerice;

  @ResponseBody
  @RequestMapping("/initOrder")
  public List<UserAddress> initOrder(@RequestParam("uid") String userId){
    return orderSerice.initOrder(userId);
  }

}
