package edu.gatech.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringTest {

	private MyStringInterface mystring;

	@Before
	public void setUp() throws Exception {
		mystring = new MyString();
	}

	@After
	public void tearDown() throws Exception {
		mystring = null;
	}

	@Test
	public void testGetConsonants7() {
		System.out.println("Output from testGetConsonants7:  bcdfghjklmnpqrstvwxyz");
		mystring.setString("aaaeeeiiioooob&c-d f%g h$j k l m n p q r s t v w x y zuuuuu");
		assertEquals("bcdfghjklmnpqrstvwxyz", mystring.getConsonants());
	}
	
	@Test
	public void testGetConsonants1() {
		System.out.println("Output from testGetConsonants1:  lkvwlsbttrthncnsnnts");
		mystring.setString("I like vowels better than consonants");
		assertEquals("lkvwlsbttrthncnsnnts", mystring.getConsonants());
	}

	@Test
	public void testGetConsonants2() {
		System.out.println("Expected for testGetConsonants2: ");
		mystring.setString("aeiou");
		assertEquals("", mystring.getConsonants());
	}

	@Test
	public void testGetConsonants3() {
		System.out.println("Expected for testGetConsonants3: LKVwLSBttRTHncNSNts");
		mystring.setString("I LIKE VowELS BEttER THAn cONSONAts .");
		assertEquals("LKVwLSBttRTHncNSNts", mystring.getConsonants());
	}

	@Test
	public void testGetConsonants4() {
		System.out.println("Expected for testGetConsonants4: hdntthghtfspclchrctrslk");
		mystring.setString("I had	!not thought of special charecters like '*' ??!!!");
		assertEquals("hdntthghtfspclchrctrslk", mystring.getConsonants());
	}
	@Test
	public void testGetConsonants5() {
		System.out.println("Expected for testGetConsonants5: null");
		mystring.setString("");
		assertEquals(null, mystring.getConsonants());
	}
	
	@Test
	public void testGetConsonants6() {
		System.out.println("Expected Output from testGetConsonants6: ndsmtmsy");
		mystring.setString("aeiou u and somtimes y");
		assertEquals("ndsmtmsy", mystring.getConsonants());
	}
	
	@Test
	public void testNumberOfConsonants1() {
		System.out.println("Expected Output from GetNumConsonants1: 20 ");
		mystring.setString("I like vowels better than consonants");
		assertEquals(20, mystring.numberOfConsonants());
	}

	@Test
	public void testNumberOfConsonants2() {
		System.out.println("Expected Output from GetNumConsonants2: 0 ");
		mystring.setString("aeiou");
		assertEquals(0, mystring.numberOfConsonants());
	}

	@Test
	public void testNumberOfConsonants3() {
		System.out.println("Expected Output from GetNumConsonants3: 19 ");
		mystring.setString("I LIKE VowELS BEttER THAn cONSONAts .");
		assertEquals(19, mystring.numberOfConsonants());
	}

	@Test
	public void testNumberOfConsonants4() {
		System.out.println("Expected Output from GetNumConsonants4: 23 ");
		mystring.setString("I had not thought of special charecters like '*' ??!!!");
		assertEquals(23, mystring.numberOfConsonants());
	}
	
	@Test
	public void testNumberOfConsonants5() {
		System.out.println("Expected Output from GetNumConsonants5: 0 ");
		mystring.setString("");
		assertEquals(0, mystring.numberOfConsonants());
	}
	
	@Test
	public void testNumberOfConsonants6() {
		System.out.println("Expected Output from GetNumConsonants6: 8 ");
		mystring.setString("aeiou u and somtimes y");
		assertEquals(8, mystring.numberOfConsonants());
	}

	@Test
	public void testGetCharacter1() {
		System.out.println("Expected Output testGetCharacter1: s ");
		mystring.setString("I like vowels better than consonants");
		assertEquals('s', mystring.getCharacter(36));
	}

	@Test
	public void testGetCharacter2() {
		System.out.println("Expected Output testGetCharacter2: ' ");
		mystring.setString("I had not thought of special charecters like '*' ??!!!");
		assertEquals('\'', mystring.getCharacter(46));

	}

	@Test(expected = IllegalIndexException.class)
	public void testGetCharacter3() {
		System.out.println("Test for Exception ");
		mystring.setString("I like vowels better than consonants");
		assertEquals(' ', mystring.getCharacter(100));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetCharacter4() {		
		System.out.println("testGetCharacter4:Test for Exception");
		mystring.setString("I like vowels better than consonants");
		assertEquals("Exception", mystring.getCharacter(0));

	}
	
	@Test(expected = IllegalIndexException.class)
	public void testGetCharacter5() {		
		System.out.println("testGetCharacter5:Test for GetCharacter5 Null String");
		mystring.setString("");
		assertEquals("Exception", mystring.getCharacter(1));

	}
	

	@Test
	public void testFlipCaseInSubstring1() {
		System.out.println("Expected output for testFlipCaseInSubstring1: I Like vOWELS bETTER Than Consonants");
		mystring.setString("I Like Vowels Better Than Consonants");
		mystring.flipCaseInSubstring(7, 21);
		assertEquals("I Like vOWELS bETTER Than Consonants", mystring.getString());	
	}

	@Test
	public void testFlipCaseInSubstring2() {
		System.out.println("Expected output for testFlipCaseInSubstring2: i lIKE vOWels bETTER Than Consonants");
			mystring.setString("I Like Vowels Better Than Consonants");
			mystring.flipCaseInSubstring(1, 10);
			assertEquals("i lIKE vOWels Better Than Consonants", mystring.getString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFlipCaseInSubstring3() {
		mystring.setString("I Like Vowels Better Than Consonants");
		mystring.flipCaseInSubstring(0, 10);
		assertEquals("i lIKE vOWEls better Than Consonants", mystring.getString());
	}

	@Test(expected = IllegalIndexException.class)
	public void testFlipCaseInSubstring4() {
		System.out.println("Output for testFlipCaseInSubstring4:");
		mystring.setString("I am unsure what to look for on these exceptions....other than they pass!!");
		mystring.flipCaseInSubstring(1, 76);
		assertEquals("I AM UNSURE WHAT TO LOOK FOR ON THESE EXCEPTIONS....OTHER THAN THEY PASS!!", mystring.getString());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testFlipCaseInSubstring5() {
		System.out.println("Output for testFlipCaseInSubstring5:");
		mystring.setString("I am unsure what to look for on these exceptions....other than they pass!!");
		mystring.flipCaseInSubstring(3, 2);
		assertEquals("I AM UNSURE WHAT TO LOOK FOR ON THESE EXCEPTIONS....OTHER THAN THEY PASS!!", mystring.getString());
	}
	
	@Test
	public void testFlipCaseInSubstring6() {
		System.out.println("Expected output for testFlipCaseInSubstring6: aBc");
		mystring.setString("abc");
		mystring.flipCaseInSubstring(2, 2);
		assertEquals("aBc", mystring.getString());	
	}
}
