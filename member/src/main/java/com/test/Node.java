package com.test;

import com.hazelcast.config.Config;
import com.hazelcast.config.InMemoryFormat;
import com.hazelcast.config.NativeMemoryConfig;
import com.hazelcast.config.SerializationConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.memory.MemorySize;
import com.hazelcast.memory.MemoryUnit;

import java.util.stream.IntStream;

public class Node {

    public static void main(String[] args) {
        System.setProperty("hazelcast.phone.home.enabled", "false");

        Config config = new Config();
        config.getSerializationConfig().getDataSerializableFactories().put(ValFactory.ID, new ValFactory());
        config.getSerializationConfig().setUseNativeByteOrder(true);

        Hazelcast.newHazelcastInstance(config);

    }
}
