package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyangshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyangshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangshenqingView;


/**
 * 领养申请
 *
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
public interface LingyangshenqingService extends IService<LingyangshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangshenqingVO> selectListVO(Wrapper<LingyangshenqingEntity> wrapper);
   	
   	LingyangshenqingVO selectVO(@Param("ew") Wrapper<LingyangshenqingEntity> wrapper);
   	
   	List<LingyangshenqingView> selectListView(Wrapper<LingyangshenqingEntity> wrapper);
   	
   	LingyangshenqingView selectView(@Param("ew") Wrapper<LingyangshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangshenqingEntity> wrapper);
   	

}

