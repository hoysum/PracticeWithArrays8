package com.company;
//8. Given the following array: ['w','t','y','h','k']
//Loop through the array and replace the the letter 't' with the word "hello" once it's found.

public class Main {

    public static void main(String[] args) {
	// write your code here
        String []array = {"w","t", "y", "h", "k"};

        for(int i=0; i<array.length; i++){
            if (array[i] == "t"){
                System.out.println("index " + i +" is hello");
            }
        }
    }
}
