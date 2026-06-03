package com.tcs.prep;

public class inheritance {
	public class Animal {
		void domestic() {
			System.out.println("we live in farm");
		}
	}

	class dog extends Animal {
		void bark() {
			System.out.println("Dog barks");
		}
	}

	class cat extends Animal {
		void meow() {
			System.out.println("Cat meows");
		}

	}

	public class All {
		static void main(String[] args) {
			dog d = new dog();
			cat c = new cat();
			d.domestic();
			d.bark();
			c.domestic();
			c.meow();
		}
	}

}
