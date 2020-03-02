package com.javastudio.tutorial.controller;

import com.javastudio.tutorial.api.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService service;

    @RequestMapping("/list")
    public String index() {
        logger.info("size" + service.list().size());
        return "/product/index";
    }
}
