package cn.newbeedaly.springbootinterface.bean;

import java.io.Serializable;

public class UserAddress implements Serializable {

  private Integer id;
  private String userId; // 用户id
  private String userAddress; // 收货人地址
  private String consignee; // 收货人
  private String phoneNum; // 收货人号码
  private String isDefault; // 是否是默认地址 Y 是 N 否

  public UserAddress(Integer id, String userId, String userAddress, String consignee, String phoneNum, String isDefault) {
    this.id = id;
    this.userId = userId;
    this.userAddress = userAddress;
    this.consignee = consignee;
    this.phoneNum = phoneNum;
    this.isDefault = isDefault;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  public String getConsignee() {
    return consignee;
  }

  public void setConsignee(String consignee) {
    this.consignee = consignee;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public String getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(String isDefault) {
    this.isDefault = isDefault;
  }
}
