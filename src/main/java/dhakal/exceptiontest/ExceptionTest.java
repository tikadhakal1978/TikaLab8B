/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dhakal.exceptiontest;



/**
 *
 * @author tikad
 */
//public class ExceptionTest {
//
//    public static void main(String[] args) {
//       methodThrowExcept();
//    }
//    private static void methodThrowExcept() {
//            try {
//                throw new ExceptionA ("Throwing Exception A");
//            
//        
//            } catch (ExceptionA e) {
//                e.printStackTrace();
//            }
//            try {
//                    throw new ExceptionB("Throwing Exception B");
//                            
//            }   catch (ExceptionB e) {
//                       System.err.println("An exception accurred: " + e.getMessage());
//            }
//             try {
//                    throw new ExceptionC("Throwing Exception C");
//                            
//            }   catch (ExceptionC e) {
//                       System.err.println("An exception accurred: " + e.getMessage());
//}
//    }
//}

public class ExceptionTest {

public static void methodC () throws ExceptionC{

System.out.println("inside the methodc..."); 
    throw new ExceptionC ("my Exception is thrown");

}

public static void methodsB () throws ExceptionB{

System.out.println ("inside the methodB..."); 
    throw new ExceptionB ("my Exception is thrown");
}
public static void main (String[] args){

System.out.println ("first line.. before try");

try{

System.out.println ("second line...top of try");
methodC();

System.out.println("third line.. bottom of try");

}catch (ExceptionC ec) {

System.out.println("…..inside Exception catch");

} 

catch (ExceptionA ea){

System.out.println ("fourth line...inside catch");
}
finally {

System. out.println ("fifth line...inside finally");

}

System. out.println ("sixth line line... last line of main");

}

}
