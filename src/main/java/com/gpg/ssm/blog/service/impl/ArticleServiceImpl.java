package com.gpg.ssm.blog.service.impl;

import com.gpg.ssm.blog.dao.ArticleMapper;
import com.gpg.ssm.blog.dao.TagMapper;
import com.gpg.ssm.blog.entity.Article;
import com.gpg.ssm.blog.entity.Tag;
import com.gpg.ssm.blog.service.ArticleService;
import com.gpg.ssm.blog.vo.ArticleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "articleServiceImpl")
public class ArticleServiceImpl extends BaseServiceImpl<Article> implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private TagMapper tagMapper;

    @Override
    public List<Article> queryByState(Integer state) {
        return articleMapper.queryByState(state);
    }

    @Override
    public Map<String, Object> queryByCode(String code) {
        Map<String, Object> map = new HashMap();
        ArticleVo article = articleMapper.queryByCode(code);
        article.setTag(getAllTagNamesBy(article.getTags()));
        updataHits(article.getId());
        Article next = articleMapper.queryById(article.getId() + 1);
        Article prev = articleMapper.queryById(article.getId() - 1);
        map.put("currArticle", article);
        map.put("nextArticle", next);
        map.put("prevArticle", prev);
        return map;
    }

    @Override
    public List<Article> queryHis() {
        return articleMapper.queryHis();
    }

    @Override
    public List<Article> queryNewRank() {
        return articleMapper.queryNewRank();
    }

    public void updataHits(Integer id) {
        Article article = articleMapper.queryById(id);
        article.setHits(article.getHits() + 1);
        articleMapper.update(article);
    }


    private String[] getAllTagNamesBy(String tagIds) {
        String[] tagIdsArr = tagIds.split(",");
        if (tagIdsArr != null && tagIdsArr[0] != "") {
            String[] tagNames = new String[tagIdsArr.length];
            List<Integer> tagIdList = new ArrayList<Integer>(tagIdsArr.length);
            for (int i = 0; i < tagIdsArr.length; i++) {
                if (tagIdsArr[i] != "") {
                    tagIdList.add(Integer.parseInt(tagIdsArr[i]));
                }
            }
            List<Tag> tags = tagMapper.selectByIds(tagIdList);
            for (int i = 0; i < tags.size(); i++) {
                tagNames[i] = tags.get(i).getTagName();
            }
            return tagNames;
        }
        return null;
    }

}
