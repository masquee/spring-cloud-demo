package demo.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author arnold
 * @date 2018/5/21
 */
@FeignClient("hello-service")
public interface IHelloService {

    @RequestMapping("/hello")
    String hello();
    
}
