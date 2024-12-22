package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyangchongwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyangchongwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangchongwuView;


/**
 * 领养宠物
 *
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
public interface LingyangchongwuService extends IService<LingyangchongwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangchongwuVO> selectListVO(Wrapper<LingyangchongwuEntity> wrapper);
   	
   	LingyangchongwuVO selectVO(@Param("ew") Wrapper<LingyangchongwuEntity> wrapper);
   	
   	List<LingyangchongwuView> selectListView(Wrapper<LingyangchongwuEntity> wrapper);
   	
   	LingyangchongwuView selectView(@Param("ew") Wrapper<LingyangchongwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangchongwuEntity> wrapper);
   	

}

