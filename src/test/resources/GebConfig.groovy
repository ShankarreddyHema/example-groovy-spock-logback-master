/*
	This is the Geb configuration file.

*/

import geb.report.ScreenshotReporter
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver
//import org.webjars.
import org.openqa.selenium.firefox.MarionetteDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.remote.DriverCommand
import util.RpScreenshotListener

import static org.openqa.selenium.remote.DesiredCapabilities.firefox

waiting {
	timeout = 20
}
//System.setProperty("webdriver.gecko.driver","D:\\geckodriver-0.11.1\\webdriver.gecko.driver");
environments {
	
	// run via “./gradlew chromeTest”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}
	
	// run via “./gradlew firefoxTest”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		//System.setProperty('webdriver.firefox.driver', 'D:\\geckodriver-0.11.1\\webdriver.gecko.driver')
		//System.setProperty("webdriver.firefox.marionette","D:\\geckodriver-0.11.1\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver-0.11.1\\geckodriver.exe");
		//FirefoxDriver.metaClass.quit << {->  Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");}
		//FirefoxDriver firefoxDriver = new FirefoxDriver();

		WebDriver.metaClass.quit = {->
			Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		}

		driver = { new FirefoxDriver() }
		//driver = { new MarionetteDriver()}
	}

    phantomJs {
        driver = { new PhantomJSDriver() }
    }

}


baseUrl="https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession"
reportsDir = new File("target/runtime_reports_dir")
reporter = new ScreenshotReporter()
reportingListener = new RpScreenshotListener()
//baseUrl="https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession"
//baseUrl = "https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_nav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1"

