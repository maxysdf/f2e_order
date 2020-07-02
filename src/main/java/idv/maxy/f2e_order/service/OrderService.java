package idv.maxy.f2e_order.service;

import idv.maxy.f2e_order.vo.OrdersVO;

/**
 * 訂單服務
 * @author Max Chen
 *
 */
public interface OrderService {
	/**
	 * 取得訂單清單
	 * @return 訂單清單
	 */
	public OrdersVO listOrders();
}
