package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongliuyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongliuyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongliuyanView;


/**
 * 员工留言
 *
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
public interface YuangongliuyanService extends IService<YuangongliuyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongliuyanVO> selectListVO(Wrapper<YuangongliuyanEntity> wrapper);
   	
   	YuangongliuyanVO selectVO(@Param("ew") Wrapper<YuangongliuyanEntity> wrapper);
   	
   	List<YuangongliuyanView> selectListView(Wrapper<YuangongliuyanEntity> wrapper);
   	
   	YuangongliuyanView selectView(@Param("ew") Wrapper<YuangongliuyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongliuyanEntity> wrapper);
   	
}

