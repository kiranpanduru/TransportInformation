package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	private void TransportForm() {
    System.out.println(" transportform is SRI RAMA TRASPORTATIONS ");
	}
	
	public static void main(String[] args) {
		Transport tr = new Transport();
		tr.TransportForm();
		Road r = new Road();
		r.bike();
		r.cycle();
		r.car();
		r.bus();
		Air a = new Air();
		a.aeroPlane();
		a.heliCopter();
		Water w = new Water();
		w.boat();
		w.ship();
		
	}
}
