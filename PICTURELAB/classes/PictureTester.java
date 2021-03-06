/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture canvas = new Picture ("640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  

  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

 
  public static void testKeepOnlyBlue()
  {
	  Picture husky = new Picture("husky.jpg");
	  husky.keepOnlyBlue();
	  husky.explore();
  }
  
  public static void testNegate()
  {
	  Picture thruDoor = new Picture("thruDoor.jpg");
	  thruDoor.negate();
	  thruDoor.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture koala = new Picture("koala.jpg");
	  koala.grayscale();
	  koala.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture redMotorcycle = new Picture("redMotorcycle.jpg");
	  redMotorcycle.mirrorVerticalRightToLeft();
	  redMotorcycle.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture redMotorcycle = new Picture("redMotorcycle.jpg");
	  redMotorcycle.mirrorHorizontal();
	  redMotorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture beach = new Picture ("beach.jpg");
	  beach.mirrorHorizontalBotToTop();
	  beach.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture ("snowman.jpg");
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture ("seagull.jpg");
	  seagull.mirrorGull();
	  seagull.explore();
  }
  
  public static void testCopy()
  {
	  Picture beach = new Picture ("beach.jpg");
	  beach.copy(beach, 220, 300);
	  beach.explore();
  }

  

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	testEdgeDetection();
    // testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    //testMirrorDiagonal();
    // testCollage();
	// testMyCollage();
    //testCopy();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}