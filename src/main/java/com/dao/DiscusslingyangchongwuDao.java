package com.dao;

import com.entity.DiscusslingyangchongwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslingyangchongwuVO;
import com.entity.view.DiscusslingyangchongwuView;


/**
 * 领养宠物评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
public interface DiscusslingyangchongwuDao extends BaseMapper<DiscusslingyangchongwuEntity> {
	
	List<DiscusslingyangchongwuVO> selectListVO(@Param("ew") Wrapper<DiscusslingyangchongwuEntity> wrapper);
	
	DiscusslingyangchongwuVO selectVO(@Param("ew") Wrapper<DiscusslingyangchongwuEntity> wrapper);
	
	List<DiscusslingyangchongwuView> selectListView(@Param("ew") Wrapper<DiscusslingyangchongwuEntity> wrapper);

	List<DiscusslingyangchongwuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslingyangchongwuEntity> wrapper);
	
	DiscusslingyangchongwuView selectView(@Param("ew") Wrapper<DiscusslingyangchongwuEntity> wrapper);
	

}
