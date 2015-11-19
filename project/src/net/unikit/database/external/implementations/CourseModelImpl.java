package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "COURSE", uniqueConstraints = {
		@UniqueConstraint(columnNames = "abbreviation"), @UniqueConstraint(columnNames = "name") })
final class CourseModelImpl implements CourseModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer idField;

	@Column(name = "name", unique = true, nullable = false, length = 63)
	private String nameField;

	@Column(name = "abbreviation", unique = true, nullable = false, length = 31)
	private String abbreviationField;

	@Column(name = "semester")
	private Integer semesterField;

	@Column(name = "min_team_size", nullable = false)
	private int minTeamSizeField;

	@Column(name = "max_team_size", nullable = false)
	private int maxTeamSizeField;

	@OneToMany(mappedBy = "courseField")
	private List<DidacticUnitModelImpl> didacticUnitModels = new ArrayList<>();

	@OneToMany(mappedBy = "courseField")
	private List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels = new ArrayList<>();

	@OneToMany(mappedBy = "courseField")
	private List<CompletedCourseModelImpl> completedCourseModels = new ArrayList<>();

	public CourseModelImpl() {
	}

	public CourseModelImpl(String nameField, String abbreviationField, Integer semesterField, int minTeamSizeField, int maxTeamSizeField, List<DidacticUnitModelImpl> didacticUnitModels, List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels, List<CompletedCourseModelImpl> completedCourseModels) {
		this.nameField = nameField;
		this.abbreviationField = abbreviationField;
		this.semesterField = semesterField;
		this.minTeamSizeField = minTeamSizeField;
		this.maxTeamSizeField = maxTeamSizeField;
		this.didacticUnitModels = didacticUnitModels;
		this.courseToFieldOfStudyModels = courseToFieldOfStudyModels;
		this.completedCourseModels = completedCourseModels;
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

	Integer getSemesterField() {
		return semesterField;
	}

	void setSemesterField(Integer semesterField) {
		this.semesterField = semesterField;
	}

	int getMinTeamSizeField() {
		return minTeamSizeField;
	}

	void setMinTeamSizeField(int minTeamSizeField) {
		this.minTeamSizeField = minTeamSizeField;
	}

	int getMaxTeamSizeField() {
		return maxTeamSizeField;
	}

	void setMaxTeamSizeField(int maxTeamSizeField) {
		this.maxTeamSizeField = maxTeamSizeField;
	}

	List<DidacticUnitModelImpl> getDidacticUnitModels() {
		return didacticUnitModels;
	}

	void setDidacticUnitModels(List<DidacticUnitModelImpl> didacticUnitModels) {
		this.didacticUnitModels = didacticUnitModels;
	}

	List<CourseToFieldOfStudyModelImpl> getCourseToFieldOfStudyModels() {
		return courseToFieldOfStudyModels;
	}

	void setCourseToFieldOfStudyModels(List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels) {
		this.courseToFieldOfStudyModels = courseToFieldOfStudyModels;
	}

	List<CompletedCourseModelImpl> getCompletedCourseModels() {
		return completedCourseModels;
	}

	void setCompletedCourseModels(List<CompletedCourseModelImpl> completedCourseModels) {
		this.completedCourseModels = completedCourseModels;
	}
}
