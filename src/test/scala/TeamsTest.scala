import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TeamsTest extends AnyFlatSpec with should.Matchers {
  "A team" should "have a name" in {
    val team: Team = Team("Betis")
    team.name shouldBe "Betis"
  }
}
