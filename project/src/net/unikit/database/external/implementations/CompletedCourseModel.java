package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.AbstractModel;
import net.unikit.database.external.interfaces.entities.CourseModel;
import net.unikit.database.external.interfaces.entities.StudentModel;

/**
 * A model for a completed course.
 * A completed course is created if a student has taken the required activity for the course.
 * @author Andreas Berks
 * @since 1.2.1
 */
interface CompletedCourseModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    /**
     * Getter for the student who completed the course.
     * @return The student who completed the course
     */
    StudentModel getStudent();

    /**
     * Setter for the student who completed the course.
     * @param student The student who completed the course
     */
    void setStudent(StudentModel student);

    /**
     * Getter for the course which is completed by the student.
     * @return The course which is completed by the student
     */
    CourseModel getCourse();

    /**
     * Setter for the course which is completed by the student.
     * @param course The course which is completed by the student
     */
    void setCourse(CourseModel course);
}
