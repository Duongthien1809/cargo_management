package eventSystem.events;

import administration.Storable;
import cargo.Cargo;

import java.util.EventObject;

public class CargoInspectionEvent<T extends Cargo & Storable> extends EventObject {
    private final int storageLocation;

    public CargoInspectionEvent(int storageLocation) {
        super(storageLocation);
        this.storageLocation = storageLocation;
    }

    public int getStorageLocation() {
        return storageLocation;
    }
}
