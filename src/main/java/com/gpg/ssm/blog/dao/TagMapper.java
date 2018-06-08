package com.gpg.ssm.blog.dao;

import com.gpg.ssm.blog.entity.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {

    List<Tag> selectByIds(@Param("ids") List<Integer> tagIdList);
}
