package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.AppointmentModel;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "APPOINTMENT", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "didactic_unit_id", "end_date" }),
		@UniqueConstraint(columnNames = { "didactic_unit_id", "start_date" }) })
public class AppointmentModelImpl implements AppointmentModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "didactic_unit_id", nullable = false)
	private int didacticUnitId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false, length = 19)
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false, length = 19)
	private Date endDate;
}
