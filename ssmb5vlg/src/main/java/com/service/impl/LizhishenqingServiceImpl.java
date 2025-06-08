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


import com.dao.LizhishenqingDao;
import com.entity.LizhishenqingEntity;
import com.service.LizhishenqingService;
import com.entity.vo.LizhishenqingVO;
import com.entity.view.LizhishenqingView;

@Service("lizhishenqingService")
public class LizhishenqingServiceImpl extends ServiceImpl<LizhishenqingDao, LizhishenqingEntity> implements LizhishenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LizhishenqingEntity> page = this.selectPage(
                new Query<LizhishenqingEntity>(params).getPage(),
                new EntityWrapper<LizhishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LizhishenqingEntity> wrapper) {
		  Page<LizhishenqingView> page =new Query<LizhishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LizhishenqingVO> selectListVO(Wrapper<LizhishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LizhishenqingVO selectVO(Wrapper<LizhishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LizhishenqingView> selectListView(Wrapper<LizhishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LizhishenqingView selectView(Wrapper<LizhishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
