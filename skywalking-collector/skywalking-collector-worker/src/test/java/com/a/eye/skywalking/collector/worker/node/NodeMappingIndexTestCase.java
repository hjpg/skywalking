package com.a.eye.skywalking.collector.worker.node;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @author pengys5
 */
public class NodeMappingIndexTestCase {

    @Test
    public void test() {
        NodeMappingIndex index = new NodeMappingIndex();
        Assert.assertEquals("node_mapping_idx", index.index());
        Assert.assertEquals(false, index.isRecord());
    }

    @Test
    public void testBuilder() throws IOException {
        NodeMappingIndex index = new NodeMappingIndex();
        Assert.assertEquals("{\"properties\":{\"code\":{\"type\":\"string\",\"index\":\"not_analyzed\"},\"peers\":{\"type\":\"string\",\"index\":\"not_analyzed\"},\"aggId\":{\"type\":\"string\",\"index\":\"not_analyzed\"},\"timeSlice\":{\"type\":\"long\",\"index\":\"not_analyzed\"}}}", index.createMappingBuilder().string());
    }
}
