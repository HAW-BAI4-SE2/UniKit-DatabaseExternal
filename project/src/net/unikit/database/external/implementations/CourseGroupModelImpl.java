package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.CourseGroupModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE_GROUP")
public class CourseGroupModelImpl implements CourseGroupModel {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "group_number", nullable = false)
	private int groupNumber;

	@Column(name = "max_group_size", nullable = false)
	private int maxGroupSize;
}
