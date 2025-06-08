package com.dao;

import com.entity.NeibuyoujianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NeibuyoujianVO;
import com.entity.view.NeibuyoujianView;


/**
 * 内部邮件
 * 
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
public interface NeibuyoujianDao extends BaseMapper<NeibuyoujianEntity> {
	
	List<NeibuyoujianVO> selectListVO(@Param("ew") Wrapper<NeibuyoujianEntity> wrapper);
	
	NeibuyoujianVO selectVO(@Param("ew") Wrapper<NeibuyoujianEntity> wrapper);
	
	List<NeibuyoujianView> selectListView(@Param("ew") Wrapper<NeibuyoujianEntity> wrapper);

	List<NeibuyoujianView> selectListView(Pagination page,@Param("ew") Wrapper<NeibuyoujianEntity> wrapper);
	
	NeibuyoujianView selectView(@Param("ew") Wrapper<NeibuyoujianEntity> wrapper);
	
}
