package com.lavanya.designpatterns.state.birthdaycake;

public class AddFrostingState implements State {
	BirthdayCake cake;
	
	public AddFrostingState(BirthdayCake cake) {
		super();
		this.cake = cake;
	}
	
	@Override
	public void prepareBatter() {
		System.out.println("You can't prepare batter again until the cake is finished");
	}

	@Override
	public void prepareCake() {
		System.out.println("You can't prepare cake again until the cake is finished");
	}

	@Override
	public void bakeCake() {
		System.out.println("You can't bake the cake until the cake is prepared");
	}

	@Override
	public void addFrostings() {
		System.out.println("Adding frosting to your cake, please wait..");
		cake.setState(cake.getAddToppingsState());
	}

	@Override
	public void addToppings() {
		System.out.println("You can't add toppings until the frosting is finished");
	}
	
	@Override
	public void done() {
		System.out.println("Your cake is not finished yet");		
	}

	@Override
	public String toString() {
		return "Added frosting";
	}
}
