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
 * 领养宠物
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
@TableName("lingyangchongwu")
public class LingyangchongwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LingyangchongwuEntity() {
		
	}
	
	public LingyangchongwuEntity(T t) {
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
	 * 领养名称
	 */
					
	private String lingyangmingcheng;
	
	/**
	 * 宠物图片
	 */
					
	private String chongwutupian;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 性情
	 */
					
	private String xingqing;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 领养须知
	 */
					
	private String lingyangxuzhi;
	
	/**
	 * 宠物简介
	 */
					
	private String chongwujianjie;
	
	/**
	 * 宠物详情
	 */
					
	private String chongwuxiangqing;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
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
	 * 设置：领养名称
	 */
	public void setLingyangmingcheng(String lingyangmingcheng) {
		this.lingyangmingcheng = lingyangmingcheng;
	}
	/**
	 * 获取：领养名称
	 */
	public String getLingyangmingcheng() {
		return lingyangmingcheng;
	}
	/**
	 * 设置：宠物图片
	 */
	public void setChongwutupian(String chongwutupian) {
		this.chongwutupian = chongwutupian;
	}
	/**
	 * 获取：宠物图片
	 */
	public String getChongwutupian() {
		return chongwutupian;
	}
	/**
	 * 设置：类型
	 */
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：性情
	 */
	public void setXingqing(String xingqing) {
		this.xingqing = xingqing;
	}
	/**
	 * 获取：性情
	 */
	public String getXingqing() {
		return xingqing;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：领养须知
	 */
	public void setLingyangxuzhi(String lingyangxuzhi) {
		this.lingyangxuzhi = lingyangxuzhi;
	}
	/**
	 * 获取：领养须知
	 */
	public String getLingyangxuzhi() {
		return lingyangxuzhi;
	}
	/**
	 * 设置：宠物简介
	 */
	public void setChongwujianjie(String chongwujianjie) {
		this.chongwujianjie = chongwujianjie;
	}
	/**
	 * 获取：宠物简介
	 */
	public String getChongwujianjie() {
		return chongwujianjie;
	}
	/**
	 * 设置：宠物详情
	 */
	public void setChongwuxiangqing(String chongwuxiangqing) {
		this.chongwuxiangqing = chongwuxiangqing;
	}
	/**
	 * 获取：宠物详情
	 */
	public String getChongwuxiangqing() {
		return chongwuxiangqing;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}

}
