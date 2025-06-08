package com.entity.view;

import com.entity.LizhishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 离职申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 15:20:25
 */
@TableName("lizhishenqing")
public class LizhishenqingView  extends LizhishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LizhishenqingView(){
	}
 
 	public LizhishenqingView(LizhishenqingEntity lizhishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, lizhishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
