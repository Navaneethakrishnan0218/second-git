package org.pom;

import org.fb.LibGlobal;
import org.junit.BeforeClass;

public class Page5  extends LibGlobal {
	@BeforeClass
	public static void base() {
		getdriver();
		String url="https://adactinhotelapp.com/";
		loadUrl(url);
	}
	
	
	
	
}
