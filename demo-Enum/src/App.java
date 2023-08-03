public class App {
   
        // Enum
        // 1. Finite number of members 
        // example 1 :(Direction: LEFT,RIGHT,UP,DOWN)
        // example 2 :(weekday: monday,tuesday...)
        // Example 3 :(Double entry: debit, credit)
        // 2. Growth of enum elements (change %)

        public static void main(String[] args) {
            System.out.println(Direction.EAST); // EAST
            System.out.println(Direction.EAST.name()); // EAST
        
            Direction east = Direction.EAST; // TEC (heap)
            System.out.println(east == Direction.NORTH); // false
            System.out.println(east != Direction.NORTH); // true
            // == and != are checking the object reference
        
            // values() -> loop
            for (Direction d : Direction.values())
            {
              System.out.println(d.name());
            }
        
            System.out.println(Direction.SOUTH.ordinal()); // 1
            System.out.println(Direction.NORTH.ordinal()); // 3
             System.out.println(Direction.EAST.ordinal()); // 0

             System.out.println(east.getDegree()); // 90
             System.out.println(east.getDirection());// E
          }
    }
