package net.unikit.database.external.implementations;

import com.google.common.collect.ImmutableList;
import net.unikit.database.external.interfaces.entities.CourseGroupAppointmentModel;
import net.unikit.database.external.interfaces.entities.CourseGroupModel;
import net.unikit.database.external.interfaces.entities.CourseModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "COURSE_GROUP")
final class CourseGroupModelImpl implements CourseGroupModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer idField;

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private CourseModelImpl courseField;

	@Column(name = "group_number", nullable = false)
	private int groupNumberField;

	@Column(name = "max_group_size", nullable = false)
	private int maxGroupSizeField;

	@OneToMany(mappedBy = "courseGroupField")
	private List<CourseGroupAppointmentModelImpl> appointmentModels = new ArrayList<>();

	public CourseGroupModelImpl() {
	}

	public CourseGroupModelImpl(CourseModelImpl courseField, int groupNumberField, int maxGroupSizeField, List<CourseGroupAppointmentModelImpl> appointmentModels) {
		this.courseField = courseField;
		this.groupNumberField = groupNumberField;
		this.maxGroupSizeField = maxGroupSizeField;
		this.appointmentModels = appointmentModels;
	}

	Integer getIdField() {
		return idField;
	}

	void setIdField(Integer idField) {
		this.idField = idField;
	}

	CourseModelImpl getCourseField() {
		return courseField;
	}

	void setCourseField(CourseModelImpl courseField) {
		this.courseField = courseField;
	}

	int getGroupNumberField() {
		return groupNumberField;
	}

	void setGroupNumberField(int groupNumberField) {
		this.groupNumberField = groupNumberField;
	}

	int getMaxGroupSizeField() {
		return maxGroupSizeField;
	}

	void setMaxGroupSizeField(int maxGroupSizeField) {
		this.maxGroupSizeField = maxGroupSizeField;
	}

	List<CourseGroupAppointmentModelImpl> getAppointmentModels() {
		return appointmentModels;
	}

	void setAppointmentModels(List<CourseGroupAppointmentModelImpl> appointmentModels) {
		this.appointmentModels = appointmentModels;
	}

	@Transient
	public Integer getId() {
		return getIdField();
	}

	@Transient
	public CourseModel getCourse() {
		return getCourseField();
	}

	@Transient
	public void setCourse(CourseModel course) {
		setCourseField((CourseModelImpl) course);
	}

	@Transient
	public int getGroupNumber() {
		return getGroupNumberField();
	}

	@Transient
	public void setGroupNumber(int groupNumber) {
		setGroupNumberField(groupNumber);
	}

	@Transient
	public int getMaxGroupSize() {
		return getMaxGroupSizeField();
	}

	@Transient
	public void setMaxGroupSize(int maxGroupSize) {
		setMaxGroupSizeField(maxGroupSize);
	}

	@Transient
	public List<CourseGroupAppointmentModel> getAppointments() {
		return ImmutableList.copyOf(getAppointmentModels());
	}
}
