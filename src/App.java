import static org.junit.Assert.assertEquals;

import java.beans.Transient;
import org.junit.Test;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public static int add( int a, int b )
    {
        return (a+b);
    }
    public static int sub(int a, int b)
    {
        return (a-b);
    }
    public static int multi(int a, int b)
    {
        return(a*b);
    }
    public static int div(int a, int b)
    {
        return(a/b);
    }
    public static int mod(int a,int b)
    {
        return(a%b);
    }

    @Test
    public void testadd()
    {
        assertEquals("message",100,add(50, 50));
        }
@Test
        public void testsub()
    {
        assertEquals("message",20,sub(40,20));
    }
@Test
    public void testmulti()
    {
        assertEquals("message",2,multi(1,2));
    }
    @Test
    public void testdiv()
    {
        assertEquals("message",0,div(4,2));
    }
    @Test
    public void testmod()
    {
        assertEquals("message",0,mod(2,2));
    }

}
