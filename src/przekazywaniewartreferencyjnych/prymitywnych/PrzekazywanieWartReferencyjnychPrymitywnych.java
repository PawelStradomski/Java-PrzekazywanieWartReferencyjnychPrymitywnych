
package przekazywaniewartreferencyjnych.prymitywnych;
/**
 * 
 * @author pawelstradomski
 */

public class PrzekazywanieWartReferencyjnychPrymitywnych {

    
    public static void main(String[] args) {
        
       
        int a = 5;
        Test X = new Test();
        X.zmienWartosc(a);
//        a = X.zmienWartosc(a);
        System.out.println(a);
        
        
        Foo foo = new Foo();
        X.zmienWartosc(foo);
        System.out.println(foo.y);
  
        
        
            
            
        
                
    }
    
}
class Test
{
    void zmienWartosc(int zm)
    {
        zm = zm + 2;
        System.out.println(zm); //void vs int - zwraca zmieniona wartosc vs ten sam adres z wartoscia bez zmiany
    }
//    int zmienWartosc(int zm)
//    {
//        zm = zm + 2;
//        return zm;
//    }
    void zmienWartosc(Foo zz)
    {
        zz.y = zz.y + 40;
    }
}
class Foo
{
   int y = 20; 
}