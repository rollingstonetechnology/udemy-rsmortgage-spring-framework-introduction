package com.rollingstone.springframework.basic.ioc.contructor.injection.collection.second;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartWithItemObjects {

	private long shoppingCartId;
	
	private LocalDate cartDate;
	
	private List<CartItem> cartItems = new ArrayList<CartItem>();

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




	
	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public ShoppingCartWithItemObjects(long shoppingCartId, LocalDate cartDate, List<CartItem> cartItems) {
		super();
		this.shoppingCartId = shoppingCartId;
		this.cartDate = cartDate;
		this.cartItems = cartItems;
	}

	public ShoppingCartWithItemObjects(long shoppingCartId) {
		super();
		this.shoppingCartId = shoppingCartId;
	}

	public ShoppingCartWithItemObjects() {
		super();
	}

	@Override
	public String toString() {
		return "ShoppingCart [shoppingCartId=" + shoppingCartId + ", cartDate=" + cartDate + ", cartItems=" + cartItems
				+ "]";
	}
	
	
}
