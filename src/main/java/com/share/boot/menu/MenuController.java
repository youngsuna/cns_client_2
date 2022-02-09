package com.share.boot.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/menu")
public class MenuController {
	 @Autowired
	    MenuService menuService;
	 
	    @GetMapping(value = "/{id}")
	    public String menu(@PathVariable("id") String id) {
			return menuService.getMenu(id);
	    }
}
