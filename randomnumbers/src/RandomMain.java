public class RandomMain {

	public static void main(String[] args) {
		// Генерация случайного целого числа в диапазоне [minValue, maxValue)
		int minValue = 10;
		int maxValue = 100;
		// через Math
		int randomIntMath = minValue + (int)Math.round((maxValue - minValue) * Math.random());
		System.out.println("Случайное из Math = " + randomIntMath);
		// через Random
		long seed = 0;
		var rnd = new java.util.Random(seed);
		int randomInt = rnd.nextInt(minValue, maxValue);
		System.out.println("Случайное из Random = " + randomInt + ", seed = " + seed);
	}

}
