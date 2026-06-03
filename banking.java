package com.tcs.prep;

public class banking {


		String name;
		int accno;
		double balance;

		void display() {
			System.out.println(name + " " + accno + " " + balance);
		}
	}

	class bank2 extends banking {
		static void main(String[] args) {
			banking b1 = new banking();
			b1.name = "jack";
			b1.accno = 12345;
			b1.balance = 5500.89;
			b1.display();
		}
	}

