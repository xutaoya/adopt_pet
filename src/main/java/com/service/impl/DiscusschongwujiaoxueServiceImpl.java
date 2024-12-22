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


import com.dao.DiscusschongwujiaoxueDao;
import com.entity.DiscusschongwujiaoxueEntity;
import com.service.DiscusschongwujiaoxueService;
import com.entity.vo.DiscusschongwujiaoxueVO;
import com.entity.view.DiscusschongwujiaoxueView;

@Service("discusschongwujiaoxueService")
public class DiscusschongwujiaoxueServiceImpl extends ServiceImpl<DiscusschongwujiaoxueDao, DiscusschongwujiaoxueEntity> implements DiscusschongwujiaoxueService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwujiaoxueEntity> page = this.selectPage(
                new Query<DiscusschongwujiaoxueEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwujiaoxueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwujiaoxueEntity> wrapper) {
		  Page<DiscusschongwujiaoxueView> page =new Query<DiscusschongwujiaoxueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwujiaoxueVO> selectListVO(Wrapper<DiscusschongwujiaoxueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwujiaoxueVO selectVO(Wrapper<DiscusschongwujiaoxueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwujiaoxueView> selectListView(Wrapper<DiscusschongwujiaoxueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwujiaoxueView selectView(Wrapper<DiscusschongwujiaoxueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
