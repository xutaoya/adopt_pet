package com.entity.view;

import com.entity.LingyangshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领养申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
@TableName("lingyangshenqing")
public class LingyangshenqingView  extends LingyangshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingyangshenqingView(){
	}
 
 	public LingyangshenqingView(LingyangshenqingEntity lingyangshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, lingyangshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
