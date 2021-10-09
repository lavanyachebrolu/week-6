package com.lavanya.designpatterns.state.birthdaycake;

public class Main {

	public static void main(String[] args) {
		BirthdayCake birthdayCake = new BirthdayCake(1);
		
		birthdayCake.prepareBatter();
		birthdayCake.prepareCake();
		birthdayCake.bakeCake();
		birthdayCake.addFrostings();
		birthdayCake.addToppings();
		birthdayCake.done();
		
		System.out.println(birthdayCake);
		System.out.println();
		
		birthdayCake = new BirthdayCake(2);
		
		birthdayCake.prepareBatter();
		birthdayCake.prepareCake();
		birthdayCake.bakeCake();
		birthdayCake.addFrostings();
		birthdayCake.addToppings();
		birthdayCake.done();
		
		System.out.println(birthdayCake);
	}

}
