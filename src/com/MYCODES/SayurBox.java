package com.MYCODES;

import java.util.ArrayList;
import java.util.List;

public class SayurBox {


    public static void main (String[] args) {


        int posInt=15;
        String result=getQuadraticNumber(posInt);


        System.out.println(result);
    }



    static String getQuadraticNumber(int posInt){

      //  List<Integer> resultList= new ArrayList<Integer>();

        StringBuffer sb = new StringBuffer();
        for(int i=0;i<=posInt;i++){

            int val = (int)(Math.pow(i,2));
            if(val>posInt){
                break;
            }
            sb.append(val+" ");
        }


        return sb.toString();

    }
}
