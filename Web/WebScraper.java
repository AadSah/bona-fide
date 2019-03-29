import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.*; // Only needed if scraping a local File.
import java.lang.*;
import java.util.*;
import java.net.*;
public class WebScraper{
	public WebScraper() throws Exception {
		Scanner inp = new Scanner(System.in);
		String google = "http://www.google.com/search?q=";
		String search = inp.nextLine();
		String charset = "UTF-8";
		String userAgent = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2"; // Change this to your company's name and bot homepage!

		Elements links = Jsoup.connect(google + URLEncoder.encode(search, charset)).proxy("172.16.2.30",8080).userAgent(userAgent).get().select(".g>.r>a");
		int i=0;
		for (Element link : links ) {
		    String title = link.text();
		    String url = link.absUrl("href"); // Google returns URLs in format "http://www.google.com/url?q=<url>&sa=U&ei=<someKey>".
		    url = URLDecoder.decode(url.substring(url.indexOf('=') + 1, url.indexOf('&')));

		    //if (!url.startsWith("https")) {
		      //  continue; // Ads/news/etc.
		    //}
		    System.out.println("URL: " + url);
		    //i++;
		    //if(i>=3 ) break;
		}
	
	}
	
	public static void main (String args[]) throws Exception {

		new WebScraper();
	
	}
}


	
