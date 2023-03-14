package com.nagarro.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Mycontroller {
@GetMapping("/Show")
public String getcharacter()
 
{return "Ritesh";
}
}
