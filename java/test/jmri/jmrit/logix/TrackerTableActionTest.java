package jmri.jmrit.logix;

import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Paul Bender Copyright (C) 2017	
 */
public class TrackerTableActionTest {

    /**
     * Checks automatic creation
     */
    @Test
    public void testInstance() {
        TrackerTableAction t = jmri.InstanceManager.getDefault(TrackerTableAction.class);
        Assert.assertNotNull("exists",t);
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        JUnitUtil.setUp();
        jmri.util.JUnitUtil.resetInstanceManager();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }

    // private final static Logger log = LoggerFactory.getLogger(TrackerTableActionTest.class);

}
