package org.tnsindia.enumdemo;

public enum EnumCardsDemo implements InterfaceCardDemo{
		HEART,CLUB,DIAMOND,SPADES;

		@Override
		public void print() {
			System.out.println("Selected Shape in the Cards are: "+this);
			
		}
}