/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.virgo;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author pramoth
 */
public class MyActivator implements BundleActivator {

    private final Logger LOG = LoggerFactory.getLogger(MyActivator.class);

    public void start(BundleContext context) throws Exception {
        LOG.info("Bundle start.");
    }

    public void stop(BundleContext context) throws Exception {
        LOG.info("Bundle stop.");
    }
}
