public class characters
{
 
  public static void A(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==1||i==x||j==1||j==m)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void B(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==1||i==x&&j>=2||j==2||j==m)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void C(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==1||i==x||j==1)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void D(int n,int m,char ch)
  {
   //int x=(int)Math.round(n/2.0);
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==1||i==n||j==m||j==2)
      System.out.print(ch+" ");
     else
      System.out.print("  ");
    }
    System.out.println();
   }
  }
  public static void E(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==1||i==x||i==n)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void F(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==1||i==x||j==1)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void G(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   int y=(int)Math.round(m/2.0);
   y=y+2;
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==1||i==x&&j>=y||i==n&&j<=y||j==1||j==m&&i>=x||j==y&&i>=x)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void H(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==x||j==1||j==m)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void I(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   int y=(int)Math.round(m/2.0);
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==1||i==x||j==y)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void J(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   int y=(int)Math.round(m/2.0);
   x+=2;
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==1||j==y||i>=x&&j==1||i==x&&j<=y)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void K(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   int y=m;
   int z=y/x;
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(j==1||j==y)
      System.out.print(ch);
     else
      System.out.print(" ");
      
    }
    if(i<=x)
     y-=z;
     else
     y+=z;
    System.out.println();
   }
  }
  public static void L(int n,int m,char ch)
  {
   int x=(int)Math.round(n/2.0);
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(i==n||j==1)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    System.out.println();
   }
  }
  public static void M(int m,int n,char ch)
  {
   /*int x=(int)Math.round(n/2.0);
   int y=(int)Math.round(m/2.0);
   int z=(int)Math.round((double)y/n);
   z=(z>=1)?z:1;
   int w=0;
   System.out.println();
   for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=m;j++)
    {
     if(j==m||j==1||j==(m-w)||j==w)
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    y=(w==m-w)||(w-1==m-w)?0:1;
    if(y!=0&&w!=0)
    w=w+z;
    if((y==0||w==0)&&i>1)
     w=0;
    System.out.println();
   }*/
   System.out.println();
   int c=1;
   for(int i=1;i<=m;i++)
   {
    for(int j=1;j<=n;j++)
    {
     if(j==1||j==c+1||j==(n-c)||j==n) 
      System.out.print(ch);
     else
      System.out.print(" ");
    }
    if(i!=1&&c==0)
     c=0;
    if(c!=0)
     c=(c<(n)/2)?c+1:0;
    System.out.println();
   }
  }
  public static void N(int l,int b,char ch)
  {
    for(int i=1;i<=l;i++)
    {
     for(int j=1;j<=b;j++)
     {
      if(j==1||j==b||j==i)
       System.out.print(ch);
      else
       System.out.print(" "); 
     }
     System.out.println();
    }
  }  
  public static void O(int l,int b,char ch)  
  {  
   for(int i=1;i<=l;i++)
   {
    for(int j=1;j<=b;j++)
    { 
     if(i==1||j==1||j==b||i==l)
      System.out.print(ch+" ");
     else
      System.out.print("  ");
    }
    System.out.println();
   }
  }
  public static void P(int h,int b,char ch)
  {
    System.out.println();
    for(int i=1;i<=h;i++)
    {
      for(int j=1;j<=b;j++)
      {
       if(j==b&&i<=h/2||j==1||i==h/2||i==1)
        System.out.print(ch+" ");
       else
        System.out.print(" "+" ");
      }
      System.out.println();
    }
  }
  public static void Q(int h,int b,char ch)
  {
    System.out.println();
    int c=0;
    for(int i=1;i<=h;i++)
    {
     int j=1;
     for(j=1;j<=b;j++)
     {
      if(i==1||i==h||j==1||j==b||(i>=h/2&&j==b/2+c))
      {
       System.out.print(ch+" ");
       
       /*else if(i>=h/2&&j==(b/2+c))
       {
        System.out.print(ch+" ");
        c++;
       }*/
      }
      else
       System.out.print("  ");
     }
     if(i>=h/2)
        c++;
     System.out.println();
    }
    for(int i=h;i>=1;i--)
     System.out.print("  ");
    System.out.println(ch); 
  }
  public static void R(int h,int b,char ch)
  {
   int c=1;
   System.out.println();
   for(int i=1;i<=h;i++)
   {
    for(int j=1;j<=b;j++)
    {
     if(i==1||i==h/2||j==1||(j==b&&i<=h/2))//||(i>=h/2&&j==c))
      System.out.print(" "+ch);
     else if(i>=h/2&&j==c)
      System.out.print("  "+ch);
     else
      System.out.print("  ");
      
    }
    if(i>=h/2)
     c++;
    System.out.println();
   }
  }
  public static void S(int h,int b,char ch)
  {
    System.out.println();
    for(int i=1;i<=h;i++)
    {
     for(int j=1;j<=b;j++)
     {
       if(i==1||i==h||(j==1&&i<h/2)||(j==b&&i>h/2)||i==h/2)
         System.out.print(ch+" ");
       else
         System.out.print("  ");
     }
     System.out.println();
    }
  }
  public static void T(int h,int b,char ch)
  { System.out.println();
    for(int i=1;i<=h;i++)
    {
     for(int j=1;j<=b;j++)
     {
       if(j==b/2||i==1)
         System.out.print(ch+" ");
       else
         System.out.print("  ");
     }
     System.out.println();
    }
  }
  public static void U(int h,int b,char ch)
  {
   System.out.println();
   for(int i=1;i<=h;i++)
   {
    for(int j=1;j<=b;j++)
    {
      if(j==1||i==h||j==b)
       System.out.print(ch+" ");
      else
       System.out.print("  ");
    }
    System.out.println();
    }
  }
  public static void V(int h,int b,char ch)
  {
   System.out.println();
   //int c=0;
   for(int i=1;i<=h;i++)
   {
    for(int j=1;j<=i;j++)
     System.out.print(" ");
    System.out.print(ch);
    for(int j=b;j>=1;j--)
     System.out.println(" ");
    System.out.print(ch);
    System.out.println();
    //c++;
   }
  }
  public static void W(int h,int b,char ch)
  {
   System.out.println();
   //int c=0;
   for(int i=1;i<=h;i++)
   {
    for(int j=1;j<=b;j++)
    {
     if(j==1||j==b||j==b/2||i==h)
      System.out.print(ch+" ");
     else
      System.out.print("  ");
    }
    System.out.println();
    //c++;
   }
  }
  public static void X(int h,int b,char ch)
  {
   System.out.println();
   //int c=0;
   for(int i=1;i<=h;i++)
   { 
    if(i<=h/2)
    for(int j=1;j<=b;j++)
    {
     if(j==i||j==b-i)
      System.out.print(ch+" ");
     else
      System.out.print("  ");
    }
    else
    for(int j=1;j<=b;j++)
    {
     if(j==i||j==b-i)
      System.out.print("  ");
     else
      System.out.print(ch+" ");
    }
    System.out.println();
    //c++;
   }
  }
}
