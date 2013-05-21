package gov.nih.nci.ncia.search;

import junit.framework.TestCase;

public class NameValuesPairsTestCase extends TestCase {

	public void testGetName() {
		NameValuesPairs out = new NameValuesPairs();
		out.setName("foo");
		assertEquals(out.getName(), "foo");
	}


	public void testGetValues() {
		NameValuesPairs out = new NameValuesPairs();
		out.setName("foo");


		String[] inVals = new String[] {"foo1", "foo2", "foo3"};
		
		out.setValues(inVals);
		
		String[] returnedValues = out.getValues();
		assertEquals(returnedValues[0], inVals[0]);
		assertEquals(returnedValues[1], inVals[1]);
		assertEquals(returnedValues[2], inVals[2]);
		
		out.setValues(1, "yikes");
		assertEquals(out.getValues(1), "yikes");		
	}
}
