package com.test.springbdd;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class JenkinsRunner {
	
	public static void main(String[] args) throws Exception {
		try {
			
			TestNG testng = new TestNG();
			testng.setVerbose(10);
			List<String> testFileList = new ArrayList<String>();
			testFileList.add(args[0]);
			testng.setTestSuites(testFileList);
			testng.run();
			
		}catch (AssertionError ae) {
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
