package com.entity.model;

import com.entity.ShenpiliuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 审批流程
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
public class ShenpiliuchengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 审批项目
	 */
	
	private String shenpixiangmu;
		
	/**
	 * 审批流程
	 */
	
	private String shenpiliucheng;
		
	/**
	 * 相关附件
	 */
	
	private String xiangguanfujian;
		
	/**
	 * 更新日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinriqi;
				
	
	/**
	 * 设置：审批项目
	 */
	 
	public void setShenpixiangmu(String shenpixiangmu) {
		this.shenpixiangmu = shenpixiangmu;
	}
	
	/**
	 * 获取：审批项目
	 */
	public String getShenpixiangmu() {
		return shenpixiangmu;
	}
				
	
	/**
	 * 设置：审批流程
	 */
	 
	public void setShenpiliucheng(String shenpiliucheng) {
		this.shenpiliucheng = shenpiliucheng;
	}
	
	/**
	 * 获取：审批流程
	 */
	public String getShenpiliucheng() {
		return shenpiliucheng;
	}
				
	
	/**
	 * 设置：相关附件
	 */
	 
	public void setXiangguanfujian(String xiangguanfujian) {
		this.xiangguanfujian = xiangguanfujian;
	}
	
	/**
	 * 获取：相关附件
	 */
	public String getXiangguanfujian() {
		return xiangguanfujian;
	}
				
	
	/**
	 * 设置：更新日期
	 */
	 
	public void setGengxinriqi(Date gengxinriqi) {
		this.gengxinriqi = gengxinriqi;
	}
	
	/**
	 * 获取：更新日期
	 */
	public Date getGengxinriqi() {
		return gengxinriqi;
	}
			
}
