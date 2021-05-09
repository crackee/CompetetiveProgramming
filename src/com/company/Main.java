package com.company;

import java.util.Formatter;
/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[] ) {
        String s="DEAVKNYKPOXHXCLQQEDQAVDWZOIORRWWXYRHLSRDGQKDUVTMZZCZUFVTVFIOYGKVEDERVVUDNEGHBCTCBXDXEZRZGBPFHZANFFECCBGQFMZJQTLRSPPXQIYWJOBSPEFUJLXNMDDURDDIYOB";
        int k=87958;
        int n=226036;
        char ch='F';

        //System.out.print(printSequence(" JVWN"));
       // System.out.print(multiplyby11("9621"));
       // System.out.println(fun(s,k,n,ch));
    }


    static String printSequence(String S)  //ONLY cAPS STRING ALLOWED!!!
    {
        // code here
        StringBuffer sb=new StringBuffer();
        char ch;
        int n,count=0,value=0;
        for(int i=0;i<S.length();i++)
        {
            ch=S.charAt(i);
            n=ch-'A'+1;
            if(ch>='A'&&ch<='Z'){

                if(ch=='S'){
                    count=4;
                    value=7;
                }
                else if(ch=='T'){
                    count=1;
                    value=8;
                }
                else if(ch=='U'){
                    count=2;
                    value=8;
                }
                else if(ch=='V'){
                    count=3;
                    value=8;
                }
                else if(ch=='W'){
                    count=1;
                    value=9;
                }else if(ch=='X'){
                    count=2;
                    value=9;
                }
                else if(ch=='Y'){
                    count=3;
                    value=9;
                }
                else if(ch=='Z'){
                    count=4;
                    value=9;
                }

                else{
                    count=n%3;
                    if(count==0){
                        count=3;
                        value=(n/3)+1;
                    }
                    else{
                        value=(n/3)+2;

                    }

                }

                for(int j=0;j<count;j++){
                    sb.append(value);
                }
            }
        }
        return new String(sb);
    }

    static String multiplyby11(String number)
    {
        // code here
       String s2=number+"0",s3="";
      // StringBuffer sb=new StringBuffer();
       int R=0,sum=0;
       for(int i=s2.length()-1;i>-1;i--){
           if(i==0){
               sum=Integer.parseInt(String.valueOf(s2.charAt(i)))+R;
               StringBuffer sb=new StringBuffer(s3);
               s3=sum+"";
               return s3+new String(sb.reverse());
           }
           else{
               int s2int=Integer.valueOf(String.valueOf(s2.charAt(i)));
               sum=s2int+R;
               s2int=Integer.valueOf(String.valueOf(number.charAt(i-1)));
               sum=sum+s2int;
               R=sum/10;
               sum=sum%10;
               s3=s3+(sum+"");
           }
       }
       return s3;
    }
    public static long fun(String s, int k, int n, char c)
    {
        // Your code here
        long count=0;
        if(k==0||n<=s.length()){
            return occurance(s,c,n);
        }
        else{
            long occurancePartial=(n/s.length())*occurance(s,c,s.length());
            if(occurancePartial==0){
                return 0;
            }
            long remainderLength=(n%(s.length()));
            //long x=n/occurancePartial;
            count=occurancePartial+(occurance(s,c,remainderLength));
        }
        return count;

    }
    public static long occurance(String s, char c,long length ){
        long count1=0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)==c){
                count1++;
            }
        }
        return count1;
    }
}
