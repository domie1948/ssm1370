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


import com.dao.YuangongliuyanDao;
import com.entity.YuangongliuyanEntity;
import com.service.YuangongliuyanService;
import com.entity.vo.YuangongliuyanVO;
import com.entity.view.YuangongliuyanView;

@Service("yuangongliuyanService")
public class YuangongliuyanServiceImpl extends ServiceImpl<YuangongliuyanDao, YuangongliuyanEntity> implements YuangongliuyanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuangongliuyanEntity> page = this.selectPage(
                new Query<YuangongliuyanEntity>(params).getPage(),
                new EntityWrapper<YuangongliuyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuangongliuyanEntity> wrapper) {
		  Page<YuangongliuyanView> page =new Query<YuangongliuyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuangongliuyanVO> selectListVO(Wrapper<YuangongliuyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuangongliuyanVO selectVO(Wrapper<YuangongliuyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuangongliuyanView> selectListView(Wrapper<YuangongliuyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuangongliuyanView selectView(Wrapper<YuangongliuyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
