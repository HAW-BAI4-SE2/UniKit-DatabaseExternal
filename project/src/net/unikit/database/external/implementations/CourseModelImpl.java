package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "COURSE", uniqueConstraints = {
		@UniqueConstraint(columnNames = "abbreviation"), @UniqueConstraint(columnNames = "name") })
final class CourseModelImpl implements CourseModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", unique = true, nullable = false, length = 63)
	private String name;

	@Column(name = "abbreviation", unique = true, nullable = false, length = 31)
	private String abbreviation;

	@Column(name = "semester")
	private Integer semester;

	@Column(name = "min_team_size", nullable = false)
	private int minTeamSize;

	@Column(name = "max_team_size", nullable = false)
	private int maxTeamSize;

	@OneToMany(mappedBy = "courseField")
	private List<DidacticUnitModelImpl> didacticUnitModels = new ArrayList<>();

	@OneToMany(mappedBy = "courseField")
	private List<CourseToFieldOfStudyModelImpl> courseToFieldOfStudyModels = new ArrayList<>();

	@OneToMany(mappedBy = "courseField")
	private List<CompletedCourseModelImpl> completedCourseModels = new ArrayList<>();
}
