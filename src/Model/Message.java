package Model;

import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b0bdbe5b-2bc2-4785-86e2-35af0ec7746f")
public abstract class Message {
    @objid ("6b610d44-d0f2-40b0-856a-bd142d6d7ccd")
    private Date sentDate;

    @objid ("377b44b3-7a18-492d-b0ec-9ca952c1d389")
    public Message() {
    }

}
