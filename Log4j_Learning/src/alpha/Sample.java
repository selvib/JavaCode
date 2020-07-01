package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Sample {

	private static Logger log = LogManager.getLogger(Sample.class.getName());
	
	public static void main(String[] args) {
		
		log.debug("Im Debug from Sample");
		log.error("Im Error");
		log.info("hello");
		log.fatal("Im Fatal");

	}

}
