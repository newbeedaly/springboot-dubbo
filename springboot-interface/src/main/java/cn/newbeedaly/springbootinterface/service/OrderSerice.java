package cn.newbeedaly.springbootinterface.service;

import cn.newbeedaly.springbootinterface.bean.UserAddress;

import java.util.List;

public interface OrderSerice {

  /**
   * 初始化订单
   * @param userId
   */
    public List<UserAddress> initOrder(String userId);
}
