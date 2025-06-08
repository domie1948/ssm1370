package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.NeibuyoujianDao;
import com.entity.NeibuyoujianEntity;
import com.service.NeibuyoujianService;
import com.entity.vo.NeibuyoujianVO;
import com.entity.view.NeibuyoujianView;

@Service("neibuyoujianService")
public class NeibuyoujianServiceImpl extends ServiceImpl<NeibuyoujianDao, NeibuyoujianEntity> implements NeibuyoujianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NeibuyoujianEntity> page = this.selectPage(
                new Query<NeibuyoujianEntity>(params).getPage(),
                new EntityWrapper<NeibuyoujianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NeibuyoujianEntity> wrapper) {
		  Page<NeibuyoujianView> page =new Query<NeibuyoujianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NeibuyoujianVO> selectListVO(Wrapper<NeibuyoujianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NeibuyoujianVO selectVO(Wrapper<NeibuyoujianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NeibuyoujianView> selectListView(Wrapper<NeibuyoujianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NeibuyoujianView selectView(Wrapper<NeibuyoujianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
