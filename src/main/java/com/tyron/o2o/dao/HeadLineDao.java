package com.tyron.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tyron.o2o.entity.HeadLine;

/**
 * @Description: 首页头条数据接口
 *
 * @author: tyron
 * @date: 2018年11月25日
 */

public interface HeadLineDao {

	/**
	 * 添加首页头条
	 * 
	 * @param headLine
	 * @return
	 */
	int insertHeadLine(HeadLine headLine);

	/**
	 * 根据传入的查询条件查询头条信息列表
	 * 
	 * @param headLineCondition
	 * @return
	 */
	List<HeadLine> selectHeadLineList(@Param("headLineConditon") HeadLine headLineCondition);

	/**
	 * 根据头条Id查询头条信息
	 * 
	 * @param headLineId
	 * @return
	 */
	HeadLine selectHeadLineById(long lineId);

	/**
	 * 更新头条信息
	 * 
	 * @param headLine
	 * @return
	 */
	int updateHeadLine(HeadLine headLine);

}