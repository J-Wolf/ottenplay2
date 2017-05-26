
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addCustomer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class addCustomer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: play.data.Form[Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main("Project")/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Project</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.CustomersController.create(), 'enctype -> "multipart/form-data")/*12.102*/{_display_(Seq[Any](format.raw/*12.103*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(customerForm("prename"), 'id -> "name", '_label -> "prename", 'class -> "form-control")),format.raw/*13.118*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(customerForm("lastname"), '_label -> "lastname", 'class -> "form-control")),format.raw/*14.105*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(customerForm("address"), '_label -> "address", 'class -> "form-control")),format.raw/*15.103*/("""
            """),_display_(/*16.14*/helper/*16.20*/.inputText(customerForm("email"), '_label -> "email", 'class -> "form-control")),format.raw/*16.99*/("""

            """),format.raw/*18.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Add </button>
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""</div>
    </div>

""")))}))
      }
    }
  }

  def render(customerForm:play.data.Form[Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm)

  def f:((play.data.Form[Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm) => apply(customerForm)

  def ref: this.type = this

}


}

/**/
object addCustomer extends addCustomer_Scope0.addCustomer
              /*
                  -- GENERATED --
                  DATE: Fri May 26 14:31:13 CEST 2017
                  SOURCE: C:/Users/Julian/Documents/GitHub/playOtten/app/views/addCustomer.scala.html
                  HASH: ee512d88f34da121bfc4199d6155f33ef1c3a346
                  MATRIX: 775->1|910->41|940->46|963->61|1001->62|1033->68|1237->245|1252->251|1348->337|1388->338|1430->353|1445->359|1565->457|1607->472|1622->478|1729->563|1771->578|1786->584|1891->667|1933->682|1948->688|2048->767|2092->783|2283->943|2320->953
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|49->18|50->19|51->20
                  -- GENERATED --
              */
          