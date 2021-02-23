package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	public GridExamConsole() {
	}

	@Override
	public void print() {
		System.out.println("grid");
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
