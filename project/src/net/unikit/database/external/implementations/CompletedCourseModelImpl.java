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
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "student_number", nullable = false)
	private StudentModelImpl student;

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private CourseModelImpl course;
}
