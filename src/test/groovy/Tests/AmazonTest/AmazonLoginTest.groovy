package Tests.AmazonTest
import Pages.AmazonPage.AmazonLogin
import geb.spock.GebReportingSpec
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class AmazonLoginTest extends GebReportingSpec{
    final static Logger log= LoggerFactory.getLogger(AmazonLoginTest.class)
    def "login to Amazon"(){
        given:
        log.debug("==start==")
        def amazonLogin= to AmazonLogin
        amazonLogin.login("hemavathi370@gmail.com","9845653538")

        when:
        log.info("==verify title==")
        waitFor {title.startsWith{title=="Gmail"}}

        then:
        //log.debug("==Logout==")
        //amazonLogin.logout()
        println("done")

    }

}
