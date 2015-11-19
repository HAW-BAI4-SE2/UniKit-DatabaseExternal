package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.DidacticUnitModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIDACTIC_UNIT")
public class DidacticUnitModelImpl implements DidacticUnitModel {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "course_id", nullable = false)
	private int courseId;
}
