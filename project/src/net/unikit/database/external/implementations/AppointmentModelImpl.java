package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.AppointmentModel;

import java.util.Date;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "APPOINTMENT", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "didactic_unit_id", "end_date" }),
		@UniqueConstraint(columnNames = { "didactic_unit_id", "start_date" }) })
final class AppointmentModelImpl implements AppointmentModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "didactic_unit_id", nullable = false)
	private DidacticUnitModelImpl didacticUnit;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false, length = 19)
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false, length = 19)
	private Date endDate;
}
