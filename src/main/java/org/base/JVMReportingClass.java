package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportingClass {

	public static void jvmReporter(String json) {
		File file=new File("C:\\Users\\lione\\eclipse-workspace\\CucumberPom\\target");
		Configuration config=new Configuration(file,"Report");
		config.addClassifications("Browser-type","chrome");
		config.addClassifications("platform","Windows-10");
		config.addClassifications("Sprint-No","21");
		config.addClassifications("Environment", "QA");
		List<String> li=new ArrayList<String>();
		li.add(json);
		ReportBuilder builder=new ReportBuilder(li,config);
		builder.generateReports();
		


	}

}
