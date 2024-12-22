package com.dao;

import com.entity.LingyangchongwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyangchongwuVO;
import com.entity.view.LingyangchongwuView;


/**
 * 领养宠物
 * 
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
public interface LingyangchongwuDao extends BaseMapper<LingyangchongwuEntity> {
	
	List<LingyangchongwuVO> selectListVO(@Param("ew") Wrapper<LingyangchongwuEntity> wrapper);
	
	LingyangchongwuVO selectVO(@Param("ew") Wrapper<LingyangchongwuEntity> wrapper);
	
	List<LingyangchongwuView> selectListView(@Param("ew") Wrapper<LingyangchongwuEntity> wrapper);

	List<LingyangchongwuView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangchongwuEntity> wrapper);
	
	LingyangchongwuView selectView(@Param("ew") Wrapper<LingyangchongwuEntity> wrapper);
	

}
