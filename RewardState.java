package com.lavanya.designpatterns.state.birthdaycake;

public class RewardState implements State {
	BirthdayCake cake;
	
	public RewardState(BirthdayCake cake) {
		super();
		this.cake = cake;
	}
	@Override
	public void prepareBatter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prepareCake() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bakeCake() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFrostings() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addToppings() {
		// TODO Auto-generated method stub

	}
	@Override
	public void done() {
		if(cake.getLuckyWinner() > 0 && cake.getLuckyWinner() % 2 == 00) {
			System.out.println("Your cake is done and your cake won the prize");		
		} else {
			System.out.println("Your cake is done, but you didn't win the prize");	
		}
		cake.setState(cake.getCakeReadyState());
	}


}
