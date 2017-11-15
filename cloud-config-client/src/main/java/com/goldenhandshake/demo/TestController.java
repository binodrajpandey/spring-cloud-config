/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goldenhandshake.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author binod
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${message}")
    String projectName;
   
    @GetMapping("/project-name")
    public String getProjectName(){
        return projectName;
        
    }
    
}
