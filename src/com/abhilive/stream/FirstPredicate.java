package com.abhilive.stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {
	
	public static void main(String... args) {
		Stream<String> streams = Stream.of("one", "two", "three", "four", "five");
		
		Predicate<String> p1 = s -> s.length() > 2;
		
		Predicate<String> p2 = Predicate.isEqual("three");
		
		Predicate<String> p3 = Predicate.isEqual("four");
		
		streams.filter(p1.and(p2).or(p3)).forEach(s -> System.out.println(s));
	}
	
}
