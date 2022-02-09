package com.share.boot.menu;

import org.springframework.stereotype.Service;

@Service
public class MenuService {
	 public String getMenu(String id) {
	        switch (id) {
	            case "1":
	                return "Coffee";
	            case "2":
	                return "Pizza";
	            default:
	                return "Chicken";
	        }
	    }
}
