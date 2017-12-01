package com.river.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: he.feng
 * @date: 19:28 2017/12/1
 * @desc:
 **/
@Configuration
@ComponentScan({"org.activiti.rest.editor.model","org.activiti.rest.editor.main"})
public class ActivitiModelerConfig {
}
