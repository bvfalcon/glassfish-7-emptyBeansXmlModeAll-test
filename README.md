#### Purpose

This demo shows one small the difference between Glassfish 6 (Jakarta EE 9.1/CDI 3.0) and Glassfish 7 (Jakarta EE 10/CDI 4.0).
Attribute `bean-discovery-mode` of root element in beans.xml must be declared explicitly.
Otherwise his absence will be interpreted by Glassfish 6 as `bean-discovery-mode="all"`, by Glassfish 7 as `bean-discovery-mode="annotated"`

Weld (CDI implementation used by Glassfish) recommends to use parameter [emptyBeansXmlModeAll](https://docs.jboss.org/weld/reference/5.1.2.Final/en-US/html_single/#legacy-empty-beans-xml), but first two methods [of three proposed](https://docs.jboss.org/weld/reference/5.1.2.Final/en-US/html_single/#weld_configuration) are not working. Is it possible to configure this Weld feature with 3rd method? 

#### Build and run

build with command `mvn clean install -pl service-api,service-impl`

run on glassfish 6: `mvn package org.codehaus.cargo:cargo-maven3-plugin:run@gf6 -pl webapp`. After starting goto `http://localhost:8080/test-webapp/` in web-browser

run on glassfish 7: `mvn package org.codehaus.cargo:cargo-maven3-plugin:run@gf7 -pl webapp`. Application start ends with CDI-error
