package Evidence;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Evidence {

	String filename;
	String imagename;

	public static void main(String[] args){

		ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
        extent.attachReporter(spark);

		ExtentTest test = extent.createTest("MyFirstTest");

		// reference image saved to disk
		test.fail(MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\mlaza\\Área de Trabalho").build());

		// base64
		test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());

	}
}
