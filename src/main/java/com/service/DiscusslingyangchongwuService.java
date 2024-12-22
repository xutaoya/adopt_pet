package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslingyangchongwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslingyangchongwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslingyangchongwuView;


/**
 * 领养宠物评论表
 *
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
public interface DiscusslingyangchongwuService extends IService<DiscusslingyangchongwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslingyangchongwuVO> selectListVO(Wrapper<DiscusslingyangchongwuEntity> wrapper);
   	
   	DiscusslingyangchongwuVO selectVO(@Param("ew") Wrapper<DiscusslingyangchongwuEntity> wrapper);
   	
   	List<DiscusslingyangchongwuView> selectListView(Wrapper<DiscusslingyangchongwuEntity> wrapper);
   	
   	DiscusslingyangchongwuView selectView(@Param("ew") Wrapper<DiscusslingyangchongwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslingyangchongwuEntity> wrapper);
   	

}

