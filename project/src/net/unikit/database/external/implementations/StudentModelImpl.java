package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.StudentModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "STUDENT", uniqueConstraints = @UniqueConstraint(columnNames = "email") )
public class StudentModelImpl implements StudentModel {
	@Id
	@Column(name = "student_number", unique = true, nullable = false, length = 31)
	private String studentNumber;

	@Column(name = "first_name", nullable = false, length = 63)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 63)
	private String lastName;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "field_of_study_id", nullable = false)
	private int fieldOfStudyId;

	@Column(name = "semester", nullable = false)
	private int semester;
}
