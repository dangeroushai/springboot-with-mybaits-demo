package com.demo.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.demo.mybatis.dao.MeetingRoomMapper;
import com.demo.mybatis.entity.MeetingRoom;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class MapperTest {
	
	@Autowired
	MeetingRoomMapper mapper;
	
	@Test
	public void testUpadteSelectiveBatch() throws Exception{
		MeetingRoom example = new MeetingRoom();
		example .setStatus(0);
		List<Integer> ids = new ArrayList<Integer>();
		for (int i = 15; i < 20; i++) {
			ids.add(i);
		}
		mapper.updateSelectiveBatch(example, ids );
	}
	
	@Test
	public void testSelectAmount() throws Exception{
		MeetingRoom example = new MeetingRoom();
		example.setStatus(1);
		mapper.selectAmount(example);
	}
	
	@Test
	public void testSelectBatch() throws Exception{
		//所有的用于查询的example需要有queryCondition字段
		MeetingRoom example = new MeetingRoom();
		example.setStatus(1);
		mapper.selectBatch(example );
	}
	
	@Test
	public void testInsertBatch() throws Exception{
		
		List<MeetingRoom> records = new ArrayList<MeetingRoom>();
		
		for(int i=0 ; i< 10 ; i++){
			MeetingRoom mr = new MeetingRoom();
			
			mr.setBeginTime(new Date());
			mr.setCapacity(i);
			mr.setCompanyId(1);
			mr.setCreateTime(new Date());
			mr.setCreateUser(i);
			mr.setEndTime(new Date());
			mr.setIsEnable(1);
			mr.setPosition("F" + i);
			mr.setRemark("remark" + i);
			mr.setRoomName("roomName" + i);
			mr.setStatus(1);
			mr.setUpdateTime(new Date());
			mr.setUpdateUser(1);
			
			records.add(mr);
		}
		
		mapper.insertBatch(records );
	}

}
