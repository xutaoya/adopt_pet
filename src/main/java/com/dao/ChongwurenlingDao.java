package com.dao;

import com.entity.ChongwurenlingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwurenlingVO;
import com.entity.view.ChongwurenlingView;


/**
 * 宠物认领
 * 
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
public interface ChongwurenlingDao extends BaseMapper<ChongwurenlingEntity> {
	
	List<ChongwurenlingVO> selectListVO(@Param("ew") Wrapper<ChongwurenlingEntity> wrapper);
	
	ChongwurenlingVO selectVO(@Param("ew") Wrapper<ChongwurenlingEntity> wrapper);
	
	List<ChongwurenlingView> selectListView(@Param("ew") Wrapper<ChongwurenlingEntity> wrapper);

	List<ChongwurenlingView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwurenlingEntity> wrapper);
	
	ChongwurenlingView selectView(@Param("ew") Wrapper<ChongwurenlingEntity> wrapper);
	

}
