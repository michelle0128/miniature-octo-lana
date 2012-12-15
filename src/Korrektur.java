
public class Korrektur {
	private static boolean isEqual(double[][] M1, double[][]M2) {

		
		if (M1 == null && M2 == null) {
				return true;
			
	 } else if (M1 == null || M2 == null) {
				return false;
		
		}

			
	        boolean result = true;
			
	  for (int i = 0; i < M1.length; i++) {
		
			for (int j = 0; j < M1[i].length; j++) {

					if (M1[i][j] != M2[i][j]) {

						result = false;
					}
				}
			}
		
		                                 return result;

		}

		/**
		 * Die Methoden der Klasse Matrix werden getestet.
		 * 
		 * @param args Kommandozeilenparameter, nicht verwendet
		 * 
		 */
		public static void main(String[] args) {

			// Fuer den Test werden diese Matrizen verwendet:
			double[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
			double[][] matrix2 = { { 1, 0, 1 }, { 1, 0, 1 } };
			double[][] matrix3 = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 2 } };
			// Das sind Ihre Ergebnisse:
			double[][] solution1 = Matrix.add(matrix1, matrix2);
			double[][] solution2 = Matrix.sub(matrix1, matrix3);
			double[][] solution3 = Matrix.mul(matrix2, matrix3);
			// Hier stehen die richtigen Resultate:
			double[][] sum = { { 2, 2, 4 }, { 5, 5, 7 } };
			double[][] difference = null;
			double[][] product = { { 1, 0, 2 }, { 1, 0, 2 } };

			int points = 0;
			// Diese Variablen geben an, ob der Testfall bestanden wurde.
			boolean isCorrect1 = isEqual(solution1, sum);
			boolean isCorrect2 = isEqual(solution2, difference);
			boolean isCorrect3 = isEqual(solution3, product);

		
		if (!isCorrect1) {
			
		System.out.println("Die Addition war fehlerhaft.");
			}

		
		if (!isCorrect2) {
				System.out.println("Die Subtraktion war fehlerhaft.");
			}

			
	        if (!isCorrect3) {
				System.out.println("Die Multiplikation war fehlerhaft.");
			}


		if (isCorrect1 && isCorrect2 && isCorrect3) {
				points++;
			}

		
		System.out.println("Punkte: " + points);

		}

	}



