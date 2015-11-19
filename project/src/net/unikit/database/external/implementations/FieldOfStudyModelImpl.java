package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.FieldOfStudyModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "FIELD_OF_STUDY", uniqueConstraints = {
		@UniqueConstraint(columnNames = "abbreviation"), @UniqueConstraint(columnNames = "name") })
public class FieldOfStudyModelImpl implements FieldOfStudyModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", unique = true, nullable = false, length = 63)
	private String name;

	@Column(name = "abbreviation", unique = true, nullable = false, length = 31)
	private String abbreviation;
}
