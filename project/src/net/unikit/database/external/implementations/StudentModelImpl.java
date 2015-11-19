package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.StudentModel;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT", uniqueConstraints = @UniqueConstraint(columnNames = "email") )
final class StudentModelImpl implements StudentModel {
	@Id
	@Column(name = "student_number", unique = true, nullable = false, length = 31)
	private String studentNumber;

	@Column(name = "first_name", nullable = false, length = 63)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 63)
	private String lastName;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@ManyToOne
	@JoinColumn(name = "field_of_study_id", nullable = false)
	private FieldOfStudyModelImpl fieldOfStudy;

	@Column(name = "semester", nullable = false)
	private int semester;
}
