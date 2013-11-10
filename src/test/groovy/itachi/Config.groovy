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
  functional01 {
    presentation {
      baseUrl = "http://itachi-presentation-functional01.herokuapp.com/"
      baseContext = ""
    }
    stubulator  {
      baseUrl = "http://itachi-presentation-stubulator01.herokuapp.com/"
      baseContext = ""
    }
  }
}