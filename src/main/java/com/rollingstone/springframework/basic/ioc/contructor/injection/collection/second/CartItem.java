package com.rollingstone.springframework.basic.ioc.contructor.injection.collection.second;

import java.time.LocalDate;

public class CartItem {

	private long itemID;
	
	private String cartItemName;
	
	private LocalDate mfgDate;
	
	private LocalDate expiryDate;

	public long getItemID() {
		return itemID;
	}

	public void setItemID(long itemID) {
		this.itemID = itemID;
	}

	public String getCartItemName() {
		return cartItemName;
	}

	public void setCartItemName(String cartItemName) {
		this.cartItemName = cartItemName;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public CartItem(long itemID, String cartItemName, LocalDate mfgDate, LocalDate expiryDate) {
		super();
		this.itemID = itemID;
		this.cartItemName = cartItemName;
		this.mfgDate = mfgDate;
		this.expiryDate = expiryDate;
	}

	public CartItem() {
		super();
	}

	@Override
	public String toString() {
		return "CartItem [itemID=" + itemID + ", cartItemName=" + cartItemName + ", mfgDate=" + mfgDate
				+ ", expiryDate=" + expiryDate + "]";
	}
	
	
}
