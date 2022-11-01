package Arrays;

import java.util.Arrays;

public class RevisãoArray1 {
	public static void main(String[] args) {

		double[] notaAlunoA = new double[3];
		notaAlunoA[0] = 6.8;
		notaAlunoA[1] = 4.9;
		notaAlunoA[2] = 7.5;

		System.out.println(Arrays.toString(notaAlunoA));

		double totalAlunoA = 0;
		for (int i = 0; i < notaAlunoA.length; i++) {
			totalAlunoA += notaAlunoA[i];
		}

		System.out.println(totalAlunoA / notaAlunoA.length);

		System.out.println();

		double[] notaAlunoB = { 3.2, 5.7, 7.9 };

		double totalAlunoB = 0;
		for (int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];
		}
		System.out.println(Arrays.toString(notaAlunoB));

		System.out.println(totalAlunoB / notaAlunoB.length);
	}
}
