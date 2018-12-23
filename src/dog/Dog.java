
package dog;

class Dog {
    String name;
    
    public static void main(String[] args) {
       Dog dog1 = new Dog();
        dog1.name = "Vegas";
        
      Dog[] myDogs = new Dog[6];
       
       myDogs[0] = new Dog();
       myDogs[1] = new Dog();
       myDogs[2] = new Dog();
       myDogs[3] = new Dog();
       myDogs[4] = new Dog();
       myDogs[5] = new Dog();
       
       //
       myDogs[0].name = "Madge";
       myDogs[1].name = "Sheldon";
       myDogs[2].name = "Red";
       myDogs[3].name = "Islay";
       myDogs[4].name = "Leeloo";
       myDogs[5].name = "Stoli";
       
       //loop through and have them all bark
       int x = 3;
       while (x < myDogs.length) {
           myDogs[x].bark();
           x = x + 1;
        }
       //loop trough and have them all chase
       int y = 4;
       while (y < myDogs.length) {
           myDogs[y].chase();
           y = y + 1;
        }
    }
       
       public void bark() {
           System.out.println(name + " says BARK!!");
       }
       public void chase() {
           System.out.println(name + " CHASE CHASE CHASE");
       }
    } 