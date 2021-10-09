package com.lavanya.designpatterns.state.birthdaycake;

public interface State {
	public void prepareBatter();
	public void prepareCake();
	public void bakeCake();
	public void addFrostings();
	public void addToppings();
	public void done();
}
