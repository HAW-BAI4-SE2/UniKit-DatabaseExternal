package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.AppointmentModel;
import net.unikit.database.external.interfaces.entities.DidacticUnitModel;

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
	private Integer idField;

	@ManyToOne
	@JoinColumn(name = "didactic_unit_id", nullable = false)
	private DidacticUnitModelImpl didacticUnitField;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", nullable = false, length = 19)
	private Date startDateField;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", nullable = false, length = 19)
	private Date endDateField;

	public AppointmentModelImpl() {
	}

	public AppointmentModelImpl(DidacticUnitModelImpl didacticUnitField, Date startDateField, Date endDateField) {
		this.didacticUnitField = didacticUnitField;
		this.startDateField = startDateField;
		this.endDateField = endDateField;
	}

	Integer getIdField() {
		return idField;
	}

	void setIdField(Integer idField) {
		this.idField = idField;
	}

	DidacticUnitModelImpl getDidacticUnitField() {
		return didacticUnitField;
	}

	void setDidacticUnitField(DidacticUnitModelImpl didacticUnitField) {
		this.didacticUnitField = didacticUnitField;
	}

	Date getStartDateField() {
		return startDateField;
	}

	void setStartDateField(Date startDateField) {
		this.startDateField = startDateField;
	}

	Date getEndDateField() {
		return endDateField;
	}

	void setEndDateField(Date endDateField) {
		this.endDateField = endDateField;
	}

	@Transient
	public Integer getId() {
		return null;
	}

	@Transient
	public DidacticUnitModel getDidacticUnit() {
		return null;
	}

	@Transient
	public void setDidacticUnit(DidacticUnitModel didacticUnit) {

	}

	@Transient
	public Date getStartDate() {
		return null;
	}

	@Transient
	public void setStartDate(Date startDate) {

	}

	@Transient
	public Date getEndDate() {
		return null;
	}

	@Transient
	public void setEndDate(Date endDate) {

	}
}
