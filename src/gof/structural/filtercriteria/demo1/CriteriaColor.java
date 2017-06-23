package gof.structural.filtercriteria.demo1;

import java.util.ArrayList;
import java.util.List;

public class CriteriaColor implements Criteria {
	private String color;

	public CriteriaColor(String color) {
		this.color = color;
	}

	@Override
	public List<Racquet> meetCriteria(List<Racquet> racquets) {
		List<Racquet> rs = new ArrayList<Racquet>();
		for (Racquet r : racquets) {
			if (r.getColor().equalsIgnoreCase(color)) {
				rs.add(r);
			}
		}
		return rs;
	}

}
