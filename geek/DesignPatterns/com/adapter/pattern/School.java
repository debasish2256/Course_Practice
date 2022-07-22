package com.adapter.pattern;

public class School {
	public static void main(String[] args) {
		Pen p = new PenAdapter();
		Assignment asign=new Assignment();
		asign.setP(p);
		asign.writeAssignment("This is the Homework");
	}
}
