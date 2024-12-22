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


import com.dao.ChongwujiaoxueDao;
import com.entity.ChongwujiaoxueEntity;
import com.service.ChongwujiaoxueService;
import com.entity.vo.ChongwujiaoxueVO;
import com.entity.view.ChongwujiaoxueView;

@Service("chongwujiaoxueService")
public class ChongwujiaoxueServiceImpl extends ServiceImpl<ChongwujiaoxueDao, ChongwujiaoxueEntity> implements ChongwujiaoxueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwujiaoxueEntity> page = this.selectPage(
                new Query<ChongwujiaoxueEntity>(params).getPage(),
                new EntityWrapper<ChongwujiaoxueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwujiaoxueEntity> wrapper) {
		  Page<ChongwujiaoxueView> page =new Query<ChongwujiaoxueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwujiaoxueVO> selectListVO(Wrapper<ChongwujiaoxueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwujiaoxueVO selectVO(Wrapper<ChongwujiaoxueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwujiaoxueView> selectListView(Wrapper<ChongwujiaoxueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwujiaoxueView selectView(Wrapper<ChongwujiaoxueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
