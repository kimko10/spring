package com.project.spring.table.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.spring.table.service.TableService;
import com.project.spring.table.vo.TableVO;

@Service
public class TableServiceImpl implements TableService{

	@Resource(name="tableMapper")
	private TableMapper tableMapper;
	
	@Override
	public List<TableVO> table() {
		return tableMapper.table();
	}

	@Override
	public void test() {
		System.out.println("HJLOG serviceImpl로 도착함");
	}

}
