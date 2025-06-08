package com.dao;

import com.entity.ZongjingliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZongjingliVO;
import com.entity.view.ZongjingliView;


/**
 * 总经理
 * 
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
public interface ZongjingliDao extends BaseMapper<ZongjingliEntity> {
	
	List<ZongjingliVO> selectListVO(@Param("ew") Wrapper<ZongjingliEntity> wrapper);
	
	ZongjingliVO selectVO(@Param("ew") Wrapper<ZongjingliEntity> wrapper);
	
	List<ZongjingliView> selectListView(@Param("ew") Wrapper<ZongjingliEntity> wrapper);

	List<ZongjingliView> selectListView(Pagination page,@Param("ew") Wrapper<ZongjingliEntity> wrapper);
	
	ZongjingliView selectView(@Param("ew") Wrapper<ZongjingliEntity> wrapper);
	
}
