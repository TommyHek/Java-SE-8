package pro_1;
import java.util.Scanner;

import pro_1.Out.In;
public class c66 {
	public static void main(String[] args) {
		Food f=new Food();
		f.p.pop();
		Out.Ins oi=new Out().new Ins();
		oi.print();
		Ou ou=new Ou();
		ou.m();
	}
}
//
class Popcorn{
	
		void pop() {
		System.out.println("Popcorn");
		}
	
	
}
class Food{
	Popcorn p=new Popcorn() {
		void pop() {
			System.out.println("Annonymous Popcorn");
		}
	};
}

class Ou{
	
	void m() {
		
		System.out.println();
		class In{
			int x=0;
			void mm() {
				System.out.println("ww");
			}
		}
		In in=new In();
		in.mm();
	}
}
class Out{
	class Ins{
		void print() {
			System.out.println("w");
		}
	}
}
