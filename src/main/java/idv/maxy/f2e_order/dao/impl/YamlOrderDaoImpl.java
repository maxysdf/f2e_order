package idv.maxy.f2e_order.dao.impl;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.Yaml;

import idv.maxy.f2e_order.dao.OrderDao;
import idv.maxy.f2e_order.model.Order;

@Repository
public class YamlOrderDaoImpl implements OrderDao {
	
	public List<Order> listOrder() {
		Order[] orderArr = load("/data/orders.yaml", Order[].class);
		return Arrays.stream(orderArr).collect(Collectors.toList());
	}
	
	private <T> T load(String resc, Class<T> cls) {
		Yaml y = new Yaml();
		InputStream yis = YamlOrderDaoImpl.class.getResourceAsStream(resc);
		return y.loadAs(yis, cls);
	}
	
}
