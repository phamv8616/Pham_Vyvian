import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
<<<<<<< HEAD
 
  /** Method to keep only blue */ 
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
		pixelObj.setGreen(0);
      }
    }
  }
  
  /** Method to set 255 - current values */  
    public void negate()
    {
        Pixel[][] pixels = this.getPixels2D();
        for ( Pixel[] rowArray : pixels )
        {
            for ( Pixel pixelObj : rowArray )
            {
                pixelObj.setRed(255 - pixelObj.getRed());
                pixelObj.setGreen(255 - pixelObj.getGreen());
                pixelObj.setBlue(255 - pixelObj.getBlue());
            }
        }
    }

  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for (Pixel pixelObj : rowArray)
		  {
			  int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3; 
			  pixelObj.setRed(average);
			  pixelObj.setGreen(average);
			  pixelObj.setBlue(average);
			  
		  }
	  }
  }
  
=======
>>>>>>> origin/master
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
<<<<<<< HEAD
    public void mirrorVerticalRightToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for ( int row = 0; row < pixels.length; row++ )
        {
            for ( int col = 0; col < width / 2; col++ )
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor( rightPixel.getColor() );
            }
        }
    }
	
    public void mirrorHorizontal()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for ( int row = 0; row < height; row++ )
        {
            for ( int col = 0; col < pixels[0].length; col++ )
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                bottomPixel.setColor( topPixel.getColor() );
            }
        }
    }
	
    public void mirrorHorizontalBotToTop()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for ( int row = 0; row < height; row++ )
        {
            for ( int col = 0; col < pixels[0].length; col++ )
            {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                topPixel.setColor( bottomPixel.getColor() );
            }
        }
    }
	
	
	

  
=======
>>>>>>> origin/master
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
<<<<<<< HEAD
        count++;
=======
        
>>>>>>> origin/master
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
<<<<<<< HEAD
	  System.out.println(count);
    }
  }
  
  public void mirrorArms()
  {
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // Left arm
    for (int row = 158; row < mirrorPoint; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 103; col < 170; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
    int mirrorPoint2 = 198;
    Pixel topPixel2 = null;
    Pixel bottomPixel2 = null;
    
    // Right arm
    for (int row = 171; row < mirrorPoint2; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 239; col < 294; col++)
      {
        topPixel2 = pixels[row][col];      
        bottomPixel2 = pixels[mirrorPoint2 - row + mirrorPoint2][col];
        bottomPixel2.setColor(topPixel2.getColor());
      }
    }
  }
  
   public void mirrorGull()
  {
    int mirrorPoint = 345;
    Pixel rightPixel = null;
    Pixel leftPixel = null;
    Pixel[][] pixels = this.getPixels2D();   
    
    // Seagull
    for (int row = 235; row < 323; row++)
    {
      for (int col = 238; col < mirrorPoint; col++)
      {
        rightPixel = pixels[row][col];      
        leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
        leftPixel.setColor(rightPixel.getColor());
      }
=======
>>>>>>> origin/master
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
<<<<<<< HEAD
	
	
	
  // public void copy(Picture fromPic, 
                 // int startRow, int startCol)
  // {
    // Pixel fromPixel = null;
    // Pixel toPixel = null;
    // Pixel[][] toPixels = this.getPixels2D();
    // Pixel[][] fromPixels = fromPic.getPixels2D();
    // for (int fromRow = 0, toRow = startRow; 
         // fromRow < fromPixels.length &&
         // toRow < toPixels.length; 
         // fromRow++, toRow++)
    // {
      // for (int fromCol = 0, toCol = startCol; 
           // fromCol < fromPixels[0].length &&
           // toCol < toPixels[0].length;  
           // fromCol++, toCol++)
      // {
        // fromPixel = fromPixels[fromRow][fromCol];
        // toPixel = toPixels[toRow][toCol];
        // toPixel.setColor(fromPixel.getColor());
      // }
    // }   
  // }
  
=======
>>>>>>> origin/master
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
<<<<<<< HEAD
  
  public void copyTwo(Picture fromPic, int startRow, int startCol, int endrow, int endCo)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for(int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < toPixels.length; fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < toPixels[0].length; fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromCol][fromRow];
			  toPixel = toPixels[toCol][toRow];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }
  }
