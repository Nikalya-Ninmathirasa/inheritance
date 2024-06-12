public class hierarchical {

   public static void main(String[] args) {

    // mother
        mother m = new mother();
        System.out.println(m.gender);
        m.print();


        // uncle 

        uncle u = new uncle();
        System.out.println(u.gender);
        u.print();
        
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





    


    

