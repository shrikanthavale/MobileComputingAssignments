package randoop.mutant;

import junit.framework.*;

public class RingBufferMutantTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test1");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test2");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    boolean var14 = var10.isEmpty();
    boolean var15 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var15);
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    java.util.Iterator var23 = var18.iterator();
    boolean var24 = var18.isEmpty();
    randoop.mutant.RingBufferMutant var26 = new randoop.mutant.RingBufferMutant(10);
    var26.enqueue((java.lang.Object)'#');
    java.util.Iterator var29 = var26.iterator();
    java.util.Iterator var30 = var26.iterator();
    java.util.Iterator var31 = var26.iterator();
    var18.enqueue((java.lang.Object)var26);
    java.util.Iterator var33 = var26.iterator();
    boolean var34 = var26.isEmpty();
    var1.enqueue((java.lang.Object)var26);
    boolean var36 = var1.isEmpty();
    int var37 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test3");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    var10.enqueue((java.lang.Object)'#');
    boolean var17 = var10.isEmpty();
    java.util.Iterator var18 = var10.iterator();
    var10.enqueue((java.lang.Object)(short)0);
    int var21 = var10.size();
    int var22 = var10.size();
    int var23 = var10.size();
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    java.util.Iterator var28 = var25.iterator();
    boolean var29 = var25.isEmpty();
    var25.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var33 = new randoop.mutant.RingBufferMutant(1);
    boolean var34 = var33.isEmpty();
    java.util.Iterator var35 = var33.iterator();
    java.util.Iterator var36 = var33.iterator();
    java.util.Iterator var37 = var33.iterator();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(10);
    var39.enqueue((java.lang.Object)'#');
    java.util.Iterator var42 = var39.iterator();
    java.util.Iterator var43 = var39.iterator();
    java.util.Iterator var44 = var39.iterator();
    boolean var45 = var39.isEmpty();
    randoop.mutant.RingBufferMutant var47 = new randoop.mutant.RingBufferMutant(10);
    var47.enqueue((java.lang.Object)'#');
    java.util.Iterator var50 = var47.iterator();
    java.util.Iterator var51 = var47.iterator();
    java.util.Iterator var52 = var47.iterator();
    var39.enqueue((java.lang.Object)var47);
    randoop.mutant.RingBufferMutant var55 = new randoop.mutant.RingBufferMutant(10);
    boolean var56 = var55.isEmpty();
    boolean var57 = var55.isEmpty();
    java.util.Iterator var58 = var55.iterator();
    randoop.mutant.RingBufferMutant var60 = new randoop.mutant.RingBufferMutant(10);
    var60.enqueue((java.lang.Object)'#');
    java.util.Iterator var63 = var60.iterator();
    java.util.Iterator var64 = var60.iterator();
    java.util.Iterator var65 = var60.iterator();
    var55.enqueue((java.lang.Object)var60);
    java.util.Iterator var67 = var60.iterator();
    var47.enqueue((java.lang.Object)var60);
    var33.enqueue((java.lang.Object)var47);
    var25.enqueue((java.lang.Object)var33);
    java.util.Iterator var71 = var33.iterator();
    var10.enqueue((java.lang.Object)var33);
    var1.enqueue((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test4");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    var10.enqueue((java.lang.Object)' ');
    boolean var15 = var10.isEmpty();
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    java.util.Iterator var20 = var17.iterator();
    boolean var21 = var17.isEmpty();
    int var22 = var17.size();
    java.util.Iterator var23 = var17.iterator();
    int var24 = var17.size();
    java.lang.Object var25 = new java.lang.Object();
    var17.enqueue(var25);
    var10.enqueue((java.lang.Object)var17);
    java.util.Iterator var28 = var17.iterator();
    var1.enqueue((java.lang.Object)var17);
    randoop.mutant.RingBufferMutant var31 = new randoop.mutant.RingBufferMutant(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    java.util.Iterator var36 = var31.iterator();
    java.util.Iterator var37 = var31.iterator();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(10);
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    java.util.Iterator var42 = var39.iterator();
    boolean var43 = var39.isEmpty();
    var39.enqueue((java.lang.Object)'#');
    boolean var46 = var39.isEmpty();
    java.util.Iterator var47 = var39.iterator();
    var39.enqueue((java.lang.Object)(short)0);
    randoop.mutant.RingBufferMutant var51 = new randoop.mutant.RingBufferMutant(10);
    boolean var52 = var51.isEmpty();
    boolean var53 = var51.isEmpty();
    int var54 = var51.size();
    java.util.Iterator var55 = var51.iterator();
    java.lang.Object var56 = new java.lang.Object();
    var51.enqueue(var56);
    int var58 = var51.size();
    java.util.Iterator var59 = var51.iterator();
    var39.enqueue((java.lang.Object)var59);
    var31.enqueue((java.lang.Object)var59);
    var17.enqueue((java.lang.Object)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test5");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    boolean var15 = var11.isEmpty();
    int var16 = var11.size();
    boolean var17 = var11.isEmpty();
    int var18 = var11.size();
    var1.enqueue((java.lang.Object)var18);
    randoop.mutant.RingBufferMutant var21 = new randoop.mutant.RingBufferMutant(10);
    var21.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)var21);
    randoop.mutant.RingBufferMutant var26 = new randoop.mutant.RingBufferMutant(10);
    var26.enqueue((java.lang.Object)'#');
    java.util.Iterator var29 = var26.iterator();
    java.util.Iterator var30 = var26.iterator();
    var26.enqueue((java.lang.Object)false);
    int var33 = var26.size();
    randoop.mutant.RingBufferMutant var35 = new randoop.mutant.RingBufferMutant(10);
    var35.enqueue((java.lang.Object)'#');
    int var38 = var35.size();
    boolean var39 = var35.isEmpty();
    randoop.mutant.RingBufferMutant var41 = new randoop.mutant.RingBufferMutant(0);
    int var42 = var41.size();
    boolean var43 = var41.isEmpty();
    java.util.Iterator var44 = var41.iterator();
    var35.enqueue((java.lang.Object)var44);
    var26.enqueue((java.lang.Object)var44);
    randoop.mutant.RingBufferMutant var48 = new randoop.mutant.RingBufferMutant(10);
    var48.enqueue((java.lang.Object)'#');
    var48.enqueue((java.lang.Object)' ');
    boolean var53 = var48.isEmpty();
    boolean var54 = var48.isEmpty();
    int var55 = var48.size();
    boolean var56 = var48.isEmpty();
    int var57 = var48.size();
    var26.enqueue((java.lang.Object)var57);
    java.util.Iterator var59 = var26.iterator();
    var21.enqueue((java.lang.Object)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test6");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    java.util.Iterator var6 = var1.iterator();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    var8.enqueue((java.lang.Object)'#');
    int var11 = var8.size();
    java.util.Iterator var12 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var14 = var8.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    int var21 = var16.size();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    java.util.Iterator var26 = var23.iterator();
    boolean var27 = var23.isEmpty();
    int var28 = var23.size();
    java.util.Iterator var29 = var23.iterator();
    int var30 = var23.size();
    java.lang.Object var31 = new java.lang.Object();
    var23.enqueue(var31);
    var16.enqueue((java.lang.Object)var23);
    randoop.mutant.RingBufferMutant var35 = new randoop.mutant.RingBufferMutant(10);
    var35.enqueue((java.lang.Object)'#');
    java.util.Iterator var38 = var35.iterator();
    java.util.Iterator var39 = var35.iterator();
    java.util.Iterator var40 = var35.iterator();
    java.util.Iterator var41 = var35.iterator();
    randoop.mutant.RingBufferMutant var43 = new randoop.mutant.RingBufferMutant(10);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    java.util.Iterator var46 = var43.iterator();
    boolean var47 = var43.isEmpty();
    java.util.Iterator var48 = var43.iterator();
    var35.enqueue((java.lang.Object)var43);
    randoop.mutant.RingBufferMutant var51 = new randoop.mutant.RingBufferMutant(10);
    var51.enqueue((java.lang.Object)'#');
    java.util.Iterator var54 = var51.iterator();
    java.util.Iterator var55 = var51.iterator();
    java.util.Iterator var56 = var51.iterator();
    java.util.Iterator var57 = var51.iterator();
    var43.enqueue((java.lang.Object)var57);
    int var59 = var43.size();
    boolean var60 = var43.isEmpty();
    randoop.mutant.RingBufferMutant var62 = new randoop.mutant.RingBufferMutant(10);
    boolean var63 = var62.isEmpty();
    boolean var64 = var62.isEmpty();
    java.util.Iterator var65 = var62.iterator();
    randoop.mutant.RingBufferMutant var67 = new randoop.mutant.RingBufferMutant(10);
    var67.enqueue((java.lang.Object)'#');
    java.util.Iterator var70 = var67.iterator();
    java.util.Iterator var71 = var67.iterator();
    java.util.Iterator var72 = var67.iterator();
    var62.enqueue((java.lang.Object)var67);
    int var74 = var67.size();
    randoop.mutant.RingBufferMutant var76 = new randoop.mutant.RingBufferMutant(10);
    boolean var77 = var76.isEmpty();
    boolean var78 = var76.isEmpty();
    java.util.Iterator var79 = var76.iterator();
    boolean var80 = var76.isEmpty();
    int var81 = var76.size();
    int var82 = var76.size();
    java.util.Iterator var83 = var76.iterator();
    var67.enqueue((java.lang.Object)var83);
    var43.enqueue((java.lang.Object)var67);
    var16.enqueue((java.lang.Object)var43);
    var8.enqueue((java.lang.Object)var43);
    randoop.mutant.RingBufferMutant var89 = new randoop.mutant.RingBufferMutant(10);
    var89.enqueue((java.lang.Object)'#');
    java.util.Iterator var92 = var89.iterator();
    java.util.Iterator var93 = var89.iterator();
    java.util.Iterator var94 = var89.iterator();
    int var95 = var89.size();
    int var96 = var89.size();
    var8.enqueue((java.lang.Object)var89);
    int var98 = var8.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var92);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == 3);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test7");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)(short)0);
    int var12 = var1.size();
    int var13 = var1.size();
    int var14 = var1.size();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    java.util.Iterator var21 = var16.iterator();
    boolean var22 = var16.isEmpty();
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    var24.enqueue((java.lang.Object)'#');
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    java.util.Iterator var29 = var24.iterator();
    var16.enqueue((java.lang.Object)var24);
    randoop.mutant.RingBufferMutant var32 = new randoop.mutant.RingBufferMutant(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    java.util.Iterator var35 = var32.iterator();
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    var37.enqueue((java.lang.Object)'#');
    java.util.Iterator var40 = var37.iterator();
    java.util.Iterator var41 = var37.iterator();
    java.util.Iterator var42 = var37.iterator();
    var32.enqueue((java.lang.Object)var37);
    java.util.Iterator var44 = var37.iterator();
    var24.enqueue((java.lang.Object)var37);
    var1.enqueue((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test8");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    int var6 = var1.size();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test9");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    boolean var17 = var13.isEmpty();
    var13.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var21 = new randoop.mutant.RingBufferMutant(1);
    boolean var22 = var21.isEmpty();
    java.util.Iterator var23 = var21.iterator();
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    randoop.mutant.RingBufferMutant var27 = new randoop.mutant.RingBufferMutant(10);
    var27.enqueue((java.lang.Object)'#');
    java.util.Iterator var30 = var27.iterator();
    java.util.Iterator var31 = var27.iterator();
    java.util.Iterator var32 = var27.iterator();
    boolean var33 = var27.isEmpty();
    randoop.mutant.RingBufferMutant var35 = new randoop.mutant.RingBufferMutant(10);
    var35.enqueue((java.lang.Object)'#');
    java.util.Iterator var38 = var35.iterator();
    java.util.Iterator var39 = var35.iterator();
    java.util.Iterator var40 = var35.iterator();
    var27.enqueue((java.lang.Object)var35);
    randoop.mutant.RingBufferMutant var43 = new randoop.mutant.RingBufferMutant(10);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    java.util.Iterator var46 = var43.iterator();
    randoop.mutant.RingBufferMutant var48 = new randoop.mutant.RingBufferMutant(10);
    var48.enqueue((java.lang.Object)'#');
    java.util.Iterator var51 = var48.iterator();
    java.util.Iterator var52 = var48.iterator();
    java.util.Iterator var53 = var48.iterator();
    var43.enqueue((java.lang.Object)var48);
    java.util.Iterator var55 = var48.iterator();
    var35.enqueue((java.lang.Object)var48);
    var21.enqueue((java.lang.Object)var35);
    var13.enqueue((java.lang.Object)var21);
    java.util.Iterator var59 = var21.iterator();
    java.util.Iterator var60 = var21.iterator();
    var1.enqueue((java.lang.Object)var21);
    randoop.mutant.RingBufferMutant var63 = new randoop.mutant.RingBufferMutant(10);
    var63.enqueue((java.lang.Object)'#');
    int var66 = var63.size();
    var63.enqueue((java.lang.Object)true);
    var63.enqueue((java.lang.Object)(byte)100);
    java.util.Iterator var71 = var63.iterator();
    var1.enqueue((java.lang.Object)var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test10");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test11");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test12");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test13");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    int var9 = var6.size();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var11);
    randoop.mutant.RingBufferMutant var14 = new randoop.mutant.RingBufferMutant(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    int var19 = var14.size();
    java.util.Iterator var20 = var14.iterator();
    var1.enqueue((java.lang.Object)var14);
    boolean var22 = var14.isEmpty();
    int var23 = var14.size();
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    java.util.Iterator var28 = var25.iterator();
    boolean var29 = var25.isEmpty();
    java.util.Iterator var30 = var25.iterator();
    randoop.mutant.RingBufferMutant var32 = new randoop.mutant.RingBufferMutant(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    int var35 = var32.size();
    java.util.Iterator var36 = var32.iterator();
    int var37 = var32.size();
    var25.enqueue((java.lang.Object)var37);
    var14.enqueue((java.lang.Object)var37);
    java.util.Iterator var40 = var14.iterator();
    java.util.Iterator var41 = var14.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test14");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var16 = var9.iterator();
    int var17 = var9.size();
    java.util.Iterator var18 = var9.iterator();
    java.util.Iterator var19 = var9.iterator();
    boolean var20 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test15");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    int var21 = var18.size();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    int var26 = var23.size();
    java.util.Iterator var27 = var23.iterator();
    java.util.Iterator var28 = var23.iterator();
    var18.enqueue((java.lang.Object)var28);
    var1.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test16");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    randoop.mutant.RingBufferMutant var14 = new randoop.mutant.RingBufferMutant(10);
    var14.enqueue((java.lang.Object)'#');
    java.util.Iterator var17 = var14.iterator();
    java.util.Iterator var18 = var14.iterator();
    java.util.Iterator var19 = var14.iterator();
    java.util.Iterator var20 = var14.iterator();
    java.util.Iterator var21 = var14.iterator();
    var6.enqueue((java.lang.Object)var14);
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    var24.enqueue((java.lang.Object)'#');
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    var14.enqueue((java.lang.Object)var24);
    randoop.mutant.RingBufferMutant var31 = new randoop.mutant.RingBufferMutant(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    java.util.Iterator var36 = var31.iterator();
    boolean var37 = var31.isEmpty();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(10);
    var39.enqueue((java.lang.Object)'#');
    java.util.Iterator var42 = var39.iterator();
    java.util.Iterator var43 = var39.iterator();
    java.util.Iterator var44 = var39.iterator();
    var31.enqueue((java.lang.Object)var39);
    java.util.Iterator var46 = var39.iterator();
    int var47 = var39.size();
    java.util.Iterator var48 = var39.iterator();
    randoop.mutant.RingBufferMutant var50 = new randoop.mutant.RingBufferMutant(10);
    boolean var51 = var50.isEmpty();
    boolean var52 = var50.isEmpty();
    int var53 = var50.size();
    java.util.Iterator var54 = var50.iterator();
    java.lang.Object var55 = new java.lang.Object();
    var50.enqueue(var55);
    int var57 = var50.size();
    var39.enqueue((java.lang.Object)var57);
    java.util.Iterator var59 = var39.iterator();
    var24.enqueue((java.lang.Object)var39);
    boolean var61 = var24.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test17");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test18");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    java.util.Iterator var17 = var1.iterator();
    boolean var18 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test19");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = new java.lang.Object();
    var1.enqueue(var6);
    int var8 = var1.size();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    java.util.Iterator var23 = var18.iterator();
    var13.enqueue((java.lang.Object)var18);
    int var25 = var18.size();
    int var26 = var18.size();
    boolean var27 = var18.isEmpty();
    var1.enqueue((java.lang.Object)var18);
    boolean var29 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test20");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    java.util.Iterator var21 = var16.iterator();
    var11.enqueue((java.lang.Object)var16);
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    var24.enqueue((java.lang.Object)'#');
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    java.util.Iterator var29 = var24.iterator();
    java.util.Iterator var30 = var24.iterator();
    java.util.Iterator var31 = var24.iterator();
    var16.enqueue((java.lang.Object)var24);
    var1.enqueue((java.lang.Object)var16);
    randoop.mutant.RingBufferMutant var35 = new randoop.mutant.RingBufferMutant(10);
    var35.enqueue((java.lang.Object)'#');
    int var38 = var35.size();
    java.util.Iterator var39 = var35.iterator();
    randoop.mutant.RingBufferMutant var41 = new randoop.mutant.RingBufferMutant(10);
    var41.enqueue((java.lang.Object)'#');
    java.util.Iterator var44 = var41.iterator();
    java.util.Iterator var45 = var41.iterator();
    java.util.Iterator var46 = var41.iterator();
    boolean var47 = var41.isEmpty();
    randoop.mutant.RingBufferMutant var49 = new randoop.mutant.RingBufferMutant(10);
    var49.enqueue((java.lang.Object)'#');
    java.util.Iterator var52 = var49.iterator();
    java.util.Iterator var53 = var49.iterator();
    java.util.Iterator var54 = var49.iterator();
    var41.enqueue((java.lang.Object)var49);
    java.util.Iterator var56 = var49.iterator();
    java.util.Iterator var57 = var49.iterator();
    boolean var58 = var49.isEmpty();
    var35.enqueue((java.lang.Object)var58);
    randoop.mutant.RingBufferMutant var61 = new randoop.mutant.RingBufferMutant(10);
    var61.enqueue((java.lang.Object)1.0d);
    var35.enqueue((java.lang.Object)1.0d);
    var1.enqueue((java.lang.Object)var35);
    java.util.Iterator var66 = var1.iterator();
    int var67 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 2);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test21");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test22");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    java.util.Iterator var15 = var10.iterator();
    int var16 = var10.size();
    int var17 = var10.size();
    var1.enqueue((java.lang.Object)var10);
    java.util.Iterator var19 = var10.iterator();
    boolean var20 = var10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test23");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)(short)0);
    int var12 = var1.size();
    int var13 = var1.size();
    int var14 = var1.size();
    boolean var15 = var1.isEmpty();
    java.util.Iterator var16 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test24");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    java.util.Iterator var21 = var16.iterator();
    var11.enqueue((java.lang.Object)var16);
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    var24.enqueue((java.lang.Object)'#');
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    java.util.Iterator var29 = var24.iterator();
    java.util.Iterator var30 = var24.iterator();
    java.util.Iterator var31 = var24.iterator();
    var16.enqueue((java.lang.Object)var24);
    var1.enqueue((java.lang.Object)var16);
    var1.enqueue((java.lang.Object)(-1));
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    var37.enqueue((java.lang.Object)'#');
    java.util.Iterator var40 = var37.iterator();
    java.util.Iterator var41 = var37.iterator();
    java.util.Iterator var42 = var37.iterator();
    boolean var43 = var37.isEmpty();
    int var44 = var37.size();
    var1.enqueue((java.lang.Object)var44);
    java.util.Iterator var46 = var1.iterator();
    randoop.mutant.RingBufferMutant var48 = new randoop.mutant.RingBufferMutant(0);
    java.util.Iterator var49 = var48.iterator();
    var1.enqueue((java.lang.Object)var48);
    boolean var51 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test25");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    boolean var6 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    boolean var12 = var8.isEmpty();
    int var13 = var8.size();
    java.util.Iterator var14 = var8.iterator();
    int var15 = var8.size();
    java.lang.Object var16 = new java.lang.Object();
    var8.enqueue(var16);
    var1.enqueue((java.lang.Object)var8);
    randoop.mutant.RingBufferMutant var20 = new randoop.mutant.RingBufferMutant(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    int var25 = var20.size();
    var1.enqueue((java.lang.Object)var20);
    int var27 = var1.size();
    randoop.mutant.RingBufferMutant var29 = new randoop.mutant.RingBufferMutant(10);
    var29.enqueue((java.lang.Object)'#');
    java.util.Iterator var32 = var29.iterator();
    java.util.Iterator var33 = var29.iterator();
    java.util.Iterator var34 = var29.iterator();
    java.util.Iterator var35 = var29.iterator();
    boolean var36 = var29.isEmpty();
    var29.enqueue((java.lang.Object)(byte)10);
    var1.enqueue((java.lang.Object)var29);
    randoop.mutant.RingBufferMutant var41 = new randoop.mutant.RingBufferMutant(10);
    var41.enqueue((java.lang.Object)'#');
    java.util.Iterator var44 = var41.iterator();
    java.util.Iterator var45 = var41.iterator();
    java.util.Iterator var46 = var41.iterator();
    boolean var47 = var41.isEmpty();
    randoop.mutant.RingBufferMutant var49 = new randoop.mutant.RingBufferMutant(10);
    var49.enqueue((java.lang.Object)'#');
    java.util.Iterator var52 = var49.iterator();
    java.util.Iterator var53 = var49.iterator();
    java.util.Iterator var54 = var49.iterator();
    var41.enqueue((java.lang.Object)var49);
    java.util.Iterator var56 = var49.iterator();
    randoop.mutant.RingBufferMutant var58 = new randoop.mutant.RingBufferMutant(10);
    boolean var59 = var58.isEmpty();
    boolean var60 = var58.isEmpty();
    java.util.Iterator var61 = var58.iterator();
    boolean var62 = var58.isEmpty();
    int var63 = var58.size();
    int var64 = var58.size();
    randoop.mutant.RingBufferMutant var66 = new randoop.mutant.RingBufferMutant(10);
    var66.enqueue((java.lang.Object)'#');
    java.util.Iterator var69 = var66.iterator();
    java.util.Iterator var70 = var66.iterator();
    java.util.Iterator var71 = var66.iterator();
    java.util.Iterator var72 = var66.iterator();
    java.util.Iterator var73 = var66.iterator();
    int var74 = var66.size();
    var58.enqueue((java.lang.Object)var66);
    boolean var76 = var58.isEmpty();
    java.util.Iterator var77 = var58.iterator();
    var49.enqueue((java.lang.Object)var58);
    var1.enqueue((java.lang.Object)var58);
    java.util.Iterator var80 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test26");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    var11.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var15 = new randoop.mutant.RingBufferMutant(1);
    boolean var16 = var15.isEmpty();
    java.util.Iterator var17 = var15.iterator();
    java.util.Iterator var18 = var15.iterator();
    var11.enqueue((java.lang.Object)var18);
    int var20 = var11.size();
    boolean var21 = var11.isEmpty();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    java.util.Iterator var26 = var23.iterator();
    boolean var27 = var23.isEmpty();
    int var28 = var23.size();
    java.util.Iterator var29 = var23.iterator();
    int var30 = var23.size();
    java.util.Iterator var31 = var23.iterator();
    boolean var32 = var23.isEmpty();
    boolean var33 = var23.isEmpty();
    var11.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var23);
    int var36 = var23.size();
    int var37 = var23.size();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(1);
    boolean var40 = var39.isEmpty();
    java.util.Iterator var41 = var39.iterator();
    java.util.Iterator var42 = var39.iterator();
    java.util.Iterator var43 = var39.iterator();
    boolean var44 = var39.isEmpty();
    var23.enqueue((java.lang.Object)var39);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var46 = var39.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test27");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = new java.lang.Object();
    var1.enqueue(var6);
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    var16.enqueue((java.lang.Object)false);
    boolean var23 = var16.isEmpty();
    var10.enqueue((java.lang.Object)var16);
    var1.enqueue((java.lang.Object)var10);
    randoop.mutant.RingBufferMutant var27 = new randoop.mutant.RingBufferMutant(1);
    java.util.Iterator var28 = var27.iterator();
    var10.enqueue((java.lang.Object)var27);
    boolean var30 = var27.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test28");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    boolean var15 = var1.isEmpty();
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test29");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    boolean var19 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test30");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(1);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)100.0d);
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test31");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test32");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var7 = new randoop.mutant.RingBufferMutant(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    java.util.Iterator var15 = var1.iterator();
    int var16 = var1.size();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    var18.enqueue((java.lang.Object)' ');
    java.util.Iterator var23 = var18.iterator();
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    int var28 = var25.size();
    java.util.Iterator var29 = var25.iterator();
    java.lang.Object var30 = new java.lang.Object();
    var25.enqueue(var30);
    int var32 = var25.size();
    randoop.mutant.RingBufferMutant var34 = new randoop.mutant.RingBufferMutant(10);
    var34.enqueue((java.lang.Object)'#');
    var34.enqueue((java.lang.Object)' ');
    boolean var39 = var34.isEmpty();
    randoop.mutant.RingBufferMutant var41 = new randoop.mutant.RingBufferMutant(10);
    boolean var42 = var41.isEmpty();
    boolean var43 = var41.isEmpty();
    java.util.Iterator var44 = var41.iterator();
    boolean var45 = var41.isEmpty();
    int var46 = var41.size();
    java.util.Iterator var47 = var41.iterator();
    int var48 = var41.size();
    java.lang.Object var49 = new java.lang.Object();
    var41.enqueue(var49);
    var34.enqueue((java.lang.Object)var41);
    randoop.mutant.RingBufferMutant var53 = new randoop.mutant.RingBufferMutant(10);
    var53.enqueue((java.lang.Object)'#');
    java.util.Iterator var56 = var53.iterator();
    java.util.Iterator var57 = var53.iterator();
    int var58 = var53.size();
    randoop.mutant.RingBufferMutant var60 = new randoop.mutant.RingBufferMutant(10);
    boolean var61 = var60.isEmpty();
    boolean var62 = var60.isEmpty();
    java.util.Iterator var63 = var60.iterator();
    boolean var64 = var60.isEmpty();
    int var65 = var60.size();
    java.util.Iterator var66 = var60.iterator();
    int var67 = var60.size();
    java.lang.Object var68 = new java.lang.Object();
    var60.enqueue(var68);
    var53.enqueue((java.lang.Object)var60);
    var34.enqueue((java.lang.Object)var53);
    var25.enqueue((java.lang.Object)var53);
    boolean var73 = var25.isEmpty();
    var18.enqueue((java.lang.Object)var25);
    var1.enqueue((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test33");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    java.util.Iterator var23 = var17.iterator();
    var9.enqueue((java.lang.Object)var23);
    int var25 = var9.size();
    boolean var26 = var9.isEmpty();
    randoop.mutant.RingBufferMutant var28 = new randoop.mutant.RingBufferMutant(10);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    java.util.Iterator var31 = var28.iterator();
    randoop.mutant.RingBufferMutant var33 = new randoop.mutant.RingBufferMutant(10);
    var33.enqueue((java.lang.Object)'#');
    java.util.Iterator var36 = var33.iterator();
    java.util.Iterator var37 = var33.iterator();
    java.util.Iterator var38 = var33.iterator();
    var28.enqueue((java.lang.Object)var33);
    int var40 = var33.size();
    randoop.mutant.RingBufferMutant var42 = new randoop.mutant.RingBufferMutant(10);
    boolean var43 = var42.isEmpty();
    boolean var44 = var42.isEmpty();
    java.util.Iterator var45 = var42.iterator();
    boolean var46 = var42.isEmpty();
    int var47 = var42.size();
    int var48 = var42.size();
    java.util.Iterator var49 = var42.iterator();
    var33.enqueue((java.lang.Object)var49);
    var9.enqueue((java.lang.Object)var33);
    randoop.mutant.RingBufferMutant var53 = new randoop.mutant.RingBufferMutant(10);
    var53.enqueue((java.lang.Object)'#');
    var53.enqueue((java.lang.Object)' ');
    boolean var58 = var53.isEmpty();
    boolean var59 = var53.isEmpty();
    var33.enqueue((java.lang.Object)var53);
    int var61 = var33.size();
    int var62 = var33.size();
    boolean var63 = var33.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test34");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    int var6 = var1.size();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    randoop.mutant.RingBufferMutant var12 = new randoop.mutant.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    java.util.Iterator var17 = var12.iterator();
    java.util.Iterator var18 = var12.iterator();
    java.util.Iterator var19 = var12.iterator();
    var12.enqueue((java.lang.Object)"hi!");
    boolean var22 = var12.isEmpty();
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    int var27 = var24.size();
    java.util.Iterator var28 = var24.iterator();
    randoop.mutant.RingBufferMutant var30 = new randoop.mutant.RingBufferMutant(10);
    var30.enqueue((java.lang.Object)'#');
    var30.enqueue((java.lang.Object)' ');
    boolean var35 = var30.isEmpty();
    var24.enqueue((java.lang.Object)var35);
    java.util.Iterator var37 = var24.iterator();
    java.util.Iterator var38 = var24.iterator();
    java.util.Iterator var39 = var24.iterator();
    var12.enqueue((java.lang.Object)var24);
    int var41 = var24.size();
    var1.enqueue((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test35");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var16 = var9.iterator();
    int var17 = var9.size();
    java.util.Iterator var18 = var9.iterator();
    int var19 = var9.size();
    int var20 = var9.size();
    randoop.mutant.RingBufferMutant var22 = new randoop.mutant.RingBufferMutant(10);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    java.util.Iterator var25 = var22.iterator();
    boolean var26 = var22.isEmpty();
    int var27 = var22.size();
    int var28 = var22.size();
    boolean var29 = var22.isEmpty();
    boolean var30 = var22.isEmpty();
    randoop.mutant.RingBufferMutant var32 = new randoop.mutant.RingBufferMutant(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    java.util.Iterator var35 = var32.iterator();
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    var37.enqueue((java.lang.Object)'#');
    java.util.Iterator var40 = var37.iterator();
    java.util.Iterator var41 = var37.iterator();
    java.util.Iterator var42 = var37.iterator();
    var32.enqueue((java.lang.Object)var37);
    randoop.mutant.RingBufferMutant var45 = new randoop.mutant.RingBufferMutant(10);
    var45.enqueue((java.lang.Object)'#');
    java.util.Iterator var48 = var45.iterator();
    java.util.Iterator var49 = var45.iterator();
    java.util.Iterator var50 = var45.iterator();
    java.util.Iterator var51 = var45.iterator();
    java.util.Iterator var52 = var45.iterator();
    var37.enqueue((java.lang.Object)var45);
    var22.enqueue((java.lang.Object)var37);
    var22.enqueue((java.lang.Object)(-1));
    randoop.mutant.RingBufferMutant var58 = new randoop.mutant.RingBufferMutant(10);
    var58.enqueue((java.lang.Object)'#');
    java.util.Iterator var61 = var58.iterator();
    java.util.Iterator var62 = var58.iterator();
    java.util.Iterator var63 = var58.iterator();
    boolean var64 = var58.isEmpty();
    int var65 = var58.size();
    var22.enqueue((java.lang.Object)var65);
    java.util.Iterator var67 = var22.iterator();
    boolean var68 = var22.isEmpty();
    var9.enqueue((java.lang.Object)var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test36");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    int var14 = var9.size();
    int var15 = var9.size();
    boolean var16 = var9.isEmpty();
    boolean var17 = var9.isEmpty();
    randoop.mutant.RingBufferMutant var19 = new randoop.mutant.RingBufferMutant(10);
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    java.util.Iterator var22 = var19.iterator();
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    var24.enqueue((java.lang.Object)'#');
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    java.util.Iterator var29 = var24.iterator();
    var19.enqueue((java.lang.Object)var24);
    randoop.mutant.RingBufferMutant var32 = new randoop.mutant.RingBufferMutant(10);
    var32.enqueue((java.lang.Object)'#');
    java.util.Iterator var35 = var32.iterator();
    java.util.Iterator var36 = var32.iterator();
    java.util.Iterator var37 = var32.iterator();
    java.util.Iterator var38 = var32.iterator();
    java.util.Iterator var39 = var32.iterator();
    var24.enqueue((java.lang.Object)var32);
    var9.enqueue((java.lang.Object)var24);
    java.util.Iterator var42 = var24.iterator();
    var1.enqueue((java.lang.Object)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test37");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    randoop.mutant.RingBufferMutant var12 = new randoop.mutant.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)1.0d);
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    boolean var20 = var16.isEmpty();
    int var21 = var16.size();
    boolean var22 = var16.isEmpty();
    java.util.Iterator var23 = var16.iterator();
    var12.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var12);
    boolean var26 = var12.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test38");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    boolean var14 = var10.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(0);
    int var17 = var16.size();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    var10.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    var23.enqueue((java.lang.Object)'#');
    var23.enqueue((java.lang.Object)' ');
    boolean var28 = var23.isEmpty();
    boolean var29 = var23.isEmpty();
    int var30 = var23.size();
    boolean var31 = var23.isEmpty();
    int var32 = var23.size();
    var1.enqueue((java.lang.Object)var32);
    java.util.Iterator var34 = var1.iterator();
    boolean var35 = var1.isEmpty();
    java.util.Iterator var36 = var1.iterator();
    boolean var37 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test39");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    boolean var14 = var10.isEmpty();
    boolean var15 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var15);
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    java.util.Iterator var23 = var18.iterator();
    boolean var24 = var18.isEmpty();
    randoop.mutant.RingBufferMutant var26 = new randoop.mutant.RingBufferMutant(10);
    var26.enqueue((java.lang.Object)'#');
    java.util.Iterator var29 = var26.iterator();
    java.util.Iterator var30 = var26.iterator();
    java.util.Iterator var31 = var26.iterator();
    var18.enqueue((java.lang.Object)var26);
    java.util.Iterator var33 = var26.iterator();
    boolean var34 = var26.isEmpty();
    var1.enqueue((java.lang.Object)var26);
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    var37.enqueue((java.lang.Object)'#');
    java.util.Iterator var40 = var37.iterator();
    java.util.Iterator var41 = var37.iterator();
    java.util.Iterator var42 = var37.iterator();
    java.util.Iterator var43 = var37.iterator();
    randoop.mutant.RingBufferMutant var45 = new randoop.mutant.RingBufferMutant(10);
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    java.util.Iterator var48 = var45.iterator();
    boolean var49 = var45.isEmpty();
    java.util.Iterator var50 = var45.iterator();
    var37.enqueue((java.lang.Object)var45);
    randoop.mutant.RingBufferMutant var53 = new randoop.mutant.RingBufferMutant(10);
    var53.enqueue((java.lang.Object)'#');
    java.util.Iterator var56 = var53.iterator();
    java.util.Iterator var57 = var53.iterator();
    java.util.Iterator var58 = var53.iterator();
    java.util.Iterator var59 = var53.iterator();
    var45.enqueue((java.lang.Object)var59);
    int var61 = var45.size();
    boolean var62 = var45.isEmpty();
    randoop.mutant.RingBufferMutant var64 = new randoop.mutant.RingBufferMutant(10);
    boolean var65 = var64.isEmpty();
    boolean var66 = var64.isEmpty();
    java.util.Iterator var67 = var64.iterator();
    randoop.mutant.RingBufferMutant var69 = new randoop.mutant.RingBufferMutant(10);
    var69.enqueue((java.lang.Object)'#');
    java.util.Iterator var72 = var69.iterator();
    java.util.Iterator var73 = var69.iterator();
    java.util.Iterator var74 = var69.iterator();
    var64.enqueue((java.lang.Object)var69);
    int var76 = var69.size();
    randoop.mutant.RingBufferMutant var78 = new randoop.mutant.RingBufferMutant(10);
    boolean var79 = var78.isEmpty();
    boolean var80 = var78.isEmpty();
    java.util.Iterator var81 = var78.iterator();
    boolean var82 = var78.isEmpty();
    int var83 = var78.size();
    int var84 = var78.size();
    java.util.Iterator var85 = var78.iterator();
    var69.enqueue((java.lang.Object)var85);
    var45.enqueue((java.lang.Object)var69);
    randoop.mutant.RingBufferMutant var89 = new randoop.mutant.RingBufferMutant(10);
    var89.enqueue((java.lang.Object)'#');
    var89.enqueue((java.lang.Object)' ');
    boolean var94 = var89.isEmpty();
    boolean var95 = var89.isEmpty();
    var69.enqueue((java.lang.Object)var89);
    var26.enqueue((java.lang.Object)var89);
    java.util.Iterator var98 = var26.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var98);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test40");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test41");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = new java.lang.Object();
    var1.enqueue(var6);
    int var8 = var1.size();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test42");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    var8.enqueue((java.lang.Object)'#');
    int var11 = var8.size();
    boolean var12 = var8.isEmpty();
    var1.enqueue((java.lang.Object)var8);
    java.util.Iterator var14 = var1.iterator();
    java.util.Iterator var15 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test43");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    java.util.Iterator var20 = var17.iterator();
    randoop.mutant.RingBufferMutant var22 = new randoop.mutant.RingBufferMutant(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    java.util.Iterator var26 = var22.iterator();
    java.util.Iterator var27 = var22.iterator();
    var17.enqueue((java.lang.Object)var22);
    java.util.Iterator var29 = var22.iterator();
    var9.enqueue((java.lang.Object)var22);
    boolean var31 = var9.isEmpty();
    randoop.mutant.RingBufferMutant var33 = new randoop.mutant.RingBufferMutant(10);
    var33.enqueue((java.lang.Object)'#');
    var33.enqueue((java.lang.Object)' ');
    int var38 = var33.size();
    int var39 = var33.size();
    java.util.Iterator var40 = var33.iterator();
    java.util.Iterator var41 = var33.iterator();
    var9.enqueue((java.lang.Object)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test44");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    int var11 = var1.size();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test45");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    var10.enqueue((java.lang.Object)false);
    int var17 = var10.size();
    boolean var18 = var10.isEmpty();
    java.util.Iterator var19 = var10.iterator();
    boolean var20 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var10);
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    java.util.Iterator var26 = var23.iterator();
    boolean var27 = var23.isEmpty();
    int var28 = var23.size();
    boolean var29 = var23.isEmpty();
    var1.enqueue((java.lang.Object)var23);
    int var31 = var23.size();
    int var32 = var23.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test46");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    java.util.Iterator var15 = var9.iterator();
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    java.util.Iterator var20 = var17.iterator();
    boolean var21 = var17.isEmpty();
    java.util.Iterator var22 = var17.iterator();
    var9.enqueue((java.lang.Object)var17);
    boolean var24 = var9.isEmpty();
    var1.enqueue((java.lang.Object)var9);
    int var26 = var1.size();
    randoop.mutant.RingBufferMutant var28 = new randoop.mutant.RingBufferMutant(10);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    java.util.Iterator var31 = var28.iterator();
    boolean var32 = var28.isEmpty();
    int var33 = var28.size();
    boolean var34 = var28.isEmpty();
    randoop.mutant.RingBufferMutant var36 = new randoop.mutant.RingBufferMutant(1);
    boolean var37 = var36.isEmpty();
    int var38 = var36.size();
    randoop.mutant.RingBufferMutant var40 = new randoop.mutant.RingBufferMutant(10);
    boolean var41 = var40.isEmpty();
    boolean var42 = var40.isEmpty();
    boolean var43 = var40.isEmpty();
    int var44 = var40.size();
    int var45 = var40.size();
    var36.enqueue((java.lang.Object)var45);
    var28.enqueue((java.lang.Object)var36);
    boolean var48 = var36.isEmpty();
    int var49 = var36.size();
    var1.enqueue((java.lang.Object)var36);
    java.util.Iterator var51 = var36.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test47");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    boolean var12 = var8.isEmpty();
    int var13 = var8.size();
    java.util.Iterator var14 = var8.iterator();
    int var15 = var8.size();
    java.lang.Object var16 = new java.lang.Object();
    var8.enqueue(var16);
    var1.enqueue((java.lang.Object)var8);
    int var19 = var8.size();
    java.util.Iterator var20 = var8.iterator();
    randoop.mutant.RingBufferMutant var22 = new randoop.mutant.RingBufferMutant(10);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    int var25 = var22.size();
    java.util.Iterator var26 = var22.iterator();
    java.lang.Object var27 = new java.lang.Object();
    var22.enqueue(var27);
    java.util.Iterator var29 = var22.iterator();
    randoop.mutant.RingBufferMutant var31 = new randoop.mutant.RingBufferMutant(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    java.util.Iterator var36 = var31.iterator();
    boolean var37 = var31.isEmpty();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(10);
    var39.enqueue((java.lang.Object)'#');
    java.util.Iterator var42 = var39.iterator();
    java.util.Iterator var43 = var39.iterator();
    java.util.Iterator var44 = var39.iterator();
    var31.enqueue((java.lang.Object)var39);
    int var46 = var39.size();
    java.util.Iterator var47 = var39.iterator();
    var22.enqueue((java.lang.Object)var47);
    var8.enqueue((java.lang.Object)var47);
    boolean var50 = var8.isEmpty();
    randoop.mutant.RingBufferMutant var52 = new randoop.mutant.RingBufferMutant(10);
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    java.util.Iterator var55 = var52.iterator();
    randoop.mutant.RingBufferMutant var57 = new randoop.mutant.RingBufferMutant(10);
    var57.enqueue((java.lang.Object)'#');
    java.util.Iterator var60 = var57.iterator();
    java.util.Iterator var61 = var57.iterator();
    java.util.Iterator var62 = var57.iterator();
    var52.enqueue((java.lang.Object)var57);
    randoop.mutant.RingBufferMutant var65 = new randoop.mutant.RingBufferMutant(10);
    var65.enqueue((java.lang.Object)'#');
    java.util.Iterator var68 = var65.iterator();
    java.util.Iterator var69 = var65.iterator();
    java.util.Iterator var70 = var65.iterator();
    java.util.Iterator var71 = var65.iterator();
    java.util.Iterator var72 = var65.iterator();
    var57.enqueue((java.lang.Object)var65);
    var8.enqueue((java.lang.Object)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test48");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    java.util.Iterator var15 = var9.iterator();
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    java.util.Iterator var20 = var17.iterator();
    boolean var21 = var17.isEmpty();
    java.util.Iterator var22 = var17.iterator();
    var9.enqueue((java.lang.Object)var17);
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    java.util.Iterator var30 = var25.iterator();
    java.util.Iterator var31 = var25.iterator();
    var17.enqueue((java.lang.Object)var31);
    var1.enqueue((java.lang.Object)var17);
    java.util.Iterator var34 = var17.iterator();
    java.util.Iterator var35 = var17.iterator();
    int var36 = var17.size();
    java.util.Iterator var37 = var17.iterator();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(100);
    int var40 = var39.size();
    randoop.mutant.RingBufferMutant var42 = new randoop.mutant.RingBufferMutant(10);
    boolean var43 = var42.isEmpty();
    boolean var44 = var42.isEmpty();
    java.util.Iterator var45 = var42.iterator();
    boolean var46 = var42.isEmpty();
    randoop.mutant.RingBufferMutant var48 = new randoop.mutant.RingBufferMutant(10);
    var48.enqueue((java.lang.Object)'#');
    java.util.Iterator var51 = var48.iterator();
    java.util.Iterator var52 = var48.iterator();
    var48.enqueue((java.lang.Object)false);
    boolean var55 = var48.isEmpty();
    var42.enqueue((java.lang.Object)var48);
    var39.enqueue((java.lang.Object)var48);
    var17.enqueue((java.lang.Object)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test49");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var13 = var6.size();
    int var14 = var6.size();
    boolean var15 = var6.isEmpty();
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    java.util.Iterator var20 = var17.iterator();
    randoop.mutant.RingBufferMutant var22 = new randoop.mutant.RingBufferMutant(10);
    var22.enqueue((java.lang.Object)'#');
    java.util.Iterator var25 = var22.iterator();
    java.util.Iterator var26 = var22.iterator();
    java.util.Iterator var27 = var22.iterator();
    var17.enqueue((java.lang.Object)var22);
    int var29 = var22.size();
    randoop.mutant.RingBufferMutant var31 = new randoop.mutant.RingBufferMutant(10);
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    java.util.Iterator var34 = var31.iterator();
    boolean var35 = var31.isEmpty();
    int var36 = var31.size();
    int var37 = var31.size();
    java.util.Iterator var38 = var31.iterator();
    var22.enqueue((java.lang.Object)var38);
    var6.enqueue((java.lang.Object)var22);
    java.util.Iterator var41 = var22.iterator();
    java.util.Iterator var42 = var22.iterator();
    randoop.mutant.RingBufferMutant var44 = new randoop.mutant.RingBufferMutant(10);
    var44.enqueue((java.lang.Object)'#');
    java.util.Iterator var47 = var44.iterator();
    java.util.Iterator var48 = var44.iterator();
    java.util.Iterator var49 = var44.iterator();
    java.util.Iterator var50 = var44.iterator();
    boolean var51 = var44.isEmpty();
    randoop.mutant.RingBufferMutant var53 = new randoop.mutant.RingBufferMutant(10);
    boolean var54 = var53.isEmpty();
    boolean var55 = var53.isEmpty();
    int var56 = var53.size();
    var44.enqueue((java.lang.Object)var53);
    boolean var58 = var44.isEmpty();
    java.util.Iterator var59 = var44.iterator();
    var22.enqueue((java.lang.Object)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test50");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test51");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    boolean var15 = var11.isEmpty();
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    var17.enqueue((java.lang.Object)false);
    boolean var24 = var17.isEmpty();
    var11.enqueue((java.lang.Object)var17);
    int var26 = var17.size();
    java.util.Iterator var27 = var17.iterator();
    var1.enqueue((java.lang.Object)var17);
    java.util.Iterator var29 = var17.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test52");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var13 = var6.size();
    int var14 = var6.size();
    java.util.Iterator var15 = var6.iterator();
    int var16 = var6.size();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    int var22 = var18.size();
    var6.enqueue((java.lang.Object)var18);
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    var25.enqueue((java.lang.Object)'#');
    int var28 = var25.size();
    randoop.mutant.RingBufferMutant var30 = new randoop.mutant.RingBufferMutant(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    int var33 = var30.size();
    java.util.Iterator var34 = var30.iterator();
    java.util.Iterator var35 = var30.iterator();
    var25.enqueue((java.lang.Object)var35);
    var6.enqueue((java.lang.Object)var35);
    boolean var38 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test53");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test54");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    boolean var15 = var9.isEmpty();
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    var9.enqueue((java.lang.Object)var17);
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    java.util.Iterator var28 = var25.iterator();
    randoop.mutant.RingBufferMutant var30 = new randoop.mutant.RingBufferMutant(10);
    var30.enqueue((java.lang.Object)'#');
    java.util.Iterator var33 = var30.iterator();
    java.util.Iterator var34 = var30.iterator();
    java.util.Iterator var35 = var30.iterator();
    var25.enqueue((java.lang.Object)var30);
    java.util.Iterator var37 = var30.iterator();
    var17.enqueue((java.lang.Object)var30);
    int var39 = var30.size();
    var1.enqueue((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test55");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(100);
    int var2 = var1.size();
    randoop.mutant.RingBufferMutant var4 = new randoop.mutant.RingBufferMutant(10);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    java.util.Iterator var7 = var4.iterator();
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    java.util.Iterator var10 = var4.iterator();
    int var11 = var4.size();
    java.util.Iterator var12 = var4.iterator();
    randoop.mutant.RingBufferMutant var14 = new randoop.mutant.RingBufferMutant(10);
    var14.enqueue((java.lang.Object)'#');
    int var17 = var14.size();
    java.util.Iterator var18 = var14.iterator();
    boolean var19 = var14.isEmpty();
    java.util.Iterator var20 = var14.iterator();
    var4.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test56");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    java.util.Iterator var15 = var9.iterator();
    java.util.Iterator var16 = var9.iterator();
    int var17 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    boolean var19 = var9.isEmpty();
    java.util.Iterator var20 = var9.iterator();
    int var21 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test57");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)1.0d);
    randoop.mutant.RingBufferMutant var14 = new randoop.mutant.RingBufferMutant(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    int var19 = var14.size();
    boolean var20 = var14.isEmpty();
    java.util.Iterator var21 = var14.iterator();
    var10.enqueue((java.lang.Object)var21);
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(0);
    int var25 = var24.size();
    java.util.Iterator var26 = var24.iterator();
    var10.enqueue((java.lang.Object)var24);
    var1.enqueue((java.lang.Object)var24);
    int var29 = var1.size();
    int var30 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 3);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test58");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(0);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test59");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    boolean var15 = var11.isEmpty();
    var11.enqueue((java.lang.Object)'#');
    boolean var18 = var11.isEmpty();
    java.util.Iterator var19 = var11.iterator();
    var11.enqueue((java.lang.Object)(short)0);
    int var22 = var11.size();
    int var23 = var11.size();
    int var24 = var11.size();
    randoop.mutant.RingBufferMutant var26 = new randoop.mutant.RingBufferMutant(10);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    java.util.Iterator var29 = var26.iterator();
    boolean var30 = var26.isEmpty();
    var26.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var34 = new randoop.mutant.RingBufferMutant(1);
    boolean var35 = var34.isEmpty();
    java.util.Iterator var36 = var34.iterator();
    java.util.Iterator var37 = var34.iterator();
    java.util.Iterator var38 = var34.iterator();
    randoop.mutant.RingBufferMutant var40 = new randoop.mutant.RingBufferMutant(10);
    var40.enqueue((java.lang.Object)'#');
    java.util.Iterator var43 = var40.iterator();
    java.util.Iterator var44 = var40.iterator();
    java.util.Iterator var45 = var40.iterator();
    boolean var46 = var40.isEmpty();
    randoop.mutant.RingBufferMutant var48 = new randoop.mutant.RingBufferMutant(10);
    var48.enqueue((java.lang.Object)'#');
    java.util.Iterator var51 = var48.iterator();
    java.util.Iterator var52 = var48.iterator();
    java.util.Iterator var53 = var48.iterator();
    var40.enqueue((java.lang.Object)var48);
    randoop.mutant.RingBufferMutant var56 = new randoop.mutant.RingBufferMutant(10);
    boolean var57 = var56.isEmpty();
    boolean var58 = var56.isEmpty();
    java.util.Iterator var59 = var56.iterator();
    randoop.mutant.RingBufferMutant var61 = new randoop.mutant.RingBufferMutant(10);
    var61.enqueue((java.lang.Object)'#');
    java.util.Iterator var64 = var61.iterator();
    java.util.Iterator var65 = var61.iterator();
    java.util.Iterator var66 = var61.iterator();
    var56.enqueue((java.lang.Object)var61);
    java.util.Iterator var68 = var61.iterator();
    var48.enqueue((java.lang.Object)var61);
    var34.enqueue((java.lang.Object)var48);
    var26.enqueue((java.lang.Object)var34);
    java.util.Iterator var72 = var34.iterator();
    var11.enqueue((java.lang.Object)var34);
    int var74 = var11.size();
    var1.enqueue((java.lang.Object)var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 3);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test60");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    java.util.Iterator var15 = var10.iterator();
    java.util.Iterator var16 = var10.iterator();
    boolean var17 = var10.isEmpty();
    boolean var18 = var10.isEmpty();
    randoop.mutant.RingBufferMutant var20 = new randoop.mutant.RingBufferMutant(10);
    var20.enqueue((java.lang.Object)'#');
    java.util.Iterator var23 = var20.iterator();
    java.util.Iterator var24 = var20.iterator();
    int var25 = var20.size();
    randoop.mutant.RingBufferMutant var27 = new randoop.mutant.RingBufferMutant(10);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    java.util.Iterator var30 = var27.iterator();
    boolean var31 = var27.isEmpty();
    int var32 = var27.size();
    java.util.Iterator var33 = var27.iterator();
    int var34 = var27.size();
    java.lang.Object var35 = new java.lang.Object();
    var27.enqueue(var35);
    var20.enqueue((java.lang.Object)var27);
    int var38 = var27.size();
    java.util.Iterator var39 = var27.iterator();
    randoop.mutant.RingBufferMutant var41 = new randoop.mutant.RingBufferMutant(10);
    boolean var42 = var41.isEmpty();
    boolean var43 = var41.isEmpty();
    int var44 = var41.size();
    java.util.Iterator var45 = var41.iterator();
    java.lang.Object var46 = new java.lang.Object();
    var41.enqueue(var46);
    java.util.Iterator var48 = var41.iterator();
    randoop.mutant.RingBufferMutant var50 = new randoop.mutant.RingBufferMutant(10);
    var50.enqueue((java.lang.Object)'#');
    java.util.Iterator var53 = var50.iterator();
    java.util.Iterator var54 = var50.iterator();
    java.util.Iterator var55 = var50.iterator();
    boolean var56 = var50.isEmpty();
    randoop.mutant.RingBufferMutant var58 = new randoop.mutant.RingBufferMutant(10);
    var58.enqueue((java.lang.Object)'#');
    java.util.Iterator var61 = var58.iterator();
    java.util.Iterator var62 = var58.iterator();
    java.util.Iterator var63 = var58.iterator();
    var50.enqueue((java.lang.Object)var58);
    int var65 = var58.size();
    java.util.Iterator var66 = var58.iterator();
    var41.enqueue((java.lang.Object)var66);
    var27.enqueue((java.lang.Object)var66);
    var10.enqueue((java.lang.Object)var27);
    var1.enqueue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test61");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test62");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test63");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    randoop.mutant.RingBufferMutant var12 = new randoop.mutant.RingBufferMutant(10);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    java.util.Iterator var15 = var12.iterator();
    boolean var16 = var12.isEmpty();
    int var17 = var12.size();
    int var18 = var12.size();
    boolean var19 = var12.isEmpty();
    boolean var20 = var12.isEmpty();
    boolean var21 = var12.isEmpty();
    java.util.Iterator var22 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    java.util.Iterator var24 = var12.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test64");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(1);
    boolean var10 = var9.isEmpty();
    java.util.Iterator var11 = var9.iterator();
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    randoop.mutant.RingBufferMutant var15 = new randoop.mutant.RingBufferMutant(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    java.util.Iterator var20 = var15.iterator();
    boolean var21 = var15.isEmpty();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    java.util.Iterator var27 = var23.iterator();
    java.util.Iterator var28 = var23.iterator();
    var15.enqueue((java.lang.Object)var23);
    randoop.mutant.RingBufferMutant var31 = new randoop.mutant.RingBufferMutant(10);
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    java.util.Iterator var34 = var31.iterator();
    randoop.mutant.RingBufferMutant var36 = new randoop.mutant.RingBufferMutant(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    java.util.Iterator var41 = var36.iterator();
    var31.enqueue((java.lang.Object)var36);
    java.util.Iterator var43 = var36.iterator();
    var23.enqueue((java.lang.Object)var36);
    var9.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var9);
    boolean var47 = var9.isEmpty();
    int var48 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test65");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    var1.enqueue((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test66");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test67");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    boolean var20 = var16.isEmpty();
    int var21 = var16.size();
    java.util.Iterator var22 = var16.iterator();
    int var23 = var16.size();
    java.util.Iterator var24 = var16.iterator();
    java.util.Iterator var25 = var16.iterator();
    boolean var26 = var16.isEmpty();
    var1.enqueue((java.lang.Object)var26);
    java.util.Iterator var28 = var1.iterator();
    boolean var29 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test68");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var16 = var9.iterator();
    java.util.Iterator var17 = var9.iterator();
    boolean var18 = var9.isEmpty();
    randoop.mutant.RingBufferMutant var20 = new randoop.mutant.RingBufferMutant(2);
    randoop.mutant.RingBufferMutant var22 = new randoop.mutant.RingBufferMutant(10);
    var22.enqueue((java.lang.Object)'#');
    int var25 = var22.size();
    java.util.Iterator var26 = var22.iterator();
    boolean var27 = var22.isEmpty();
    var20.enqueue((java.lang.Object)var22);
    var9.enqueue((java.lang.Object)var20);
    int var30 = var20.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test69");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    boolean var15 = var11.isEmpty();
    int var16 = var11.size();
    boolean var17 = var11.isEmpty();
    int var18 = var11.size();
    var1.enqueue((java.lang.Object)var18);
    int var20 = var1.size();
    boolean var21 = var1.isEmpty();
    java.util.Iterator var22 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test70");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test71");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    boolean var15 = var11.isEmpty();
    int var16 = var11.size();
    boolean var17 = var11.isEmpty();
    java.util.Iterator var18 = var11.iterator();
    int var19 = var11.size();
    java.util.Iterator var20 = var11.iterator();
    int var21 = var11.size();
    var1.enqueue((java.lang.Object)var11);
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    randoop.mutant.RingBufferMutant var29 = new randoop.mutant.RingBufferMutant(10);
    var29.enqueue((java.lang.Object)'#');
    java.util.Iterator var32 = var29.iterator();
    java.util.Iterator var33 = var29.iterator();
    java.util.Iterator var34 = var29.iterator();
    var24.enqueue((java.lang.Object)var29);
    int var36 = var29.size();
    var29.enqueue((java.lang.Object)100.0d);
    randoop.mutant.RingBufferMutant var40 = new randoop.mutant.RingBufferMutant(0);
    int var41 = var40.size();
    java.util.Iterator var42 = var40.iterator();
    boolean var43 = var40.isEmpty();
    var29.enqueue((java.lang.Object)var43);
    randoop.mutant.RingBufferMutant var46 = new randoop.mutant.RingBufferMutant(10);
    boolean var47 = var46.isEmpty();
    boolean var48 = var46.isEmpty();
    java.util.Iterator var49 = var46.iterator();
    boolean var50 = var46.isEmpty();
    var46.enqueue((java.lang.Object)'#');
    int var53 = var46.size();
    boolean var54 = var46.isEmpty();
    var29.enqueue((java.lang.Object)var46);
    boolean var56 = var46.isEmpty();
    var1.enqueue((java.lang.Object)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test72");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var13 = var6.iterator();
    randoop.mutant.RingBufferMutant var15 = new randoop.mutant.RingBufferMutant(0);
    boolean var16 = var15.isEmpty();
    java.util.Iterator var17 = var15.iterator();
    var6.enqueue((java.lang.Object)var17);
    boolean var19 = var6.isEmpty();
    java.util.Iterator var20 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test73");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    int var19 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test74");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var13 = var6.size();
    var6.enqueue((java.lang.Object)100.0d);
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(0);
    int var18 = var17.size();
    java.util.Iterator var19 = var17.iterator();
    boolean var20 = var17.isEmpty();
    var6.enqueue((java.lang.Object)var20);
    java.util.Iterator var22 = var6.iterator();
    java.util.Iterator var23 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test75");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    randoop.mutant.RingBufferMutant var14 = new randoop.mutant.RingBufferMutant(0);
    java.util.Iterator var15 = var14.iterator();
    var6.enqueue((java.lang.Object)var14);
    int var17 = var14.size();
    java.util.Iterator var18 = var14.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test76");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = new java.lang.Object();
    var1.enqueue(var6);
    int var8 = var1.size();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    var10.enqueue((java.lang.Object)'#');
    int var17 = var10.size();
    boolean var18 = var10.isEmpty();
    randoop.mutant.RingBufferMutant var20 = new randoop.mutant.RingBufferMutant(10);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    java.util.Iterator var23 = var20.iterator();
    boolean var24 = var20.isEmpty();
    randoop.mutant.RingBufferMutant var26 = new randoop.mutant.RingBufferMutant(10);
    var26.enqueue((java.lang.Object)'#');
    int var29 = var26.size();
    java.util.Iterator var30 = var26.iterator();
    var20.enqueue((java.lang.Object)var30);
    java.util.Iterator var32 = var20.iterator();
    java.util.Iterator var33 = var20.iterator();
    var10.enqueue((java.lang.Object)var33);
    var1.enqueue((java.lang.Object)var33);
    boolean var36 = var1.isEmpty();
    int var37 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 2);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test77");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = new java.lang.Object();
    var1.enqueue(var6);
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    var16.enqueue((java.lang.Object)false);
    boolean var23 = var16.isEmpty();
    var10.enqueue((java.lang.Object)var16);
    var1.enqueue((java.lang.Object)var10);
    randoop.mutant.RingBufferMutant var27 = new randoop.mutant.RingBufferMutant(1);
    java.util.Iterator var28 = var27.iterator();
    var10.enqueue((java.lang.Object)var27);
    boolean var30 = var10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test78");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var7 = new randoop.mutant.RingBufferMutant(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    boolean var14 = var7.isEmpty();
    var1.enqueue((java.lang.Object)var7);
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    var17.enqueue((java.lang.Object)'#');
    int var20 = var17.size();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    var1.enqueue((java.lang.Object)var17);
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    int var28 = var25.size();
    java.util.Iterator var29 = var25.iterator();
    java.lang.Object var30 = new java.lang.Object();
    var25.enqueue(var30);
    java.util.Iterator var32 = var25.iterator();
    boolean var33 = var25.isEmpty();
    randoop.mutant.RingBufferMutant var35 = new randoop.mutant.RingBufferMutant(2);
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    var37.enqueue((java.lang.Object)'#');
    var35.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var42 = new randoop.mutant.RingBufferMutant(10);
    var42.enqueue((java.lang.Object)'#');
    java.util.Iterator var45 = var42.iterator();
    java.util.Iterator var46 = var42.iterator();
    java.util.Iterator var47 = var42.iterator();
    var35.enqueue((java.lang.Object)var47);
    var25.enqueue((java.lang.Object)var47);
    var1.enqueue((java.lang.Object)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test79");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    boolean var14 = var10.isEmpty();
    boolean var15 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var15);
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    boolean var22 = var18.isEmpty();
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    var24.enqueue((java.lang.Object)'#');
    int var27 = var24.size();
    java.util.Iterator var28 = var24.iterator();
    var18.enqueue((java.lang.Object)var28);
    randoop.mutant.RingBufferMutant var31 = new randoop.mutant.RingBufferMutant(10);
    var31.enqueue((java.lang.Object)'#');
    int var34 = var31.size();
    randoop.mutant.RingBufferMutant var36 = new randoop.mutant.RingBufferMutant(10);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    int var39 = var36.size();
    java.util.Iterator var40 = var36.iterator();
    java.util.Iterator var41 = var36.iterator();
    var31.enqueue((java.lang.Object)var41);
    var18.enqueue((java.lang.Object)var41);
    var1.enqueue((java.lang.Object)var18);
    randoop.mutant.RingBufferMutant var46 = new randoop.mutant.RingBufferMutant(10);
    var46.enqueue((java.lang.Object)'#');
    java.util.Iterator var49 = var46.iterator();
    java.util.Iterator var50 = var46.iterator();
    var46.enqueue((java.lang.Object)false);
    int var53 = var46.size();
    int var54 = var46.size();
    boolean var55 = var46.isEmpty();
    var18.enqueue((java.lang.Object)var55);
    int var57 = var18.size();
    boolean var58 = var18.isEmpty();
    boolean var59 = var18.isEmpty();
    randoop.mutant.RingBufferMutant var61 = new randoop.mutant.RingBufferMutant(1);
    boolean var62 = var61.isEmpty();
    java.util.Iterator var63 = var61.iterator();
    java.util.Iterator var64 = var61.iterator();
    java.util.Iterator var65 = var61.iterator();
    var18.enqueue((java.lang.Object)var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test80");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    var1.enqueue((java.lang.Object)"hi!");
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test81");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(3);
    java.util.Iterator var2 = var1.iterator();
    randoop.mutant.RingBufferMutant var4 = new randoop.mutant.RingBufferMutant(1);
    boolean var5 = var4.isEmpty();
    java.util.Iterator var6 = var4.iterator();
    java.util.Iterator var7 = var4.iterator();
    java.util.Iterator var8 = var4.iterator();
    var1.enqueue((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test82");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var7 = new randoop.mutant.RingBufferMutant(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    java.util.Iterator var15 = var1.iterator();
    java.util.Iterator var16 = var1.iterator();
    boolean var17 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var19 = new randoop.mutant.RingBufferMutant(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    java.util.Iterator var24 = var19.iterator();
    boolean var25 = var19.isEmpty();
    randoop.mutant.RingBufferMutant var27 = new randoop.mutant.RingBufferMutant(10);
    var27.enqueue((java.lang.Object)'#');
    java.util.Iterator var30 = var27.iterator();
    java.util.Iterator var31 = var27.iterator();
    java.util.Iterator var32 = var27.iterator();
    var19.enqueue((java.lang.Object)var27);
    boolean var34 = var19.isEmpty();
    java.util.Iterator var35 = var19.iterator();
    var1.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test83");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var7 = new randoop.mutant.RingBufferMutant(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    java.util.Iterator var15 = var1.iterator();
    boolean var16 = var1.isEmpty();
    int var17 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test84");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    randoop.mutant.RingBufferMutant var12 = new randoop.mutant.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    java.util.Iterator var17 = var12.iterator();
    java.util.Iterator var18 = var12.iterator();
    java.util.Iterator var19 = var12.iterator();
    var12.enqueue((java.lang.Object)"hi!");
    java.util.Iterator var22 = var12.iterator();
    var1.enqueue((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test85");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var14 = new randoop.mutant.RingBufferMutant(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    var14.enqueue((java.lang.Object)'#');
    int var21 = var14.size();
    boolean var22 = var14.isEmpty();
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    int var29 = var24.size();
    boolean var30 = var24.isEmpty();
    int var31 = var24.size();
    var14.enqueue((java.lang.Object)var31);
    int var33 = var14.size();
    var10.enqueue((java.lang.Object)var14);
    var1.enqueue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 2);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test86");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    int var6 = var1.size();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test87");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var13 = var6.iterator();
    randoop.mutant.RingBufferMutant var15 = new randoop.mutant.RingBufferMutant(0);
    boolean var16 = var15.isEmpty();
    java.util.Iterator var17 = var15.iterator();
    var6.enqueue((java.lang.Object)var17);
    boolean var19 = var6.isEmpty();
    randoop.mutant.RingBufferMutant var21 = new randoop.mutant.RingBufferMutant(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    java.util.Iterator var26 = var21.iterator();
    boolean var27 = var21.isEmpty();
    randoop.mutant.RingBufferMutant var29 = new randoop.mutant.RingBufferMutant(10);
    var29.enqueue((java.lang.Object)'#');
    java.util.Iterator var32 = var29.iterator();
    java.util.Iterator var33 = var29.iterator();
    java.util.Iterator var34 = var29.iterator();
    var21.enqueue((java.lang.Object)var29);
    java.util.Iterator var36 = var29.iterator();
    int var37 = var29.size();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(10);
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    java.util.Iterator var42 = var39.iterator();
    randoop.mutant.RingBufferMutant var44 = new randoop.mutant.RingBufferMutant(10);
    var44.enqueue((java.lang.Object)'#');
    java.util.Iterator var47 = var44.iterator();
    java.util.Iterator var48 = var44.iterator();
    java.util.Iterator var49 = var44.iterator();
    var39.enqueue((java.lang.Object)var44);
    int var51 = var44.size();
    int var52 = var44.size();
    java.util.Iterator var53 = var44.iterator();
    var29.enqueue((java.lang.Object)var44);
    randoop.mutant.RingBufferMutant var56 = new randoop.mutant.RingBufferMutant(10);
    var56.enqueue((java.lang.Object)'#');
    java.util.Iterator var59 = var56.iterator();
    java.util.Iterator var60 = var56.iterator();
    java.util.Iterator var61 = var56.iterator();
    java.util.Iterator var62 = var56.iterator();
    randoop.mutant.RingBufferMutant var64 = new randoop.mutant.RingBufferMutant(10);
    boolean var65 = var64.isEmpty();
    boolean var66 = var64.isEmpty();
    java.util.Iterator var67 = var64.iterator();
    boolean var68 = var64.isEmpty();
    var64.enqueue((java.lang.Object)'#');
    boolean var71 = var64.isEmpty();
    java.util.Iterator var72 = var64.iterator();
    var64.enqueue((java.lang.Object)(short)0);
    randoop.mutant.RingBufferMutant var76 = new randoop.mutant.RingBufferMutant(10);
    boolean var77 = var76.isEmpty();
    boolean var78 = var76.isEmpty();
    int var79 = var76.size();
    java.util.Iterator var80 = var76.iterator();
    java.lang.Object var81 = new java.lang.Object();
    var76.enqueue(var81);
    int var83 = var76.size();
    java.util.Iterator var84 = var76.iterator();
    var64.enqueue((java.lang.Object)var84);
    var56.enqueue((java.lang.Object)var84);
    var44.enqueue((java.lang.Object)var84);
    var6.enqueue((java.lang.Object)var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test88");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(1);
    boolean var10 = var9.isEmpty();
    int var11 = var9.size();
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    int var17 = var13.size();
    int var18 = var13.size();
    var9.enqueue((java.lang.Object)var18);
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var21 = var1.iterator();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    java.util.Iterator var26 = var23.iterator();
    randoop.mutant.RingBufferMutant var28 = new randoop.mutant.RingBufferMutant(10);
    var28.enqueue((java.lang.Object)'#');
    java.util.Iterator var31 = var28.iterator();
    java.util.Iterator var32 = var28.iterator();
    java.util.Iterator var33 = var28.iterator();
    var23.enqueue((java.lang.Object)var28);
    randoop.mutant.RingBufferMutant var36 = new randoop.mutant.RingBufferMutant(10);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    java.util.Iterator var39 = var36.iterator();
    boolean var40 = var36.isEmpty();
    int var41 = var36.size();
    boolean var42 = var36.isEmpty();
    randoop.mutant.RingBufferMutant var44 = new randoop.mutant.RingBufferMutant(1);
    boolean var45 = var44.isEmpty();
    int var46 = var44.size();
    randoop.mutant.RingBufferMutant var48 = new randoop.mutant.RingBufferMutant(10);
    boolean var49 = var48.isEmpty();
    boolean var50 = var48.isEmpty();
    boolean var51 = var48.isEmpty();
    int var52 = var48.size();
    int var53 = var48.size();
    var44.enqueue((java.lang.Object)var53);
    var36.enqueue((java.lang.Object)var44);
    boolean var56 = var44.isEmpty();
    var28.enqueue((java.lang.Object)var56);
    var1.enqueue((java.lang.Object)var56);
    boolean var59 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var61 = new randoop.mutant.RingBufferMutant(10);
    boolean var62 = var61.isEmpty();
    boolean var63 = var61.isEmpty();
    java.util.Iterator var64 = var61.iterator();
    randoop.mutant.RingBufferMutant var66 = new randoop.mutant.RingBufferMutant(10);
    var66.enqueue((java.lang.Object)'#');
    java.util.Iterator var69 = var66.iterator();
    java.util.Iterator var70 = var66.iterator();
    java.util.Iterator var71 = var66.iterator();
    var61.enqueue((java.lang.Object)var66);
    java.util.Iterator var73 = var66.iterator();
    randoop.mutant.RingBufferMutant var75 = new randoop.mutant.RingBufferMutant(0);
    boolean var76 = var75.isEmpty();
    java.util.Iterator var77 = var75.iterator();
    var66.enqueue((java.lang.Object)var77);
    randoop.mutant.RingBufferMutant var80 = new randoop.mutant.RingBufferMutant(0);
    var66.enqueue((java.lang.Object)var80);
    java.util.Iterator var82 = var80.iterator();
    var1.enqueue((java.lang.Object)var82);
    boolean var84 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test89");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    int var9 = var6.size();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var11);
    randoop.mutant.RingBufferMutant var14 = new randoop.mutant.RingBufferMutant(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    int var19 = var14.size();
    java.util.Iterator var20 = var14.iterator();
    var1.enqueue((java.lang.Object)var14);
    boolean var22 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test90");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var16 = var9.iterator();
    java.util.Iterator var17 = var9.iterator();
    boolean var18 = var9.isEmpty();
    randoop.mutant.RingBufferMutant var20 = new randoop.mutant.RingBufferMutant(2);
    randoop.mutant.RingBufferMutant var22 = new randoop.mutant.RingBufferMutant(10);
    var22.enqueue((java.lang.Object)'#');
    int var25 = var22.size();
    java.util.Iterator var26 = var22.iterator();
    boolean var27 = var22.isEmpty();
    var20.enqueue((java.lang.Object)var22);
    var9.enqueue((java.lang.Object)var20);
    int var30 = var9.size();
    boolean var31 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test91");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test92");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    randoop.mutant.RingBufferMutant var7 = new randoop.mutant.RingBufferMutant(10);
    var7.enqueue((java.lang.Object)'#');
    var7.enqueue((java.lang.Object)' ');
    boolean var12 = var7.isEmpty();
    boolean var13 = var7.isEmpty();
    boolean var14 = var7.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    int var21 = var16.size();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    java.util.Iterator var26 = var23.iterator();
    boolean var27 = var23.isEmpty();
    int var28 = var23.size();
    java.util.Iterator var29 = var23.iterator();
    int var30 = var23.size();
    java.lang.Object var31 = new java.lang.Object();
    var23.enqueue(var31);
    var16.enqueue((java.lang.Object)var23);
    int var34 = var23.size();
    java.util.Iterator var35 = var23.iterator();
    var7.enqueue((java.lang.Object)var35);
    var1.enqueue((java.lang.Object)var35);
    boolean var38 = var1.isEmpty();
    int var39 = var1.size();
    java.util.Iterator var40 = var1.iterator();
    boolean var41 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test93");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    var13.enqueue((java.lang.Object)'#');
    var13.enqueue((java.lang.Object)' ');
    java.util.Iterator var18 = var13.iterator();
    randoop.mutant.RingBufferMutant var20 = new randoop.mutant.RingBufferMutant(10);
    var20.enqueue((java.lang.Object)'#');
    int var23 = var20.size();
    java.util.Iterator var24 = var20.iterator();
    var13.enqueue((java.lang.Object)var20);
    java.util.Iterator var26 = var13.iterator();
    java.util.Iterator var27 = var13.iterator();
    var1.enqueue((java.lang.Object)var13);
    randoop.mutant.RingBufferMutant var30 = new randoop.mutant.RingBufferMutant(10);
    var30.enqueue((java.lang.Object)'#');
    java.util.Iterator var33 = var30.iterator();
    java.util.Iterator var34 = var30.iterator();
    java.util.Iterator var35 = var30.iterator();
    boolean var36 = var30.isEmpty();
    randoop.mutant.RingBufferMutant var38 = new randoop.mutant.RingBufferMutant(10);
    var38.enqueue((java.lang.Object)'#');
    java.util.Iterator var41 = var38.iterator();
    java.util.Iterator var42 = var38.iterator();
    java.util.Iterator var43 = var38.iterator();
    var30.enqueue((java.lang.Object)var38);
    java.util.Iterator var45 = var38.iterator();
    randoop.mutant.RingBufferMutant var47 = new randoop.mutant.RingBufferMutant(10);
    boolean var48 = var47.isEmpty();
    boolean var49 = var47.isEmpty();
    java.util.Iterator var50 = var47.iterator();
    boolean var51 = var47.isEmpty();
    int var52 = var47.size();
    int var53 = var47.size();
    randoop.mutant.RingBufferMutant var55 = new randoop.mutant.RingBufferMutant(10);
    var55.enqueue((java.lang.Object)'#');
    java.util.Iterator var58 = var55.iterator();
    java.util.Iterator var59 = var55.iterator();
    java.util.Iterator var60 = var55.iterator();
    java.util.Iterator var61 = var55.iterator();
    java.util.Iterator var62 = var55.iterator();
    int var63 = var55.size();
    var47.enqueue((java.lang.Object)var55);
    boolean var65 = var47.isEmpty();
    java.util.Iterator var66 = var47.iterator();
    var38.enqueue((java.lang.Object)var47);
    var1.enqueue((java.lang.Object)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test94");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    int var5 = var1.size();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test95");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    boolean var6 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    boolean var12 = var8.isEmpty();
    int var13 = var8.size();
    java.util.Iterator var14 = var8.iterator();
    int var15 = var8.size();
    java.lang.Object var16 = new java.lang.Object();
    var8.enqueue(var16);
    var1.enqueue((java.lang.Object)var8);
    boolean var19 = var8.isEmpty();
    boolean var20 = var8.isEmpty();
    int var21 = var8.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test96");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(0);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    int var4 = var1.size();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test97");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    int var12 = var11.size();
    java.util.Iterator var13 = var11.iterator();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var11.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test98");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    var1.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)(byte)100);
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    int var15 = var10.size();
    java.util.Iterator var16 = var10.iterator();
    int var17 = var10.size();
    java.util.Iterator var18 = var10.iterator();
    int var19 = var10.size();
    randoop.mutant.RingBufferMutant var21 = new randoop.mutant.RingBufferMutant(10);
    var21.enqueue((java.lang.Object)1.0d);
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    java.util.Iterator var28 = var25.iterator();
    boolean var29 = var25.isEmpty();
    int var30 = var25.size();
    boolean var31 = var25.isEmpty();
    java.util.Iterator var32 = var25.iterator();
    var21.enqueue((java.lang.Object)var32);
    var10.enqueue((java.lang.Object)var21);
    var1.enqueue((java.lang.Object)var21);
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    java.util.Iterator var40 = var37.iterator();
    randoop.mutant.RingBufferMutant var42 = new randoop.mutant.RingBufferMutant(10);
    var42.enqueue((java.lang.Object)'#');
    java.util.Iterator var45 = var42.iterator();
    java.util.Iterator var46 = var42.iterator();
    java.util.Iterator var47 = var42.iterator();
    var37.enqueue((java.lang.Object)var42);
    randoop.mutant.RingBufferMutant var50 = new randoop.mutant.RingBufferMutant(10);
    var50.enqueue((java.lang.Object)'#');
    java.util.Iterator var53 = var50.iterator();
    java.util.Iterator var54 = var50.iterator();
    java.util.Iterator var55 = var50.iterator();
    java.util.Iterator var56 = var50.iterator();
    java.util.Iterator var57 = var50.iterator();
    var42.enqueue((java.lang.Object)var50);
    randoop.mutant.RingBufferMutant var60 = new randoop.mutant.RingBufferMutant(10);
    boolean var61 = var60.isEmpty();
    boolean var62 = var60.isEmpty();
    java.util.Iterator var63 = var60.iterator();
    boolean var64 = var60.isEmpty();
    int var65 = var60.size();
    int var66 = var60.size();
    randoop.mutant.RingBufferMutant var68 = new randoop.mutant.RingBufferMutant(10);
    var68.enqueue((java.lang.Object)'#');
    java.util.Iterator var71 = var68.iterator();
    java.util.Iterator var72 = var68.iterator();
    java.util.Iterator var73 = var68.iterator();
    java.util.Iterator var74 = var68.iterator();
    java.util.Iterator var75 = var68.iterator();
    int var76 = var68.size();
    var60.enqueue((java.lang.Object)var68);
    var42.enqueue((java.lang.Object)var60);
    int var79 = var42.size();
    java.util.Iterator var80 = var42.iterator();
    var1.enqueue((java.lang.Object)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test99");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    java.util.Iterator var23 = var17.iterator();
    var9.enqueue((java.lang.Object)var23);
    int var25 = var9.size();
    boolean var26 = var9.isEmpty();
    int var27 = var9.size();
    int var28 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test100");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    randoop.mutant.RingBufferMutant var7 = new randoop.mutant.RingBufferMutant(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    int var12 = var7.size();
    randoop.mutant.RingBufferMutant var14 = new randoop.mutant.RingBufferMutant(10);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    java.util.Iterator var17 = var14.iterator();
    boolean var18 = var14.isEmpty();
    int var19 = var14.size();
    java.util.Iterator var20 = var14.iterator();
    int var21 = var14.size();
    java.lang.Object var22 = new java.lang.Object();
    var14.enqueue(var22);
    var7.enqueue((java.lang.Object)var14);
    int var25 = var14.size();
    java.util.Iterator var26 = var14.iterator();
    var1.enqueue((java.lang.Object)var14);
    int var28 = var1.size();
    boolean var29 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test101");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test102");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    int var6 = var1.size();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    var11.enqueue((java.lang.Object)'#');
    int var14 = var11.size();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    int var19 = var16.size();
    java.util.Iterator var20 = var16.iterator();
    java.util.Iterator var21 = var16.iterator();
    var11.enqueue((java.lang.Object)var21);
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    int var28 = var24.size();
    int var29 = var24.size();
    java.util.Iterator var30 = var24.iterator();
    var11.enqueue((java.lang.Object)var24);
    var1.enqueue((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test103");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    boolean var14 = var10.isEmpty();
    boolean var15 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var15);
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    java.util.Iterator var23 = var18.iterator();
    boolean var24 = var18.isEmpty();
    randoop.mutant.RingBufferMutant var26 = new randoop.mutant.RingBufferMutant(10);
    var26.enqueue((java.lang.Object)'#');
    java.util.Iterator var29 = var26.iterator();
    java.util.Iterator var30 = var26.iterator();
    java.util.Iterator var31 = var26.iterator();
    var18.enqueue((java.lang.Object)var26);
    java.util.Iterator var33 = var26.iterator();
    boolean var34 = var26.isEmpty();
    var1.enqueue((java.lang.Object)var26);
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    java.util.Iterator var40 = var37.iterator();
    boolean var41 = var37.isEmpty();
    var37.enqueue((java.lang.Object)'#');
    int var44 = var37.size();
    boolean var45 = var37.isEmpty();
    randoop.mutant.RingBufferMutant var47 = new randoop.mutant.RingBufferMutant(10);
    boolean var48 = var47.isEmpty();
    boolean var49 = var47.isEmpty();
    java.util.Iterator var50 = var47.iterator();
    boolean var51 = var47.isEmpty();
    int var52 = var47.size();
    boolean var53 = var47.isEmpty();
    int var54 = var47.size();
    var37.enqueue((java.lang.Object)var54);
    randoop.mutant.RingBufferMutant var57 = new randoop.mutant.RingBufferMutant(10);
    var57.enqueue((java.lang.Object)'#');
    var37.enqueue((java.lang.Object)var57);
    var26.enqueue((java.lang.Object)var57);
    boolean var62 = var26.isEmpty();
    randoop.mutant.RingBufferMutant var64 = new randoop.mutant.RingBufferMutant(10);
    var64.enqueue((java.lang.Object)'#');
    java.util.Iterator var67 = var64.iterator();
    int var68 = var64.size();
    randoop.mutant.RingBufferMutant var70 = new randoop.mutant.RingBufferMutant(10);
    boolean var71 = var70.isEmpty();
    boolean var72 = var70.isEmpty();
    java.util.Iterator var73 = var70.iterator();
    randoop.mutant.RingBufferMutant var75 = new randoop.mutant.RingBufferMutant(10);
    var75.enqueue((java.lang.Object)'#');
    java.util.Iterator var78 = var75.iterator();
    java.util.Iterator var79 = var75.iterator();
    java.util.Iterator var80 = var75.iterator();
    var70.enqueue((java.lang.Object)var75);
    java.util.Iterator var82 = var75.iterator();
    randoop.mutant.RingBufferMutant var84 = new randoop.mutant.RingBufferMutant(0);
    boolean var85 = var84.isEmpty();
    java.util.Iterator var86 = var84.iterator();
    var75.enqueue((java.lang.Object)var86);
    var64.enqueue((java.lang.Object)var86);
    var26.enqueue((java.lang.Object)var64);
    int var90 = var26.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var86);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == 3);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test104");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    randoop.mutant.RingBufferMutant var5 = new randoop.mutant.RingBufferMutant(10);
    var5.enqueue((java.lang.Object)'#');
    java.util.Iterator var8 = var5.iterator();
    java.util.Iterator var9 = var5.iterator();
    java.util.Iterator var10 = var5.iterator();
    java.util.Iterator var11 = var5.iterator();
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    boolean var17 = var13.isEmpty();
    java.util.Iterator var18 = var13.iterator();
    var5.enqueue((java.lang.Object)var13);
    randoop.mutant.RingBufferMutant var21 = new randoop.mutant.RingBufferMutant(10);
    var21.enqueue((java.lang.Object)'#');
    java.util.Iterator var24 = var21.iterator();
    java.util.Iterator var25 = var21.iterator();
    java.util.Iterator var26 = var21.iterator();
    java.util.Iterator var27 = var21.iterator();
    var13.enqueue((java.lang.Object)var27);
    int var29 = var13.size();
    boolean var30 = var13.isEmpty();
    randoop.mutant.RingBufferMutant var32 = new randoop.mutant.RingBufferMutant(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    java.util.Iterator var35 = var32.iterator();
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    var37.enqueue((java.lang.Object)'#');
    java.util.Iterator var40 = var37.iterator();
    java.util.Iterator var41 = var37.iterator();
    java.util.Iterator var42 = var37.iterator();
    var32.enqueue((java.lang.Object)var37);
    int var44 = var37.size();
    randoop.mutant.RingBufferMutant var46 = new randoop.mutant.RingBufferMutant(10);
    boolean var47 = var46.isEmpty();
    boolean var48 = var46.isEmpty();
    java.util.Iterator var49 = var46.iterator();
    boolean var50 = var46.isEmpty();
    int var51 = var46.size();
    int var52 = var46.size();
    java.util.Iterator var53 = var46.iterator();
    var37.enqueue((java.lang.Object)var53);
    var13.enqueue((java.lang.Object)var37);
    int var56 = var13.size();
    var1.enqueue((java.lang.Object)var13);
    randoop.mutant.RingBufferMutant var59 = new randoop.mutant.RingBufferMutant(10);
    boolean var60 = var59.isEmpty();
    boolean var61 = var59.isEmpty();
    int var62 = var59.size();
    int var63 = var59.size();
    int var64 = var59.size();
    java.util.Iterator var65 = var59.iterator();
    boolean var66 = var59.isEmpty();
    int var67 = var59.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var59);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test105");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test106");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    java.util.Iterator var23 = var17.iterator();
    var9.enqueue((java.lang.Object)var23);
    int var25 = var9.size();
    boolean var26 = var9.isEmpty();
    randoop.mutant.RingBufferMutant var28 = new randoop.mutant.RingBufferMutant(10);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    java.util.Iterator var31 = var28.iterator();
    randoop.mutant.RingBufferMutant var33 = new randoop.mutant.RingBufferMutant(10);
    var33.enqueue((java.lang.Object)'#');
    java.util.Iterator var36 = var33.iterator();
    java.util.Iterator var37 = var33.iterator();
    java.util.Iterator var38 = var33.iterator();
    var28.enqueue((java.lang.Object)var33);
    int var40 = var33.size();
    randoop.mutant.RingBufferMutant var42 = new randoop.mutant.RingBufferMutant(10);
    boolean var43 = var42.isEmpty();
    boolean var44 = var42.isEmpty();
    java.util.Iterator var45 = var42.iterator();
    boolean var46 = var42.isEmpty();
    int var47 = var42.size();
    int var48 = var42.size();
    java.util.Iterator var49 = var42.iterator();
    var33.enqueue((java.lang.Object)var49);
    var9.enqueue((java.lang.Object)var33);
    randoop.mutant.RingBufferMutant var53 = new randoop.mutant.RingBufferMutant(10);
    var53.enqueue((java.lang.Object)'#');
    var53.enqueue((java.lang.Object)' ');
    boolean var58 = var53.isEmpty();
    int var59 = var53.size();
    var33.enqueue((java.lang.Object)var59);
    boolean var61 = var33.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test107");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    int var16 = var13.size();
    java.util.Iterator var17 = var13.iterator();
    java.lang.Object var18 = new java.lang.Object();
    var13.enqueue(var18);
    java.util.Iterator var20 = var13.iterator();
    java.util.Iterator var21 = var13.iterator();
    java.util.Iterator var22 = var13.iterator();
    var1.enqueue((java.lang.Object)var13);
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    var25.enqueue((java.lang.Object)'#');
    int var28 = var25.size();
    int var29 = var25.size();
    int var30 = var25.size();
    java.util.Iterator var31 = var25.iterator();
    randoop.mutant.RingBufferMutant var33 = new randoop.mutant.RingBufferMutant(10);
    var33.enqueue((java.lang.Object)'#');
    int var36 = var33.size();
    int var37 = var33.size();
    int var38 = var33.size();
    java.util.Iterator var39 = var33.iterator();
    boolean var40 = var33.isEmpty();
    var25.enqueue((java.lang.Object)var40);
    var1.enqueue((java.lang.Object)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test108");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    boolean var12 = var8.isEmpty();
    int var13 = var8.size();
    java.util.Iterator var14 = var8.iterator();
    int var15 = var8.size();
    java.lang.Object var16 = new java.lang.Object();
    var8.enqueue(var16);
    var1.enqueue((java.lang.Object)var8);
    int var19 = var8.size();
    java.util.Iterator var20 = var8.iterator();
    randoop.mutant.RingBufferMutant var22 = new randoop.mutant.RingBufferMutant(10);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    int var25 = var22.size();
    java.util.Iterator var26 = var22.iterator();
    java.lang.Object var27 = new java.lang.Object();
    var22.enqueue(var27);
    java.util.Iterator var29 = var22.iterator();
    randoop.mutant.RingBufferMutant var31 = new randoop.mutant.RingBufferMutant(10);
    var31.enqueue((java.lang.Object)'#');
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    java.util.Iterator var36 = var31.iterator();
    boolean var37 = var31.isEmpty();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(10);
    var39.enqueue((java.lang.Object)'#');
    java.util.Iterator var42 = var39.iterator();
    java.util.Iterator var43 = var39.iterator();
    java.util.Iterator var44 = var39.iterator();
    var31.enqueue((java.lang.Object)var39);
    int var46 = var39.size();
    java.util.Iterator var47 = var39.iterator();
    var22.enqueue((java.lang.Object)var47);
    var8.enqueue((java.lang.Object)var47);
    int var50 = var8.size();
    java.util.Iterator var51 = var8.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test109");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    int var11 = var1.size();
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    var13.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)'#');
    boolean var17 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test110");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test111");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)(short)0);
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    int var16 = var13.size();
    java.util.Iterator var17 = var13.iterator();
    java.lang.Object var18 = new java.lang.Object();
    var13.enqueue(var18);
    int var20 = var13.size();
    java.util.Iterator var21 = var13.iterator();
    var1.enqueue((java.lang.Object)var21);
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(1);
    boolean var25 = var24.isEmpty();
    int var26 = var24.size();
    randoop.mutant.RingBufferMutant var28 = new randoop.mutant.RingBufferMutant(10);
    var28.enqueue((java.lang.Object)1.0d);
    randoop.mutant.RingBufferMutant var32 = new randoop.mutant.RingBufferMutant(10);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    java.util.Iterator var35 = var32.iterator();
    boolean var36 = var32.isEmpty();
    int var37 = var32.size();
    boolean var38 = var32.isEmpty();
    java.util.Iterator var39 = var32.iterator();
    var28.enqueue((java.lang.Object)var39);
    var24.enqueue((java.lang.Object)var39);
    java.util.Iterator var42 = var24.iterator();
    var1.enqueue((java.lang.Object)var24);
    randoop.mutant.RingBufferMutant var45 = new randoop.mutant.RingBufferMutant(10);
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    int var48 = var45.size();
    java.util.Iterator var49 = var45.iterator();
    java.util.Iterator var50 = var45.iterator();
    java.util.Iterator var51 = var45.iterator();
    java.util.Iterator var52 = var45.iterator();
    randoop.mutant.RingBufferMutant var54 = new randoop.mutant.RingBufferMutant(10);
    var54.enqueue((java.lang.Object)'#');
    int var57 = var54.size();
    boolean var58 = var54.isEmpty();
    boolean var59 = var54.isEmpty();
    var45.enqueue((java.lang.Object)var59);
    int var61 = var45.size();
    var1.enqueue((java.lang.Object)var45);
    java.util.Iterator var63 = var45.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test112");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    java.util.Iterator var6 = var1.iterator();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    int var11 = var8.size();
    java.util.Iterator var12 = var8.iterator();
    java.lang.Object var13 = new java.lang.Object();
    var8.enqueue(var13);
    int var15 = var8.size();
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    var17.enqueue((java.lang.Object)'#');
    var17.enqueue((java.lang.Object)' ');
    boolean var22 = var17.isEmpty();
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    int var29 = var24.size();
    java.util.Iterator var30 = var24.iterator();
    int var31 = var24.size();
    java.lang.Object var32 = new java.lang.Object();
    var24.enqueue(var32);
    var17.enqueue((java.lang.Object)var24);
    randoop.mutant.RingBufferMutant var36 = new randoop.mutant.RingBufferMutant(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    int var41 = var36.size();
    randoop.mutant.RingBufferMutant var43 = new randoop.mutant.RingBufferMutant(10);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    java.util.Iterator var46 = var43.iterator();
    boolean var47 = var43.isEmpty();
    int var48 = var43.size();
    java.util.Iterator var49 = var43.iterator();
    int var50 = var43.size();
    java.lang.Object var51 = new java.lang.Object();
    var43.enqueue(var51);
    var36.enqueue((java.lang.Object)var43);
    var17.enqueue((java.lang.Object)var36);
    var8.enqueue((java.lang.Object)var36);
    boolean var56 = var8.isEmpty();
    var1.enqueue((java.lang.Object)var8);
    int var58 = var1.size();
    randoop.mutant.RingBufferMutant var60 = new randoop.mutant.RingBufferMutant(10);
    boolean var61 = var60.isEmpty();
    boolean var62 = var60.isEmpty();
    int var63 = var60.size();
    java.util.Iterator var64 = var60.iterator();
    java.lang.Object var65 = new java.lang.Object();
    var60.enqueue(var65);
    java.util.Iterator var67 = var60.iterator();
    java.util.Iterator var68 = var60.iterator();
    var1.enqueue((java.lang.Object)var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test113");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    java.util.Iterator var6 = var1.iterator();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    var8.enqueue((java.lang.Object)'#');
    int var11 = var8.size();
    java.util.Iterator var12 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    randoop.mutant.RingBufferMutant var15 = new randoop.mutant.RingBufferMutant(10);
    var15.enqueue((java.lang.Object)1.0d);
    randoop.mutant.RingBufferMutant var19 = new randoop.mutant.RingBufferMutant(10);
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    java.util.Iterator var22 = var19.iterator();
    boolean var23 = var19.isEmpty();
    int var24 = var19.size();
    boolean var25 = var19.isEmpty();
    java.util.Iterator var26 = var19.iterator();
    var15.enqueue((java.lang.Object)var26);
    java.util.Iterator var28 = var15.iterator();
    randoop.mutant.RingBufferMutant var30 = new randoop.mutant.RingBufferMutant(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    int var34 = var30.size();
    java.util.Iterator var35 = var30.iterator();
    java.util.Iterator var36 = var30.iterator();
    var15.enqueue((java.lang.Object)var36);
    var8.enqueue((java.lang.Object)var15);
    boolean var39 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test114");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = new java.lang.Object();
    var1.enqueue(var6);
    int var8 = var1.size();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    java.util.Iterator var16 = var13.iterator();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    java.util.Iterator var23 = var18.iterator();
    var13.enqueue((java.lang.Object)var18);
    int var25 = var18.size();
    int var26 = var18.size();
    boolean var27 = var18.isEmpty();
    var1.enqueue((java.lang.Object)var18);
    randoop.mutant.RingBufferMutant var30 = new randoop.mutant.RingBufferMutant(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    int var33 = var30.size();
    java.util.Iterator var34 = var30.iterator();
    java.lang.Object var35 = new java.lang.Object();
    var30.enqueue(var35);
    java.util.Iterator var37 = var30.iterator();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(10);
    var39.enqueue((java.lang.Object)'#');
    int var42 = var39.size();
    var39.enqueue((java.lang.Object)true);
    var39.enqueue((java.lang.Object)(byte)100);
    boolean var47 = var39.isEmpty();
    var30.enqueue((java.lang.Object)var47);
    int var49 = var30.size();
    var18.enqueue((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test115");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    java.util.Iterator var6 = var1.iterator();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    var8.enqueue((java.lang.Object)'#');
    int var11 = var8.size();
    java.util.Iterator var12 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var14 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(100);
    boolean var17 = var16.isEmpty();
    java.util.Iterator var18 = var16.iterator();
    var1.enqueue((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test116");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var5 = new randoop.mutant.RingBufferMutant(10);
    var5.enqueue((java.lang.Object)'#');
    var5.enqueue((java.lang.Object)' ');
    boolean var10 = var5.isEmpty();
    randoop.mutant.RingBufferMutant var12 = new randoop.mutant.RingBufferMutant(10);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    java.util.Iterator var15 = var12.iterator();
    boolean var16 = var12.isEmpty();
    int var17 = var12.size();
    java.util.Iterator var18 = var12.iterator();
    int var19 = var12.size();
    java.lang.Object var20 = new java.lang.Object();
    var12.enqueue(var20);
    var5.enqueue((java.lang.Object)var12);
    boolean var23 = var12.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    boolean var25 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test117");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test118");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    int var16 = var13.size();
    java.util.Iterator var17 = var13.iterator();
    java.util.Iterator var18 = var13.iterator();
    java.util.Iterator var19 = var13.iterator();
    java.util.Iterator var20 = var13.iterator();
    randoop.mutant.RingBufferMutant var22 = new randoop.mutant.RingBufferMutant(10);
    var22.enqueue((java.lang.Object)'#');
    int var25 = var22.size();
    boolean var26 = var22.isEmpty();
    boolean var27 = var22.isEmpty();
    var13.enqueue((java.lang.Object)var27);
    randoop.mutant.RingBufferMutant var30 = new randoop.mutant.RingBufferMutant(10);
    var30.enqueue((java.lang.Object)'#');
    java.util.Iterator var33 = var30.iterator();
    java.util.Iterator var34 = var30.iterator();
    java.util.Iterator var35 = var30.iterator();
    boolean var36 = var30.isEmpty();
    randoop.mutant.RingBufferMutant var38 = new randoop.mutant.RingBufferMutant(10);
    var38.enqueue((java.lang.Object)'#');
    java.util.Iterator var41 = var38.iterator();
    java.util.Iterator var42 = var38.iterator();
    java.util.Iterator var43 = var38.iterator();
    var30.enqueue((java.lang.Object)var38);
    java.util.Iterator var45 = var38.iterator();
    boolean var46 = var38.isEmpty();
    var13.enqueue((java.lang.Object)var38);
    randoop.mutant.RingBufferMutant var49 = new randoop.mutant.RingBufferMutant(10);
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    java.util.Iterator var52 = var49.iterator();
    boolean var53 = var49.isEmpty();
    var49.enqueue((java.lang.Object)'#');
    int var56 = var49.size();
    boolean var57 = var49.isEmpty();
    randoop.mutant.RingBufferMutant var59 = new randoop.mutant.RingBufferMutant(10);
    boolean var60 = var59.isEmpty();
    boolean var61 = var59.isEmpty();
    java.util.Iterator var62 = var59.iterator();
    boolean var63 = var59.isEmpty();
    int var64 = var59.size();
    boolean var65 = var59.isEmpty();
    int var66 = var59.size();
    var49.enqueue((java.lang.Object)var66);
    randoop.mutant.RingBufferMutant var69 = new randoop.mutant.RingBufferMutant(10);
    var69.enqueue((java.lang.Object)'#');
    var49.enqueue((java.lang.Object)var69);
    var38.enqueue((java.lang.Object)var69);
    var1.enqueue((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test119");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    randoop.mutant.RingBufferMutant var15 = new randoop.mutant.RingBufferMutant(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    java.util.Iterator var20 = var15.iterator();
    var10.enqueue((java.lang.Object)var15);
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    java.util.Iterator var27 = var23.iterator();
    java.util.Iterator var28 = var23.iterator();
    java.util.Iterator var29 = var23.iterator();
    java.util.Iterator var30 = var23.iterator();
    var15.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var15);
    randoop.mutant.RingBufferMutant var34 = new randoop.mutant.RingBufferMutant(10);
    var34.enqueue((java.lang.Object)'#');
    int var37 = var34.size();
    randoop.mutant.RingBufferMutant var39 = new randoop.mutant.RingBufferMutant(10);
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    int var42 = var39.size();
    java.util.Iterator var43 = var39.iterator();
    java.util.Iterator var44 = var39.iterator();
    var34.enqueue((java.lang.Object)var44);
    randoop.mutant.RingBufferMutant var47 = new randoop.mutant.RingBufferMutant(10);
    boolean var48 = var47.isEmpty();
    boolean var49 = var47.isEmpty();
    boolean var50 = var47.isEmpty();
    int var51 = var47.size();
    int var52 = var47.size();
    java.util.Iterator var53 = var47.iterator();
    var34.enqueue((java.lang.Object)var47);
    var15.enqueue((java.lang.Object)var34);
    java.util.Iterator var56 = var15.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test120");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = new java.lang.Object();
    var1.enqueue(var6);
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test121");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    java.util.Iterator var6 = var1.iterator();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    var8.enqueue((java.lang.Object)'#');
    int var11 = var8.size();
    java.util.Iterator var12 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var14 = var8.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    int var21 = var16.size();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    java.util.Iterator var26 = var23.iterator();
    boolean var27 = var23.isEmpty();
    int var28 = var23.size();
    java.util.Iterator var29 = var23.iterator();
    int var30 = var23.size();
    java.lang.Object var31 = new java.lang.Object();
    var23.enqueue(var31);
    var16.enqueue((java.lang.Object)var23);
    int var34 = var23.size();
    java.util.Iterator var35 = var23.iterator();
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    int var40 = var37.size();
    java.util.Iterator var41 = var37.iterator();
    java.lang.Object var42 = new java.lang.Object();
    var37.enqueue(var42);
    java.util.Iterator var44 = var37.iterator();
    randoop.mutant.RingBufferMutant var46 = new randoop.mutant.RingBufferMutant(10);
    var46.enqueue((java.lang.Object)'#');
    java.util.Iterator var49 = var46.iterator();
    java.util.Iterator var50 = var46.iterator();
    java.util.Iterator var51 = var46.iterator();
    boolean var52 = var46.isEmpty();
    randoop.mutant.RingBufferMutant var54 = new randoop.mutant.RingBufferMutant(10);
    var54.enqueue((java.lang.Object)'#');
    java.util.Iterator var57 = var54.iterator();
    java.util.Iterator var58 = var54.iterator();
    java.util.Iterator var59 = var54.iterator();
    var46.enqueue((java.lang.Object)var54);
    int var61 = var54.size();
    java.util.Iterator var62 = var54.iterator();
    var37.enqueue((java.lang.Object)var62);
    var23.enqueue((java.lang.Object)var62);
    int var65 = var23.size();
    var8.enqueue((java.lang.Object)var65);
    int var67 = var8.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 2);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test122");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    boolean var15 = var11.isEmpty();
    var11.enqueue((java.lang.Object)'#');
    boolean var18 = var11.isEmpty();
    java.util.Iterator var19 = var11.iterator();
    var11.enqueue((java.lang.Object)(short)0);
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    int var26 = var23.size();
    java.util.Iterator var27 = var23.iterator();
    java.lang.Object var28 = new java.lang.Object();
    var23.enqueue(var28);
    int var30 = var23.size();
    java.util.Iterator var31 = var23.iterator();
    var11.enqueue((java.lang.Object)var31);
    int var33 = var11.size();
    randoop.mutant.RingBufferMutant var35 = new randoop.mutant.RingBufferMutant(10);
    var35.enqueue((java.lang.Object)'#');
    var35.enqueue((java.lang.Object)' ');
    java.util.Iterator var40 = var35.iterator();
    randoop.mutant.RingBufferMutant var42 = new randoop.mutant.RingBufferMutant(10);
    var42.enqueue((java.lang.Object)'#');
    int var45 = var42.size();
    java.util.Iterator var46 = var42.iterator();
    var35.enqueue((java.lang.Object)var42);
    java.util.Iterator var48 = var35.iterator();
    java.util.Iterator var49 = var35.iterator();
    var11.enqueue((java.lang.Object)var49);
    java.util.Iterator var51 = var11.iterator();
    java.util.Iterator var52 = var11.iterator();
    var1.enqueue((java.lang.Object)var52);
    int var54 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test123");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var5 = new randoop.mutant.RingBufferMutant(1);
    boolean var6 = var5.isEmpty();
    java.util.Iterator var7 = var5.iterator();
    java.util.Iterator var8 = var5.iterator();
    var1.enqueue((java.lang.Object)var8);
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    var11.enqueue((java.lang.Object)'#');
    var11.enqueue((java.lang.Object)' ');
    boolean var16 = var11.isEmpty();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    boolean var22 = var18.isEmpty();
    int var23 = var18.size();
    java.util.Iterator var24 = var18.iterator();
    int var25 = var18.size();
    java.lang.Object var26 = new java.lang.Object();
    var18.enqueue(var26);
    var11.enqueue((java.lang.Object)var18);
    java.util.Iterator var29 = var18.iterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var31 = var1.isEmpty();
    int var32 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 3);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test124");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    java.util.Iterator var6 = var1.iterator();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    var8.enqueue((java.lang.Object)'#');
    int var11 = var8.size();
    java.util.Iterator var12 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    boolean var14 = var8.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    int var21 = var16.size();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    java.util.Iterator var26 = var23.iterator();
    boolean var27 = var23.isEmpty();
    int var28 = var23.size();
    java.util.Iterator var29 = var23.iterator();
    int var30 = var23.size();
    java.lang.Object var31 = new java.lang.Object();
    var23.enqueue(var31);
    var16.enqueue((java.lang.Object)var23);
    randoop.mutant.RingBufferMutant var35 = new randoop.mutant.RingBufferMutant(10);
    var35.enqueue((java.lang.Object)'#');
    java.util.Iterator var38 = var35.iterator();
    java.util.Iterator var39 = var35.iterator();
    java.util.Iterator var40 = var35.iterator();
    java.util.Iterator var41 = var35.iterator();
    randoop.mutant.RingBufferMutant var43 = new randoop.mutant.RingBufferMutant(10);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    java.util.Iterator var46 = var43.iterator();
    boolean var47 = var43.isEmpty();
    java.util.Iterator var48 = var43.iterator();
    var35.enqueue((java.lang.Object)var43);
    randoop.mutant.RingBufferMutant var51 = new randoop.mutant.RingBufferMutant(10);
    var51.enqueue((java.lang.Object)'#');
    java.util.Iterator var54 = var51.iterator();
    java.util.Iterator var55 = var51.iterator();
    java.util.Iterator var56 = var51.iterator();
    java.util.Iterator var57 = var51.iterator();
    var43.enqueue((java.lang.Object)var57);
    int var59 = var43.size();
    boolean var60 = var43.isEmpty();
    randoop.mutant.RingBufferMutant var62 = new randoop.mutant.RingBufferMutant(10);
    boolean var63 = var62.isEmpty();
    boolean var64 = var62.isEmpty();
    java.util.Iterator var65 = var62.iterator();
    randoop.mutant.RingBufferMutant var67 = new randoop.mutant.RingBufferMutant(10);
    var67.enqueue((java.lang.Object)'#');
    java.util.Iterator var70 = var67.iterator();
    java.util.Iterator var71 = var67.iterator();
    java.util.Iterator var72 = var67.iterator();
    var62.enqueue((java.lang.Object)var67);
    int var74 = var67.size();
    randoop.mutant.RingBufferMutant var76 = new randoop.mutant.RingBufferMutant(10);
    boolean var77 = var76.isEmpty();
    boolean var78 = var76.isEmpty();
    java.util.Iterator var79 = var76.iterator();
    boolean var80 = var76.isEmpty();
    int var81 = var76.size();
    int var82 = var76.size();
    java.util.Iterator var83 = var76.iterator();
    var67.enqueue((java.lang.Object)var83);
    var43.enqueue((java.lang.Object)var67);
    var16.enqueue((java.lang.Object)var43);
    var8.enqueue((java.lang.Object)var43);
    int var88 = var43.size();
    java.util.Iterator var89 = var43.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var89);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test125");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = new java.lang.Object();
    var1.enqueue(var6);
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    java.util.Iterator var13 = var10.iterator();
    boolean var14 = var10.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    var16.enqueue((java.lang.Object)false);
    boolean var23 = var16.isEmpty();
    var10.enqueue((java.lang.Object)var16);
    var1.enqueue((java.lang.Object)var10);
    boolean var26 = var1.isEmpty();
    int var27 = var1.size();
    boolean var28 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test126");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(1);
    boolean var10 = var9.isEmpty();
    java.util.Iterator var11 = var9.iterator();
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    randoop.mutant.RingBufferMutant var15 = new randoop.mutant.RingBufferMutant(10);
    var15.enqueue((java.lang.Object)'#');
    java.util.Iterator var18 = var15.iterator();
    java.util.Iterator var19 = var15.iterator();
    java.util.Iterator var20 = var15.iterator();
    boolean var21 = var15.isEmpty();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    var23.enqueue((java.lang.Object)'#');
    java.util.Iterator var26 = var23.iterator();
    java.util.Iterator var27 = var23.iterator();
    java.util.Iterator var28 = var23.iterator();
    var15.enqueue((java.lang.Object)var23);
    randoop.mutant.RingBufferMutant var31 = new randoop.mutant.RingBufferMutant(10);
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    java.util.Iterator var34 = var31.iterator();
    randoop.mutant.RingBufferMutant var36 = new randoop.mutant.RingBufferMutant(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    java.util.Iterator var41 = var36.iterator();
    var31.enqueue((java.lang.Object)var36);
    java.util.Iterator var43 = var36.iterator();
    var23.enqueue((java.lang.Object)var36);
    var9.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var47 = var9.iterator();
    int var48 = var9.size();
    java.util.Iterator var49 = var9.iterator();
    java.util.Iterator var50 = var9.iterator();
    java.util.Iterator var51 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test127");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Iterator var14 = var11.iterator();
    boolean var15 = var11.isEmpty();
    int var16 = var11.size();
    java.util.Iterator var17 = var11.iterator();
    int var18 = var11.size();
    java.util.Iterator var19 = var11.iterator();
    java.util.Iterator var20 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var22 = var11.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test128");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    int var15 = var1.size();
    java.util.Iterator var16 = var1.iterator();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    var18.enqueue((java.lang.Object)' ');
    java.util.Iterator var23 = var18.iterator();
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    var25.enqueue((java.lang.Object)'#');
    int var28 = var25.size();
    java.util.Iterator var29 = var25.iterator();
    var18.enqueue((java.lang.Object)var25);
    var1.enqueue((java.lang.Object)var18);
    java.util.Iterator var32 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test129");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    var8.enqueue((java.lang.Object)'#');
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    java.util.Iterator var13 = var8.iterator();
    boolean var14 = var8.isEmpty();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    var16.enqueue((java.lang.Object)'#');
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    java.util.Iterator var21 = var16.iterator();
    var8.enqueue((java.lang.Object)var16);
    int var23 = var8.size();
    boolean var24 = var8.isEmpty();
    var1.enqueue((java.lang.Object)var8);
    randoop.mutant.RingBufferMutant var27 = new randoop.mutant.RingBufferMutant(10);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    java.util.Iterator var30 = var27.iterator();
    boolean var31 = var27.isEmpty();
    int var32 = var27.size();
    java.util.Iterator var33 = var27.iterator();
    int var34 = var27.size();
    java.util.Iterator var35 = var27.iterator();
    int var36 = var27.size();
    randoop.mutant.RingBufferMutant var38 = new randoop.mutant.RingBufferMutant(10);
    var38.enqueue((java.lang.Object)1.0d);
    randoop.mutant.RingBufferMutant var42 = new randoop.mutant.RingBufferMutant(10);
    boolean var43 = var42.isEmpty();
    boolean var44 = var42.isEmpty();
    java.util.Iterator var45 = var42.iterator();
    boolean var46 = var42.isEmpty();
    int var47 = var42.size();
    boolean var48 = var42.isEmpty();
    java.util.Iterator var49 = var42.iterator();
    var38.enqueue((java.lang.Object)var49);
    var27.enqueue((java.lang.Object)var38);
    int var52 = var38.size();
    var8.enqueue((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 2);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test130");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    randoop.mutant.RingBufferMutant var7 = new randoop.mutant.RingBufferMutant(10);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    java.util.Iterator var10 = var7.iterator();
    randoop.mutant.RingBufferMutant var12 = new randoop.mutant.RingBufferMutant(10);
    var12.enqueue((java.lang.Object)'#');
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    java.util.Iterator var17 = var12.iterator();
    var7.enqueue((java.lang.Object)var12);
    java.util.Iterator var19 = var12.iterator();
    randoop.mutant.RingBufferMutant var21 = new randoop.mutant.RingBufferMutant(0);
    boolean var22 = var21.isEmpty();
    java.util.Iterator var23 = var21.iterator();
    var12.enqueue((java.lang.Object)var23);
    var1.enqueue((java.lang.Object)var23);
    boolean var26 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test131");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Iterator var9 = var6.iterator();
    boolean var10 = var6.isEmpty();
    int var11 = var6.size();
    java.util.Iterator var12 = var6.iterator();
    int var13 = var6.size();
    java.util.Iterator var14 = var6.iterator();
    randoop.mutant.RingBufferMutant var16 = new randoop.mutant.RingBufferMutant(10);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    java.util.Iterator var19 = var16.iterator();
    boolean var20 = var16.isEmpty();
    int var21 = var16.size();
    boolean var22 = var16.isEmpty();
    java.util.Iterator var23 = var16.iterator();
    int var24 = var16.size();
    java.util.Iterator var25 = var16.iterator();
    int var26 = var16.size();
    var6.enqueue((java.lang.Object)var16);
    var1.enqueue((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test132");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test133");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    int var15 = var1.size();
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    var17.enqueue((java.lang.Object)'#');
    var17.enqueue((java.lang.Object)' ');
    boolean var22 = var17.isEmpty();
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    java.util.Iterator var27 = var24.iterator();
    boolean var28 = var24.isEmpty();
    int var29 = var24.size();
    java.util.Iterator var30 = var24.iterator();
    int var31 = var24.size();
    java.lang.Object var32 = new java.lang.Object();
    var24.enqueue(var32);
    var17.enqueue((java.lang.Object)var24);
    randoop.mutant.RingBufferMutant var36 = new randoop.mutant.RingBufferMutant(10);
    var36.enqueue((java.lang.Object)'#');
    java.util.Iterator var39 = var36.iterator();
    java.util.Iterator var40 = var36.iterator();
    int var41 = var36.size();
    randoop.mutant.RingBufferMutant var43 = new randoop.mutant.RingBufferMutant(10);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    java.util.Iterator var46 = var43.iterator();
    boolean var47 = var43.isEmpty();
    int var48 = var43.size();
    java.util.Iterator var49 = var43.iterator();
    int var50 = var43.size();
    java.lang.Object var51 = new java.lang.Object();
    var43.enqueue(var51);
    var36.enqueue((java.lang.Object)var43);
    var17.enqueue((java.lang.Object)var36);
    var1.enqueue((java.lang.Object)var17);
    int var56 = var17.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 4);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test134");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    var10.enqueue((java.lang.Object)false);
    int var17 = var10.size();
    boolean var18 = var10.isEmpty();
    java.util.Iterator var19 = var10.iterator();
    boolean var20 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var10);
    java.util.Iterator var22 = var10.iterator();
    randoop.mutant.RingBufferMutant var24 = new randoop.mutant.RingBufferMutant(10);
    var24.enqueue((java.lang.Object)'#');
    java.util.Iterator var27 = var24.iterator();
    java.util.Iterator var28 = var24.iterator();
    java.util.Iterator var29 = var24.iterator();
    boolean var30 = var24.isEmpty();
    int var31 = var24.size();
    java.util.Iterator var32 = var24.iterator();
    var10.enqueue((java.lang.Object)var24);
    boolean var34 = var24.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test135");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    randoop.mutant.RingBufferMutant var10 = new randoop.mutant.RingBufferMutant(10);
    var10.enqueue((java.lang.Object)'#');
    int var13 = var10.size();
    boolean var14 = var10.isEmpty();
    boolean var15 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var15);
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    java.util.Iterator var23 = var18.iterator();
    boolean var24 = var18.isEmpty();
    randoop.mutant.RingBufferMutant var26 = new randoop.mutant.RingBufferMutant(10);
    var26.enqueue((java.lang.Object)'#');
    java.util.Iterator var29 = var26.iterator();
    java.util.Iterator var30 = var26.iterator();
    java.util.Iterator var31 = var26.iterator();
    var18.enqueue((java.lang.Object)var26);
    java.util.Iterator var33 = var26.iterator();
    boolean var34 = var26.isEmpty();
    var1.enqueue((java.lang.Object)var26);
    randoop.mutant.RingBufferMutant var37 = new randoop.mutant.RingBufferMutant(10);
    var37.enqueue((java.lang.Object)'#');
    java.util.Iterator var40 = var37.iterator();
    java.util.Iterator var41 = var37.iterator();
    java.util.Iterator var42 = var37.iterator();
    java.util.Iterator var43 = var37.iterator();
    randoop.mutant.RingBufferMutant var45 = new randoop.mutant.RingBufferMutant(10);
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    java.util.Iterator var48 = var45.iterator();
    boolean var49 = var45.isEmpty();
    java.util.Iterator var50 = var45.iterator();
    var37.enqueue((java.lang.Object)var45);
    randoop.mutant.RingBufferMutant var53 = new randoop.mutant.RingBufferMutant(10);
    var53.enqueue((java.lang.Object)'#');
    java.util.Iterator var56 = var53.iterator();
    java.util.Iterator var57 = var53.iterator();
    java.util.Iterator var58 = var53.iterator();
    java.util.Iterator var59 = var53.iterator();
    var45.enqueue((java.lang.Object)var59);
    int var61 = var45.size();
    boolean var62 = var45.isEmpty();
    randoop.mutant.RingBufferMutant var64 = new randoop.mutant.RingBufferMutant(10);
    boolean var65 = var64.isEmpty();
    boolean var66 = var64.isEmpty();
    java.util.Iterator var67 = var64.iterator();
    randoop.mutant.RingBufferMutant var69 = new randoop.mutant.RingBufferMutant(10);
    var69.enqueue((java.lang.Object)'#');
    java.util.Iterator var72 = var69.iterator();
    java.util.Iterator var73 = var69.iterator();
    java.util.Iterator var74 = var69.iterator();
    var64.enqueue((java.lang.Object)var69);
    int var76 = var69.size();
    randoop.mutant.RingBufferMutant var78 = new randoop.mutant.RingBufferMutant(10);
    boolean var79 = var78.isEmpty();
    boolean var80 = var78.isEmpty();
    java.util.Iterator var81 = var78.iterator();
    boolean var82 = var78.isEmpty();
    int var83 = var78.size();
    int var84 = var78.size();
    java.util.Iterator var85 = var78.iterator();
    var69.enqueue((java.lang.Object)var85);
    var45.enqueue((java.lang.Object)var69);
    randoop.mutant.RingBufferMutant var89 = new randoop.mutant.RingBufferMutant(10);
    var89.enqueue((java.lang.Object)'#');
    var89.enqueue((java.lang.Object)' ');
    boolean var94 = var89.isEmpty();
    boolean var95 = var89.isEmpty();
    var69.enqueue((java.lang.Object)var89);
    var26.enqueue((java.lang.Object)var89);
    int var98 = var89.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var94 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == 2);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test136");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    var1.enqueue((java.lang.Object)(short)0);
    randoop.mutant.RingBufferMutant var13 = new randoop.mutant.RingBufferMutant(10);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    int var16 = var13.size();
    java.util.Iterator var17 = var13.iterator();
    java.lang.Object var18 = new java.lang.Object();
    var13.enqueue(var18);
    int var20 = var13.size();
    java.util.Iterator var21 = var13.iterator();
    var1.enqueue((java.lang.Object)var21);
    int var23 = var1.size();
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    var25.enqueue((java.lang.Object)'#');
    var25.enqueue((java.lang.Object)' ');
    java.util.Iterator var30 = var25.iterator();
    randoop.mutant.RingBufferMutant var32 = new randoop.mutant.RingBufferMutant(10);
    var32.enqueue((java.lang.Object)'#');
    int var35 = var32.size();
    java.util.Iterator var36 = var32.iterator();
    var25.enqueue((java.lang.Object)var32);
    java.util.Iterator var38 = var25.iterator();
    java.util.Iterator var39 = var25.iterator();
    var1.enqueue((java.lang.Object)var39);
    java.util.Iterator var41 = var1.iterator();
    java.util.Iterator var42 = var1.iterator();
    java.util.Iterator var43 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test137");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    int var15 = var1.size();
    int var16 = var1.size();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    boolean var22 = var18.isEmpty();
    int var23 = var18.size();
    java.util.Iterator var24 = var18.iterator();
    java.util.Iterator var25 = var18.iterator();
    var1.enqueue((java.lang.Object)var25);
    randoop.mutant.RingBufferMutant var28 = new randoop.mutant.RingBufferMutant(10);
    int var29 = var28.size();
    java.util.Iterator var30 = var28.iterator();
    var1.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test138");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var7 = new randoop.mutant.RingBufferMutant(10);
    var7.enqueue((java.lang.Object)'#');
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    var7.enqueue((java.lang.Object)false);
    boolean var14 = var7.isEmpty();
    var1.enqueue((java.lang.Object)var7);
    int var16 = var7.size();
    java.util.Iterator var17 = var7.iterator();
    randoop.mutant.RingBufferMutant var19 = new randoop.mutant.RingBufferMutant(10);
    var19.enqueue((java.lang.Object)'#');
    java.util.Iterator var22 = var19.iterator();
    java.util.Iterator var23 = var19.iterator();
    java.util.Iterator var24 = var19.iterator();
    java.util.Iterator var25 = var19.iterator();
    randoop.mutant.RingBufferMutant var27 = new randoop.mutant.RingBufferMutant(10);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    java.util.Iterator var30 = var27.iterator();
    boolean var31 = var27.isEmpty();
    java.util.Iterator var32 = var27.iterator();
    var19.enqueue((java.lang.Object)var27);
    randoop.mutant.RingBufferMutant var35 = new randoop.mutant.RingBufferMutant(10);
    var35.enqueue((java.lang.Object)'#');
    java.util.Iterator var38 = var35.iterator();
    java.util.Iterator var39 = var35.iterator();
    java.util.Iterator var40 = var35.iterator();
    java.util.Iterator var41 = var35.iterator();
    var27.enqueue((java.lang.Object)var41);
    java.util.Iterator var43 = var27.iterator();
    java.util.Iterator var44 = var27.iterator();
    var7.enqueue((java.lang.Object)var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test139");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test140");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(3);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test141");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    int var18 = var1.size();
    var1.enqueue((java.lang.Object)(byte)100);
    boolean var21 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var23 = new randoop.mutant.RingBufferMutant(10);
    var23.enqueue((java.lang.Object)'#');
    var23.enqueue((java.lang.Object)' ');
    boolean var28 = var23.isEmpty();
    randoop.mutant.RingBufferMutant var30 = new randoop.mutant.RingBufferMutant(10);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    java.util.Iterator var33 = var30.iterator();
    boolean var34 = var30.isEmpty();
    int var35 = var30.size();
    java.util.Iterator var36 = var30.iterator();
    int var37 = var30.size();
    java.lang.Object var38 = new java.lang.Object();
    var30.enqueue(var38);
    var23.enqueue((java.lang.Object)var30);
    boolean var41 = var23.isEmpty();
    var1.enqueue((java.lang.Object)var23);
    java.util.Iterator var43 = var23.iterator();
    randoop.mutant.RingBufferMutant var45 = new randoop.mutant.RingBufferMutant(10);
    var45.enqueue((java.lang.Object)'#');
    java.util.Iterator var48 = var45.iterator();
    java.util.Iterator var49 = var45.iterator();
    java.util.Iterator var50 = var45.iterator();
    java.util.Iterator var51 = var45.iterator();
    java.util.Iterator var52 = var45.iterator();
    var23.enqueue((java.lang.Object)var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test142");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var7 = new randoop.mutant.RingBufferMutant(10);
    var7.enqueue((java.lang.Object)'#');
    int var10 = var7.size();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var13 = var1.iterator();
    int var14 = var1.size();
    java.util.Iterator var15 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test143");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var13 = var6.size();
    var6.enqueue((java.lang.Object)100.0d);
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(0);
    int var18 = var17.size();
    java.util.Iterator var19 = var17.iterator();
    boolean var20 = var17.isEmpty();
    var6.enqueue((java.lang.Object)var20);
    boolean var22 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test144");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    randoop.mutant.RingBufferMutant var6 = new randoop.mutant.RingBufferMutant(10);
    var6.enqueue((java.lang.Object)'#');
    java.util.Iterator var9 = var6.iterator();
    java.util.Iterator var10 = var6.iterator();
    java.util.Iterator var11 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    int var13 = var6.size();
    int var14 = var6.size();
    java.util.Iterator var15 = var6.iterator();
    int var16 = var6.size();
    boolean var17 = var6.isEmpty();
    java.util.Iterator var18 = var6.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test145");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    boolean var6 = var1.isEmpty();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    java.util.Iterator var11 = var8.iterator();
    boolean var12 = var8.isEmpty();
    int var13 = var8.size();
    java.util.Iterator var14 = var8.iterator();
    int var15 = var8.size();
    java.lang.Object var16 = new java.lang.Object();
    var8.enqueue(var16);
    var1.enqueue((java.lang.Object)var8);
    boolean var19 = var1.isEmpty();
    int var20 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 3);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test146");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    var9.enqueue((java.lang.Object)'#');
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    java.util.Iterator var14 = var9.iterator();
    java.util.Iterator var15 = var9.iterator();
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    java.util.Iterator var20 = var17.iterator();
    boolean var21 = var17.isEmpty();
    java.util.Iterator var22 = var17.iterator();
    var9.enqueue((java.lang.Object)var17);
    randoop.mutant.RingBufferMutant var25 = new randoop.mutant.RingBufferMutant(10);
    var25.enqueue((java.lang.Object)'#');
    java.util.Iterator var28 = var25.iterator();
    java.util.Iterator var29 = var25.iterator();
    java.util.Iterator var30 = var25.iterator();
    java.util.Iterator var31 = var25.iterator();
    var17.enqueue((java.lang.Object)var31);
    var1.enqueue((java.lang.Object)var17);
    boolean var34 = var17.isEmpty();
    boolean var35 = var17.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test147");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    randoop.mutant.RingBufferMutant var9 = new randoop.mutant.RingBufferMutant(10);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    java.util.Iterator var12 = var9.iterator();
    boolean var13 = var9.isEmpty();
    java.util.Iterator var14 = var9.iterator();
    var1.enqueue((java.lang.Object)var9);
    randoop.mutant.RingBufferMutant var17 = new randoop.mutant.RingBufferMutant(10);
    var17.enqueue((java.lang.Object)'#');
    java.util.Iterator var20 = var17.iterator();
    java.util.Iterator var21 = var17.iterator();
    java.util.Iterator var22 = var17.iterator();
    java.util.Iterator var23 = var17.iterator();
    var9.enqueue((java.lang.Object)var23);
    int var25 = var9.size();
    boolean var26 = var9.isEmpty();
    randoop.mutant.RingBufferMutant var28 = new randoop.mutant.RingBufferMutant(10);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    java.util.Iterator var31 = var28.iterator();
    randoop.mutant.RingBufferMutant var33 = new randoop.mutant.RingBufferMutant(10);
    var33.enqueue((java.lang.Object)'#');
    java.util.Iterator var36 = var33.iterator();
    java.util.Iterator var37 = var33.iterator();
    java.util.Iterator var38 = var33.iterator();
    var28.enqueue((java.lang.Object)var33);
    int var40 = var33.size();
    randoop.mutant.RingBufferMutant var42 = new randoop.mutant.RingBufferMutant(10);
    boolean var43 = var42.isEmpty();
    boolean var44 = var42.isEmpty();
    java.util.Iterator var45 = var42.iterator();
    boolean var46 = var42.isEmpty();
    int var47 = var42.size();
    int var48 = var42.size();
    java.util.Iterator var49 = var42.iterator();
    var33.enqueue((java.lang.Object)var49);
    var9.enqueue((java.lang.Object)var33);
    randoop.mutant.RingBufferMutant var53 = new randoop.mutant.RingBufferMutant(10);
    var53.enqueue((java.lang.Object)'#');
    var53.enqueue((java.lang.Object)' ');
    boolean var58 = var53.isEmpty();
    boolean var59 = var53.isEmpty();
    var33.enqueue((java.lang.Object)var53);
    java.util.Iterator var61 = var53.iterator();
    java.util.Iterator var62 = var53.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test148");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    boolean var11 = var1.isEmpty();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test149");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var5 = new randoop.mutant.RingBufferMutant(1);
    boolean var6 = var5.isEmpty();
    java.util.Iterator var7 = var5.iterator();
    java.util.Iterator var8 = var5.iterator();
    var1.enqueue((java.lang.Object)var8);
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    var11.enqueue((java.lang.Object)'#');
    var11.enqueue((java.lang.Object)' ');
    boolean var16 = var11.isEmpty();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    boolean var22 = var18.isEmpty();
    int var23 = var18.size();
    java.util.Iterator var24 = var18.iterator();
    int var25 = var18.size();
    java.lang.Object var26 = new java.lang.Object();
    var18.enqueue(var26);
    var11.enqueue((java.lang.Object)var18);
    java.util.Iterator var29 = var18.iterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var31 = var18.isEmpty();
    java.util.Iterator var32 = var18.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test150");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test151");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    randoop.mutant.RingBufferMutant var5 = new randoop.mutant.RingBufferMutant(1);
    boolean var6 = var5.isEmpty();
    java.util.Iterator var7 = var5.iterator();
    java.util.Iterator var8 = var5.iterator();
    var1.enqueue((java.lang.Object)var8);
    randoop.mutant.RingBufferMutant var11 = new randoop.mutant.RingBufferMutant(10);
    var11.enqueue((java.lang.Object)'#');
    var11.enqueue((java.lang.Object)' ');
    boolean var16 = var11.isEmpty();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    boolean var22 = var18.isEmpty();
    int var23 = var18.size();
    java.util.Iterator var24 = var18.iterator();
    int var25 = var18.size();
    java.lang.Object var26 = new java.lang.Object();
    var18.enqueue(var26);
    var11.enqueue((java.lang.Object)var18);
    java.util.Iterator var29 = var18.iterator();
    var1.enqueue((java.lang.Object)var18);
    randoop.mutant.RingBufferMutant var32 = new randoop.mutant.RingBufferMutant(10);
    var32.enqueue((java.lang.Object)'#');
    java.util.Iterator var35 = var32.iterator();
    java.util.Iterator var36 = var32.iterator();
    java.util.Iterator var37 = var32.iterator();
    java.util.Iterator var38 = var32.iterator();
    java.util.Iterator var39 = var32.iterator();
    var1.enqueue((java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRingBufferMutantTest1.test152");


    randoop.mutant.RingBufferMutant var1 = new randoop.mutant.RingBufferMutant(10);
    var1.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)' ');
    java.util.Iterator var6 = var1.iterator();
    randoop.mutant.RingBufferMutant var8 = new randoop.mutant.RingBufferMutant(10);
    var8.enqueue((java.lang.Object)'#');
    int var11 = var8.size();
    java.util.Iterator var12 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    int var14 = var1.size();
    java.util.Iterator var15 = var1.iterator();
    int var16 = var1.size();
    randoop.mutant.RingBufferMutant var18 = new randoop.mutant.RingBufferMutant(10);
    var18.enqueue((java.lang.Object)'#');
    java.util.Iterator var21 = var18.iterator();
    java.util.Iterator var22 = var18.iterator();
    java.util.Iterator var23 = var18.iterator();
    java.util.Iterator var24 = var18.iterator();
    boolean var25 = var18.isEmpty();
    randoop.mutant.RingBufferMutant var27 = new randoop.mutant.RingBufferMutant(10);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    int var30 = var27.size();
    var18.enqueue((java.lang.Object)var27);
    java.util.Iterator var32 = var18.iterator();
    var1.enqueue((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

}
