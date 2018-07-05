package com.test;

import com.hazelcast.map.EntryBackupProcessor;
import com.hazelcast.map.EntryProcessor;
import com.hazelcast.nio.ObjectDataInput;
import com.hazelcast.nio.ObjectDataOutput;
import com.hazelcast.nio.serialization.IdentifiedDataSerializable;

import java.io.IOException;
import java.util.Map;

public class EP implements EntryProcessor, IdentifiedDataSerializable {

    public static final int ID = 1;

    @Override
    public Object process(Map.Entry entry) {
        return null;
    }

    @Override
    public EntryBackupProcessor getBackupProcessor() {
        return null;
    }

    @Override
    public int getFactoryId() {
        return ValFactory.ID;
    }

    @Override
    public int getId() {
        return ID;
    }

    @Override
    public void writeData(ObjectDataOutput out) throws IOException {
    }

    @Override
    public void readData(ObjectDataInput in) throws IOException {
    }
}
