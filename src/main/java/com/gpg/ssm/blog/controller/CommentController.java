package com.gpg.ssm.blog.controller;

import com.gpg.ssm.blog.vo.ArticleCommentVo;
import com.gpg.ssm.blog.common.CommonResult;
import com.gpg.ssm.blog.entity.Comment;
import com.gpg.ssm.blog.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "comment")
public class CommentController {
    @Resource(name = "commentServiceImpl")
    private CommentService commentServiceImpl;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addComment(@RequestBody ArticleCommentVo articleCommentVo) {
        Integer result = commentServiceImpl.addComment(articleCommentVo.getGuest(), articleCommentVo.getComment());
        if (result > 0) {
            return new CommonResult(200, true, "留言成功");
        } else {
            return new CommonResult(300, false, "留言失败");
        }
    }

    @RequestMapping(value = "list/{articleId}.do", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult listCommon(@PathVariable("articleId") Integer articleId) {
        List<ArticleCommentVo> comments = commentServiceImpl.selectByArticleId(articleId);
        return new CommonResult(200, comments, "");
    }
}
