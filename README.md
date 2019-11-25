# thorntail-arquillian-cdi
launch : mvn test

Then you'll have :
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.avm.business.jdb_manager.jdb.parser.services.ApplicationScopedForTestTest
jdbManagerTEST.jar:
/org/
/org/avm/
/org/avm/business/
/org/avm/business/jdb_manager/
/org/avm/business/jdb_manager/jdb/
/org/avm/business/jdb_manager/jdb/parser/
/org/avm/business/jdb_manager/jdb/parser/services/
/org/avm/business/jdb_manager/jdb/parser/services/ApplicationScopedForTest.class
/org/avm/business/jdb_manager/jdb/parser/services/ApplicationScopedForTestTest.class
/beans.xml
/persistence.xml
/project-default.yml
Resolving 0 out of 359 artifacts
Fri Nov 22 19:14:10 CET 2019 INFO [org.wildfly.swarm.bootstrap] (main) Dependencies not bundled; resolving from M2REPO.
2019-11-22 19:14:13,393 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:                      CDI - STABLE          io.thorntail:cdi:2.5.0.Final
2019-11-22 19:14:13,400 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:        CDI Configuration - STABLE          io.thorntail:cdi-config:2.5.0.Final
2019-11-22 19:14:13,400 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:             Transactions - STABLE          io.thorntail:transactions:2.5.0.Final
2019-11-22 19:14:13,400 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:               Arquillian - STABLE          io.thorntail:arquillian:2.5.0.Final
2019-11-22 19:14:13,401 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:          Bean Validation - STABLE          io.thorntail:bean-validation:2.5.0.Final
2019-11-22 19:14:13,401 INFO  [org.wildfly.swarm] (main) THORN0013: Installed fraction:                  Logging - STABLE          io.thorntail:logging:2.5.0.Final
2019-11-22 19:14:14,289 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.5.Final
2019-11-22 19:14:14,294 INFO  [org.jboss.threads] (main) JBoss Threads version 2.3.2.Final
2019-11-22 19:14:14,371 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: Thorntail 2.5.0.Final (WildFly Core 7.0.0.Final) starting
2019-11-22 19:14:14,410 INFO  [org.wildfly.swarm] (MSC service thread 1-2) THORN0019: Install MSC service for command line args: []
2019-11-22 19:14:14,561 INFO  [org.wildfly.swarm.arquillian.daemon.server.Server] (MSC service thread 1-5) Arquillian Daemon server started on localhost:12345
2019-11-22 19:14:14,787 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 12) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
2019-11-22 19:14:14,790 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 11) WFLYNAM0001: Activating Naming Subsystem
2019-11-22 19:14:14,808 INFO  [org.jboss.as.naming] (MSC service thread 1-3) WFLYNAM0003: Starting Naming Service
2019-11-22 19:14:14,926 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
2019-11-22 19:14:14,927 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: Thorntail 2.5.0.Final (WildFly Core 7.0.0.Final) started in 664ms - Started 71 of 75 services (8 services are lazy, passive or on-demand)
2019-11-22 19:14:15,308 INFO  [org.wildfly.swarm.runtime.deployer] (main) deploying jdbManagerTEST.jar
2019-11-22 19:14:15,330 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-1) WFLYSRV0027: Starting deployment of "jdbManagerTEST.jar" (runtime-name: "jdbManagerTEST.jar")
2019-11-22 19:14:15,716 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) WFLYSRV0018: Deployment "deployment.jdbManagerTEST.jar" is using a private module ("org.jboss.jts") which may be changed or removed in future versions without notice.
2019-11-22 19:14:15,723 INFO  [org.jboss.weld.deployer] (MSC service thread 1-1) WFLYWELD0003: Processing weld deployment jdbManagerTEST.jar
2019-11-22 19:14:15,766 INFO  [org.hibernate.validator.internal.util.Version] (MSC service thread 1-1) HV000001: Hibernate Validator 6.0.14.Final
2019-11-22 19:14:15,878 INFO  [org.jboss.weld.Version] (MSC service thread 1-4) WELD-000900: 3.0.5 (Final)
2019-11-22 19:14:16,153 INFO  [org.jboss.as.server] (main) WFLYSRV0010: Deployed "jdbManagerTEST.jar" (runtime-name : "jdbManagerTEST.jar")
2019-11-22 19:14:16,158 INFO  [org.wildfly.swarm] (main) THORN99999: Thorntail is Ready
Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 8.887 sec <<< FAILURE!
print(org.avm.business.jdb_manager.jdb.parser.services.ApplicationScopedForTestTest)  Time elapsed: 0.144 sec  <<< ERROR!
java.lang.RuntimeException: Could not inject members
	at org.jboss.arquillian.testenricher.cdi.CDIInjectionEnricher.injectClass(CDIInjectionEnricher.java:117)
	at org.jboss.arquillian.testenricher.cdi.CDIInjectionEnricher.enrich(CDIInjectionEnricher.java:71)
	at org.jboss.arquillian.test.impl.TestInstanceEnricher.enrich(TestInstanceEnricher.java:51)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.arquillian.core.impl.ObserverImpl.invoke(ObserverImpl.java:86)
	at org.jboss.arquillian.core.impl.EventContextImpl.invokeObservers(EventContextImpl.java:103)
	at org.jboss.arquillian.core.impl.EventContextImpl.proceed(EventContextImpl.java:90)
	at org.jboss.arquillian.test.impl.TestContextHandler.createTestContext(TestContextHandler.java:116)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.arquillian.core.impl.ObserverImpl.invoke(ObserverImpl.java:86)
	at org.jboss.arquillian.core.impl.EventContextImpl.proceed(EventContextImpl.java:95)
	at org.jboss.arquillian.test.impl.TestContextHandler.createClassContext(TestContextHandler.java:83)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.arquillian.core.impl.ObserverImpl.invoke(ObserverImpl.java:86)
	at org.jboss.arquillian.core.impl.EventContextImpl.proceed(EventContextImpl.java:95)
	at org.jboss.arquillian.test.impl.TestContextHandler.createSuiteContext(TestContextHandler.java:69)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.arquillian.core.impl.ObserverImpl.invoke(ObserverImpl.java:86)
	at org.jboss.arquillian.core.impl.EventContextImpl.proceed(EventContextImpl.java:95)
	at org.jboss.arquillian.core.impl.ManagerImpl.fire(ManagerImpl.java:133)
	at org.jboss.arquillian.core.impl.ManagerImpl.fire(ManagerImpl.java:105)
	at org.jboss.arquillian.test.impl.EventTestRunnerAdaptor.before(EventTestRunnerAdaptor.java:98)
	at org.jboss.arquillian.junit.Arquillian$4.evaluate(Arquillian.java:200)
	at org.jboss.arquillian.junit.Arquillian.multiExecute(Arquillian.java:350)
	at org.jboss.arquillian.junit.Arquillian.access$200(Arquillian.java:54)
	at org.jboss.arquillian.junit.Arquillian$5.evaluate(Arquillian.java:215)
	at org.jboss.arquillian.junit.Arquillian$7$1.invoke(Arquillian.java:279)
	at org.jboss.arquillian.container.test.impl.execution.BeforeLifecycleEventExecuter.on(BeforeLifecycleEventExecuter.java:34)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.arquillian.core.impl.ObserverImpl.invoke(ObserverImpl.java:86)
	at org.jboss.arquillian.core.impl.EventContextImpl.invokeObservers(EventContextImpl.java:103)
	at org.jboss.arquillian.core.impl.EventContextImpl.proceed(EventContextImpl.java:90)
	at org.jboss.arquillian.test.impl.TestContextHandler.createTestContext(TestContextHandler.java:116)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.arquillian.core.impl.ObserverImpl.invoke(ObserverImpl.java:86)
	at org.jboss.arquillian.core.impl.EventContextImpl.proceed(EventContextImpl.java:95)
	at org.jboss.arquillian.test.impl.TestContextHandler.createClassContext(TestContextHandler.java:83)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.arquillian.core.impl.ObserverImpl.invoke(ObserverImpl.java:86)
	at org.jboss.arquillian.core.impl.EventContextImpl.proceed(EventContextImpl.java:95)
	at org.jboss.arquillian.test.impl.TestContextHandler.createSuiteContext(TestContextHandler.java:69)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.jboss.arquillian.core.impl.ObserverImpl.invoke(ObserverImpl.java:86)
	at org.jboss.arquillian.core.impl.EventContextImpl.proceed(EventContextImpl.java:95)
	at org.jboss.arquillian.core.impl.ManagerImpl.fire(ManagerImpl.java:133)
	at org.jboss.arquillian.core.impl.ManagerImpl.fire(ManagerImpl.java:105)
	at org.jboss.arquillian.test.impl.EventTestRunnerAdaptor.fireCustomLifecycle(EventTestRunnerAdaptor.java:142)
	at org.jboss.arquillian.junit.Arquillian$7.evaluate(Arquillian.java:273)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.jboss.arquillian.junit.Arquillian$2.evaluate(Arquillian.java:166)
	at org.jboss.arquillian.junit.Arquillian.multiExecute(Arquillian.java:350)
	at org.jboss.arquillian.junit.Arquillian.access$200(Arquillian.java:54)
	at org.jboss.arquillian.junit.Arquillian$3.evaluate(Arquillian.java:177)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.jboss.arquillian.junit.Arquillian.run(Arquillian.java:115)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
	at org.jboss.arquillian.junit.container.JUnitTestRunner.execute(JUnitTestRunner.java:61)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.wildfly.swarm.arquillian.daemon.TestRunner.executeTest(TestRunner.java:64)
	at org.wildfly.swarm.arquillian.daemon.server.Server.executeTest(Server.java:255)
	at org.wildfly.swarm.arquillian.daemon.server.Server$StringCommandHandler.channelRead0(Server.java:366)
	at org.wildfly.swarm.arquillian.daemon.server.Server$StringCommandHandler.channelRead0(Server.java:308)
	at io.netty.channel.SimpleChannelInboundHandler.channelRead(SimpleChannelInboundHandler.java:105)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:102)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:310)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:284)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1434)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:965)
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:163)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:647)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:582)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:499)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:461)
	at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:884)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.lang.Thread.run(Thread.java:748)
