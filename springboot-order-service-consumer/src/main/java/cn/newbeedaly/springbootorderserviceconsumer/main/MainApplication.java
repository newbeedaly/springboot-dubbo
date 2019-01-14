package cn.newbeedaly.springbootorderserviceconsumer.main;

import cn.newbeedaly.springbootinterface.service.OrderSerice;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {

  public static void main(String[] args) throws IOException {
    ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("consumer.xml");

    OrderSerice orderSerice = context.getBean(OrderSerice.class);
    orderSerice.initOrder("1");

    System.out.println("用户完成。。。");
    System.in.read();
  }
}
