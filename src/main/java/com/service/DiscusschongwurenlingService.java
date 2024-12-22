package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwurenlingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwurenlingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwurenlingView;


/**
 * 宠物认领评论表
 *
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
public interface DiscusschongwurenlingService extends IService<DiscusschongwurenlingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwurenlingVO> selectListVO(Wrapper<DiscusschongwurenlingEntity> wrapper);
   	
   	DiscusschongwurenlingVO selectVO(@Param("ew") Wrapper<DiscusschongwurenlingEntity> wrapper);
   	
   	List<DiscusschongwurenlingView> selectListView(Wrapper<DiscusschongwurenlingEntity> wrapper);
   	
   	DiscusschongwurenlingView selectView(@Param("ew") Wrapper<DiscusschongwurenlingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwurenlingEntity> wrapper);
   	

}

