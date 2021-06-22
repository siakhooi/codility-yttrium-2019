package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractYttrium2021Test {
	abstract Yttrium2021Interface getTestObject();

	@Test
	void test01() {
		String S = "abaacbca";
		int K = 2;
		int E = 3;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	void test02() {
		String S = "aabcabc";
		int K = 1;
		int E = 5;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	void test03() {
		String S = "zaaaa";
		int K = 1;
		int E = 1;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	void test04() {
		String S = "aaaa";
		int K = 2;
		int E = -1;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	@DisplayName("K=0")
	void test05() {
		String S = "aaaa";
		int K = 0;
		int E = 4;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	@DisplayName("K>N")
	void test06() {
		String S = "abcd";
		int K = 6;
		int E = -1;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	@DisplayName("Not Remove Smallest")
	void test07() {
		String S = "aabbbbbbbcccddd";
		int K = 2;
		int E = 6;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	@DisplayName("Not Remove Second Smallest")
	void test08() {
		String S = "aaabbbbbbbccdddd";
		int K = 2;
		int E = 6;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	@DisplayName("A-ZA-Z")
	void test09a() {
		String S = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		int K = 2;
		int E = 50;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	@DisplayName("A-Z-A")
	void test09b() {
		String S = "abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba";
		int K = 2;
		int E = 48;

		assertEquals(E, getTestObject().solution(S, K));
	}

	@Test
	@DisplayName("A-ZA-Z")
	void test09c() {
		String S = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm";
		int K = 2;
		int E = 50;

		assertEquals(E, getTestObject().solution(S, K));
	}
}
