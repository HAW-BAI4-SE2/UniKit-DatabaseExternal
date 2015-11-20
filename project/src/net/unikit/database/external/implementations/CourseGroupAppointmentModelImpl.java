package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseGroupAppointmentModel;
import net.unikit.database.external.interfaces.entities.CourseGroupModel;

import java.util.Date;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "APPOINTMENT", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "course_group_id", "end_date" }),
		@UniqueConstraint(columnNames = { "course_group_id", "start_date" }) })
final class CourseGroupAppointmentModelImpl implements CourseGroupAppointmentModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer idField;

	@ManyToOne
	@JoinColumn(name = "course_group_id", nullable = false)
	private CourseGroupModelImpl courseGroupField;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false, length = 19)
	private Date startDateField;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false, length = 19)
	private Date endDateField;

	public CourseGroupAppointmentModelImpl() {
	}

	public CourseGroupAppointmentModelImpl(CourseGroupModelImpl courseGroupField, Date startDateField, Date endDateField) {
		this.courseGroupField = courseGroupField;
		this.startDateField = startDateField;
		this.endDateField = endDateField;
	}

	Integer getIdField() {
		return idField;
	}

	void setIdField(Integer idField) {
		this.idField = idField;
	}

	CourseGroupModelImpl getCourseGroupField() {
		return courseGroupField;
	}

	void setCourseGroupField(CourseGroupModelImpl courseGroupField) {
		this.courseGroupField = courseGroupField;
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
	public CourseGroupModel getCourseGroup() {
		return getCourseGroupField();
	}

	@Transient
	public void setCourseGroup(CourseGroupModel courseGroup) {
		setCourseGroupField((CourseGroupModelImpl) courseGroup);
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
