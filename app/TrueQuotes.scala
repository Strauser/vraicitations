import org.flywaydb.play.FlywayPlayComponents
import controllers.QuotesController
import play.api.{Application, ApplicationLoader, BuiltInComponentsFromContext}
import play.api.ApplicationLoader.Context
import play.filters.HttpFiltersComponents

class TrueQuotes extends ApplicationLoader {
  def load(context: Context): Application = {
    new MyComponents(context).application
  }
}

class MyComponents(context: Context) extends BuiltInComponentsFromContext(context)
  with FlywayPlayComponents
  with HttpFiltersComponents
  with _root_.controllers.AssetsComponents {
  flywayPlayInitializer
  lazy val applicationController = new QuotesController(controllerComponents)
  lazy val router = new _root_.router.Routes(httpErrorHandler, applicationController, assets)
}
