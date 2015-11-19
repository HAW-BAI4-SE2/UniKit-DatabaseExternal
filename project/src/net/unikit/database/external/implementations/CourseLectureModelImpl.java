package net.unikit.database.external.implementations;

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
	public List<AppointmentModel> getAppointments() {
		return null;
	}
}
