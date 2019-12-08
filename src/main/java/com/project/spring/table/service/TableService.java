package com.project.spring.table.service;

import java.util.List;

import com.project.spring.table.vo.TableVO;

public interface TableService {

	/**
	 * 테이블 목록
	 * @return
	 */
	public List<TableVO> table();
	
	public void test();
}
