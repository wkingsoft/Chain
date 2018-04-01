package com;

import java.util.List;

public class Chain {

	private List<ChainHandler> handles;

	private int index = 0;

	public Chain(List<ChainHandler> handles) {
		this.handles = handles;
	}

	public void process() {
		if (index >= handles.size()) {
			return;
		}

		handles.get(index++).execute(this);
	}
}
