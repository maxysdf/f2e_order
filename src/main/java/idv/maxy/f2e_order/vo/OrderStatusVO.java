package idv.maxy.f2e_order.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 訂單狀態VO
 * @author Max Chen
 *
 */
public class OrderStatusVO {
	/** 狀態代碼 */
	private Integer code;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	/** 狀態 */
	@JsonProperty
	public String getType() {
		if(code == null) { return null; }
		
		String type = null;
		if(code == 1) { type = "處理中"; }
		if(code == 2) { type = "已成立"; }
		if(code == 3) { type = "已取消"; }
		if(code == 4) { type = "已送達"; }
		return type;
	}
}
