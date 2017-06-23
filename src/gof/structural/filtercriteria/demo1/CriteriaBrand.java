package gof.structural.filtercriteria.demo1;

import java.util.ArrayList;
import java.util.List;

public class CriteriaBrand implements Criteria {
	private String brand;

	public CriteriaBrand(String b) {
		brand = b;
	}

	@Override
	public List<Racquet> meetCriteria(List<Racquet> racquets) {
		List<Racquet> rs = new ArrayList<Racquet>();
		for (Racquet r : racquets) {
			if (r.getBrand().equalsIgnoreCase(brand)) {
				rs.add(r);
			}
		}
		return rs;
	}

}
