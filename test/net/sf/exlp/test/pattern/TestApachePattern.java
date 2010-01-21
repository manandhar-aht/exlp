package net.sf.exlp.test.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.exlp.io.LoggerInit;

import org.apache.log4j.Logger;

public class TestApachePattern
{
	static Logger logger = Logger.getLogger(TestApachePattern.class);
	
	public static void main(String args[])
	{
		LoggerInit loggerInit = new LoggerInit("log4j.xml");	
			loggerInit.addAltPath("resources/config");
			loggerInit.init();
			
		Pattern p = Pattern.compile("/index.php\\?id=([\\d]+)(.*)");
		Matcher m=p.matcher("/index.php?id=408");
		logger.debug(m.matches());
	}
}