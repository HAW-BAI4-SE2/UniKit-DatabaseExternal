package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.CourseToFieldOfStudyModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "COURSE_TO_FIELD_OF_STUDY", uniqueConstraints = @UniqueConstraint(columnNames = {
		"course_id", "field_of_study_id" }) )
public class CourseToFieldOfStudyModelImpl implements CourseToFieldOfStudyModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "course_id", nullable = false)
	private int courseId;

	@Column(name = "field_of_study_id", nullable = false)
	private int fieldOfStudyId;
}
