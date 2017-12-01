package com.river.controller;

import com.river.service.ModelerService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: he.feng
 * @date: 20:20 2017/11/30
 * @desc:
 **/
@Controller
@RequestMapping("/modeler")
public class ModelerController {

    private static final Logger logger = LoggerFactory.getLogger(ModelerController.class);

    @Resource
    private ModelerService modelerService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createModel(@RequestParam("name") String name, @RequestParam("key") String key,
                            @RequestParam("description") String description,
                            HttpServletRequest request, HttpServletResponse response) {
        logger.info("创建空modeler：name:{},key:{},description:{}", name, key, description);
        try {
            //创建空模型
            String modelId = modelerService.crateModel(name, key, description);
            if(StringUtils.isBlank(modelId)) {
                throw new RuntimeException("创建modeler失败modelId:" + modelId);
            }

            return "redirect:../modeler.html?modelId=" + modelId;
        }catch (Exception e) {
            logger.error("创建模型失败",e );
            throw new RuntimeException(e);
        }
    }
}
