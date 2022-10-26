package feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
