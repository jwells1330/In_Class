package headfirst.command.simpleremote;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LightOnCommandTest {
	private	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	private PrintStream ps = new PrintStream(baos);
	private PrintStream old = System.out;
	private Light light = new Light();
	private LightOnCommand lightCommand = new LightOnCommand(light);
	
	@Before
	public void beforeTest(){
		System.setOut(ps);
	}
	@Test
	public void testExecute(){
		lightCommand.execute();
		
		String test = "Light is on";
		String baosString = baos.toString().trim();
		test = test.trim();

		assertTrue(baosString.equals(test));
	}
	@After
	public void afterTest(){
		System.out.flush();
		System.setOut(old);
	}

}
