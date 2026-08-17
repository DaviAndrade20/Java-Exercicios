package fundamentos;

public class DecimoPrimeiroExercicio {

	public static void main(String[] args) {
		/* Circle: Area and Perimeter
		 * Write a Java program to print the area 
		 * and perimeter of a circle.
		*/ 
		
		double radius = 7.5;
		double area, perimeter;
		
		area = Math.PI * Math.pow(radius, 2);
		perimeter = 2 * Math.PI * radius;
		
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
		
	}

}
