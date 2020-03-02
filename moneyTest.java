package pocketmoney;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class moneyTest {
	private money pocMoney = null;
	private int input;
	private int  expected;
	public moneyTest(int input,int expected){
		this.input = input;
		this.expected = expected;
	}
	@Before
	public void setup() {
		pocMoney = new money();
	}
	@Parameters
	public static Collection<Object[]> getData(){
			
		return Arrays.asList(new Object[][]{
			{2,1},
			{36,1},
			{79,0},
			{78,1}
			});
	}

	@Test
	public void test() {
		
		assertEquals(this.expected,pocMoney.func(input));
	}
}
