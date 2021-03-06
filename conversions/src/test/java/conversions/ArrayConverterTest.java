package conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import wdsr.exercise1.conversions.ArrayConverter;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
public class ArrayConverterTest {
	private ArrayConverter converter;
	/**
	 * Converts an array of strings to an array of integers.
	 * @param strings to be converted to integers.
	 * @return array of integers corresponding to the provided strings. Never null.
	 * @throws NullPointerException if the argument is null.
	 * @throws NumberFormatException if any of the strings does not represent an integer value.
	 */
	
	@Before
	public void setup() {
		converter=new ArrayConverter();
	}
	
	@Test 
	public void shouldConvertArrayOfStringsToArrayOfIntegers(){
		String strings[]={"1","2","3"};
		
		int numberss[]={1,2,3};
		int values[]=converter.convertToInts(strings);
		
		assertThat(values,is(numberss));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldRaiseAnExceptionForNullArgument(){
		String[] strings={"1"};
		converter.convertToInts(strings);
		throw new IllegalArgumentException();
		
	//	ArrayConverter.convertToInts(strings);
	}
	
	@Test(expected=java.lang.NumberFormatException.class)
	public void shouldRaiseAnExceptionForNotIntegerArgument(){
		//given
		String[] strings={"1","2","3"};
		//when
		converter.convertToInts(strings);
		// then
		throw new NumberFormatException();
		// empty
	}
	
}
