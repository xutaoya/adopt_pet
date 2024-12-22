package com.entity.vo;

import com.entity.LingyangchongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 领养宠物
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
public class LingyangchongwuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
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
