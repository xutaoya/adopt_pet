package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwujiaoxueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwujiaoxueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwujiaoxueView;


/**
 * 宠物教学
 *
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
public interface ChongwujiaoxueService extends IService<ChongwujiaoxueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwujiaoxueVO> selectListVO(Wrapper<ChongwujiaoxueEntity> wrapper);
   	
   	ChongwujiaoxueVO selectVO(@Param("ew") Wrapper<ChongwujiaoxueEntity> wrapper);
   	
   	List<ChongwujiaoxueView> selectListView(Wrapper<ChongwujiaoxueEntity> wrapper);
   	
   	ChongwujiaoxueView selectView(@Param("ew") Wrapper<ChongwujiaoxueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwujiaoxueEntity> wrapper);
   	

}

