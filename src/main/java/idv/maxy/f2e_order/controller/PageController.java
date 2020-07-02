package idv.maxy.f2e_order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.maxy.f2e_order.service.OrderService;
import idv.maxy.f2e_order.vo.OrdersVO;

@Controller
public class PageController {
	
	@GetMapping("/orders")
	public String listOrder() {
		return "orders";
	}
	
}
