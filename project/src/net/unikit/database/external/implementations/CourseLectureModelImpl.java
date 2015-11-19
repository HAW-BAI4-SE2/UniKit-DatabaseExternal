package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseLectureModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE_LECTURE")
final class CourseLectureModelImpl implements CourseLectureModel {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	private int idField;

	public CourseLectureModelImpl() {
	}

	public CourseLectureModelImpl(int idField) {
		this.idField = idField;
	}

	int getIdField() {
		return idField;
	}

	void setIdField(int idField) {
		this.idField = idField;
	}
}
