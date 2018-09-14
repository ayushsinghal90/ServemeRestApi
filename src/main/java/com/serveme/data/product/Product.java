package com.serveme.data.product;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
   @Id
   private Integer id;
   private String prodnm;
   private String ptype;
   private Integer mquant;
   private Integer quant;
   private Double price;
   private Double discount;
   private Date mdate;
   
    public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Product(Integer id, String prodnm,String ptype, Integer mquant, Integer quant, Double price,Double discount, Date mdate) {
		super();
		this.id = id;
		this.prodnm = prodnm;
		this.mquant = mquant;
		this.quant = quant;
		this.price = price;
		this.discount = discount;
		this.mdate = mdate;
		this.ptype = ptype;
	}
	
	

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getProdnm() {
	  return prodnm;
    }
    
	public void setProdnm(String prodnm) {
		this.prodnm = prodnm;
	}
	
	public Integer getMquant() {
		return mquant;
	}
	
	public void setMquant(Integer mquant) {
		this.mquant = mquant;
	}
	public Integer getQuant() {
		return quant;
	}
	
	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Date getMdate() {
		return mdate;
	}
	
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
   
   
   
}
