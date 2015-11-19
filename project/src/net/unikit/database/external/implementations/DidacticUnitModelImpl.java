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
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private CourseModelImpl course;

	@OneToMany(mappedBy = "didacticUnitField")
	private List<AppointmentModelImpl> appointmentModels = new ArrayList<>();
}
