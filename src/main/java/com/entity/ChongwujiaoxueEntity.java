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
 * 宠物教学
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
@TableName("chongwujiaoxue")
public class ChongwujiaoxueEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwujiaoxueEntity() {
		
	}
	
	public ChongwujiaoxueEntity(T t) {
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
	 * 教学名称
	 */
					
	private String jiaoxuemingcheng;
	
	/**
	 * 教学封面
	 */
					
	private String jiaoxuefengmian;
	
	/**
	 * 类型
	 */
					
	private String leixing;
	
	/**
	 * 教学简介
	 */
					
	private String jiaoxuejianjie;
	
	/**
	 * 教学内容
	 */
					
	private String jiaoxueneirong;
	
	/**
	 * 教学视频
	 */
					
	private String jiaoxueshipin;
	
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
	 * 设置：教学名称
	 */
	public void setJiaoxuemingcheng(String jiaoxuemingcheng) {
		this.jiaoxuemingcheng = jiaoxuemingcheng;
	}
	/**
	 * 获取：教学名称
	 */
	public String getJiaoxuemingcheng() {
		return jiaoxuemingcheng;
	}
	/**
	 * 设置：教学封面
	 */
	public void setJiaoxuefengmian(String jiaoxuefengmian) {
		this.jiaoxuefengmian = jiaoxuefengmian;
	}
	/**
	 * 获取：教学封面
	 */
	public String getJiaoxuefengmian() {
		return jiaoxuefengmian;
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
	 * 设置：教学简介
	 */
	public void setJiaoxuejianjie(String jiaoxuejianjie) {
		this.jiaoxuejianjie = jiaoxuejianjie;
	}
	/**
	 * 获取：教学简介
	 */
	public String getJiaoxuejianjie() {
		return jiaoxuejianjie;
	}
	/**
	 * 设置：教学内容
	 */
	public void setJiaoxueneirong(String jiaoxueneirong) {
		this.jiaoxueneirong = jiaoxueneirong;
	}
	/**
	 * 获取：教学内容
	 */
	public String getJiaoxueneirong() {
		return jiaoxueneirong;
	}
	/**
	 * 设置：教学视频
	 */
	public void setJiaoxueshipin(String jiaoxueshipin) {
		this.jiaoxueshipin = jiaoxueshipin;
	}
	/**
	 * 获取：教学视频
	 */
	public String getJiaoxueshipin() {
		return jiaoxueshipin;
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
