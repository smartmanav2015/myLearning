package com.sapient.prob.entity;

import java.math.BigDecimal;
import java.util.Date;

public final class Log {
	
	private final BigDecimal price;

	public Log(BigDecimal price) {
		super();
		this.price = price;
	}

	public BigDecimal getPrice() {
		return price;
	}


}
