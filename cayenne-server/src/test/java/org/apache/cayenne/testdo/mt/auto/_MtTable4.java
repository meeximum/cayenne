package org.apache.cayenne.testdo.mt.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.mt.MtTable5;

/**
 * Class _MtTable4 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MtTable4 extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<List<MtTable5>> TABLE5S = Property.create("table5s", List.class);

    public void addToTable5s(MtTable5 obj) {
        addToManyTarget("table5s", obj, true);
    }
    public void removeFromTable5s(MtTable5 obj) {
        removeToManyTarget("table5s", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<MtTable5> getTable5s() {
        return (List<MtTable5>)readProperty("table5s");
    }


}
