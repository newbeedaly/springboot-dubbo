package cn.newbeedaly.springbootuserserviceprovider.config;

import cn.newbeedaly.springbootinterface.service.UserService;
import com.alibaba.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DubboConfig {

  @Bean
  public ApplicationConfig applicationConfig(){
    ApplicationConfig applicationConfig = new ApplicationConfig();
    applicationConfig.setName("boot-user-service-provider");
    return applicationConfig;
  }

  @Bean
  public RegistryConfig registryConfig(){
    RegistryConfig registryConfig = new RegistryConfig();
    registryConfig.setProtocol("zookeeper");
    registryConfig.setAddress("127.0.0.1:2181");
    return registryConfig;
  }

  @Bean
  public ProtocolConfig protocolConfig(){
    ProtocolConfig protocolConfig = new ProtocolConfig();
    protocolConfig.setName("dubbo");
    protocolConfig.setPort(20882);
    return protocolConfig;
  }

  @Bean
  public ServiceConfig<UserService> userServiceServiceConfig(UserService userService){
    ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
    serviceConfig.setInterface(UserService.class);
    serviceConfig.setRef(userService);
    serviceConfig.setTimeout(3000);

    // 配置Method信息
    MethodConfig methodConfig = new MethodConfig();
    methodConfig.setName("getUserAddressList");
    methodConfig.setTimeout(2000);

    List<MethodConfig> methods = new ArrayList<MethodConfig>();
    methods.add(methodConfig);
    serviceConfig.setMethods(methods);

    return serviceConfig;
  }

  @Bean
  public MonitorConfig monitorConfig(){
    MonitorConfig monitorConfig = new MonitorConfig();
    monitorConfig.setProtocol("registry");
    return monitorConfig;
  }

}
