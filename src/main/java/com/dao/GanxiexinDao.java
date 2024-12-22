package com.dao;

import com.entity.GanxiexinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GanxiexinVO;
import com.entity.view.GanxiexinView;


/**
 * 感谢信
 * 
 * @author 
 * @email 
 * @date 2022-03-04 09:37:29
 */
public interface GanxiexinDao extends BaseMapper<GanxiexinEntity> {
	
	List<GanxiexinVO> selectListVO(@Param("ew") Wrapper<GanxiexinEntity> wrapper);
	
	GanxiexinVO selectVO(@Param("ew") Wrapper<GanxiexinEntity> wrapper);
	
	List<GanxiexinView> selectListView(@Param("ew") Wrapper<GanxiexinEntity> wrapper);

	List<GanxiexinView> selectListView(Pagination page,@Param("ew") Wrapper<GanxiexinEntity> wrapper);
	
	GanxiexinView selectView(@Param("ew") Wrapper<GanxiexinEntity> wrapper);
	

}
