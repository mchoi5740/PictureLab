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
    public static void testZeroRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroRed();
    beach.explore();
  }
    public static void testZeroGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroGreen();
    beach.explore();
  }
   public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.Negate();
    beach.explore();
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.Grayscale();
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
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontal();
    redMotorcycle.explore();
  }
    public static void testMirrorHorizontalBotToTop()
  {
    Picture redMotorcycle = new Picture("redMotorcycle.jpg");
    redMotorcycle.explore();
    redMotorcycle.mirrorHorizontalBotToTop();
    redMotorcycle.explore();
  }
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
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
  public static void testCopy()
  {
   Picture ocean= new Picture("beach.jpg");
   Picture daddy= new Picture("snowman.jpg");
   ocean.copy(daddy,10,10,60,160,180,230);
   ocean.explore();
    }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue(); //done
    //testKeepOnlyBlue(); //done
    //testKeepOnlyRed(); //done
    //testKeepOnlyGreen(); //done
    //testNegate(); //done   
    //testGrayscale(); //done
    //testFixUnderwater();
    //testMirrorVertical(); //done
    //testMirrorVerticalRightToLeft(); //done
    //testMirrorHorizontal(); //done
    //testMirrorHorizontalBotToTop(); //done
    //testMirrorTemple(); //done
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal(); //done
    //testCollage();
    // testCopy(); //done
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}