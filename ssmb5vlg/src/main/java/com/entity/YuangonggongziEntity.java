package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 员工工资
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-18 15:20:25
 */
@TableName("yuangonggongzi")
public class YuangonggongziEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangonggongziEntity() {
		
	}
	
	public YuangonggongziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工号
	 */
					
	private String gonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
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
