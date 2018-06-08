package com.gpg.ssm.blog.controller;

import com.gpg.ssm.blog.common.CommonResult;
import com.gpg.ssm.blog.entity.Category;
import com.gpg.ssm.blog.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "category")
public class CategoryController {

    @Resource(name = "categoryServiceImpl")
    private CategoryService categoryServiceImpl;

    @RequestMapping(value = "category", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult cateList() {
        List<Category> categories = categoryServiceImpl.list();
        return new CommonResult(200, categories, "");
    }

}
