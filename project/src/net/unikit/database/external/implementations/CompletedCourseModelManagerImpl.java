package net.unikit.database.external.implementations;

import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CompletedCourseModelManagerImpl
        extends AbstractModelManagerImpl<CompletedCourseModel, Integer, CompletedCourseModelImpl, Integer>
        implements CompletedCourseModelManager {
    private CompletedCourseModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static CompletedCourseModelManager create(SessionFactory sessionFactory) {
        return new CompletedCourseModelManagerImpl(sessionFactory);
    }

    @Override
    public CompletedCourseModel createEntity() {
        return null;
    }

    @Override
    protected Integer createIdFromBaseIdType(Integer id) {
        return null;
    }

    @Override
    protected Integer createBaseIdFromIdType(Integer id) {
        return null;
    }

    @Override
    protected Class getAnnotatedClass() {
        return null;
    }

    @Override
    protected void updateDatabaseFields(CompletedCourseModelImpl entityOld, CompletedCourseModelImpl entityNew) {

    }
}
