public class single {

    public static void main(String[] args) {

        son s = new son();
        System.out.println(s.gender);
        s.print();
        
    }

}


class grandfather{

    char gender='m';
    void print(){
        System.out.println("parent class");
    }
}




    
   class father extends grandfather{

   }

class son extends father {
       

}




    


    

