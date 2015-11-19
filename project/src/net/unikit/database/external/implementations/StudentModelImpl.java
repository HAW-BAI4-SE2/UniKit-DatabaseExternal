package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseModel;
import net.unikit.database.external.interfaces.entities.FieldOfStudyModel;
import net.unikit.database.external.interfaces.entities.StudentModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "STUDENT", uniqueConstraints = @UniqueConstraint(columnNames = "email") )
final class StudentModelImpl implements StudentModel {
	@Id
	@Column(name = "student_number", unique = true, nullable = false, length = 31)
	private String studentNumberField;

	@Column(name = "first_name", nullable = false, length = 63)
	private String firstNameField;

	@Column(name = "last_name", nullable = false, length = 63)
	private String lastNameField;

	@Column(name = "email", unique = true, nullable = false)
	private String emailField;

	@ManyToOne
	@JoinColumn(name = "field_of_study_id", nullable = false)
	private FieldOfStudyModelImpl fieldOfStudyField;

	@Column(name = "semester", nullable = false)
	private int semesterField;

	@OneToMany(mappedBy = "studentField")
	private List<CompletedCourseModelImpl> completedCourseModels = new ArrayList<>();

	public StudentModelImpl() {
	}

	public StudentModelImpl(String studentNumberField, String firstNameField, String lastNameField, String emailField, FieldOfStudyModelImpl fieldOfStudyField, int semesterField, List<CompletedCourseModelImpl> completedCourseModels) {
		this.studentNumberField = studentNumberField;
		this.firstNameField = firstNameField;
		this.lastNameField = lastNameField;
		this.emailField = emailField;
		this.fieldOfStudyField = fieldOfStudyField;
		this.semesterField = semesterField;
		this.completedCourseModels = completedCourseModels;
	}

	String getStudentNumberField() {
		return studentNumberField;
	}

	void setStudentNumberField(String studentNumberField) {
		this.studentNumberField = studentNumberField;
	}

	String getFirstNameField() {
		return firstNameField;
	}

	void setFirstNameField(String firstNameField) {
		this.firstNameField = firstNameField;
	}

	String getLastNameField() {
		return lastNameField;
	}

	void setLastNameField(String lastNameField) {
		this.lastNameField = lastNameField;
	}

	String getEmailField() {
		return emailField;
	}

	void setEmailField(String emailField) {
		this.emailField = emailField;
	}

	FieldOfStudyModelImpl getFieldOfStudyField() {
		return fieldOfStudyField;
	}

	void setFieldOfStudyField(FieldOfStudyModelImpl fieldOfStudyField) {
		this.fieldOfStudyField = fieldOfStudyField;
	}

	int getSemesterField() {
		return semesterField;
	}

	void setSemesterField(int semesterField) {
		this.semesterField = semesterField;
	}

	List<CompletedCourseModelImpl> getCompletedCourseModels() {
		return completedCourseModels;
	}

	void setCompletedCourseModels(List<CompletedCourseModelImpl> completedCourseModels) {
		this.completedCourseModels = completedCourseModels;
	}

	@Transient
	public String getStudentNumber() {
		return null;
	}

	@Transient
	public void setStudentNumber(String studentNumber) {

	}

	@Transient
	public String getFirstName() {
		return null;
	}

	@Transient
	public void setFirstName(String firstName) {

	}

	@Transient
	public String getLastName() {
		return null;
	}

	@Transient
	public void setLastName(String lastName) {

	}

	@Transient
	public String getEmail() {
		return null;
	}

	@Transient
	public void setEmail(String email) {

	}

	@Transient
	public FieldOfStudyModel getFieldOfStudy() {
		return null;
	}

	@Transient
	public void setFieldOfStudy(FieldOfStudyModel fieldOfStudy) {

	}

	@Transient
	public int getSemester() {
		return 0;
	}

	@Transient
	public void setSemester(int semester) {

	}

	@Transient
	public List<CourseModel> getCompletedCourses() {
		return null;
	}
}
