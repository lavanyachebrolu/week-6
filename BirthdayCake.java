package com.lavanya.designpatterns.state.birthdaycake;

public class BirthdayCake {

	State prepareBatterState;
	State prepareCakeSate;	
	State bakeCakeState;
	State addFrostingState;
	State addToppingsState;
	State cakeReadyState;
	State prizeState;
	int luckyWinner = 0;

	public BirthdayCake(int winner) {
		prepareBatterState = new PrepareBatterState(this);
		prepareCakeSate = new PrepareCakeState(this);
		bakeCakeState = new BakeCakeState(this);
		addFrostingState = new AddFrostingState(this);
		addToppingsState = new AddToppingsState(this);
		cakeReadyState = new CakeReadyState(this);
		prizeState = new RewardState(this);
		luckyWinner = winner;
	}


	State state = prepareBatterState;
	
	public void prepareBatter() {
		prepareBatterState.prepareBatter();
	}
	
	public void prepareCake() {
		prepareCakeSate.prepareCake();
	}
	
	public void bakeCake() {
		bakeCakeState.bakeCake();
	}
	
	public void addFrostings() {
		addFrostingState.addFrostings();
	}
	
	public void addToppings() {
		addToppingsState.addToppings();
	}
	
	public void done() {
		cakeReadyState.done();
	}

	public State getPrizeState() {
		return prizeState;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getPrepareBatterState() {
		return prepareBatterState;
	}

	public State getPrepareCakeSate() {
		return prepareCakeSate;
	}

	public State getBakeCakeState() {
		return bakeCakeState;
	}

	public State getAddFrostingState() {
		return addFrostingState;
	}

	public State getAddToppingsState() {
		return addToppingsState;
	}
	
	public int getLuckyWinner() {
		return luckyWinner;
	}

	public State getCakeReadyState() {
		return cakeReadyState;
	}

	public void setCakeReadyState(State cakeReadyState) {
		this.cakeReadyState = cakeReadyState;
	}
	
	@Override
	public String toString() {
		return "BirthdayCake [state=" + state + "]";
	}
	
	
}
