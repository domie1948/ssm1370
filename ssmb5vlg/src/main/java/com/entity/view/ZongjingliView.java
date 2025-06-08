package com.entity.view;

import com.entity.ZongjingliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 总经理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
@TableName("zongjingli")
public class ZongjingliView  extends ZongjingliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZongjingliView(){
	}
 
 	public ZongjingliView(ZongjingliEntity zongjingliEntity){
 	try {
			BeanUtils.copyProperties(this, zongjingliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
