package com.dao;

import com.entity.ShenpiliuchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenpiliuchengVO;
import com.entity.view.ShenpiliuchengView;


/**
 * 审批流程
 * 
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
public interface ShenpiliuchengDao extends BaseMapper<ShenpiliuchengEntity> {
	
	List<ShenpiliuchengVO> selectListVO(@Param("ew") Wrapper<ShenpiliuchengEntity> wrapper);
	
	ShenpiliuchengVO selectVO(@Param("ew") Wrapper<ShenpiliuchengEntity> wrapper);
	
	List<ShenpiliuchengView> selectListView(@Param("ew") Wrapper<ShenpiliuchengEntity> wrapper);

	List<ShenpiliuchengView> selectListView(Pagination page,@Param("ew") Wrapper<ShenpiliuchengEntity> wrapper);
	
	ShenpiliuchengView selectView(@Param("ew") Wrapper<ShenpiliuchengEntity> wrapper);
	
}
