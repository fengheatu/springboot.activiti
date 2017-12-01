package com.river.controller;

import com.river.dao.TestMapper;
import com.river.model.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author: he.feng
 * @date: 19:01 2017/11/30
 * @desc:
 **/
@Controller
public class TestController {

    @Resource
    private TestMapper testMapper;

    @RequestMapping("/test")
    public void test() {
        Test test  = new Test();
        test.setName("test");
        testMapper.insert(test);
    }
}
