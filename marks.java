import java.util.Scanner;
public class marks {
    public static void main(String[]args) {

        Scanner Staff = new Scanner(System.in);

        float english,maths,chem,geo,physics,total,average;
        int highest,lowest;
        int e;
        e= 9;

        System.out.println("\t\tWelcome");

        System.out.println("English:");
        english = Staff.nextFloat();

        System.out.println("Maths:");
        maths = Staff.nextFloat();

        System.out.println("Chem: ");
        chem = Staff.nextFloat();

        System.out.println("Geo:");
        geo = Staff.nextFloat();

        System.out.println("Physics:");
        physics = Staff.nextFloat();

        total = english+maths+chem+geo+physics;
        average = total/4;

        System.out.println("Total: "+total);
        System.out.println("Average:"+average);
        //highest

        if(e==9) {
        
        if(english>maths && english>chem && english>geo && english>physics) {
            System.out.println("highest"+english);
        }

        else if (maths>english && maths>chem && maths>geo && maths>physics) {
            System.out.println("highest: "+maths);
        }

        else if(chem>english && chem>maths && chem>geo && chem>physics) {
            System.out.println("highest: "+chem);
        }

        else if(geo>english && geo>maths && geo>chem && geo>physics) {
            System.out.println("highest: "+geo);
        }

        else {
            System.out.println("highest: "+physics);
        }
        //lowest
        if(english<maths && english<chem && english<geo && english<physics) {
            System.out.println("lowest:"+english);
        }

        else if (maths<english && maths<chem && maths<geo && maths<physics) {
            System.out.println("lowest: "+maths);
        }

        else if(chem<english && chem<maths && chem<geo && chem<physics) {
            System.out.println("lowest: "+chem);
        }

        else if(geo<english && geo<maths && geo<chem && geo<physics) {
            System.out.println("lowest: "+geo);
        }

        else {
            System.out.println("lowest: "+physics);
        }
        
    }
    }
}
