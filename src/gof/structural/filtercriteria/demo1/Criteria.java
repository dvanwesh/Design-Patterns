package gof.structural.filtercriteria.demo1;

import java.util.List;

public interface Criteria {
	public List<Racquet> meetCriteria(List<Racquet> racquets);
}
