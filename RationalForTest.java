public class RationalForTest
  {
    private int numerator, denominator;
    public RationalForTest(int numer, int denom)
    {
        if (denom == 0)
            denom = 1;

        if (denom < 0)
        {
            numer = numer * -1;
            denom = denom * -1;
        }
        numerator = numer;
        denominator = denom;
        f();
    }
    public int getNumerator ()
    {
        return numerator;
    }
    
    public int getDenominator ()
    {
        return denominator;
    }

    public RationalForTest a()
    {
      return new RationalForTest(denominator, numerator);
    }
    public RationalForTest b(RationalForTest op2)
    {
      int p = denominator * op2.getDenominator();
      int numerator1  = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int q = numerator1 + numerator2;
      return new RationalForTest(q,p);
    }
    public RationalForTest c(RationalForTest op2)
    {
      int q = denominator * op2.getDenominator();
      int numerator1  = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int p = numerator1 - numerator2;
      return new RationalForTest(p,q);
    }
    public RationalForTest d(RationalForTest op2)
    {
      int numer = numerator * op2.getNumerator();
      int denom = denominator * op2.getDenominator();
      return new RationalForTest(numer, denom);
    }
    public RationalForTest e(RationalForTest op2)
    {
      return d(op2.a());
    }
    public boolean equals(RationalForTest op2)
    {
      return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
    }
    public String toString()
    {
      String result;
      if (numerator ==0)
        result = "0";
      else
      if (denominator == 1)
        result = numerator + "";
      else
        result = numerator + "/" + denominator;
      return result;
    }
    private void f()
    {
      if (numerator != 0)
      {
        int z = g(Math.abs(numerator), denominator);
        numerator = numerator / z;
        denominator = denominator /z;
      }
    }
    private int g(int num1, int num2)
    {
      while (num1 != num2)
        if (num1 > num2)
          num1 = num1 - num2;
        else num2 = num2 - num1;
      return num1;
    }
  }
