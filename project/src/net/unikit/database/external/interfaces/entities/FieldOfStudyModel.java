package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * A model for a field of study.
 * @author Andreas Berks
 * @since 1.2.1
 */
public interface FieldOfStudyModel extends AbstractModel<Integer> {
    /**
     * Getter for the internal identifier in the database.
     * @return The internal identifier in the database
     */
    Integer getId();

    /**
     * Getter for the name of the course.
     * @return The name of the course
     */
    String getName();

    /**
     * Setter for the name of the course.
     * @param name The name of the course
     */
    void setName(String name);

    /**
     * Getter for the abbreviation of the course.
     * @return The abbreviation of the course
     */
    String getAbbreviation();

    /**
     * Setter for the abbreviation of the course.
     * @param abbreviation The abbreviation of the course
     */
    void setAbbreviation(String abbreviation);
}
