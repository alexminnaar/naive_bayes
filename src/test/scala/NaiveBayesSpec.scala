import org.scalatest.{WordSpec, Matchers}
import breeze.linalg._

class NaiveBayesSpec extends WordSpec with Matchers {


  "Naive Bayes" should {

    val inputs = DenseMatrix(
      (0.1, 0.5),
      (0.5, 0.1),
      (0.12, 0.56),
      (0.54, 0.12),
      (0.13, 0.51),
      (0.56, 0.15)
    )

    val outputs = Seq("A", "B", "A", "B", "A", "B")

    val testNB = new NaiveBayes(
      dataX = inputs,
      dataY = outputs
    )

    "compute the correct prior probabilities" in {

      println(testNB.priors)

      println(testNB.likelihoods.mapValues(_.toList))

    }


  }


}
