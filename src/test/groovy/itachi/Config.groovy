package itachi

presentation {
  baseUrl = "http://localhost:5000"
  baseContext = ""
}
stubulator {
  baseUrl = "http://localhost:5001"
  baseContext = ""
}

environments {
  func01 {
    presentation {
      baseUrl = "http://itachi-presentation-func01.herokuapp.com/"
      baseContext = ""
    }
    stubulator  {
      baseUrl = "http://itachi-presentation-stub01.herokuapp.com/"
      baseContext = ""
    }
  }
}