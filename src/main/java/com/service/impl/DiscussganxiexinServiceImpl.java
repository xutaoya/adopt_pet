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


import com.dao.DiscussganxiexinDao;
import com.entity.DiscussganxiexinEntity;
import com.service.DiscussganxiexinService;
import com.entity.vo.DiscussganxiexinVO;
import com.entity.view.DiscussganxiexinView;

@Service("discussganxiexinService")
public class DiscussganxiexinServiceImpl extends ServiceImpl<DiscussganxiexinDao, DiscussganxiexinEntity> implements DiscussganxiexinService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussganxiexinEntity> page = this.selectPage(
                new Query<DiscussganxiexinEntity>(params).getPage(),
                new EntityWrapper<DiscussganxiexinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussganxiexinEntity> wrapper) {
		  Page<DiscussganxiexinView> page =new Query<DiscussganxiexinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussganxiexinVO> selectListVO(Wrapper<DiscussganxiexinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussganxiexinVO selectVO(Wrapper<DiscussganxiexinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussganxiexinView> selectListView(Wrapper<DiscussganxiexinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussganxiexinView selectView(Wrapper<DiscussganxiexinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
