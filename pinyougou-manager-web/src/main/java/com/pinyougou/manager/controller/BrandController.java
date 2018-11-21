package com.pinyougou.manager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandServiceI;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Reference
	private BrandServiceI brandServiceI;
	
	@RequestMapping("/findAll")
	public List<TbBrand>findAll(){
		return brandServiceI.findAll();
	}
	
	@RequestMapping("/sss")
	public void findAlls() {
		System.out.println("sss");
	}
	
	
}
