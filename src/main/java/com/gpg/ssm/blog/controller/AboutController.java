package com.gpg.ssm.blog.controller;

import com.gpg.ssm.blog.common.CommonResult;
import com.gpg.ssm.blog.entity.User;
import com.gpg.ssm.blog.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "about")
public class AboutController {

    @Resource(name = "userServiceImpl")
    private UserService userServiceImpl;

    @RequestMapping(value = "author")
    @ResponseBody
    public CommonResult getAbout() {
        User user = userServiceImpl.list().get(0);
        return new CommonResult(200, user, "");
    }
}
