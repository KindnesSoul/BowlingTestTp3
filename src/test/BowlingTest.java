package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Bowling;

class BowlingTest {
	Bowling bowling;
	@BeforeEach
	void init() {
		bowling=new Bowling();
		}
	@Test
	void testBowling1() {
		/*aucunequille*/
		for (int i=0 ; i<20 ;i++) {
			bowling.roll(0);
		}
		assertEquals(bowling.score(),0);
	}

}
