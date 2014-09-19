

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
   
   @Test
   public void testFillUp()
   {
       VendingMachine v = new VendingMachine(10,0);
       v.FillVendor(10);
       int can = v.numCans();
       assertEquals(20, can);
   }

   @Test
   public void testInsertToken()
   {
     VendingMachine v = new VendingMachine(10,0);
     v.Buy(5);
     int tok = v.numtokens();
      assertEquals(5, tok);
   }

}