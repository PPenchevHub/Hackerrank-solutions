package com.ppenchev.compressionTest;

public class Substrings {

    public static void main(String[] args){


        String s = "welcometojava";


        System.out.println(getSmallestAndLargest(s,3));




    }



    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";

        for(int i = 0; i+k <= s.length(); i++){
            if(s.substring(i,i+k).compareTo(smallest) < 0) smallest =  s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest) > 0) largest =  s.substring(i,i+k);

        }

        return smallest + "\n" + largest;
    }



}
