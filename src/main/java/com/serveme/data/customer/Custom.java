package com.serveme.data.customer;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Custom {
	
	@Id
	private Integer id;
	private String cname;
	private List<Integer> salesids;
	private Integer visits;
	
	
	public Custom(Integer id, String cname, List<Integer> salesids, Integer visits) {
		super();
		this.id = id;
		this.cname = cname;
		this.salesids = salesids;
		this.visits = visits;
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
	public List<Integer> getSalesids() {
		return salesids;
	}
	public void setSalesids(List<Integer> salesids) {
		this.salesids = salesids;
	}
	public Integer getVisits() {
		return visits;
	}
	public void setVisits(Integer visits) {
		this.visits = visits;
	}
	
}
