package net.unikit.database.external.implementations;

import com.google.common.collect.ImmutableList;
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

	@Transient
	private DidacticUnitModelImpl didacticUnitModel;

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
	public DidacticUnitModelImpl getDidacticUnitModel() {
		return didacticUnitModel;
	}

	@Transient
	public void setDidacticUnitModel(DidacticUnitModelImpl didacticUnitModel) {
		this.didacticUnitModel = didacticUnitModel;
	}

	@Transient
	public Integer getId() {
		return getIdField();
	}

	@Transient
	public CourseModel getCourse() {
		return didacticUnitModel.getCourseField();
	}

	@Transient
	public void setCourse(CourseModel course) {
		didacticUnitModel.setCourseField((CourseModelImpl) course);
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
	public List<AppointmentModel> getAppointments() {
		return ImmutableList.copyOf(didacticUnitModel.getAppointmentModels());
	}
}
