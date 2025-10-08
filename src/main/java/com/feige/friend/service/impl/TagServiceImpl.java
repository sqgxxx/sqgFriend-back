package com.feige.friend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feige.friend.mapper.TagMapper;
import com.feige.friend.model.domain.Tag;
import com.feige.friend.service.TagService;
import org.springframework.stereotype.Service;

/**
* @author sqg
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2025-10-08 17:22:00
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService {

}




