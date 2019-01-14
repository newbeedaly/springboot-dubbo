package cn.newbeedaly.springbootinterface.service;

import cn.newbeedaly.springbootinterface.bean.UserAddress;

import java.util.List;

/**
 *  create by liqk 2019/1/14
 *
 *  用户服务接口
 */
public interface UserService {

  /**
   *  按照用户id返回所有的收获地址
   * @param userId
   * @return
   */
  public List<UserAddress> getUserAddressList(String userId);

}
