package com.ascent.test;

import com.ascent.dao.test.ProductDAOTest;

import junit.framework.Test;
import junit.framework.TestSuite;
/**
 * ???????
 * @author ascent
 *
 */
public class AcesysDAOTest {
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for acesys");
		// $JUnit-BEGIN$
		//???ProductDAOTest??????
		suite.addTestSuite(ProductDAOTest.class);
		
		//?????????????????????
		
		// $Junit-END$
		return suite;
	}

}
