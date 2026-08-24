package com.array;

public class SmallestAndBiggest {

	public static void main(String[] args) {
		int numbers[] = new int[]{9,3,6,4,8,5};

        int smallest = numbers[0];

        int biggest = numbers[0];

       

        for(int i=1; i< numbers.length; i++)

        {

                if(numbers[i] > biggest)

                        biggest = numbers[i];

                else if (numbers[i] < smallest)

                        smallest = numbers[i];

               

        }

       

        System.out.println("Largest Number is : " + biggest);

        System.out.println("Smallest Number is : " + smallest);

}



}
