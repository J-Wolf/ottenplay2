
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Julian/Documents/GitHub/playOtten/conf/routes
// @DATE:Fri May 26 14:27:12 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  FormController_5: controllers.FormController,
  // @LINE:12
  HomeController_1: controllers.HomeController,
  // @LINE:15
  ProjectsController_7: controllers.ProjectsController,
  // @LINE:19
  OttenController_4: controllers.OttenController,
  // @LINE:22
  WorkersController_2: controllers.WorkersController,
  // @LINE:26
  CustomersController_0: controllers.CustomersController,
  // @LINE:30
  UserController_3: controllers.UserController,
  // @LINE:34
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    FormController_5: controllers.FormController,
    // @LINE:12
    HomeController_1: controllers.HomeController,
    // @LINE:15
    ProjectsController_7: controllers.ProjectsController,
    // @LINE:19
    OttenController_4: controllers.OttenController,
    // @LINE:22
    WorkersController_2: controllers.WorkersController,
    // @LINE:26
    CustomersController_0: controllers.CustomersController,
    // @LINE:30
    UserController_3: controllers.UserController,
    // @LINE:34
    Assets_6: controllers.Assets
  ) = this(errorHandler, FormController_5, HomeController_1, ProjectsController_7, OttenController_4, WorkersController_2, CustomersController_0, UserController_3, Assets_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, FormController_5, HomeController_1, ProjectsController_7, OttenController_4, WorkersController_2, CustomersController_0, UserController_3, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.FormController.loginUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project""", """controllers.FormController.addProject()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """worker""", """controllers.FormController.addWorker()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer""", """controllers.FormController.addCustomer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.ProjectsController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.ProjectsController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """otten""", """controllers.OttenController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workers""", """controllers.WorkersController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """workers""", """controllers.WorkersController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers""", """controllers.CustomersController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers""", """controllers.CustomersController.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_FormController_loginUser0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_FormController_loginUser0_invoker = createInvoker(
    FormController_5.loginUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "loginUser",
      Nil,
      "GET",
      """Forms""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_FormController_addProject1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project")))
  )
  private[this] lazy val controllers_FormController_addProject1_invoker = createInvoker(
    FormController_5.addProject(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addProject",
      Nil,
      "GET",
      """""",
      this.prefix + """project"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_FormController_addWorker2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("worker")))
  )
  private[this] lazy val controllers_FormController_addWorker2_invoker = createInvoker(
    FormController_5.addWorker(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addWorker",
      Nil,
      "GET",
      """""",
      this.prefix + """worker"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_FormController_addCustomer3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer")))
  )
  private[this] lazy val controllers_FormController_addCustomer3_invoker = createInvoker(
    FormController_5.addCustomer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FormController",
      "addCustomer",
      Nil,
      "GET",
      """""",
      this.prefix + """customer"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_index4_invoker = createInvoker(
    HomeController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """Home""",
      this.prefix + """home"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ProjectsController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_ProjectsController_index5_invoker = createInvoker(
    ProjectsController_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectsController",
      "index",
      Nil,
      "GET",
      """Projects""",
      this.prefix + """projects"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ProjectsController_create6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_ProjectsController_create6_invoker = createInvoker(
    ProjectsController_7.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectsController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """projects"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_OttenController_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("otten")))
  )
  private[this] lazy val controllers_OttenController_index7_invoker = createInvoker(
    OttenController_4.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OttenController",
      "index",
      Nil,
      "GET",
      """Otten""",
      this.prefix + """otten"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_WorkersController_index8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workers")))
  )
  private[this] lazy val controllers_WorkersController_index8_invoker = createInvoker(
    WorkersController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkersController",
      "index",
      Nil,
      "GET",
      """Workers""",
      this.prefix + """workers"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_WorkersController_create9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("workers")))
  )
  private[this] lazy val controllers_WorkersController_create9_invoker = createInvoker(
    WorkersController_2.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WorkersController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """workers"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_CustomersController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers")))
  )
  private[this] lazy val controllers_CustomersController_index10_invoker = createInvoker(
    CustomersController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomersController",
      "index",
      Nil,
      "GET",
      """Costumers""",
      this.prefix + """customers"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_CustomersController_create11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers")))
  )
  private[this] lazy val controllers_CustomersController_create11_invoker = createInvoker(
    CustomersController_0.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomersController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """customers"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UserController_create12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_create12_invoker = createInvoker(
    UserController_3.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """User""",
      this.prefix + """user"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_FormController_loginUser0_route(params) =>
      call { 
        controllers_FormController_loginUser0_invoker.call(FormController_5.loginUser())
      }
  
    // @LINE:7
    case controllers_FormController_addProject1_route(params) =>
      call { 
        controllers_FormController_addProject1_invoker.call(FormController_5.addProject())
      }
  
    // @LINE:8
    case controllers_FormController_addWorker2_route(params) =>
      call { 
        controllers_FormController_addWorker2_invoker.call(FormController_5.addWorker())
      }
  
    // @LINE:9
    case controllers_FormController_addCustomer3_route(params) =>
      call { 
        controllers_FormController_addCustomer3_invoker.call(FormController_5.addCustomer())
      }
  
    // @LINE:12
    case controllers_HomeController_index4_route(params) =>
      call { 
        controllers_HomeController_index4_invoker.call(HomeController_1.index())
      }
  
    // @LINE:15
    case controllers_ProjectsController_index5_route(params) =>
      call { 
        controllers_ProjectsController_index5_invoker.call(ProjectsController_7.index())
      }
  
    // @LINE:16
    case controllers_ProjectsController_create6_route(params) =>
      call { 
        controllers_ProjectsController_create6_invoker.call(ProjectsController_7.create())
      }
  
    // @LINE:19
    case controllers_OttenController_index7_route(params) =>
      call { 
        controllers_OttenController_index7_invoker.call(OttenController_4.index())
      }
  
    // @LINE:22
    case controllers_WorkersController_index8_route(params) =>
      call { 
        controllers_WorkersController_index8_invoker.call(WorkersController_2.index())
      }
  
    // @LINE:23
    case controllers_WorkersController_create9_route(params) =>
      call { 
        controllers_WorkersController_create9_invoker.call(WorkersController_2.create())
      }
  
    // @LINE:26
    case controllers_CustomersController_index10_route(params) =>
      call { 
        controllers_CustomersController_index10_invoker.call(CustomersController_0.index())
      }
  
    // @LINE:27
    case controllers_CustomersController_create11_route(params) =>
      call { 
        controllers_CustomersController_create11_invoker.call(CustomersController_0.create())
      }
  
    // @LINE:30
    case controllers_UserController_create12_route(params) =>
      call { 
        controllers_UserController_create12_invoker.call(UserController_3.create())
      }
  
    // @LINE:34
    case controllers_Assets_versioned13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
