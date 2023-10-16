package org.jsp;

import java.util.ArrayList;
import java.util.List;

public class MainSim {
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.setId(1);
		s.setBrand("Vivo");

		SimCard sc1 = new SimCard();
		sc1.setId(2);
		sc1.setNumber(12345);

		SimCard sc2 = new SimCard();
		sc2.setId(3);
		sc2.setNumber(123456);
		List<SimCard> sims = new ArrayList<SimCard>();
		sims.add(sc1);
		sims.add(sc2);
		s.setSims(sims);
	}

}
