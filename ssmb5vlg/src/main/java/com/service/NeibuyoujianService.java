package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NeibuyoujianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NeibuyoujianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NeibuyoujianView;


/**
 * 内部邮件
 *
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
public interface NeibuyoujianService extends IService<NeibuyoujianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NeibuyoujianVO> selectListVO(Wrapper<NeibuyoujianEntity> wrapper);
   	
   	NeibuyoujianVO selectVO(@Param("ew") Wrapper<NeibuyoujianEntity> wrapper);
   	
   	List<NeibuyoujianView> selectListView(Wrapper<NeibuyoujianEntity> wrapper);
   	
   	NeibuyoujianView selectView(@Param("ew") Wrapper<NeibuyoujianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NeibuyoujianEntity> wrapper);
   	
}

