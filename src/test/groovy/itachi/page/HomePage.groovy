package itachi.page

import itachi.path.PathPresentation

class HomePage extends BasePage {

  static url = PathPresentation.BASE
  static at = { title == "Welcome to itachi presentation" }

  static content = {
    locationField { $('.location') }
  }
}