Caused by: org.jboss.arquillian.test.spi.ArquillianProxyException: org.jboss.weld.exceptions.IllegalArgumentException : WELD-001408: Unsatisfied dependencies for type ApplicationScopedForTest with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject org.avm.business.jdb_manager.jdb.parser.services.ApplicationScopedForTestTest.services
  at org.avm.business.jdb_manager.jdb.parser.services.ApplicationScopedForTestTest.services(ApplicationScopedForTestTest.java:0)
 [Proxied because : Original exception caused: class java.lang.ClassNotFoundException: org.jboss.weld.exceptions.IllegalArgumentException]
	at org.jboss.weld.manager.InjectionTargetFactoryImpl.createInjectionTarget(InjectionTargetFactoryImpl.java:83)
	at org.jboss.weld.manager.InjectionTargetFactoryImpl.createInjectionTarget(InjectionTargetFactoryImpl.java:70)
	at org.jboss.weld.manager.BeanManagerImpl.createInjectionTarget(BeanManagerImpl.java:1025)
	at org.jboss.weld.util.ForwardingBeanManager.createInjectionTarget(ForwardingBeanManager.java:204)
	at org.jboss.arquillian.testenricher.cdi.CDIInjectionEnricher.injectNonContextualInstance(CDIInjectionEnricher.java:124)
	at org.jboss.arquillian.testenricher.cdi.CDIInjectionEnricher.injectClass(CDIInjectionEnricher.java:110)
	... 121 more
