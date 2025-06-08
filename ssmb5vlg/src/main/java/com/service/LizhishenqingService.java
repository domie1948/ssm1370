package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LizhishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LizhishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LizhishenqingView;


/**
 * 离职申请
 *
 * @author 
 * @email 
 * @date 2021-01-18 15:20:25
 */
public interface LizhishenqingService extends IService<LizhishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LizhishenqingVO> selectListVO(Wrapper<LizhishenqingEntity> wrapper);
   	
   	LizhishenqingVO selectVO(@Param("ew") Wrapper<LizhishenqingEntity> wrapper);
   	
   	List<LizhishenqingView> selectListView(Wrapper<LizhishenqingEntity> wrapper);
   	
   	LizhishenqingView selectView(@Param("ew") Wrapper<LizhishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LizhishenqingEntity> wrapper);
   	
}

