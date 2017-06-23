package gof.structural.filtercriteria.demo1;

import gof.structural.filtercriteria.demo1.Racquet.RacquetType;

import java.util.ArrayList;
import java.util.List;

public class CriteriaType implements Criteria {
	private RacquetType type;

	public CriteriaType(RacquetType t) {
		type = t;
	}

	@Override
	public List<Racquet> meetCriteria(List<Racquet> racquets) {
		List<Racquet> tennisRacquets = new ArrayList<Racquet>();
		for (Racquet r : racquets) {
			if (r.getType().equals(type)) {
				tennisRacquets.add(r);
			}
		}
		return tennisRacquets;
	}

}
