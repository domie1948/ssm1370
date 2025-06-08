package com.entity.model;

import com.entity.YuangonggongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 员工工资
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-18 15:20:25
 */
public class YuangonggongziModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 发薪月份
	 */
	
	private String faxinyuefen;
		
	/**
	 * 基本工资
	 */
	
	private String jibengongzi;
		
	/**
	 * 提成
	 */
	
	private String ticheng;
		
	/**
	 * 补贴
	 */
	
	private String butie;
		
	/**
	 * 扣款
	 */
	
	private String koukuan;
		
	/**
	 * 实发工资
	 */
	
	private String shifagongzi;
		
	/**
	 * 扣款备注
	 */
	
	private String koukuanbeizhu;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：发薪月份
	 */
	 
	public void setFaxinyuefen(String faxinyuefen) {
		this.faxinyuefen = faxinyuefen;
	}
	
	/**
	 * 获取：发薪月份
	 */
	public String getFaxinyuefen() {
		return faxinyuefen;
	}
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(String jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public String getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：提成
	 */
	 
	public void setTicheng(String ticheng) {
		this.ticheng = ticheng;
	}
	
	/**
	 * 获取：提成
	 */
	public String getTicheng() {
		return ticheng;
	}
				
	
	/**
	 * 设置：补贴
	 */
	 
	public void setButie(String butie) {
		this.butie = butie;
	}
	
	/**
	 * 获取：补贴
	 */
	public String getButie() {
		return butie;
	}
				
	
	/**
	 * 设置：扣款
	 */
	 
	public void setKoukuan(String koukuan) {
		this.koukuan = koukuan;
	}
	
	/**
	 * 获取：扣款
	 */
	public String getKoukuan() {
		return koukuan;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(String shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public String getShifagongzi() {
		return shifagongzi;
	}
				
	
	/**
	 * 设置：扣款备注
	 */
	 
	public void setKoukuanbeizhu(String koukuanbeizhu) {
		this.koukuanbeizhu = koukuanbeizhu;
	}
	
	/**
	 * 获取：扣款备注
	 */
	public String getKoukuanbeizhu() {
		return koukuanbeizhu;
	}
			
}
