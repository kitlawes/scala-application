import java.io._
import scala.io.Source

object Demo {
  def main(args: Array[String]) {
    print("Please enter your input : " )
    val line = scala.io.StdIn.readLine()

    println("Thanks, you just typed: " + line)

    val writer = new PrintWriter(new File("Demo.txt" ))

    writer.write(line)
    writer.close()

    println("Following is the content read:" )

    Source.fromFile("Demo.txt" ).foreach {
      print
    }
  }
}