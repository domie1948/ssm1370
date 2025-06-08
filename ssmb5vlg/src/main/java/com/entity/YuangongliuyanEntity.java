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
 * 员工留言
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-18 15:20:24
 */
@TableName("yuangongliuyan")
public class YuangongliuyanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuangongliuyanEntity() {
		
	}
	
	public YuangongliuyanEntity(T t) {
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
	 * 部门编号
	 */
					
	private String bumenbianhao;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 留言内容
	 */
					
	private String liuyanneirong;
	
	/**
	 * 相关附件
	 */
					
	private String xiangguanfujian;
	
	/**
	 * 留言日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date liuyanriqi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：部门编号
	 */
	public void setBumenbianhao(String bumenbianhao) {
		this.bumenbianhao = bumenbianhao;
	}
	/**
	 * 获取：部门编号
	 */
	public String getBumenbianhao() {
		return bumenbianhao;
	}
	/**
	 * 设置：部门
	 */
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
	/**
	 * 设置：留言内容
	 */
	public void setLiuyanneirong(String liuyanneirong) {
		this.liuyanneirong = liuyanneirong;
	}
	/**
	 * 获取：留言内容
	 */
	public String getLiuyanneirong() {
		return liuyanneirong;
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
	 * 设置：留言日期
	 */
	public void setLiuyanriqi(Date liuyanriqi) {
		this.liuyanriqi = liuyanriqi;
	}
	/**
	 * 获取：留言日期
	 */
	public Date getLiuyanriqi() {
		return liuyanriqi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
