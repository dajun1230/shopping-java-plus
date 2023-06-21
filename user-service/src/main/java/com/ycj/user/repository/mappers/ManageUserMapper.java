package com.ycj.user.repository.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ycj.user.repository.entity.ManageUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManageUserMapper extends BaseMapper<ManageUser> {
}
