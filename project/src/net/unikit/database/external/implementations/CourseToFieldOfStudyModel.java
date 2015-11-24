package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.AbstractModel;
import net.unikit.database.external.interfaces.entities.CourseModel;
import net.unikit.database.external.interfaces.entities.FieldOfStudyModel;

/**
 * A model to assign a field of study to a course.
 * @author Andreas Berks
 * @since 1.2.1
 */
interface CourseToFieldOfStudyModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    /**
     * Getter for the course.
     * @return The course
     */
    CourseModel getCourse();

    /**
     * Setter for the course.
     * @param course The course
     */
    void setCourse(CourseModel course);

    /**
     * Getter for the field of study.
     * @return The field of study
     */
    FieldOfStudyModel getFieldOfStudy();

    /**
     * Setter for the field of study.
     * @param fieldOfStudy The field of study
     */
    void setFieldOfStudy(FieldOfStudyModel fieldOfStudy);
}
