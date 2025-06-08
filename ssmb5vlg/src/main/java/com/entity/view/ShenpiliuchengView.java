package com.entity.view;

import com.entity.ShenpiliuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 审批流程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
@TableName("shenpiliucheng")
public class ShenpiliuchengView  extends ShenpiliuchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenpiliuchengView(){
	}
 
 	public ShenpiliuchengView(ShenpiliuchengEntity shenpiliuchengEntity){
 	try {
			BeanUtils.copyProperties(this, shenpiliuchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
