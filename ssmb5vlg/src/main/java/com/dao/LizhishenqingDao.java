package com.dao;

import com.entity.LizhishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LizhishenqingVO;
import com.entity.view.LizhishenqingView;


/**
 * 离职申请
 * 
 * @author 
 * @email 
 * @date 2021-01-18 15:20:25
 */
public interface LizhishenqingDao extends BaseMapper<LizhishenqingEntity> {
	
	List<LizhishenqingVO> selectListVO(@Param("ew") Wrapper<LizhishenqingEntity> wrapper);
	
	LizhishenqingVO selectVO(@Param("ew") Wrapper<LizhishenqingEntity> wrapper);
	
	List<LizhishenqingView> selectListView(@Param("ew") Wrapper<LizhishenqingEntity> wrapper);

	List<LizhishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<LizhishenqingEntity> wrapper);
	
	LizhishenqingView selectView(@Param("ew") Wrapper<LizhishenqingEntity> wrapper);
	
}
