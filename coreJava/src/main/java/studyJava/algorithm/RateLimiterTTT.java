package studyJava.algorithm;

import com.google.common.util.concurrent.RateLimiter;



public class RateLimiterTTT extends SmoothRateLimiter{


	
	  static RateLimiter create(double permitsPerSecond, SleepingStopwatch stopwatch) {
		    RateLimiter rateLimiter = new SmoothBursty(stopwatch, 1.0 /* maxBurstSeconds */);
		    rateLimiter.setRate(permitsPerSecond);
		    return rateLimiter;
		  }

}
