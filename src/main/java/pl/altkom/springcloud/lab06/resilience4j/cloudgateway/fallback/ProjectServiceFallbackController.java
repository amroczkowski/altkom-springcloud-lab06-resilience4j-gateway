package pl.altkom.springcloud.lab06.resilience4j.cloudgateway.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectServiceFallbackController {

    @GetMapping("/projectServiceFallback")
    public String getProjectServiceFallbackMethod() {
        return "Project service not responding. Please try again later";
    }
}
