package gof.structural.filtercriteria.demo1;

import java.util.List;

public class CriteraAnd implements Criteria{
	private Criteria c1;
	private Criteria c2;
	public CriteraAnd(Criteria c1,Criteria c2){
		this.c1=c1;
		this.c2=c2;
	}

	@Override
	public List<Racquet> meetCriteria(List<Racquet> racquets) {
		List<Racquet> c1Racquets=c1.meetCriteria(racquets);
		return c2.meetCriteria(c1Racquets);
	}

}
