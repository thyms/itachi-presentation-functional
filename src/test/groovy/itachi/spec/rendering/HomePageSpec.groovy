package itachi.spec.rendering

import itachi.page.HomePage
import itachi.path.PathFixture
import itachi.spec.BaseSpecification

class HomePageSpec extends BaseSpecification {

  def "Homepage renders correctly"() {
    given:
      presentation.get(path: PathFixture.RESET)

    when:
      toAt HomePage

    then:
      locationField.displayed
      locationField.@placeholder == 'Enter your town/postcode'
  }
}
