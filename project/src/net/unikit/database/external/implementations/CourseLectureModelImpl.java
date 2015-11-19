package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.CourseLectureModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE_LECTURE")
public class CourseLectureModelImpl implements CourseLectureModel {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int id;
}
