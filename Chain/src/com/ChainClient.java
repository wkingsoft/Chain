package com;

import java.util.Arrays;
import java.util.List;

public class ChainClient {
	static class ChainHandlerA extends ChainHandler {
		@Override
		protected void handleProcess() {
			System.out.println("handle A");
		}
	}

	static class ChainHandlerB extends ChainHandler {
		@Override
		protected void handleProcess() {
			System.out.println("handle B");
		}
	}

	static class ChainHandlerC extends ChainHandler {
		@Override
		protected void handleProcess() {
			System.out.println("handle C");
		}
	}
	
	public static void main(String[] args) {
		List<ChainHandler> list = Arrays.asList(
				new ChainHandlerA(),
				new ChainHandlerB(),
				new ChainHandlerC());
		
		Chain chain = new Chain(list);
		chain.process();
		
	}

}
