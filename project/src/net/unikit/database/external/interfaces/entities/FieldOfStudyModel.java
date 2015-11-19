package net.unikit.database.external.interfaces.entities;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface FieldOfStudyModel extends AbstractModel {
    Integer getId();

    String getName();
    void setName(String name);

    String getAbbreviation();
    void setAbbreviation(String abbreviation);
}
