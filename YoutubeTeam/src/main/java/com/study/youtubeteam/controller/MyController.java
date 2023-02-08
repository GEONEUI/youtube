package com.study.youtubeteam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.youtubeteam.emtity.youtubeList;
import com.study.youtubeteam.mapper.YoutubeListMapper;





@Controller
public class MyController {
	
	@Autowired
	YoutubeListMapper mapper;

	//건의
	@RequestMapping("/")
	public String index(Model model) {
		List<youtubeList> list = mapper.selectAll();
		System.out.println(list);
		model.addAttribute("list", list);
		return "index";
	}
	//-------------------------------------------------------
	
	//예준
	@RequestMapping("/play")
	public String play() {
		return "play";
	}
	
	
	
	
	
	
	
	
	
	
	
	//--------------------------------------------------------
	
	//준호-----------------------------------------------------
	@RequestMapping("/channel")
	public String channel() {
		return "channel";
	}
	
	//유진
	@RequestMapping("/mypage")
	public String mypage() {
		return "mypage";
	}
}
