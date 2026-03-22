package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	    
	   
	public static ExtentReports extent;

    public static ExtentReports getReporter() {
        if (extent == null) {
        	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
 	      	       
            ExtentSparkReporter spark = new ExtentSparkReporter("./reports/TestReport_"+LocalDateTime.now().format(formatter)+".html");
            spark.config().setReportName("Mobile Automation Test Results");
            spark.config().setDocumentTitle("Test Execution Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("OS Version", System.getProperty("os.version"));
            extent.setSystemInfo("Java Version", System.getProperty("java.version"));
            extent.setSystemInfo("User", System.getProperty("user.name"));
            extent.setSystemInfo("Test Engg", "Irappa Hukkeri");
            extent.setSystemInfo("browser", "chrome");
            extent.setSystemInfo("AppVer", "1.0.2");
            
        }
        return extent;
    }

}

