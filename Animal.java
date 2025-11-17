package com.codegnan.Overriding;

class Animal {
	public int getLifeSpan() {
		return 0;
	}
}

class Elephant extends Animal {
	int lifespan;

	public Elephant(int lifespan) {
		this.lifespan = lifespan;
	}
	
	@Override
	public int getLifeSpan() {
		return lifespan;
	}
}