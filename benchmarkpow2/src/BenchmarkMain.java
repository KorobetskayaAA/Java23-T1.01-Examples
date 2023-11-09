import java.time.*;
import java.util.Random;

public class BenchmarkMain {
	public static void main(String[] args) {
		int generationsCount = 1000_000_000;

		Random rnd1 = new Random(100);
		long sqrSum1 = 0;
		Instant start1 = Instant.now();
		for (int i = 0; i < generationsCount; i++) {
			int randomValue = rnd1.nextInt(100);
			sqrSum1 += randomValue * randomValue;
		}
		Instant end1 = Instant.now();
		System.out.println("Расчет суммы квадратов через умножение (=" + sqrSum1 + "), мс = "
				+ Duration.between(start1, end1).toMillis());

		Random rnd2 = new Random(100);
		long sqrSum2 = 0;
		Instant start2 = Instant.now();
		for (int i = 0; i < generationsCount; i++) {
			int randomValue = rnd2.nextInt(100);
			sqrSum2 += Math.pow(randomValue, 2);
		}
		Instant end2 = Instant.now();
		System.out.println("Расчет суммы квадратов через pow (=" + sqrSum2 + "), мс = "
				+ Duration.between(start2, end2).toMillis());
	}
}
