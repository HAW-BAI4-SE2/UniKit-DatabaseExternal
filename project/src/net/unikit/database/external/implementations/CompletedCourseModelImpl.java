package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CompletedCourseModel;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "COMPLETED_COURSE")
final class CompletedCourseModelImpl implements CompletedCourseModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer idField;

	@ManyToOne
	@JoinColumn(name = "student_number", nullable = false)
	private StudentModelImpl studentField;

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private CourseModelImpl courseField;

	public CompletedCourseModelImpl() {
	}

	public CompletedCourseModelImpl(StudentModelImpl studentField, CourseModelImpl courseField) {
		this.studentField = studentField;
		this.courseField = courseField;
	}

	Integer getIdField() {
		return idField;
	}

	void setIdField(Integer idField) {
		this.idField = idField;
	}

	StudentModelImpl getStudentField() {
		return studentField;
	}

	void setStudentField(StudentModelImpl studentField) {
		this.studentField = studentField;
	}

	CourseModelImpl getCourseField() {
		return courseField;
	}

	void setCourseField(CourseModelImpl courseField) {
		this.courseField = courseField;
	}
}
