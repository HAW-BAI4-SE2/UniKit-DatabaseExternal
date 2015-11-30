package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.StudentModel;
import net.unikit.database.external.interfaces.managers.StudentModelManager;
import net.unikit.database.implementations.AbstractModelManagerImpl;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class StudentModelManagerImpl
        extends AbstractModelManagerImpl<StudentModel, String, StudentModelImpl, String>
        implements StudentModelManager {
    private StudentModelManagerImpl(SessionFactory sessionFactory) {
            super(sessionFactory);
    }

    public static StudentModelManager create(SessionFactory sessionFactory) {
        return new StudentModelManagerImpl(sessionFactory);
    }

    @Override
    public StudentModel createEntity() {
        return new StudentModelImpl();
    }

    @Override
    protected String createIdFromBaseIdType(String id) {
        return id;
    }

    @Override
    protected String createBaseIdFromIdType(String id) {
        return id;
    }

    @Override
    protected Class getAnnotatedClass() {
        return StudentModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(StudentModelImpl entityOld, StudentModelImpl entityNew) {
        entityOld.setStudentNumberField(entityNew.getStudentNumberField());
        entityOld.setFirstNameField(entityNew.getFirstNameField());
        entityOld.setLastNameField(entityNew.getLastNameField());
        entityOld.setEmailField(entityNew.getEmailField());
        entityOld.setFieldOfStudyField(entityNew.getFieldOfStudyField());
        entityOld.setSemesterField(entityNew.getSemesterField());
        entityOld.setCompletedCourseModels(entityNew.getCompletedCourseModels());
    }
}
