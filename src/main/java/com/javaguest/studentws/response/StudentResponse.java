package com.javaguest.studentws.response;

import java.util.ArrayList;
import java.util.List;

import com.javaguest.studentws.domain.StudentDO;

public class StudentResponse {

	private int pageNum;
	private int pageSize;
	private int pages;
	private int startRow;
	private int endRow;

	private List<StudentDO> students = null;

	public StudentResponse() {
		if (this.students == null) {
			this.students = new ArrayList<>();
		}
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public List<StudentDO> getStudents() {
		return students;
	}

	public void setStudents(List<StudentDO> students) {
		this.students = students;
	}

}
