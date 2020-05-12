package cn.lyc.apiserver.dao;

import cn.lyc.apiserver.entity.AuthInfoUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-05-12 15:07:32
 */
@Mapper
public interface AuthInfoUserDao extends BaseMapper<AuthInfoUserEntity> {
	
}
