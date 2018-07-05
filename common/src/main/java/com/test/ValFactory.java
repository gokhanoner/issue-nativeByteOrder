package com.test;

import com.hazelcast.nio.serialization.DataSerializableFactory;
import com.hazelcast.nio.serialization.IdentifiedDataSerializable;

public class ValFactory implements DataSerializableFactory {

    public static final int ID = 1;

    @Override
    public IdentifiedDataSerializable create(int i) {
        switch (i){
            case EP.ID: return new EP();
        }
        return null;
    }
}
