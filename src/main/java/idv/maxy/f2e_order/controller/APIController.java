package idv.maxy.f2e_order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import idv.maxy.f2e_order.service.OrderService;
import idv.maxy.f2e_order.vo.OrdersVO;

/**
 * API控制器
 * @author Max Chen
 *
 */
@RestController
public class APIController {
	
	@Autowired
	private OrderService orderService;
	
	/**
	 * 列出訂單
	 * @return
	 */
	@PostMapping("/api/orders")
	public OrdersVO listOrder() {
		return orderService.listOrders();
	}
	
}
