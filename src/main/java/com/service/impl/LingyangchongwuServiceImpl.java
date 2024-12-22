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


import com.dao.LingyangchongwuDao;
import com.entity.LingyangchongwuEntity;
import com.service.LingyangchongwuService;
import com.entity.vo.LingyangchongwuVO;
import com.entity.view.LingyangchongwuView;

@Service("lingyangchongwuService")
public class LingyangchongwuServiceImpl extends ServiceImpl<LingyangchongwuDao, LingyangchongwuEntity> implements LingyangchongwuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyangchongwuEntity> page = this.selectPage(
                new Query<LingyangchongwuEntity>(params).getPage(),
                new EntityWrapper<LingyangchongwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyangchongwuEntity> wrapper) {
		  Page<LingyangchongwuView> page =new Query<LingyangchongwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyangchongwuVO> selectListVO(Wrapper<LingyangchongwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyangchongwuVO selectVO(Wrapper<LingyangchongwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyangchongwuView> selectListView(Wrapper<LingyangchongwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyangchongwuView selectView(Wrapper<LingyangchongwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
