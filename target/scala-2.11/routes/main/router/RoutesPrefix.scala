
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/georg/Documents/projects/otten/otten/conf/routes
// @DATE:Thu May 18 20:11:49 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}