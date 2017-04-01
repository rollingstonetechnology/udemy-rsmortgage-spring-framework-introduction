package com.rollingstone.springframework.basic.ioc.contructor.injection.collection.second;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private long shoppingCartId;
	
	private LocalDate cartDate;
	
	private List<String> cartItems = new ArrayList<String>();

	public long getShoppingCartId() {
		return shoppingCartId;
	}

	public void setShoppingCartId(long shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public LocalDate getCartDate() {
		return cartDate;
	}

	public void setCartDate(LocalDate cartDate) {
		this.cartDate = cartDate;
	}

	public List<String> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<String> cartItems) {
		this.cartItems = cartItems;
	}

	public ShoppingCart(long shoppingCartId, LocalDate cartDate, List<String> cartItems) {
		super();
		this.shoppingCartId = shoppingCartId;
		this.cartDate = cartDate;
		this.cartItems = cartItems;
	}
	
	public ShoppingCart(long shoppingCartId) {
		super();
		this.shoppingCartId = shoppingCartId;
	}

	public ShoppingCart() {
		super();
	}

	@Override
	public String toString() {
		return "ShoppingCart [shoppingCartId=" + shoppingCartId + ", cartDate=" + cartDate + ", cartItems=" + cartItems
				+ "]";
	}
	
	
}
