interface A{

     void display();
         }

class B implements A{

      public void display(){
  System.out.println("B's method");
          }
        }

class C extends B{

       public void callme(){
   System.out.println("C's method");
          }
        }

class Demointerface{

 public static void main(String[] args){     
     C obj = new C();
   
       obj.display();
       obj.callme();
       }
      }
