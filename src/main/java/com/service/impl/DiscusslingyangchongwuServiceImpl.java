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


import com.dao.DiscusslingyangchongwuDao;
import com.entity.DiscusslingyangchongwuEntity;
import com.service.DiscusslingyangchongwuService;
import com.entity.vo.DiscusslingyangchongwuVO;
import com.entity.view.DiscusslingyangchongwuView;

@Service("discusslingyangchongwuService")
public class DiscusslingyangchongwuServiceImpl extends ServiceImpl<DiscusslingyangchongwuDao, DiscusslingyangchongwuEntity> implements DiscusslingyangchongwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslingyangchongwuEntity> page = this.selectPage(
                new Query<DiscusslingyangchongwuEntity>(params).getPage(),
                new EntityWrapper<DiscusslingyangchongwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslingyangchongwuEntity> wrapper) {
		  Page<DiscusslingyangchongwuView> page =new Query<DiscusslingyangchongwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslingyangchongwuVO> selectListVO(Wrapper<DiscusslingyangchongwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslingyangchongwuVO selectVO(Wrapper<DiscusslingyangchongwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslingyangchongwuView> selectListView(Wrapper<DiscusslingyangchongwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslingyangchongwuView selectView(Wrapper<DiscusslingyangchongwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
