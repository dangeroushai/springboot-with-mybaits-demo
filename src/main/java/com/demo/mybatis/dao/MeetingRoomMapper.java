package com.demo.mybatis.dao;

import org.apache.ibatis.annotations.Param;

import com.demo.mybatis.entity.MeetingRoom;

public interface MeetingRoomMapper {
    /**
     * This method corresponds to the database table t_meeting_room to delete record
     */
    int deleteByPrimaryKey(Integer id) throws Exception;

    /**
     * This method corresponds to the database table t_meeting_room to insert record
     */
    int insert(MeetingRoom record) throws Exception;

    /**
     * This method corresponds to the database table t_meeting_room to insert record
     */
    int insertSelective(MeetingRoom record) throws Exception;

    /**
     * This method corresponds to the database table t_meeting_room to select record
     */
    MeetingRoom selectByPrimaryKey(Integer id) throws Exception;

    /**
     * This method corresponds to the database table t_meeting_room to update record
     */
    int updateByPrimaryKeySelective(MeetingRoom record) throws Exception;

    /**
     * This method corresponds to the database table t_meeting_room to update record
     */
    int updateByPrimaryKey(MeetingRoom record) throws Exception;

    /**
     * 批量插入
     * @param records 模型列表
     */
    int insertBatch(java.util.List<MeetingRoom> records) throws Exception;

    /**
     * 批量修改（部分字段）
     * @param example 修改样本（只含修改字段）
     * @param ids 目标记录ID列表
     */
    int updateSelectiveBatch(@Param("example") MeetingRoom example, @Param("ids") java.util.List<Integer> ids) throws Exception;

    /**
     * 批量查询
     * @param example 查询样本
     */
    java.util.List<MeetingRoom> selectBatch(MeetingRoom example) throws Exception;

    /**
     * 查询记录数
     * @param example 查询样本
     */
    int selectAmount(MeetingRoom example) throws Exception;
}