package idv.maxy.f2e_order.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idv.maxy.f2e_order.dao.OrderDao;
import idv.maxy.f2e_order.model.Order;
import idv.maxy.f2e_order.service.OrderService;
import idv.maxy.f2e_order.vo.OrderStatusVO;
import idv.maxy.f2e_order.vo.OrderVO;
import idv.maxy.f2e_order.vo.OrdersVO;

/**
 * 訂單服務
 * @author Max Chen
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	/** Model to VO Mapper */
	private Function<Order, OrderVO> M2V_ORDER = m -> {
		if(m == null) { return null; }
		OrderVO v = new OrderVO();
		v.setName(m.getName());
		v.setLogo(m.getLogo());
		
		if(m.getStatus() != null) {
			OrderStatusVO vs = new OrderStatusVO();
			vs.setCode(m.getStatus());
			v.setStatus(vs);
		}
		
		v.setOrigDate(m.getDate());
		
		return v;
	};
	
	/** VO sorter */
	private Comparator<OrderVO> V_SORTER = (a,b) -> {
		int pa = a.isProcessing() ? 0 : 1;
		int pb = b.isProcessing() ? 0 : 1;
		if(pa != pb) { return pa - pb; }
		
		long da = a.getOrigDate() != null ? a.getOrigDate().getTime() : 0;
		long db = b.getOrigDate() != null ? b.getOrigDate().getTime() : 0;		
		
		return da < db ? 1 : da > db ? -1 : 0;
	};

	/**
	 * @see idv.maxy.f2e_order.service.OrderService#listOrders()
	 */
	public OrdersVO listOrders() {
		OrdersVO orders = new OrdersVO();

		List<OrderVO> list = orderDao.listOrder().stream()
				.map(M2V_ORDER)
				.sorted(V_SORTER)
				.collect(Collectors.toList());
		
		orders.getOrders().addAll(list);
		
		return orders;
	}
}