=======
>>>>>>> origin/master

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
<<<<<<< HEAD
  public void myCollage()
  {
	  Picture smallSwan = new Picture("smallSwan.jpg");
	  Picture water = new Picture("water.jpg");
	  Picture smallthruDoor = new Picture("smallthruDoor.jpg");
	  Picture swanKeepBlue = new Picture(smallSwan);
	  swanKeepBlue.keepOnlyBlue();
	  Picture thruDoorNegate = new Picture(smallthruDoor);
	  thruDoorNegate.negate();
	  Picture thruDoorGrayscale = new Picture(smallthruDoor);
	  thruDoorGrayscale.grayscale();
	  this.copy(water,26,0);
	  //add 71
	  this.copy(smallSwan,0,0);
	  this.copy(swanKeepBlue,0,71);
	  this.copy(smallSwan,0,142);
	  this.copy(swanKeepBlue,0,213);
	  this.copy(smallSwan,0,284);
	  this.copy(thruDoorNegate,150,0);
	  this.copy(thruDoorGrayscale,150,121);
	  this.copy(thruDoorNegate,150,242);
	  this.mirrorHorizontal();
	  this.mirrorVertical();
	  this.write("myCollage,jpg");
  }
  
=======
>>>>>>> origin/master
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
<<<<<<< HEAD
  // public void edgeDetection(int edgeDist)
  // {
    // Pixel leftPixel = null;
    // Pixel rightPixel = null;
	// Pixel topPixel = null;
	// Pixel bottomPixel = null;
    // Pixel[][] pixels = this.getPixels2D();
    // Color rightColor = null;
	// Color topColor = null;
    // for (int row = 0; row < pixels.length; row++)
    // {
      // for (int col = 0; 
           // col < pixels[0].length-1; col++)
      // {
        // leftPixel = pixels[row][col];
        // rightPixel = pixels[row][col+1];
        // rightColor = rightPixel.getColor();
        // if (leftPixel.colorDistance(rightColor) > 
            // edgeDist)
          // leftPixel.setColor(Color.BLACK);
        // else
          // leftPixel.setColor(Color.WHITE);	  
	  // }
    // }
  // }
  
=======
>>>>>>> origin/master
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
<<<<<<< HEAD
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length - 1; row++)
=======
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
>>>>>>> origin/master
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
<<<<<<< HEAD
        topPixel = pixels[row][col];
        bottomPixel = pixels[row + 1][col];
        if (leftPixel.colorDistance(rightPixel.getColor()) > edgeDist ||
            topPixel.colorDistance(bottomPixel.getColor()) > edgeDist)
=======
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
>>>>>>> origin/master
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
<<<<<<< HEAD
 //second edge detection method
	// public void edgeDetection2(int edgeDist)
	// {
		// Pixel leftPixel = null;
		// Pixel rightPixel = null;
		// Pixel topPixel = null;
		// Pixel bottomPixel = null;
		
		// Pixel[][] pixels = this.getPixels2D();
		// for(int row = 0; row < pixels.length - 1; row++);
		// {
			// for (int col = 0; col < pixels[0].length - 1; col++);
			// {
				// letPixel = pixels[row][col];
				// rightPixel = pixels [row][col+1];
				// topPixel = pixels[row][col];
				// bottomPixe = pixels[row+1][col];
				// if(leftPixel.colorDistance)
			// }
		// }
	// }
=======
>>>>>>> origin/master
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
<<<<<<< HEAD
    Picture b = new Picture("beach.jpg");
=======
    Picture b = new Picture("husky.jpg");
>>>>>>> origin/master
    b.explore();
    b.zeroBlue();
    b.explore();
  }
  
<<<<<<< HEAD
} 
// this } is the end of class Picture, put all new methods before this
=======
} // this } is the end of class Picture, put all new methods before this
>>>>>>> origin/master