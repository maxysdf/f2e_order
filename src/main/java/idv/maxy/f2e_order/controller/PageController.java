package idv.maxy.f2e_order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 頁面控制器
 * @author Max Chen
 *
 */
@Controller
public class PageController {
	
	/**
	 * 首頁(重導至訂單清單)
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "redirect:/orders";
	}
	
	/**
	 * 訂單清單
	 * @return
	 */
	@GetMapping("/orders")
	public String listOrder() {
		return "orders";
	}
	
}
