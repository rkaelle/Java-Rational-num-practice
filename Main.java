class Main {
  public static void main(String[] args) {
    RationalForTest r1 = new RationalForTest(6,8);
    RationalForTest r2 = new RationalForTest(12,3);
    RationalForTest r3,r4,r5,r6,r7;
    System.out.println("First rational number: "+ r1);
    System.out.println("Second rational number: "+ r2);
    if (r1.equals(r2))
      System.out.println("r1 and r2 are equal.");
    else
      System.out.println("r1 and r2 are NOT equal.");
    r3 = r1.a();
    System.out.println(r3);
    r4 = r1.b(r2);
    r5 = r1.c(r2);
    r6 = r1.d(r2);
    r7 = r1.e(r2);
    System.out.println(r4);
    System.out.println(r5);
    for(int i = 0; i < 7; i++){
      System.out.print("-");
    }
    System.out.println();
    System.out.println(r6);
    System.out.println(r7);
  }
}
