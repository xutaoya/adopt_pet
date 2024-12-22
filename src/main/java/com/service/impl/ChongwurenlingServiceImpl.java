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


import com.dao.ChongwurenlingDao;
import com.entity.ChongwurenlingEntity;
import com.service.ChongwurenlingService;
import com.entity.vo.ChongwurenlingVO;
import com.entity.view.ChongwurenlingView;

@Service("chongwurenlingService")
public class ChongwurenlingServiceImpl extends ServiceImpl<ChongwurenlingDao, ChongwurenlingEntity> implements ChongwurenlingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwurenlingEntity> page = this.selectPage(
                new Query<ChongwurenlingEntity>(params).getPage(),
                new EntityWrapper<ChongwurenlingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwurenlingEntity> wrapper) {
		  Page<ChongwurenlingView> page =new Query<ChongwurenlingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwurenlingVO> selectListVO(Wrapper<ChongwurenlingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwurenlingVO selectVO(Wrapper<ChongwurenlingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwurenlingView> selectListView(Wrapper<ChongwurenlingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwurenlingView selectView(Wrapper<ChongwurenlingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
