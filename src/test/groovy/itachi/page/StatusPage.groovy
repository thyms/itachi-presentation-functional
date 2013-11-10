package itachi.page

import itachi.page.module.TableModule
import itachi.path.PathPresentation

class StatusPage extends BasePage {
  static url = PathPresentation.STATUS

  static at = {
    title == "itachi presentation admin"
    header.text() == "itachi presentation status"
  }

  static content = {
    header { $("h2") }

    status(required: false) { name -> module TableModule, $(".$name")}
  }
}
