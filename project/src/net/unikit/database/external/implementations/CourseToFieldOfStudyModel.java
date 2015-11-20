package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.AbstractModel;
import net.unikit.database.external.interfaces.entities.CourseModel;
import net.unikit.database.external.interfaces.entities.FieldOfStudyModel;

/**
 * Created by Andreas on 19.11.2015.
 */
interface CourseToFieldOfStudyModel extends AbstractModel<Integer> {
    Integer getId();

    CourseModel getCourse();
    void setCourse(CourseModel course);

    FieldOfStudyModel getFieldOfStudy();
    void setFieldOfStudy(FieldOfStudyModel fieldOfStudy);
}
