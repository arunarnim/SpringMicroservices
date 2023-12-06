package com.example.SpringBootRestDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@Autowired
	ItemRepository itemRepo;
	
	@RequestMapping("/sample")
	public Response sample(@RequestParam (value="name", defaultValue = "robot") String name) {
		Response res = new Response();
		res.setId(1);
		res.setMessage("sample REST " + name);
		return res;
	}
	
	@GetMapping("/getAllItems")
	@ResponseBody 
	public List<Item> getAllItems() {
		return itemRepo.getAllItems();
	}
	
	
	@GetMapping("/getItem")
	public @ResponseBody Item getItem(@RequestParam int id) {
		return itemRepo.getItem(id);
		
	}
	
}
