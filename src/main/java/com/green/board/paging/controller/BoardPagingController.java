package com.green.board.paging.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.green.board.dto.BoardDto;
import com.green.menus.dto.MenuDTO;
import com.green.menus.mapper.MenuMapper;

@Controller
@RequestMapping("/BoardPaging")
public class BoardPagingController {
	
	@Autowired
	private MenuMapper menuMapper;
	

	// /BoardPaging/List?menu_id=MENU01&nowpage=1
	@RequestMapping("/List")
	public ModelAndView list(BoardDto boardDto, int nowpage) {
		
		// 메뉴 목록 : menus.jsp 용
		List<MenuDTO> menuList = menuMapper.getMenuList();
		
		// 게시물 목록 조회(페이징하기)
		// 해당 메뉴의 자료 갯수: 
		//int count = 
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("boardPaging/list");
		mv.addObject("menuList", menuList);
		return mv;
	}
	
	// /BoardPaging/WriteForm?menu_id=MENU01&nowpage=1
	//@RequestMapping("/WriteForm")
	/*
	public ModelAndView WriteForm(BoardDto boardDto) {
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName();
		mv.addObject();
		return mv;
		
	}*/
}
