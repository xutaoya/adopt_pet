package com.entity.view;

import com.entity.GanxiexinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 感谢信
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
@TableName("ganxiexin")
public class GanxiexinView  extends GanxiexinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GanxiexinView(){
	}
 
 	public GanxiexinView(GanxiexinEntity ganxiexinEntity){
 	try {
			BeanUtils.copyProperties(this, ganxiexinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
