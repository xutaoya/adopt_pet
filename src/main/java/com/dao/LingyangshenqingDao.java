package com.dao;

import com.entity.LingyangshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyangshenqingVO;
import com.entity.view.LingyangshenqingView;


/**
 * 领养申请
 * 
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
public interface LingyangshenqingDao extends BaseMapper<LingyangshenqingEntity> {
	
	List<LingyangshenqingVO> selectListVO(@Param("ew") Wrapper<LingyangshenqingEntity> wrapper);
	
	LingyangshenqingVO selectVO(@Param("ew") Wrapper<LingyangshenqingEntity> wrapper);
	
	List<LingyangshenqingView> selectListView(@Param("ew") Wrapper<LingyangshenqingEntity> wrapper);

	List<LingyangshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangshenqingEntity> wrapper);
	
	LingyangshenqingView selectView(@Param("ew") Wrapper<LingyangshenqingEntity> wrapper);
	

}
