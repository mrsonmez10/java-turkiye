package fs.content04;

public class ContentServiceBroken {

	public static String virus() {
		String virusUrl = "kotuhaberler.com";
		ContentService.CONTRACTED_SITES[0] = virusUrl;
		return ContentService.getNews(virusUrl);
	}

	public static void main(String[] args) {
		System.out.println(virus());
	}
}
