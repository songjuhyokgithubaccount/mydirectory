package pocketmoney;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class moneyTest {
	money pocMoney;
	@Before
	public void setup() {
		pocMoney = new money();
	}
	@Test
	public void test01() {
		assertEquals( 1,pocMoney.func(2) );
	}
	@Test
	public void test02() {
		assertEquals( 1,pocMoney.func(36) );
	}
	@Test
	public void test03() {
		assertEquals( 0,pocMoney.func(79) );
	}
	@Test
	public void test04() {
		assertEquals( 1,pocMoney.func(78) );
	}
}
