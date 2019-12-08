package com.project.spring.table.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.spring.table.vo.TableVO;

public interface TableMapper {

	/**
	 * 테이블 목록
	 * @return
	 */
	public List<TableVO> table();
}
