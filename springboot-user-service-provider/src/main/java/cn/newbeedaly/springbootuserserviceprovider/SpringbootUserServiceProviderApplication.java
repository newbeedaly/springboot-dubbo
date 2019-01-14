package cn.newbeedaly.springbootuserserviceprovider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * springboot 与 dubbo 整合的三种方式
 *
 *  1). 导入dubbo-start ,在application.properties配置属性，@Service 暴露服务，@Reference 引用服务，@EnableDubbo 开启注解
 *  2). 保留xml配置文件，在启动类添加注解 @ImportResource(locations = "classpath:xxx.xml")
 *  3). 使用注解api方式，java代码配置，@Service 暴露服务，@Reference 引用服务，@EnableDubbo 扫描包
 */
// @EnableDubbo // 1).开启基于注解的dubbo
//@ImportResource(locations = "classpath:provider.xml") //2).第二种方式
@EnableDubbo(scanBasePackages = "cn.newbeedaly.springbootuserserviceprovider") // 3).第三种方式@DubboComponentScan("cn.newbeedaly")  和 EnableDubbo 一样
@SpringBootApplication
public class SpringbootUserServiceProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootUserServiceProviderApplication.class, args);
  }

}

