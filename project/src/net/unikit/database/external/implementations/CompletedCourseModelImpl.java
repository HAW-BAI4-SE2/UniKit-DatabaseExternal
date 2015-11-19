package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.CompletedCourseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPLETED_COURSE")
public class CompletedCourseModelImpl implements CompletedCourseModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "student_number", nullable = false, length = 31)
	private String studentNumber;

	@Column(name = "course_id", nullable = false)
	private int courseId;
}
