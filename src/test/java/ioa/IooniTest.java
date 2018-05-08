package ioa;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class IooniTest{
	
	@Test
	public void andmeTest(){
		Rakendus r = new Rakendus();
		assertEquals("Iooninimi koos laengutega on H1+ NO1- ", r.IooniNimi());
	}
	
	@Test
	public void massiTest(){
		Rakendus r=new Rakendus();
		assertEquals("Nende kahe molekuli masside summa on: 51", r.MolekulideMass());
	}
}