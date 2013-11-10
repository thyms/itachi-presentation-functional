package itachi.spec

import itachi.page.HomePage
import itachi.path.PathFixture

class HomePageSpec extends BaseSpecification {

  def "Homepage renders correctly"() {
    given:
      presentation.get(path: PathFixture.RESET)

    when:
      to HomePage

    then:
      at HomePage
  }
}
