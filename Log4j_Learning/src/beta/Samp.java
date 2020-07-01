package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Samp {

	private static Logger log = LogManager.getLogger(Samp.class.getName());
	
	public static void main(String[] args) {
		log.debug("I Have Clicked A Button");
		log.error("Im Error");
		log.info("Button Clicked Successfully");
		log.fatal("Im Fatal");
		log.warn("Im Warining");
		
		
	}

}
