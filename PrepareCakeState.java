package com.lavanya.designpatterns.state.birthdaycake;

public class PrepareCakeState implements State {
	BirthdayCake cake;
	
	public PrepareCakeState(BirthdayCake cake) {
		super();
		this.cake = cake;
	}
	@Override
	public void prepareBatter() {
		System.out.println("You can't prepare your batter again until cake is finished");

	}

	@Override
	public void prepareCake() {
		System.out.println("Preparing your cake, please wait...");
		cake.setState(cake.getBakeCakeState());
	}

	@Override
	public void bakeCake() {
		System.out.println("You can't bake your cake until you prepare the bake");
	}

	@Override
	public void addFrostings() {
		System.out.println("You can't add frosting until the cake is baked");
	}

	@Override
	public void addToppings() {
		System.out.println("You can't add toppings until the frosting is added");

	}
	
	@Override
	public void done() {
		System.out.println("Your cake is not finished yet");		
	}

	@Override
	public String toString() {
		return "Prepared cake";
	}


}
