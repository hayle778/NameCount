import java.util.ArrayList;
import java.util.Scanner;

public class NameCounts {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        ArrayList<String> list = new <String>ArrayList();
        System.out.println( "Enter name:" );
        list.add( input.nextLine() );
        System.out.println( "Enter name:" );
        list.add( input.nextLine() );

        System.out.println( "Enter name:" );
        list.add( input.nextLine() );

        System.out.println( "Enter name:" );
        list.add( input.nextLine() );
        System.out.println( "Enter name:" );
        list.add( input.nextLine() );
        System.out.println( "Enter name:" );
        list.add( input.nextLine() );
        System.out.println( "Enter name:" );
        list.add( input.nextLine() );
        System.out.println( "Enter name:" );
        list.add( input.nextLine() );

        boolean isThere = true;
        for (String g : list) {

            if (input == null) {
                isThere = false;
                return;
            }

            System.out.println( "-------------------------------" );
            //   System.out.println( g );
            // print out  the redundency word;

        }
    }
}

