package secao07Compara;

public class Program {

	public Employee promotion(Employee... employees) {
		Employee bestCandidate = employees[0];
		/*
		 * go through the list of employees and calculate which one is the best
		 * candidate
		 */
		for (int i = 1; i < employees.length; i++) {
			// if there is a candidate better than the current best
			if (employees[i].getRating > bestCandidate.getRating) {
				// update the bestCandidate to the better one
				bestCandidate = employees[i];
			} // fim if
		} // fim for
			// return the best candidate found for the promotion
		return bestCandidate;
	}// fim do método promotion

}
