package configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
@RestController
public class Application {

    @Value("${message.name}")
    private String name;

    @RequestMapping("/greeting")
    public String greet() {
        return "Hello " + this.name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
