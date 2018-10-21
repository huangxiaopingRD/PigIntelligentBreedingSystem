package cn.bluedot.core.domain;

import java.util.Date;

/**
 * @author : 游斌平
 *
 */
public class Gathering {
	/**
	 * 收款单号
	 */
	private int gatheringID;
	/**
	 * 收款类型
	 */
	private String gatheringType;
	/**
	 * 收款时间
	 */
	private Date gatherDate;
	/**
	 * 金额
	 */
	private double money;
	/**
	 * 收款的流水号
	 */
	private String serialNumber;
	/**
	 * 收款原因
	 */
	private String gatherReason;
	/**
	 * 物品订单号
	 */
	private String orderNumber;
	/**
	 * 付款人员
	 */
	private String  payer;
	/**
	 * 收款人员
	 */
	private String receiver;
	public int getGatheringID() {
		return gatheringID;
	}
	public void setGatheringID(int gatheringID) {
		this.gatheringID = gatheringID;
	}
	public String getGatheringType() {
		return gatheringType;
	}
	public void setGatheringType(String gatheringType) {
		this.gatheringType = gatheringType;
	}
	public Date getGatherDate() {
		return gatherDate;
	}
	public void setGatherDate(Date gatherDate) {
		this.gatherDate = gatherDate;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getGatherReason() {
		return gatherReason;
	}
	public void setGatherReason(String gatherReason) {
		this.gatherReason = gatherReason;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	
}