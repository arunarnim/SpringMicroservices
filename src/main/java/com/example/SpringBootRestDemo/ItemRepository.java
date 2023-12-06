package com.example.SpringBootRestDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository {

	@Autowired
	JdbcTemplate temp;

	public List<Item> getAllItems() {
		List<Item> items = temp.query("select id,name,category from item", (result,
				rowNum) -> new Item(result.getInt("id"), result.getString("name"), result.getString("category")));
		return items;
	}

	public Item getItem(int id) {
		System.out.println("=== id="+id);
		Item item = (Item) temp.queryForObject("select id,name,category from item where id=?", 
				(result, rowNum) -> new Item(result.getInt("id"), result.getString("name"), result.getString("category")),
				new Object[] { id });
		return item;
	}

}
