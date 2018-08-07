package com.stuff.realm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/boot")
public class FisterCon {
@RequestMapping(value ="/request")
public String getPro(){
   return "success";
}
}
