package demo.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import demo.service.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @author arnold
 * @date 2018/5/21
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello() {
        return "hello, spring cloud!";
    }

    public String helloFallback(){
        return "error";
    }

}
