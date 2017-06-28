package gof.behavioral.commandpattern.demo1;

import java.util.ArrayList;
import java.util.List;

public class Coach {
	private List<Shot> shots = new ArrayList<Shot>();

	public void strategizeShots(Shot shot) {
		shots.add(shot);
	}

	public void hitShots() {
		for (Shot s : shots) {
			s.play();
		}
		shots.clear();
	}
}
