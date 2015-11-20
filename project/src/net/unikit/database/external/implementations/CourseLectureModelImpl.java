package net.unikit.database.external.implementations;

import com.google.common.collect.ImmutableList;
import net.unikit.database.external.interfaces.entities.AppointmentModel;
import net.unikit.database.external.interfaces.entities.CourseLectureModel;
import net.unikit.database.external.interfaces.entities.CourseModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "COURSE_LECTURE")
final class CourseLectureModelImpl implements CourseLectureModel {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int idField;

	@Transient
	private DidacticUnitModelImpl didacticUnitModel;

	public CourseLectureModelImpl() {
	}

	public CourseLectureModelImpl(int idField) {
		this.idField = idField;
	}

	int getIdField() {
		return idField;
	}

	void setIdField(int idField) {
		this.idField = idField;
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
	public List<AppointmentModel> getAppointments() {
		return ImmutableList.copyOf(didacticUnitModel.getAppointmentModels());
	}
}
