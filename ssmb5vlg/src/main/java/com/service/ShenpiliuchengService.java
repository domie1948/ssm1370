package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenpiliuchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenpiliuchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenpiliuchengView;


/**
 * 审批流程
 *
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
public interface ShenpiliuchengService extends IService<ShenpiliuchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenpiliuchengVO> selectListVO(Wrapper<ShenpiliuchengEntity> wrapper);
   	
   	ShenpiliuchengVO selectVO(@Param("ew") Wrapper<ShenpiliuchengEntity> wrapper);
   	
   	List<ShenpiliuchengView> selectListView(Wrapper<ShenpiliuchengEntity> wrapper);
   	
   	ShenpiliuchengView selectView(@Param("ew") Wrapper<ShenpiliuchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenpiliuchengEntity> wrapper);
   	
}

