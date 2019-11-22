package org.avm.business.jdb_manager.jdb.parser.services;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wildfly.swarm.arquillian.DefaultDeployment;
import org.wildfly.swarm.spi.api.JARArchive;

@RunWith(Arquillian.class)
//@DefaultDeployment
//@RunAsClient
public class ApplicationScopedForTestTest {
	@Deployment(testable = true)
	public static Archive createDeployment() {

		JavaArchive archive = ShrinkWrap.create(JavaArchive.class, "jdbManagerTEST.jar");
		archive.addPackages(true, "org.avm.business.jdb_manager");
		archive.addAsResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
		archive.addAsResource("META-INF/persistence-test.xml", "persistence.xml");
		archive.addAsResource("project-tests.yml", "project-default.yml");
	
		// print all included packages
		System.out.println(archive.toString(true));

		return archive;
	}

	@Inject
	ApplicationScopedForTest services;

	@Test
	public void print() {
		assertNotNull(services);
	}
}
