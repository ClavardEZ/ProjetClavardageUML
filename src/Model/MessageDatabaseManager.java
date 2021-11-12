package Model;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fd5b9921-4788-4052-8fd0-f023d9803df5")
public class MessageDatabaseManager {
    @objid ("c609832a-1cfc-4ca8-9762-e913d0a2046a")
    public List<MessagesInConv> messagesInConv = new ArrayList<MessagesInConv> ();

    @objid ("cd919b42-c931-42b8-911c-448a4adf301d")
    public MessageDatabaseManager() {
    }

}
