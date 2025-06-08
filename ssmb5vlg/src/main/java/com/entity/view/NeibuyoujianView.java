package com.entity.view;

import com.entity.NeibuyoujianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 内部邮件
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
@TableName("neibuyoujian")
public class NeibuyoujianView  extends NeibuyoujianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NeibuyoujianView(){
	}
 
 	public NeibuyoujianView(NeibuyoujianEntity neibuyoujianEntity){
 	try {
			BeanUtils.copyProperties(this, neibuyoujianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
