package net.unikit.database.external.implementations;

import com.google.common.collect.ImmutableList;
import net.unikit.database.external.interfaces.entities.CourseGroupAppointmentModel;
import net.unikit.database.external.interfaces.entities.CourseLectureAppointmentModel;
import net.unikit.database.external.interfaces.entities.CourseLectureModel;
import net.unikit.database.external.interfaces.entities.CourseModel;
import net.unikit.database.implementations.AbstractModelImpl;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "COURSE_LECTURE")
final class CourseLectureModelImpl extends AbstractModelImpl<Integer> implements CourseLectureModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer idField;

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private CourseModelImpl courseField;

	@OneToMany(mappedBy = "courseLectureField")
	private List<CourseLectureAppointmentModelImpl> appointmentModels = new ArrayList<>();

	public CourseLectureModelImpl() {
	}

	public CourseLectureModelImpl(CourseModelImpl courseField) {
		this.courseField = courseField;
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

	List<CourseLectureAppointmentModelImpl> getAppointmentModels() {
		return appointmentModels;
	}

	void setAppointmentModels(List<CourseLectureAppointmentModelImpl> appointmentModels) {
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
	public List<CourseLectureAppointmentModel> getAppointments() {
		return ImmutableList.copyOf(getAppointmentModels());
	}
}
