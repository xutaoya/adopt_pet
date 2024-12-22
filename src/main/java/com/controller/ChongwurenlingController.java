package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChongwurenlingEntity;
import com.entity.view.ChongwurenlingView;

import com.service.ChongwurenlingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 宠物认领
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-04 09:37:28
 */
@RestController
@RequestMapping("/chongwurenling")
public class ChongwurenlingController {
    @Autowired
    private ChongwurenlingService chongwurenlingService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChongwurenlingEntity chongwurenling, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			chongwurenling.setGerenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChongwurenlingEntity> ew = new EntityWrapper<ChongwurenlingEntity>();
    	PageUtils page = chongwurenlingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwurenling), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChongwurenlingEntity chongwurenling, 
		HttpServletRequest request){
        EntityWrapper<ChongwurenlingEntity> ew = new EntityWrapper<ChongwurenlingEntity>();
    	PageUtils page = chongwurenlingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chongwurenling), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChongwurenlingEntity chongwurenling){
       	EntityWrapper<ChongwurenlingEntity> ew = new EntityWrapper<ChongwurenlingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chongwurenling, "chongwurenling")); 
        return R.ok().put("data", chongwurenlingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChongwurenlingEntity chongwurenling){
        EntityWrapper< ChongwurenlingEntity> ew = new EntityWrapper< ChongwurenlingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chongwurenling, "chongwurenling")); 
		ChongwurenlingView chongwurenlingView =  chongwurenlingService.selectView(ew);
		return R.ok("查询宠物认领成功").put("data", chongwurenlingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChongwurenlingEntity chongwurenling = chongwurenlingService.selectById(id);
        return R.ok().put("data", chongwurenling);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChongwurenlingEntity chongwurenling = chongwurenlingService.selectById(id);
        return R.ok().put("data", chongwurenling);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwurenlingEntity chongwurenling, HttpServletRequest request){
    	chongwurenling.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwurenling);

        chongwurenlingService.insert(chongwurenling);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwurenlingEntity chongwurenling, HttpServletRequest request){
    	chongwurenling.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chongwurenling);

        chongwurenlingService.insert(chongwurenling);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChongwurenlingEntity chongwurenling, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chongwurenling);
        chongwurenlingService.updateById(chongwurenling);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chongwurenlingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ChongwurenlingEntity> wrapper = new EntityWrapper<ChongwurenlingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fabuzhe")) {
			wrapper.eq("gerenzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = chongwurenlingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
