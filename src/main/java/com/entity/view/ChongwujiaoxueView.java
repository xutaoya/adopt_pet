package com.entity.view;

import com.entity.ChongwujiaoxueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物教学
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
@TableName("chongwujiaoxue")
public class ChongwujiaoxueView  extends ChongwujiaoxueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwujiaoxueView(){
	}
 
 	public ChongwujiaoxueView(ChongwujiaoxueEntity chongwujiaoxueEntity){
 	try {
			BeanUtils.copyProperties(this, chongwujiaoxueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
