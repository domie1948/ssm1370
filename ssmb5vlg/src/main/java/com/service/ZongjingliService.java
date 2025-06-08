package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZongjingliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZongjingliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZongjingliView;


/**
 * 总经理
 *
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
public interface ZongjingliService extends IService<ZongjingliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZongjingliVO> selectListVO(Wrapper<ZongjingliEntity> wrapper);
   	
   	ZongjingliVO selectVO(@Param("ew") Wrapper<ZongjingliEntity> wrapper);
   	
   	List<ZongjingliView> selectListView(Wrapper<ZongjingliEntity> wrapper);
   	
   	ZongjingliView selectView(@Param("ew") Wrapper<ZongjingliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZongjingliEntity> wrapper);
   	
}

