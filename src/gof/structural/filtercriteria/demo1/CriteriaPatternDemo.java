package gof.structural.filtercriteria.demo1;

import gof.structural.filtercriteria.demo1.Racquet.RacquetType;

import java.util.ArrayList;
import java.util.List;

/**
 * Filter pattern or Criteria pattern is a design pattern that enables
 * developers to filter a set of objects using different criteria and chaining
 * them in a decoupled way through logical operations. This type of design
 * pattern comes under structural pattern as this pattern combines multiple
 * criteria to obtain single criteria.
 * 
 * @author Anwesh
 * 
 */
public class CriteriaPatternDemo {
	public static void main(String[] args) {
		List<Racquet> rs = new ArrayList<Racquet>();
		rs.add(new Racquet("Lakshmi", "Desi", "red", RacquetType.BADMINTON));
		rs.add(new Racquet("Anwesh", "Wilson", "black", RacquetType.TENNIS));
		rs.add(new Racquet("Hamdy", "Prince", "Blue", RacquetType.TENNIS));
		rs.add(new Racquet("Krishna", "Desi", "black", RacquetType.BADMINTON));
		rs.add(new Racquet("Anwesh", "Prince", "Orange", RacquetType.TENNIS));
		rs.add(new Racquet("Emily", "Wilson", "black", RacquetType.TENNIS));
		Criteria black = new CriteriaColor("BLACK");
		Criteria tennis = new CriteriaType(RacquetType.TENNIS);
		Criteria badminton = new CriteriaType(RacquetType.BADMINTON);
		Criteria wilson = new CriteriaBrand("WILSON");
		Criteria desi = new CriteriaBrand("desi");
		Criteria cAnd = new CriteraAnd(badminton, black);
		System.out.println("---Desi Racquets---");
		System.out.println(desi.meetCriteria(rs));
		System.out.println("---tenns Racquets---");
		System.out.println(tennis.meetCriteria(rs));
		System.out.println("---badminton and black Racquets---");
		System.out.println(cAnd.meetCriteria(rs));
		System.out.println("---Wilson Racquets---");
		System.out.println(wilson.meetCriteria(rs));
		System.out.println();
	}
}
