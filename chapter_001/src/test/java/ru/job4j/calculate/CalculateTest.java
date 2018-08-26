package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Alexandra Yazopova (mailto:aleaxndra.yaz@gmail.com)
* @version 1
* @since 26.08.2018
*/

public class CalculateTest {
		/**
		* Test echo.
		*/ 
		@Test
		public void whenTakeNameThenTreeEchoPlusName() {
			String input = "Alexandra Yazopova";
			String expect = "Echo, echo, echo : Alexandra Yazopova"; 
			Calculate calc = new Calculate();
			String result = calc.echo(input);
			assertThat(result, is(expect));
		}
}