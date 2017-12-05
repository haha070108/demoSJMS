package com.baobaotao;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
    private String brand="bmw";
    private double price=10.0;


	@Override
    public String toString() {
        return "brand:" + brand + "," + "price:" + price;
    }
}

 
