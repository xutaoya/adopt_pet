package com.entity.view;

import com.entity.DiscusschongwurenlingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物认领评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
@TableName("discusschongwurenling")
public class DiscusschongwurenlingView  extends DiscusschongwurenlingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusschongwurenlingView(){
	}
 
 	public DiscusschongwurenlingView(DiscusschongwurenlingEntity discusschongwurenlingEntity){
 	try {
			BeanUtils.copyProperties(this, discusschongwurenlingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
