package fs.content04;

public class ContentService {

	public static final String[] CONTRACTED_SITES = new String[] { "http://hızlıguvenlitemizhaber.com",
			"http://engercekciharikahaberler.com" };

	// this method allows untrusted code to connect to allowed sites (only)
	public static String getNews(String url) {
		for (String haberler : CONTRACTED_SITES) {
			if (url.equals(haberler)) {
				return url;
			}
		}
		return "";
	}

	/*
        public static final List<String> ANLASMALI_SITELER_GUVENLI = Collections.unmodifiableList(Arrays.asList(ANLASMALI_SITELER));
	*/
}
