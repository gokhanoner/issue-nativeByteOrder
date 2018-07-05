package com.test;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;


public class HZClient {

    public static void main(String[] args) {
        System.setProperty("hazelcast.phone.home.enabled", "false");

        ClientConfig clientConfig = new ClientConfig();
        clientConfig.getSerializationConfig().setUseNativeByteOrder(true);
        clientConfig.getSerializationConfig().getDataSerializableFactories().put(ValFactory.ID, new ValFactory());

        HazelcastInstance cl = HazelcastClient.newHazelcastClient(clientConfig);

        cl.getMap("test").executeOnKey(1, new EP());


    }

}
