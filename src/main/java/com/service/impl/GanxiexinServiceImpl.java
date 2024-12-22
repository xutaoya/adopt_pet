package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GanxiexinDao;
import com.entity.GanxiexinEntity;
import com.service.GanxiexinService;
import com.entity.vo.GanxiexinVO;
import com.entity.view.GanxiexinView;

@Service("ganxiexinService")
public class GanxiexinServiceImpl extends ServiceImpl<GanxiexinDao, GanxiexinEntity> implements GanxiexinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GanxiexinEntity> page = this.selectPage(
                new Query<GanxiexinEntity>(params).getPage(),
                new EntityWrapper<GanxiexinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GanxiexinEntity> wrapper) {
		  Page<GanxiexinView> page =new Query<GanxiexinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GanxiexinVO> selectListVO(Wrapper<GanxiexinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GanxiexinVO selectVO(Wrapper<GanxiexinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GanxiexinView> selectListView(Wrapper<GanxiexinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GanxiexinView selectView(Wrapper<GanxiexinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
