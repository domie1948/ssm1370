package com.dao;

import com.entity.YuangongliuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongliuyanVO;
import com.entity.view.YuangongliuyanView;


/**
 * 员工留言
 * 
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
public interface YuangongliuyanDao extends BaseMapper<YuangongliuyanEntity> {
	
	List<YuangongliuyanVO> selectListVO(@Param("ew") Wrapper<YuangongliuyanEntity> wrapper);
	
	YuangongliuyanVO selectVO(@Param("ew") Wrapper<YuangongliuyanEntity> wrapper);
	
	List<YuangongliuyanView> selectListView(@Param("ew") Wrapper<YuangongliuyanEntity> wrapper);

	List<YuangongliuyanView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongliuyanEntity> wrapper);
	
	YuangongliuyanView selectView(@Param("ew") Wrapper<YuangongliuyanEntity> wrapper);
	
}
