import java.awt.Color;

public class SandUtilities
{
  //pre : c!= null
  //post: returns the inverted color from the one sent as c
   public static Color invert(Color c)
   {
      c = new Color(255-c.getRed(), 255-c.getGreen(), 255-c.getBlue());
      return c;
   }
   
   //pre:   m!= null
   //post:  for each non-null element of m, changes it to its inverted color
   //       skips any color with the value skip1 and skip2, leaving them unchanged
   public static void invertColors(Color[][]m, Color skip1, Color skip2)
   {
      for(int i = 0; i < m.length; i++)
      {
         for(int j = 0; j < m[i].length; j++)
         {
            if(m[i][j] != null && m[i][j] != skip1 && m[i][j] != skip2)
            {
               m[i][j] = invert(m[i][j]);
            }
         }
      }
   }
   
   //pre:   m is a square 2-D array (m.length==m[0].length)
   //post:  flips the array upside down
   public static void flipUpsideDown(Object[][]m)
   {
      Object[][] temp = new Object[m.length][m[0].length];
      for(int i = 0; i < m.length; i++)
      {
         for(int j = 0; j < m[i].length; j++)
         {
            temp[i][j] = m[i][j];
         }
      }
      for(int i = 0; i < m.length; i++)
      {
         for(int j = 0; j < m[i].length; j++)
         {
            m[i][j] = temp[m.length - 1 - i][j];
         }
      }
   }
   
   //pre:   m is a square 2-D array (m.length==m[0].length)
   //post:  rotates the array 90 degrees to the left
   public static void rotateLeft(Object[][] m) 
   {
      Object[][] temp = new Object[m.length][m[0].length];
      for(int i = 0; i < m.length; i++)
      {
         for(int j = 0; j < m[i].length; j++)
         {
            temp[i][j] = m[i][j];
         }
      }
      for(int i = 0; i < m.length; i++)
      {
         for(int j = 0; j < m[i].length; j++)
         {
            m[i][j] = temp[j][m.length - 1 - i];
         }
      }
   }

   //pre:   m is a square 2-D array (m.length==m[0].length)
   //post:  rotates the array 90 degrees to the right
   public static void rotateRight(Object[][] m)
   {
      Object[][] temp = new Object[m.length][m[0].length];
      for(int i = 0; i < m.length; i++)
      {
         for(int j = 0; j < m[i].length; j++)
         {
            temp[i][j] = m[i][j];
         }
      }
      for(int i = 0; i < m.length; i++)
      {
         for(int j = 0; j < m[i].length; j++)
         {
            m[i][j] = temp[m.length - 1 - j][i];
         }
      }
   }      
}