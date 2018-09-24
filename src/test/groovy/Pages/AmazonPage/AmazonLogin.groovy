package Pages.AmazonPage

import geb.Page

class AmazonLogin extends Page{

    //static url = "https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_nav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1"


   /* static content={
        EmailId{$("div.a-row>input#ap_email")}
        ContinueButton{("div.a-section>span>span>input#continue")}
        password{$("div.a-section>input#ap_password")}
        ClickButton{$("div.a-section>span>span>input.a-button-input")}
        dragdown{$("#nav-link-yourAccount > span.nav-line-2")}
        LogOut{$("#nav-item-signout-sa > span")}

    }

    void login(username, pass){
        EmailId.value(username)
        password.value(pass)
        ClickButton.click()
        //ContinueButton.click()
    }
    void logout(){
        LogOut.click()
    }*/

    static content={
        EmailId{$("#identifierId")}
        contin{$("#identifierNext > content > span")}
        pass{$("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")}
        con2{$("#passwordNext > div.ZFr60d.CeoRYc")}
    }
    void login(username,password){

        contin.click()
        EmailId=username
        pass=password
        con2.click()
    }
}

