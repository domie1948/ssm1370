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


import com.dao.ZongjingliDao;
import com.entity.ZongjingliEntity;
import com.service.ZongjingliService;
import com.entity.vo.ZongjingliVO;
import com.entity.view.ZongjingliView;

@Service("zongjingliService")
public class ZongjingliServiceImpl extends ServiceImpl<ZongjingliDao, ZongjingliEntity> implements ZongjingliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZongjingliEntity> page = this.selectPage(
                new Query<ZongjingliEntity>(params).getPage(),
                new EntityWrapper<ZongjingliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZongjingliEntity> wrapper) {
		  Page<ZongjingliView> page =new Query<ZongjingliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZongjingliVO> selectListVO(Wrapper<ZongjingliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZongjingliVO selectVO(Wrapper<ZongjingliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZongjingliView> selectListView(Wrapper<ZongjingliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZongjingliView selectView(Wrapper<ZongjingliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
