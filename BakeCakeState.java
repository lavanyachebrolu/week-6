package com.lavanya.designpatterns.state.birthdaycake;

public class BakeCakeState implements State {
	BirthdayCake cake;
	
	public BakeCakeState(BirthdayCake cake) {
		super();
		this.cake = cake;
	}
	@Override
	public void prepareBatter() {
		System.out.println("You can't prepare batter again util the cake is finished");

	}

	@Override
	public void prepareCake() {
		System.out.println("You can't prepare cake again util the cake is finished");
	}

	@Override
	public void bakeCake() {
		System.out.println("Baking your cake, please wait...");
		cake.setState(cake.getAddFrostingState());
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
		return "Baked the cake";
	}


}
