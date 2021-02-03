package com.chiennd.cleancode.strategy;

import org.springframework.data.domain.Sort;

public class SortCourseByOpenedStrategy implements SortCourseStrategy {

	@Override
	public Sort getSort() {
		return Sort.by(Sort.Direction.DESC, "opened");
	}
}
