package org.apache.cayenne.testdo.inherit.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.testdo.inherit.SubEntity;

/**
 * Class _DirectToSubEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DirectToSubEntity extends CayenneDataObject {

    public static final String SUB_ENTITIES_PROPERTY = "subEntities";

    public static final String ID_PK_COLUMN = "ID";

    public void addToSubEntities(SubEntity obj) {
        addToManyTarget(SUB_ENTITIES_PROPERTY, obj, true);
    }
    public void removeFromSubEntities(SubEntity obj) {
        removeToManyTarget(SUB_ENTITIES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<SubEntity> getSubEntities() {
        return (List<SubEntity>)readProperty(SUB_ENTITIES_PROPERTY);
    }


}