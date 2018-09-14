package com.serveme.data.sales;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sales {

	@Id
	private Integer id;
	private String cname;
	private Integer cid;
	private Date saledate;
	private List<Integer> items;
	private Double tolalamount;
	
	
	public Sales(Integer id, String cname, Integer cid, Date saledate, List<Integer> items, Double tolalamount) {
		super();
		this.id = id;
		this.cname = cname;
		this.cid = cid;
		this.saledate = saledate;
		this.items = items;
		this.tolalamount = tolalamount;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Date getSaledate() {
		return saledate;
	}
	public void setSaledate(Date saledate) {
		this.saledate = saledate;
	}
	public List<Integer> getItems() {
		return items;
	}
	public void setItems(List<Integer> items) {
		this.items = items;
	}
	public Double getTolalamount() {
		return tolalamount;
	}
	public void setTolalamount(Double tolalamount) {
		this.tolalamount = tolalamount;
	}
	
	
}
