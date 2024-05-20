package fs.content01;

import java.util.regex.Pattern;

public final class RegexUtilFixed {

	private RegexUtilFixed() {}

	private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

	public static boolean isNonNumeral(String s) {
		return ROMAN.matcher(s).matches();
	}
}
