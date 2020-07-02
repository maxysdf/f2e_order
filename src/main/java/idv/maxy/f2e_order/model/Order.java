package idv.maxy.f2e_order.model;

import java.util.Date;

/**
 * 訂單Model
 * @author Max Chen
 *
 */
public class Order {
	/** 商品名 */
	private String name;
	/** 圖片 */
	private String logo;
	/** 狀態 */
	private Integer status;
	/** 預計出貨日 */
	private Date date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
