package com.example.demo.realm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FisterCon {
@RequestMapping(value ="/request")
public String getPro(){
   return "success";
}
}
