package com.example.springcloudeurekaserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

  @Autowired
  private DiscoveryClient discoveryClient;

  @RequestMapping(path = "/helloWorld", method = RequestMethod.GET)
  public String helloWorld() {
    log.info("Called by remote");
    return "Hello World";
  }

}
