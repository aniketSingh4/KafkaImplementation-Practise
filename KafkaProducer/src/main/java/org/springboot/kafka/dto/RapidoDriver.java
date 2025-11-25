package org.springboot.kafka.dto;

public class RapidoDriver 
{
	private int driver_id;
	private String longitude;
	private String latitude;

	
	public RapidoDriver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RapidoDriver(int driver_id, String longitude, String latitude) {
		super();
		this.driver_id = driver_id;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public int getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	

}
