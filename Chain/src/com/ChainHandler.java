package com;

public abstract class ChainHandler {

	public void execute(Chain chain) {
		handleProcess();
		chain.process();
		
	}
	protected abstract void handleProcess();

}
