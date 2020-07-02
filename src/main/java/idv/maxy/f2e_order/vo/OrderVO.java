package idv.maxy.f2e_order.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderVO {
	private String name;
	private String logo;
	private OrderStatusVO status;
	
	@JsonIgnore
	private Date origDate;
	
	@JsonProperty
	public String getDate() {
		if(origDate == null) { return null; }
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(origDate);
		int y = cal.get(Calendar.YEAR);
		String md = new SimpleDateFormat("MM/dd").format(origDate);
		
		return String.format("%s/%s", y-1911, md);
	}
	
	public boolean isProcessing() {
		if(status == null || status.getCode() == null) { return false; }
		return status.getCode() == 1 || status.getCode() == 2;
	}
	
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

	public OrderStatusVO getStatus() {
		return status;
	}

	public void setStatus(OrderStatusVO status) {
		this.status = status;
	}

	public Date getOrigDate() {
		return origDate;
	}

	public void setOrigDate(Date origDate) {
		this.origDate = origDate;
	}
}
