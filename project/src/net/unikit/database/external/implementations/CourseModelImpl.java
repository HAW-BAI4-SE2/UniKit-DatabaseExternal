package net.unikit.database.external.implementations;

import com.google.common.collect.ImmutableList;
import net.unikit.database.external.interfaces.entities.*;

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

	@OneToOne(mappedBy = "courseField")
	private CourseLectureModelImpl courseLectureField;

	@OneToMany(mappedBy = "courseField")
	private List<CourseGroupModelImpl> courseGroupModels = new ArrayList<>();

	@OneToMany(mappedBy = "courseField")
	private List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels = new ArrayList<>();

	@OneToMany(mappedBy = "courseField")
	private List<CompletedCourseModelImpl> completedCourseModels = new ArrayList<>();

	public CourseModelImpl() {
	}

	public CourseModelImpl(String nameField, String abbreviationField, Integer semesterField, int minTeamSizeField, int maxTeamSizeField, CourseLectureModelImpl courseLectureField, List<CourseGroupModelImpl> courseGroupModels, List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels, List<CompletedCourseModelImpl> completedCourseModels) {
		this.nameField = nameField;
		this.abbreviationField = abbreviationField;
		this.semesterField = semesterField;
		this.minTeamSizeField = minTeamSizeField;
		this.maxTeamSizeField = maxTeamSizeField;
		this.courseLectureField = courseLectureField;
		this.courseGroupModels = courseGroupModels;
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

	public CourseLectureModelImpl getCourseLectureField() {
		return courseLectureField;
	}

	public void setCourseLectureField(CourseLectureModelImpl courseLectureField) {
		this.courseLectureField = courseLectureField;
	}

	List<CourseGroupModelImpl> getCourseGroupModels() {
		return courseGroupModels;
	}

	void setCourseGroupModels(List<CourseGroupModelImpl> courseGroupModels) {
		this.courseGroupModels = courseGroupModels;
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

	@Transient
	public Integer getId() {
		return getIdField();
	}

	@Transient
	public String getName() {
		return getNameField();
	}

	@Transient
	public void setName(String name) {
		setNameField(name);
	}

	@Transient
	public String getAbbreviation() {
		return getAbbreviationField();
	}

	@Transient
	public void setAbbreviation(String abbreviation) {
		setAbbreviationField(abbreviation);
	}

	@Transient
	public Integer getSemester() {
		return getSemesterField();
	}

	@Transient
	public void setSemester(Integer semester) {
		setSemesterField(semester);
	}

	@Transient
	public int getMinTeamSize() {
		return getMinTeamSizeField();
	}

	@Transient
	public void setMinTeamSize(int minTeamSize) {
		setMinTeamSizeField(minTeamSize);
	}

	@Transient
	public int getMaxTeamSize() {
		return getMaxTeamSizeField();
	}

	@Transient
	public void setMaxTeamSize(int maxTeamSize) {
		setMaxTeamSizeField(maxTeamSize);
	}

	@Transient
	public CourseLectureModel getCourseLecture() {
		return getCourseLectureField();
	}

	@Transient
	public List<CourseGroupModel> getCourseGroups() {
		return ImmutableList.copyOf(getCourseGroupModels());
	}

	@Transient
	public List<FieldOfStudyModel> getFieldOfStudies() {
		ImmutableList.Builder<FieldOfStudyModel> builder = ImmutableList.builder();
		for (CourseToFieldOfStudyModel courseToFieldOfStudy : getCourseToFieldOfStudyModels()) {
			builder.add(courseToFieldOfStudy.getFieldOfStudy());
		}
		return builder.build();
	}
}
