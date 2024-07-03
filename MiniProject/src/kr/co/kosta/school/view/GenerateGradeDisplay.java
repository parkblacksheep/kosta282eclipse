package kr.co.kosta.school.view;

import java.util.ArrayList;

import kr.co.kosta.grade.BasicEvaluation;
import kr.co.kosta.grade.GradeEvaluation;
import kr.co.kosta.grade.MajorEvluation;
import kr.co.kosta.grade.PassFailEvaluation;
import kr.co.kosta.school.School;
import kr.co.kosta.school.Score;
import kr.co.kosta.school.Student;
import kr.co.kosta.school.Subject;
import kr.co.kosta.utils.Constant;

public class GenerateGradeDisplay {

	School school = School.getInstance();

	public static final String Title = "과목 학점 결과>>> \n";
	public static final String Line = "=========================================== \n";
	public static final String HEADER = "이름 \t\t 학번\t\t 필수 \t 점수  학점\n ";
	public static final String Line2 = "------------------------------------------\n";

	private StringBuffer buffer = new StringBuffer();

	public String getDisplay() {
		ArrayList<Subject> subjects = school.getSubjects();

		for (Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter(subject);
		}
		return buffer.toString();
	}

	private void makeFooter(Subject subject) {
		buffer.append("\n");
	}

	private void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			if (student.getStudentName().length() >= 6) {
				buffer.append("\t");
			} else {
				buffer.append("\t\t");
			}
			buffer.append(student.getStudentId());
			buffer.append("\t");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append("\t");
			getScoreGrade(student, subject); // 학생별 해당과목 학점 계산
			buffer.append("\n");

		}

	}

	private void makeHeader(Subject subject) {
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.Title);
		buffer.append(GenerateGradeDisplay.Line);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.Line2);

	}

	private void getScoreGrade(Student student, Subject subject) {
		ArrayList<Score> scoreList = student.getScores();
		int majorId = student.getMajorSubject().getSubjectId();

		// 학점 부여 클래스들
		GradeEvaluation[] gradeEvaluations = { new BasicEvaluation(), new MajorEvluation(), new PassFailEvaluation() };

		for (int i = 0; i < scoreList.size(); i++) { // 학생이 가진 점수들
			Score score = scoreList.get(i);
			if (score.getSubject().getSubjectId() == subject.getSubjectId()) {
				String grade;

				if (score.getSubject().getGradeType() == Constant.Golf) {
					grade = gradeEvaluations[Constant.PF_TYPE].getGrade(score.getScore());
				} else {
					if (score.getSubject().getSubjectId() == majorId)
						grade = gradeEvaluations[Constant.SAF_TYPE].getGrade(score.getScore());
					else
						grade = gradeEvaluations[Constant.AF_TYPE].getGrade(score.getScore());

				}
				buffer.append(score.getScore());
				buffer.append("\t");
				buffer.append(grade);
				buffer.append("\t");
			}

		}

	}
}
