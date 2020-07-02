package idv.maxy.f2e_order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.maxy.f2e_order.service.OrderService;
import idv.maxy.f2e_order.vo.OrdersVO;

@RestController
public class APIController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/api/orders")
	public OrdersVO listOrder() {
		return orderService.listOrders();
	}
	
}
