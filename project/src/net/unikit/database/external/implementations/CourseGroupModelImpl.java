package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.AppointmentModel;
import net.unikit.database.external.interfaces.entities.CourseGroupModel;
import net.unikit.database.external.interfaces.entities.CourseModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "COURSE_GROUP")
final class CourseGroupModelImpl implements CourseGroupModel {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int idField;

	@Column(name = "group_number", nullable = false)
	private int groupNumberField;

	@Column(name = "max_group_size", nullable = false)
	private int maxGroupSizeField;

	public CourseGroupModelImpl() {
	}

	public CourseGroupModelImpl(int idField, int groupNumberField, int maxGroupSizeField) {
		this.idField = idField;
		this.groupNumberField = groupNumberField;
		this.maxGroupSizeField = maxGroupSizeField;
	}

	int getIdField() {
		return idField;
	}

	void setIdField(int idField) {
		this.idField = idField;
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

	@Transient
	public Integer getId() {
		return null;
	}

	@Transient
	public CourseModel getCourse() {
		return null;
	}

	@Transient
	public void setCourse(CourseModel course) {

	}

	@Transient
	public int getGroupNumber() {
		return 0;
	}

	@Transient
	public void setGroupNumber(int groupNumber) {

	}

	@Transient
	public int getMaxGroupSize() {
		return 0;
	}

	@Transient
	public void setMaxGroupSize(int maxGroupSize) {

	}

	@Transient
	public List<AppointmentModel> getAppointments() {
		return null;
	}
}
