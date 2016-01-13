/**
 * 
 */
package cn.edu.bjtu.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * @author solitudeycq
 *
 */
@Component
public class Truck implements java.io.Serializable {
	
	private String id;
	private String startCity;
	private String endCity;
	private int onwayTime;
	private String carType;
	private Float carLength;
	private Float stanPrice1;
	private Float stanPrice2;
	private Float pickFee;
	private Float deliveryFee;
	private String offerReturn;
	private String extraService;
	private Date relDate;
	private String carrierId;
	private String remarks;
	private String picture;
	private String resourceType;
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return startCity
	 */
	public String getStartCity() {
		return startCity;
	}
	/**
	 * @param startCity Ҫ���õ� startCity
	 */
	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}
	/**
	 * @return endCity
	 */
	public String getEndCity() {
		return endCity;
	}
	/**
	 * @param endCity Ҫ���õ� endCity
	 */
	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}
	/**
	 * @return onwayTime
	 */
	public int getOnwayTime() {
		return onwayTime;
	}
	/**
	 * @param onwayTime Ҫ���õ� onwayTime
	 */
	public void setOnwayTime(int onwayTime) {
		this.onwayTime = onwayTime;
	}
	/**
	 * @return carType
	 */
	public String getCarType() {
		return carType;
	}
	/**
	 * @param carType Ҫ���õ� carType
	 */
	public void setCarType(String carType) {
		this.carType = carType;
	}
	/**
	 * @return carLength
	 */
	public Float getCarLength() {
		return carLength;
	}
	/**
	 * @param carLength Ҫ���õ� carLength
	 */
	public void setCarLength(Float carLength) {
		this.carLength = carLength;
	}
	/**
	 * @return stanPrice1
	 */
	public Float getStanPrice1() {
		return stanPrice1;
	}
	/**
	 * @param stanPrice1 Ҫ���õ� stanPrice1
	 */
	public void setStanPrice1(Float stanPrice1) {
		this.stanPrice1 = stanPrice1;
	}
	/**
	 * @return stanPrice2
	 */
	public Float getStanPrice2() {
		return stanPrice2;
	}
	/**
	 * @param stanPrice2 Ҫ���õ� stanPrice2
	 */
	public void setStanPrice2(Float stanPrice2) {
		this.stanPrice2 = stanPrice2;
	}
	/**
	 * @return pickFee
	 */
	public Float getPickFee() {
		return pickFee;
	}
	/**
	 * @param pickFee Ҫ���õ� pickFee
	 */
	public void setPickFee(Float pickFee) {
		this.pickFee = pickFee;
	}
	/**
	 * @return deliveryFee
	 */
	public Float getDeliveryFee() {
		return deliveryFee;
	}
	/**
	 * @param deliveryFee Ҫ���õ� deliveryFee
	 */
	public void setDeliveryFee(Float deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	/**
	 * @return offerReturn
	 */
	public String getOfferReturn() {
		return offerReturn;
	}
	/**
	 * @param offerReturn Ҫ���õ� offerReturn
	 */
	public void setOfferReturn(String offerReturn) {
		this.offerReturn = offerReturn;
	}
	/**
	 * @return extraService
	 */
	public String getExtraService() {
		return extraService;
	}
	/**
	 * @param extraService Ҫ���õ� extraService
	 */
	public void setExtraService(String extraService) {
		this.extraService = extraService;
	}
	/**
	 * @return relDate
	 */
	public Date getRelDate() {
		return relDate;
	}
	/**
	 * @param relDate Ҫ���õ� relDate
	 */
	public void setRelDate(Date relDate) {
		this.relDate = relDate;
	}
	/**
	 * @return carrierId
	 */
	public String getCarrierId() {
		return carrierId;
	}
	/**
	 * @param carrierId Ҫ���õ� carrierId
	 */
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	/**
	 * @return remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks Ҫ���õ� remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return picture
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * @param picture Ҫ���õ� picture
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	/**
	 * @return resourceType
	 */
	public String getResourceType() {
		return resourceType;
	}
	/**
	 * @param resourceType Ҫ���õ� resourceType
	 */
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	/**
	 * 
	 */
	public Truck() {
	}
	/**
	 * @param id
	 */
	public Truck(String id) {
		this.id = id;
	}
	/**
	 * @param id
	 * @param startCity
	 * @param endCity
	 * @param onwayTime
	 * @param carType
	 * @param carLength
	 * @param stanPrice1
	 * @param stanPrice2
	 * @param pickFee
	 * @param deliveryFee
	 * @param offerReturn
	 * @param extraService
	 * @param relDate
	 * @param carrierId
	 * @param remarks
	 * @param picture
	 * @param resourceType
	 */
	public Truck(String id, String startCity, String endCity, int onwayTime, String carType, Float carLength,
			Float stanPrice1, Float stanPrice2, Float pickFee, Float deliveryFee, String offerReturn,
			String extraService, Date relDate, String carrierId, String remarks, String picture, String resourceType) {
		super();
		this.id = id;
		this.startCity = startCity;
		this.endCity = endCity;
		this.onwayTime = onwayTime;
		this.carType = carType;
		this.carLength = carLength;
		this.stanPrice1 = stanPrice1;
		this.stanPrice2 = stanPrice2;
		this.pickFee = pickFee;
		this.deliveryFee = deliveryFee;
		this.offerReturn = offerReturn;
		this.extraService = extraService;
		this.relDate = relDate;
		this.carrierId = carrierId;
		this.remarks = remarks;
		this.picture = picture;
		this.resourceType = resourceType;
	}
}