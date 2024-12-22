package com.dao;

import com.entity.ChongwujiaoxueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwujiaoxueVO;
import com.entity.view.ChongwujiaoxueView;


/**
 * 宠物教学
 * 
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
public interface ChongwujiaoxueDao extends BaseMapper<ChongwujiaoxueEntity> {
	
	List<ChongwujiaoxueVO> selectListVO(@Param("ew") Wrapper<ChongwujiaoxueEntity> wrapper);
	
	ChongwujiaoxueVO selectVO(@Param("ew") Wrapper<ChongwujiaoxueEntity> wrapper);
	
	List<ChongwujiaoxueView> selectListView(@Param("ew") Wrapper<ChongwujiaoxueEntity> wrapper);

	List<ChongwujiaoxueView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwujiaoxueEntity> wrapper);
	
	ChongwujiaoxueView selectView(@Param("ew") Wrapper<ChongwujiaoxueEntity> wrapper);
	

}
