public class multi {
    public static void main(String[] args) {

        son s = new son();
        System.out.println(s.gender);
        s.print();
        
    }

}

// one parent class ----> sub class----> subclass

class grandfather{

    char gender='m';
    void print(){
        System.out.println("parent class");
    }
}




    
   class father extends grandfather{
    char gender='f';


   }

class son extends father {
    char gender='a';
       

    
}
