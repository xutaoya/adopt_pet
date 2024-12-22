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


import com.dao.LingyangshenqingDao;
import com.entity.LingyangshenqingEntity;
import com.service.LingyangshenqingService;
import com.entity.vo.LingyangshenqingVO;
import com.entity.view.LingyangshenqingView;

@Service("lingyangshenqingService")
public class LingyangshenqingServiceImpl extends ServiceImpl<LingyangshenqingDao, LingyangshenqingEntity> implements LingyangshenqingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyangshenqingEntity> page = this.selectPage(
                new Query<LingyangshenqingEntity>(params).getPage(),
                new EntityWrapper<LingyangshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyangshenqingEntity> wrapper) {
		  Page<LingyangshenqingView> page =new Query<LingyangshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyangshenqingVO> selectListVO(Wrapper<LingyangshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyangshenqingVO selectVO(Wrapper<LingyangshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyangshenqingView> selectListView(Wrapper<LingyangshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyangshenqingView selectView(Wrapper<LingyangshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
