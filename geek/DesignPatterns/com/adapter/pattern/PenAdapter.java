package com.adapter.pattern;


/*single class which is responsible to join functionalities of independent or incompatible interfaces.
A real life example could be a case of card reader which acts as an adapter between memory card 
and a laptop. You plugin the memory card into card reader and card reader into the laptop so 
that memory card can be read via laptop.*/

public class PenAdapter implements Pen {
	PilotPen pp =new PilotPen();

	@Override
	public void write(String str) {
		pp.mark(str);
	}
	
}
