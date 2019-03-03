package za.ac.cput.projectone;

import java.util.*;

/**
 * Ryan Petersen
 * 217027806
 * 3G
 * Chapter 2 Question 3
 */
    public interface MyInterface{

         int age(int currentyear,int birthyear);
    }

     class AgeCalculator implements MyInterface{
        @Override
        public int age(int currentyear,int birthyear){
            return currentyear - birthyear;
        }
    }