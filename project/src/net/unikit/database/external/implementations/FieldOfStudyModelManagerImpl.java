package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.FieldOfStudyModel;
import net.unikit.database.external.interfaces.managers.FieldOfStudyModelManager;
import net.unikit.database.implementations.AbstractModelManagerImpl;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class FieldOfStudyModelManagerImpl
        extends AbstractModelManagerImpl<FieldOfStudyModel, Integer, FieldOfStudyModelImpl, Integer>
        implements FieldOfStudyModelManager {
    private FieldOfStudyModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static FieldOfStudyModelManager create(SessionFactory sessionFactory) {
        return new FieldOfStudyModelManagerImpl(sessionFactory);
    }

    @Override
    public FieldOfStudyModel createEntity() {
        return new FieldOfStudyModelImpl();
    }

    @Override
    protected Class getAnnotatedClass() {
        return FieldOfStudyModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(FieldOfStudyModelImpl entityOld, FieldOfStudyModelImpl entityNew) {
        entityOld.setNameField(entityNew.getNameField());
        entityOld.setAbbreviationField(entityNew.getAbbreviationField());
        entityOld.setCourseToFieldOfStudyModels(entityNew.getCourseToFieldOfStudyModels());
        entityOld.setStudentModels(entityNew.getStudentModels());
    }

    @Override
    protected void updateAutogeneratedFields(FieldOfStudyModelImpl entityOld, FieldOfStudyModelImpl entityNew) {
        entityOld.setIdField(entityNew.getIdField());
    }
}