Caused by: org.jboss.arquillian.test.spi.ArquillianProxyException: org.jboss.weld.exceptions.DeploymentException : WELD-001408: Unsatisfied dependencies for type ApplicationScopedForTest with qualifiers @Default
  at injection point [BackedAnnotatedField] @Inject org.avm.business.jdb_manager.jdb.parser.services.ApplicationScopedForTestTest.services
  at org.avm.business.jdb_manager.jdb.parser.services.ApplicationScopedForTestTest.services(ApplicationScopedForTestTest.java:0)
 [Proxied because : Original exception caused: class java.lang.ClassNotFoundException: org.jboss.weld.exceptions.DeploymentException]
	at org.jboss.weld.bootstrap.Validator.validateInjectionPointForDeploymentProblems(Validator.java:378)
	at org.jboss.weld.bootstrap.Validator.validateInjectionPoint(Validator.java:290)
	at org.jboss.weld.bootstrap.Validator.validateProducer(Validator.java:425)
	at org.jboss.weld.injection.producer.InjectionTargetService.validateProducer(InjectionTargetService.java:36)
	at org.jboss.weld.manager.InjectionTargetFactoryImpl.validate(InjectionTargetFactoryImpl.java:153)
	at org.jboss.weld.manager.InjectionTargetFactoryImpl.createInjectionTarget(InjectionTargetFactoryImpl.java:81)
	... 126 more
```


_Question is WHY ????_

#Solution :
And the answer is there : https://stackoverflow.com/questions/58997158/howto-test-with-arquillian-and-thorntail-without-defaultdeployment/59027407#59027407
Simply add file beans.xml as a ManifestResource `archive.addAsManifestResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));` not as a resource.
