package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.DidacticUnitModel;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "DIDACTIC_UNIT")
final class DidacticUnitModelImpl implements DidacticUnitModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer idField;

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private CourseModelImpl courseField;

	@OneToMany(mappedBy = "didacticUnitField")
	private List<AppointmentModelImpl> appointmentModels = new ArrayList<>();

	public DidacticUnitModelImpl() {
	}

	public DidacticUnitModelImpl(CourseModelImpl courseField, List<AppointmentModelImpl> appointmentModels) {
		this.courseField = courseField;
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

	List<AppointmentModelImpl> getAppointmentModels() {
		return appointmentModels;
	}

	void setAppointmentModels(List<AppointmentModelImpl> appointmentModels) {
		this.appointmentModels = appointmentModels;
	}
}
