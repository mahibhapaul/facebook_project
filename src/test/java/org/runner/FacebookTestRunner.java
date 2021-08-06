package org.runner;

import org.base.JVMReportingClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, dryRun = false, snippets = SnippetType.CAMELCASE, glue = {
		"org.step" }, plugin = { "pretty", "html:C:\\Users\\lione\\eclipse-workspace\\CucumberPom\\target",
				"json:C:\\Users\\lione\\eclipse-workspace\\CucumberPom\\target\\sample.json",
				"junit:C:\\Users\\lione\\eclipse-workspace\\CucumberPom\\target\\sample.xml" },tags= {"~@Smoke","~@Sanity"})

public class FacebookTestRunner {
	@AfterClass
public static	void afterClass() {

JVMReportingClass.jvmReporter("C:\\Users\\lione\\eclipse-workspace\\CucumberPom\\target\\sample.json");
}
}