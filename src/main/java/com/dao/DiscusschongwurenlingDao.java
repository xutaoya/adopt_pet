package com.dao;

import com.entity.DiscusschongwurenlingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwurenlingVO;
import com.entity.view.DiscusschongwurenlingView;


/**
 * 宠物认领评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
public interface DiscusschongwurenlingDao extends BaseMapper<DiscusschongwurenlingEntity> {
	
	List<DiscusschongwurenlingVO> selectListVO(@Param("ew") Wrapper<DiscusschongwurenlingEntity> wrapper);
	
	DiscusschongwurenlingVO selectVO(@Param("ew") Wrapper<DiscusschongwurenlingEntity> wrapper);
	
	List<DiscusschongwurenlingView> selectListView(@Param("ew") Wrapper<DiscusschongwurenlingEntity> wrapper);

	List<DiscusschongwurenlingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwurenlingEntity> wrapper);
	
	DiscusschongwurenlingView selectView(@Param("ew") Wrapper<DiscusschongwurenlingEntity> wrapper);
	

}
