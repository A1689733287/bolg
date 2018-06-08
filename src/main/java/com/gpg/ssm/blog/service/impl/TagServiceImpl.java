package com.gpg.ssm.blog.service.impl;

import com.gpg.ssm.blog.entity.Tag;
import com.gpg.ssm.blog.service.TagService;
import org.springframework.stereotype.Service;

@Service(value = "tagServiceImpl")
public class TagServiceImpl extends BaseServiceImpl<Tag> implements TagService {
}
