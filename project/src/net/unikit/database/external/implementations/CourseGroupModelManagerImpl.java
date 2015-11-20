package net.unikit.database.external.implementations;

import com.google.common.collect.ImmutableList;
import net.unikit.database.external.interfaces.entities.CourseGroupModel;
import net.unikit.database.external.interfaces.managers.CourseGroupModelManager;
import net.unikit.database.external.interfaces.managers.DidacticUnitModelManager;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CourseGroupModelManagerImpl
        extends AbstractModelManagerImpl<CourseGroupModel, Integer, CourseGroupModelImpl, Integer>
        implements CourseGroupModelManager {
    private DidacticUnitModelManager didacticUnitManager;

    private CourseGroupModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
        this.didacticUnitManager = DidacticUnitModelManagerImpl.create(sessionFactory);
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

    @Override
    public List<CourseGroupModel> getAllEntities() {
        List<CourseGroupModel> allEntities = super.getAllEntities();
        for (CourseGroupModel entity : allEntities) {
            CourseGroupModelImpl entityImpl = (CourseGroupModelImpl) entity;
            DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
            entityImpl.setDidacticUnitModel(didacticUnitImpl);
        }
        return allEntities;
    }

    @Override
    public CourseGroupModel getEntity(Integer id) {
        CourseGroupModel entity = super.getEntity(id);
        CourseGroupModelImpl entityImpl = (CourseGroupModelImpl) entity;
        DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
        entityImpl.setDidacticUnitModel(didacticUnitImpl);
        return entity;
    }

    @Override
    public void updateEntity(CourseGroupModel entity) {
        CourseGroupModelImpl entityImpl = (CourseGroupModelImpl) entity;
        DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
        entityImpl.setDidacticUnitModel(didacticUnitImpl);
        super.updateEntity(entity);
    }

    @Override
    public void deleteEntity(CourseGroupModel entity) {
        CourseGroupModelImpl entityImpl = (CourseGroupModelImpl) entity;
        DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
        entityImpl.setDidacticUnitModel(didacticUnitImpl);
        super.deleteEntity(entity);
    }

    @Override
    public Integer addEntity(CourseGroupModel entity) {
        CourseGroupModelImpl entityImpl = (CourseGroupModelImpl) entity;
        DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
        entityImpl.setDidacticUnitModel(didacticUnitImpl);
        return super.addEntity(entity);
    }
}
