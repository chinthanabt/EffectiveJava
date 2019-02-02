package com.chinthana.effectivejava.chapterone;

import java.math.BigInteger;
import java.util.Random;

public class DefaultCacheDemo {
	public static void main(String... arg) throws Exception {

		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean(true);

		// Getting from cache
		Boolean b3 = Boolean.valueOf(true);
		Boolean b4 = Boolean.valueOf(true);

		System.out.println(b1 == b2);
		System.out.println(b3 == b4);

		// Getting from Integer cache
		Integer i1 = Integer.valueOf(1);
		Integer i2 = Integer.valueOf(1);

		// Getting from Integer cache
		Integer i3 = Integer.valueOf(127);
		Integer i4 = Integer.valueOf(127);

		// Not cached
		Integer i5 = Integer.valueOf(128);
		Integer i6 = Integer.valueOf(128);

		System.out.println(i1 == i2);
		System.out.println(i3 == i4);
		System.out.println(i5 == i6);

		BigInteger probablePrime = BigInteger.probablePrime(3, new Random());
		System.out.println(probablePrime);
	}
}
