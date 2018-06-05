package com.gpg.ssm.blog.controller;

import com.gpg.ssm.blog.common.CommonResult;
import com.gpg.ssm.blog.entity.Article;
import com.gpg.ssm.blog.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "article")
public class ArticleController {
    @Resource(name = "articleServiceImpl")
    private ArticleService articleServiceImpl;

    @RequestMapping("article/{typeId}")
    @ResponseBody
    public CommonResult getArticelList(@PathVariable("typeId") Integer typeId) {
        System.out.println(typeId);
        List<Article> articles = articleServiceImpl.queryBytypeId(typeId);
        return new CommonResult(200, articles, "");
    }

    @RequestMapping(value = "articleDteail/{id}")
    @ResponseBody
    public CommonResult getArticelDetail(@PathVariable("id") Integer id) {
        Article article = articleServiceImpl.queryById(id);
        return new CommonResult(200, article, "");
    }
}
