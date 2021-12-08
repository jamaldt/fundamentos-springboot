package com.fundamentos.springboot.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * System:                 CleanBnB
 * Name:                   TestController
 * Description:            Class that represents a TestController's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 12/8/21
 */
@Controller
public class TestController
{
    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> function(){
        return  new ResponseEntity<>("hello from controller cambio 2", HttpStatus.OK);
    }
}
