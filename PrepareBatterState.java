package com.lavanya.designpatterns.state.birthdaycake;

public class PrepareBatterState implements State {
	BirthdayCake cake;
	
	
	public PrepareBatterState(BirthdayCake cake) {
		super();
		this.cake = cake;
	}

	@Override
	public void prepareBatter() {
		System.out.println("Preparing Batter..");
		cake.setState(cake.getPrepareCakeSate());

	}

	@Override
	public void prepareCake() {
		System.out.println("You can't prepare your cake until you prepare the batter");

	}

	@Override
	public void bakeCake() {
		System.out.println("You can't prepare your cake until you prepare the cake");
	}

	@Override
	public void addFrostings() {
		System.out.println("You can't add frosting  until you bake your cake");

	}

	@Override
	public void addToppings() {
		System.out.println("You can't add toppings until you add frosting");

	}
	
	@Override
	public void done() {
		System.out.println("Your cake is not finished yet");		
	}

	@Override
	public String toString() {
		return "Prepared batter";
	}


}
