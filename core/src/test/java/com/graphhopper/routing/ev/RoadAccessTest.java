package com.graphhopper.routing.ev;

import org.junit.Test;

import static com.graphhopper.routing.ev.RoadAccess.*;
import static org.junit.Assert.assertEquals;

public class RoadAccessTest {
    @Test
    public void testBasics() {
        assertEquals(MISSING, RoadAccess.find(""));
        assertEquals(OTHER, RoadAccess.find("unknown"));
        assertEquals(NO, RoadAccess.find("no"));
    }

}