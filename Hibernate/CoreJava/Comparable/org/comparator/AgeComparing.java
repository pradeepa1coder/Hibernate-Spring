package org.comparator;

import java.util.Comparator;

public class AgeComparing implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;
	}

}
