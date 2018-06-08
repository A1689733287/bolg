package com.gpg.ssm.blog.controller;

import com.gpg.ssm.blog.common.CommonResult;
import com.gpg.ssm.blog.entity.Article;
import com.gpg.ssm.blog.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "article", method = RequestMethod.GET)
public class ArticleController {
    @Resource(name = "articleServiceImpl")
    private ArticleService articleServiceImpl;

    @RequestMapping(value = "article", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getArticelList() {
        List<Article> articles = articleServiceImpl.queryByState(1);
        return new CommonResult(200, articles, "");
    }

    @RequestMapping(value = "articleDteail/{code}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getArticelDetail(@PathVariable("code") String code) {
        Map<String, Object> map = articleServiceImpl.queryByCode(code);
        return new CommonResult(200, map, "");
    }

    @RequestMapping(value = "hitsRangk", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult queryHits() {
        List<Article> articles = articleServiceImpl.queryHis();
        return new CommonResult(200, articles, "");
    }

    @RequestMapping(value = "newRank", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult queryNewRank() {
        List<Article> articles = articleServiceImpl.queryNewRank();
        return new CommonResult(200, articles, "");
    }

}
