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


import com.dao.ShenpiliuchengDao;
import com.entity.ShenpiliuchengEntity;
import com.service.ShenpiliuchengService;
import com.entity.vo.ShenpiliuchengVO;
import com.entity.view.ShenpiliuchengView;

@Service("shenpiliuchengService")
public class ShenpiliuchengServiceImpl extends ServiceImpl<ShenpiliuchengDao, ShenpiliuchengEntity> implements ShenpiliuchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenpiliuchengEntity> page = this.selectPage(
                new Query<ShenpiliuchengEntity>(params).getPage(),
                new EntityWrapper<ShenpiliuchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenpiliuchengEntity> wrapper) {
		  Page<ShenpiliuchengView> page =new Query<ShenpiliuchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenpiliuchengVO> selectListVO(Wrapper<ShenpiliuchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenpiliuchengVO selectVO(Wrapper<ShenpiliuchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenpiliuchengView> selectListView(Wrapper<ShenpiliuchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenpiliuchengView selectView(Wrapper<ShenpiliuchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
