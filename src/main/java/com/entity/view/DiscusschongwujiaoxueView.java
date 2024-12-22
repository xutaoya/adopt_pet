package com.entity.view;

import com.entity.DiscusschongwujiaoxueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物教学评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
@TableName("discusschongwujiaoxue")
public class DiscusschongwujiaoxueView  extends DiscusschongwujiaoxueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschongwujiaoxueView(){
	}
 
 	public DiscusschongwujiaoxueView(DiscusschongwujiaoxueEntity discusschongwujiaoxueEntity){
 	try {
			BeanUtils.copyProperties(this, discusschongwujiaoxueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
