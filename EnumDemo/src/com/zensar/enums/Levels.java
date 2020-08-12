package com.zensar.enums;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Levels {
	HIGH, MEDIUM, LOW;
	
	private static final List<Levels> values = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = values.size();
	private static final Random r1 = new Random();
	
	public static Levels randomLevel()
	{
		return values.get(r1.nextInt(SIZE));
	}

}
