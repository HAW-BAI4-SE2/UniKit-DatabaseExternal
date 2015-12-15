package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseLectureAppointmentModel;
import net.unikit.database.external.interfaces.entities.CourseLectureModel;
import net.unikit.database.implementations.AbstractModelImpl;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "COURSE_LECTURE_APPOINTMENT", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "course_lecture_id", "end_date" }),
		@UniqueConstraint(columnNames = { "course_lecture_id", "start_date" }) })
final class CourseLectureAppointmentModelImpl extends AbstractModelImpl<Integer> implements CourseLectureAppointmentModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer idField;

	@ManyToOne
	@JoinColumn(name = "course_lecture_id", nullable = false)
	private CourseLectureModelImpl courseLectureField;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false, length = 19)
	private Date startDateField;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false, length = 19)
	private Date endDateField;

	public CourseLectureAppointmentModelImpl() {
	}

	public CourseLectureAppointmentModelImpl(CourseLectureModelImpl courseLectureField, Date startDateField, Date endDateField) {
		this.courseLectureField = courseLectureField;
		this.startDateField = startDateField;
		this.endDateField = endDateField;
	}

	Integer getIdField() {
		return idField;
	}

	void setIdField(Integer idField) {
		this.idField = idField;
	}

	CourseLectureModelImpl getCourseLectureField() {
		return courseLectureField;
	}

	void setCourseLectureField(CourseLectureModelImpl courseLectureField) {
		this.courseLectureField = courseLectureField;
	}

	Date getStartDateField() {
		return startDateField;
	}

	void setStartDateField(Date startDateField) {
		this.startDateField = startDateField;
	}

	Date getEndDateField() {
		return endDateField;
	}

	void setEndDateField(Date endDateField) {
		this.endDateField = endDateField;
	}

	@Transient
	public Integer getId() {
		return getIdField();
	}

	@Transient
	public CourseLectureModel getCourseLecture() {
		return getCourseLectureField();
	}

	@Transient
	public void setCourseLecture(CourseLectureModel courseGroup) {
		setCourseLectureField((CourseLectureModelImpl) courseGroup);
	}

	@Transient
	public Date getStartDate() {
		return getStartDateField();
	}

	@Transient
	public void setStartDate(Date startDate) {
		setStartDateField(startDate);
	}

	@Transient
	public Date getEndDate() {
		return getEndDateField();
	}

	@Transient
	public void setEndDate(Date endDate) {
		setEndDateField(endDate);
	}
}
