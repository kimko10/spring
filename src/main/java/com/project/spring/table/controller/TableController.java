package com.project.spring.table.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.spring.table.service.TableService;
import com.project.spring.table.vo.TableVO;

@Controller
public class TableController {

	@Autowired
	private TableService tableServiceImpl;
	
	@RequestMapping(value="/sample")
	public String sample() {
		tableServiceImpl.test();
		return "tableView";
	}
	
	@RequestMapping(value="/table")
	public ModelAndView table() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<TableVO> list = tableServiceImpl.table();
		mav.addObject("table", list);
		mav.setViewName("tableView");
		return mav;
	}
}
