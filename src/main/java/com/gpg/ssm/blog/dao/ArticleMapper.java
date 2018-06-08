package com.gpg.ssm.blog.dao;

import com.gpg.ssm.blog.entity.Article;
import com.gpg.ssm.blog.vo.ArticleVo;
import org.apache.ibatis.annotations.Param;
import org.aspectj.apache.bcel.classfile.Code;

import javax.swing.plaf.nimbus.State;
import java.util.List;

public interface ArticleMapper extends BaseMapper<Article> {
    /*通过typeId查找*/
    public List<Article> queryByState(Integer state);

    public ArticleVo queryByCode(String code);

    public List<Article> queryHis();

    public List<Article> queryNewRank();

}
