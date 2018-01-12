package com.tea.controllar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class TeaControl {

 @RequestMapping(value="/test",method=RequestMethod.GET)
 public @ResponseBody String test() {
	 System.out.println("hi I am calling .... ");
	 return "i am working ... with out config and vmc class";
 }
 
	
}
