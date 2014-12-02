package randoopFailures;

import junit.framework.*;

public class RingBufferMutantTest_failure_1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest_failure_1.test1");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();

  }

}
