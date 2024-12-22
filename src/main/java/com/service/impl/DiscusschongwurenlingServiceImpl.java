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


import com.dao.DiscusschongwurenlingDao;
import com.entity.DiscusschongwurenlingEntity;
import com.service.DiscusschongwurenlingService;
import com.entity.vo.DiscusschongwurenlingVO;
import com.entity.view.DiscusschongwurenlingView;

@Service("discusschongwurenlingService")
public class DiscusschongwurenlingServiceImpl extends ServiceImpl<DiscusschongwurenlingDao, DiscusschongwurenlingEntity> implements DiscusschongwurenlingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwurenlingEntity> page = this.selectPage(
                new Query<DiscusschongwurenlingEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwurenlingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwurenlingEntity> wrapper) {
		  Page<DiscusschongwurenlingView> page =new Query<DiscusschongwurenlingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwurenlingVO> selectListVO(Wrapper<DiscusschongwurenlingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwurenlingVO selectVO(Wrapper<DiscusschongwurenlingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwurenlingView> selectListView(Wrapper<DiscusschongwurenlingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwurenlingView selectView(Wrapper<DiscusschongwurenlingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
