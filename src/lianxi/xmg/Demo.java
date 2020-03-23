package lianxi.xmg;

public class Demo {
                 public static void main(String args[]) {
                     int i = 1 ;
                     int j = i++ ;
                     if((i==(++j))&&((i++)==j))     {
                         i += j ;
                     }
                     System.out.println("i = "+i);
//
//                     int num = 68 ;
//                     char c = (char) num ;
//                     System.out.println(c) ;

                     char c = 'A' ;
                     int num = 10 ;
                     switch(c) {
                         case 'B' :
                             num ++ ;
                         case 'A' :
                             num ++ ;
                             break;
                         case 'Y' :
                             num ++ ;
                             break ;
                         default :
                             num -- ;
                     }
                     System.out.println(num) ;
                 }
}

