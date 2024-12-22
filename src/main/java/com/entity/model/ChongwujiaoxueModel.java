package com.entity.model;

import com.entity.ChongwujiaoxueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 宠物教学
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
public class ChongwujiaoxueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
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
