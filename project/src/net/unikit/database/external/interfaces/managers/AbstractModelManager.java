package net.unikit.database.external.interfaces.managers;

import java.util.List;

/**
 * Created by Andreas on 19.11.2015.
 */
public interface AbstractModelManager<EntityType, IdType> {
    List<EntityType> getAllEntities();
    EntityType getEntity(IdType id);
    void updateEntity(EntityType entity);
    void deleteEntity(EntityType entity);
    IdType addEntity(EntityType entity);
    EntityType createEntity();
}
