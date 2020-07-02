package idv.maxy.f2e_order.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 訂單清單VO
 * @author Max Chen
 *
 */
public class OrdersVO {
	private List<OrderVO> orders = new ArrayList<>();

	public List<OrderVO> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderVO> orders) {
		this.orders = orders;
	}
}
