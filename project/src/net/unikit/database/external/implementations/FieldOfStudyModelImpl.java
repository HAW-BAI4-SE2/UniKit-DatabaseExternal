package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.FieldOfStudyModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "FIELD_OF_STUDY", uniqueConstraints = {
		@UniqueConstraint(columnNames = "abbreviation"), @UniqueConstraint(columnNames = "name") })
final class FieldOfStudyModelImpl implements FieldOfStudyModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", unique = true, nullable = false, length = 63)
	private String name;

	@Column(name = "abbreviation", unique = true, nullable = false, length = 31)
	private String abbreviation;

	@OneToMany(mappedBy = "fieldOfStudyField")
	private List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels = new ArrayList<>();
}
