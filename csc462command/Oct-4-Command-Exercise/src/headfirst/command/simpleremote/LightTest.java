package headfirst.command.simpleremote;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LightTest {

	private	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	private PrintStream ps = new PrintStream(baos);
	private PrintStream old = System.out;
	private Light light = new Light();
	
	@Before
	public void beforeTests(){
		System.setOut(ps);
	}
	@Test
	public void testOn(){
		light.on();
		
		String test = "Light is on";
		String baosString = baos.toString().trim();
		test = test.trim();

		assertTrue(baosString.equals(test));
	}
	@Test
	public void testOff(){
		light.off();
		
		String test = "Light is off";
		String baosString = baos.toString().trim();
		test = test.trim();

		assertTrue(baosString.equals(test));
	}
	
	@After
	public void afterTests(){
		System.out.flush();
		System.setOut(old);
	}

}
