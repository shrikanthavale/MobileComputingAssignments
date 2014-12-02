package randoop.mutant;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class RingBufferMutantTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public RingBufferMutantTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(RingBufferMutantTest0.class));
    result.addTest(new TestSuite(RingBufferMutantTest1.class));
    result.addTest(new TestSuite(randoopFailures.RingBufferMutantTest_failure_1.class));
    return result;
  }

}
