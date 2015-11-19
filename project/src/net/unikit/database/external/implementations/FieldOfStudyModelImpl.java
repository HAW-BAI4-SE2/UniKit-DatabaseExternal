package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.FieldOfStudyModel;
import net.unikit.database.external.interfaces.entities.StudentModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "FIELD_OF_STUDY", uniqueConstraints = {
		@UniqueConstraint(columnNames = "abbreviation"), @UniqueConstraint(columnNames = "name") })
final class FieldOfStudyModelImpl implements FieldOfStudyModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer idField;

	@Column(name = "name", unique = true, nullable = false, length = 63)
	private String nameField;

	@Column(name = "abbreviation", unique = true, nullable = false, length = 31)
	private String abbreviationField;

	@OneToMany(mappedBy = "fieldOfStudyField")
	private List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels = new ArrayList<>();

	@OneToMany(mappedBy = "fieldOfStudyField")
	private List<StudentModelImpl> studentModels = new ArrayList<>();

	public FieldOfStudyModelImpl() {
	}

	public FieldOfStudyModelImpl(String nameField, String abbreviationField, List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels, List<StudentModelImpl> studentModels) {
		this.nameField = nameField;
		this.abbreviationField = abbreviationField;
		this.courseToFieldOfStudyModels = courseToFieldOfStudyModels;
		this.studentModels = studentModels;
	}

	Integer getIdField() {
		return idField;
	}

	void setIdField(Integer idField) {
		this.idField = idField;
	}

	String getNameField() {
		return nameField;
	}

	void setNameField(String nameField) {
		this.nameField = nameField;
	}

	String getAbbreviationField() {
		return abbreviationField;
	}

	void setAbbreviationField(String abbreviationField) {
		this.abbreviationField = abbreviationField;
	}

	List<CourseToFieldOfStudyModelImpl> getCourseToFieldOfStudyModels() {
		return courseToFieldOfStudyModels;
	}

	void setCourseToFieldOfStudyModels(List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels) {
		this.courseToFieldOfStudyModels = courseToFieldOfStudyModels;
	}

	List<StudentModelImpl> getStudentModels() {
		return studentModels;
	}

	void setStudentModels(List<StudentModelImpl> studentModels) {
		this.studentModels = studentModels;
	}

	@Transient
	public Integer getId() {
		return null;
	}

	@Transient
	public String getName() {
		return null;
	}

	@Transient
	public void setName(String name) {

	}

	@Transient
	public String getAbbreviation() {
		return null;
	}

	@Transient
	public void setAbbreviation(String abbreviation) {

	}

	@Transient
	public List<StudentModel> getStudents() {
		return null;
	}
}
