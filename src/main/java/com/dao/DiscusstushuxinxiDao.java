package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.DiscusstushuxinxiEntity;
import com.entity.view.DiscusstushuxinxiView;
import com.entity.vo.DiscusstushuxinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 图书信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-20 16:50:49
 */
public interface DiscusstushuxinxiDao extends BaseMapper<DiscusstushuxinxiEntity> {
	
	List<DiscusstushuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
	
	DiscusstushuxinxiVO selectVO(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
	
	List<DiscusstushuxinxiView> selectListView(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);

	List<DiscusstushuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);
	
	DiscusstushuxinxiView selectView(@Param("ew") Wrapper<DiscusstushuxinxiEntity> wrapper);

}
