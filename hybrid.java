public class hybrid {


    public static void main(String[] args) {

        // mother
            mother m = new mother();
            System.out.println(m.gender);
            m.print();
    
    
            // uncle 
    
            uncle u = new uncle();
            System.out.println(u.gender);
            u.print();

        // daughter

          daughter d = new daughter();
          System.out.println(d.gender);
          d.print();

          
        // son 
        son s = new son();
        System.out.println(s.gender);
        s.print();

        // granddaughter
        granddaughter dg = new granddaughter();
        System.out.println(dg.gender);
        dg.print();

            
        }



    
    }
    
    // one parent class -----> many child class
    
    class grandfather{
    
        char gender='m';
        void print(){
            System.out.println("parent class");
        }
    }
    
    
    
    
        
       class mother extends grandfather{
        char gender='f';
    
    
       }
    
    class uncle extends grandfather {
        
        
       }


       class son extends mother {

        char gender = 'm';
       }



       class daughter extends mother {

        
       }

       class granddaughter extends daughter{

       }
    
    
    
    
    
        
    
    
        
    
    

    

