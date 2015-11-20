package net.unikit.database.external.implementations;

import net.unikit.database.external.interfaces.entities.CourseLectureModel;
import net.unikit.database.external.interfaces.managers.CourseLectureModelManager;
import net.unikit.database.external.interfaces.managers.DidacticUnitModelManager;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by Andreas on 20.11.2015.
 */
final class CourseLectureModelManagerImpl
        extends AbstractModelManagerImpl<CourseLectureModel, Integer, CourseLectureModelImpl, Integer>
        implements CourseLectureModelManager {
    private DidacticUnitModelManager didacticUnitManager;

    private CourseLectureModelManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
        this.didacticUnitManager = DidacticUnitModelManagerImpl.create(sessionFactory);
    }

    public static CourseLectureModelManager create(SessionFactory sessionFactory) {
        return new CourseLectureModelManagerImpl(sessionFactory);
    }

    @Override
    public CourseLectureModel createEntity() {
        return new CourseLectureModelImpl();
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
        return CourseLectureModelImpl.class;
    }

    @Override
    public List<CourseLectureModel> getAllEntities() {
        List<CourseLectureModel> allEntities = super.getAllEntities();
        for (CourseLectureModel entity : allEntities) {
            CourseLectureModelImpl entityImpl = (CourseLectureModelImpl) entity;
            DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
            entityImpl.setDidacticUnitModel(didacticUnitImpl);
        }
        return allEntities;
    }

    @Override
    public CourseLectureModel getEntity(Integer id) {
        CourseLectureModel entity = super.getEntity(id);
        CourseLectureModelImpl entityImpl = (CourseLectureModelImpl) entity;
        DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
        entityImpl.setDidacticUnitModel(didacticUnitImpl);
        return entity;
    }

    @Override
    public void updateEntity(CourseLectureModel entity) {
        CourseLectureModelImpl entityImpl = (CourseLectureModelImpl) entity;
        DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
        entityImpl.setDidacticUnitModel(didacticUnitImpl);
        super.updateEntity(entity);
    }

    @Override
    public void deleteEntity(CourseLectureModel entity) {
        CourseLectureModelImpl entityImpl = (CourseLectureModelImpl) entity;
        DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
        entityImpl.setDidacticUnitModel(didacticUnitImpl);
        super.deleteEntity(entity);
    }

    @Override
    public Integer addEntity(CourseLectureModel entity) {
        CourseLectureModelImpl entityImpl = (CourseLectureModelImpl) entity;
        DidacticUnitModelImpl didacticUnitImpl = (DidacticUnitModelImpl) didacticUnitManager.getEntity(entityImpl.getIdField());
        entityImpl.setDidacticUnitModel(didacticUnitImpl);
        return super.addEntity(entity);
    }

    @Override
    protected void updateDatabaseFields(CourseLectureModelImpl entityOld, CourseLectureModelImpl entityNew) {

    }
}
