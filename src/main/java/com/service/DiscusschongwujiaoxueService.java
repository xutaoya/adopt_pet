package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwujiaoxueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwujiaoxueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwujiaoxueView;


/**
 * 宠物教学评论表
 *
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
public interface DiscusschongwujiaoxueService extends IService<DiscusschongwujiaoxueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwujiaoxueVO> selectListVO(Wrapper<DiscusschongwujiaoxueEntity> wrapper);
   	
   	DiscusschongwujiaoxueVO selectVO(@Param("ew") Wrapper<DiscusschongwujiaoxueEntity> wrapper);
   	
   	List<DiscusschongwujiaoxueView> selectListView(Wrapper<DiscusschongwujiaoxueEntity> wrapper);
   	
   	DiscusschongwujiaoxueView selectView(@Param("ew") Wrapper<DiscusschongwujiaoxueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwujiaoxueEntity> wrapper);
   	

}

