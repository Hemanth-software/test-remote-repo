package com.adapt;

import com.krishna.pilotPen;

public class penAdapter implements Pen{

	pilotPen pilotpen = new pilotPen();

	
	@Override
	public void write(String stw) {
		
		pilotpen.mark(stw);
		
		
		
	}

	
	
	
}
