package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseGroupModel;
import net.unikit.database.external.interfaces.managers.CourseGroupModelManager;
import org.hibernate.SessionFactory;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CourseGroupModelManagerImpl
        extends AbstractModelManagerImpl<CourseGroupModel, Integer, CourseGroupModelImpl, Integer>
        implements CourseGroupModelManager {
    private CourseGroupModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public static CourseGroupModelManager create(SessionFactory sessionFactory) {
        return new CourseGroupModelManagerImpl(sessionFactory);
    }

    @Override
    public CourseGroupModel createEntity() {
        return new CourseGroupModelImpl();
    }

    @Override
    protected Integer createIdFromBaseIdType(Integer id) {
        return id;
    }

    @Override
    protected Integer createBaseIdFromIdType(Integer id) {
        return id;
    }

    @Override
    protected Class getAnnotatedClass() {
        return CourseGroupModelImpl.class;
    }

    @Override
    protected void updateDatabaseFields(CourseGroupModelImpl entityOld, CourseGroupModelImpl entityNew) {

    }
}
