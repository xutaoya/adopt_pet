package com.dao;

import com.entity.DiscusschongwujiaoxueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwujiaoxueVO;
import com.entity.view.DiscusschongwujiaoxueView;


/**
 * 宠物教学评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
public interface DiscusschongwujiaoxueDao extends BaseMapper<DiscusschongwujiaoxueEntity> {
	
	List<DiscusschongwujiaoxueVO> selectListVO(@Param("ew") Wrapper<DiscusschongwujiaoxueEntity> wrapper);
	
	DiscusschongwujiaoxueVO selectVO(@Param("ew") Wrapper<DiscusschongwujiaoxueEntity> wrapper);
	
	List<DiscusschongwujiaoxueView> selectListView(@Param("ew") Wrapper<DiscusschongwujiaoxueEntity> wrapper);

	List<DiscusschongwujiaoxueView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwujiaoxueEntity> wrapper);
	
	DiscusschongwujiaoxueView selectView(@Param("ew") Wrapper<DiscusschongwujiaoxueEntity> wrapper);
	

}
