package org.deftserver.io.timeout;

import static org.junit.Assert.assertEquals;

import org.deftserver.io.timeout.Timeout;
import org.deftserver.web.AsyncCallback;
import org.junit.Test;

public class TimeoutTest {

	@Test
	public void simpleTimeoutConstructorTest() {
		final AsyncCallback cb = new AsyncCallback() {
			@Override public void onCallback() {}
		};
		
		Timeout t = new Timeout(1492, cb);

		assertEquals(1492, t.getTimeout());
		assertEquals(cb, t.getCallback());
	}
	
}
