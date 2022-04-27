package top.wangudiercai.jenkins_demo_github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangudiercai
 */
@RestController
public class HelloJenkins {
@GetMapping("/hello")
  public String sayHello() {
    return "Hello Jenkins";
  }
}
