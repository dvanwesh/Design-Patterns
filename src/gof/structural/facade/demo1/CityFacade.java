package gof.structural.facade.demo1;

public class CityFacade {
	private City detroit;
	private City charlotte;
	private City ny;

	public CityFacade() {
		detroit = new Detroit();
		charlotte = new Charlotte();
		ny = new NewYork();
	}

	public void whyVisitNy() {
		ny.bestThingsGoing();
	}

	public void whyVisitCharlotte() {
		charlotte.bestThingsGoing();
	}

	public void whyVisitDetroit() {
		detroit.bestThingsGoing();
	}
}
