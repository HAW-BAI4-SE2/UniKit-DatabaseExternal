package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseToFieldOfStudyModel;

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
}
