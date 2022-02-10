
public class CastingConversion {

	public static void main(String[] args) {
		// All mathamatical operations return the result in "int". If you want to store
		// that result in a variable that is smaller than an int, you will need to cast
		// it.
		// To cast, you need to put the variable type in brackets () before the int
		// value
		// for float and long, you may need to add an "f" or "L" after the number,
		// respectively.

		byte num1 = 127;
		float num2 = 3.9f;

		float f1 = 19.9f;
		double d1 = 987.9;

		// Explicit casting conversion needs to be written in the code
		f1 = (float) d1;

		// Implicit casting conversion happens automatically
		d1 = f1;

		short s1 = 90;
		short s2 = 190;
		short s3 = (short) (s1 + s2);

		// List of primitive datatypes and their abilities. (Curtsy of W3 Schools)

		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775807L;

		float f = 1.1234567891011121314151617181920f; // Stores fractional numbers. Sufficient for storing 6 to 7
														// decimal digits
		double d = 1.1234567891011121314151617181920; // Stores fractional numbers. Sufficient for storing 15 decimal
														// digits

		char c = 'a'; // Stores a single character/letter or ASCII values

		boolean b2 = true; // Stores true or false values

	}

}
