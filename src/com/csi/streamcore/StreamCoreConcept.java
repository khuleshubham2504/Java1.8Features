package com.csi.streamcore;

import java.util.LinkedList;
import java.util.List;

class ProductDetails {
	private int pId;
	private String pName;
	private double pPrice;

	public ProductDetails(int pId, String pName, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "ProductDetails [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}

}

public class StreamCoreConcept {
	public static void main(String[] args) {

		List<ProductDetails> plList = new LinkedList<ProductDetails>();

		plList.add(new ProductDetails(333, "Smart Phone", 8965.00));
		plList.add(new ProductDetails(444, "Smart TV", 67894.89));
		plList.add(new ProductDetails(222, "Smart AC", 56043.76));

		plList.stream().filter(i -> i.getpPrice() > 50000).forEach(ii -> System.out.println(ii));
	}
}
