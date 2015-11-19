package net.unikit.database.external.implementations;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "COURSE_TO_FIELD_OF_STUDY", uniqueConstraints = @UniqueConstraint(columnNames = {
		"course_id", "field_of_study_id" }) )
final class CourseToFieldOfStudyModelImpl implements CourseToFieldOfStudyModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer idField;

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private CourseModelImpl courseField;

	@ManyToOne
	@JoinColumn(name = "field_of_study_id", nullable = false)
	private FieldOfStudyModelImpl fieldOfStudyField;

	public CourseToFieldOfStudyModelImpl() {
	}

	public CourseToFieldOfStudyModelImpl(CourseModelImpl courseField, FieldOfStudyModelImpl fieldOfStudyField) {
		this.courseField = courseField;
		this.fieldOfStudyField = fieldOfStudyField;
	}

	Integer getIdField() {
		return idField;
	}

	void setIdField(Integer idField) {
		this.idField = idField;
	}

	CourseModelImpl getCourseField() {
		return courseField;
	}

	void setCourseField(CourseModelImpl courseField) {
		this.courseField = courseField;
	}

	FieldOfStudyModelImpl getFieldOfStudyField() {
		return fieldOfStudyField;
	}

	void setFieldOfStudyField(FieldOfStudyModelImpl fieldOfStudyField) {
		this.fieldOfStudyField = fieldOfStudyField;
	}
}
