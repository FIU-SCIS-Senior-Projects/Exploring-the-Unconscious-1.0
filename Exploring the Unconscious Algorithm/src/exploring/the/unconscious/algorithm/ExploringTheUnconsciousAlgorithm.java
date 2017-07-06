/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploring.the.unconscious.algorithm;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;

/**
 *
 * @author Ruben
 */
public class ExploringTheUnconsciousAlgorithm {
public static void main(String[] args) {
    String Question = "";
    String Answer1 = "";
    String Answer2 = "";
    String Answer3 = "";
    int tempquest = 0;
    int tempquest2 = 0;
    int tempquest3 = 0;
    int tempquest4 = 0;
    int tempquest5 = 0;
    int tempquest6 = 0;
    int tempquest7 = 0;
    int tempquest8 = 0;
    int tempquest9 = 0;
    int tempA = 0;
    int tempA2 = 0;
    int tempA3 = 0;
    int tempA4 = 0;
    int tempA5 = 0;
    int tempA6 = 0;
    int tempA7 = 0;
    int tempA8 = 0;
    int tempA9 = 0;
    int tempB = 0;
    int tempB2 = 0;
    int tempB3 = 0;
    int tempB4 = 0;
    int tempB5 = 0;
    int tempB6 = 0;
    int tempB7 = 0;
    int tempB8 = 0;
    int tempB9 = 0;
    char[] chr1 = {'a', 'j', 's'};
    char[] chr2 = {'b', 'k', 't'};
    char[] chr3 = {'c', 'l', 'u'};
    char[] chr4 = {'d', 'm', 'v'};
    char[] chr5 = {'e', 'n', 'w'};
    char[] chr6 = {'f', 'o', 'x'};
    char[] chr7 = {'g', 'p', 'y'};
    char[] chr8 = {'h', 'q', 'z'};
    char[] chr9 = {'i', 'r'};
    int modQ = 0;
    int modA1 = 0;
    int modA2 = 0;
    int modQdigit1 = 0;
    int modQdigit2 = 0;
    int modresultQ = 0;
    int modresult = 0;
    int Qdigit3 = 0;
    int modAdigit2 = 0;
    int modAresult = 0;
    int Adigit3 = 0;
    int modBdigit2 = 0;
    int modBresult = 0;
    int Bdigit3 = 0;
    //Sum of question and 1st answer
    int SumA1 = 0;
    int SumA2 = 0;
    int SumA3 = 0;
    //Sum of question and 2nd answer
    int SumB1 = 0;
    int SumB2 = 0;
    int SumB3 = 0;
    //1st Answer sum
    int modSum3 = 0;
    int modSum2 = 0;
    int modSum1 = 0;
    //2nd Answer sum
    int modS3 = 0;
    int modS2 = 0;
    int modS1 = 0;
    //1st
    int modSumA1 = 0;
    int modSumA2 = 0;
    //2nd
    int modSumB1 = 0;
    int modSumB2 = 0;
   
    //Code revised, fixed error where the first digit for question and answers was not being decreased if greater then 10
    //Fixed issue where the digits were not being added correctly
    //Now result properly shows whether the question and answers are compatible or not 
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your question: ");
    Question =  input.nextLine();
    Question =  Question.toLowerCase();
    System.out.print("Enter your 1st answer: ");
    Answer1 =  input.nextLine();
    Answer1 =  Answer1.toLowerCase();
    System.out.print("Enter your 2nd answer: ");
    Answer2 =  input.nextLine();
    Answer2 =  Answer2.toLowerCase();
    
    
    //Digit1 for questions and answers
    int Qdigit1 = Question.replace(" ", "").length();
    if (Qdigit1 > 9){
         modQdigit1 = Qdigit1 % 10;
         modresultQ = (Qdigit1/10) + modQdigit1;
     }
    System.out.println(Qdigit1);
    System.out.println(modresultQ);
    int A1d1 = Answer1.replace(" ", "").length();
    System.out.println(A1d1);
    int A2d1 = Answer2.replace(" ", "").length();
    System.out.println(A2d1);
    
    
    //For Loop's for Questions 2nd digit
     for (int i = 0; i < Qdigit1; i++){
        for (int a = 0; a < chr1.length; a++) {
        if (Question.charAt(i) == chr1[a])
     {
         tempquest++;
         break;
     }
    }
   }
     
     for (int i = 0; i < Qdigit1; i++){
        for (int b = 0; b < chr2.length; b++) {
        if (Question.charAt(i) == chr2[b])
     {
         tempquest2 +=2;
         break;
     }   
    }
   }
     
     for (int i = 0; i < Qdigit1; i++){
        for (int c = 0; c < chr3.length; c++) {
        if (Question.charAt(i) == chr3[c])
     {
         tempquest3 +=3;
         break;
     }   
    }
   }
     
     for (int i = 0; i < Qdigit1; i++){
        for (int d = 0; d < chr4.length; d++) {
        if (Question.charAt(i) == chr4[d])
     {
         tempquest4 +=4;
         break;
     }   
    }
   }
     
     for (int i = 0; i < Qdigit1; i++){
        for (int e = 0; e < chr5.length; e++) {
        if (Question.charAt(i) == chr5[e])
     {
         tempquest5 +=5;
         break;
     }   
    }
   }
     
      for (int i = 0; i < Qdigit1; i++){
        for (int f = 0; f < chr6.length; f++) {
        if (Question.charAt(i) == chr6[f])
     {
         tempquest6 +=6;
         break;
     }   
    }
   }
      
      for (int i = 0; i < Qdigit1; i++){
        for (int g = 0; g < chr7.length; g++) {
        if (Question.charAt(i) == chr7[g])
     {
         tempquest7 +=7;
         break;
     }   
    }
   }
      
       for (int i = 0; i < Qdigit1; i++){
        for (int h = 0; h < chr8.length; h++) {
        if (Question.charAt(i) == chr8[h])
     {
         tempquest8 +=8;
         break;
     }   
    }
   }
       
        for (int i = 0; i < Qdigit1; i++){
        for (int k = 0; k < chr9.length; k++) {
        if (Question.charAt(i) == chr9[k])
     {
         tempquest9 +=9;
         break;
     }   
    }
   }
        
     System.out.println("Values for the Question's Digit 2");   
     System.out.println("Values of 1: " +tempquest);
     System.out.println("Values of 2: " +tempquest2);
     System.out.println("Values of 3: " +tempquest3);
     System.out.println("Values of 4: " +tempquest4);
     System.out.println("Values of 5: " +tempquest5);
     System.out.println("Values of 6: " +tempquest6);
     System.out.println("Values of 7: " +tempquest7);
     System.out.println("Values of 8: " +tempquest8);
     System.out.println("Values of 9: " +tempquest9);
     
     int Qdigit2 = tempquest + tempquest2 + tempquest3 + tempquest4 + tempquest5 + tempquest6 + tempquest7 + tempquest8 + tempquest9;
     //Digit3 for question
     if (Qdigit1 > 9){
         modQdigit1 = Qdigit1 % 10;
         Qdigit1 = (Qdigit1/10) + modQdigit1;
     }
     if (Qdigit2 > 9){
         modQdigit2 = Qdigit2 % 10;
         modresult = (Qdigit2/10) + modQdigit2;
     }
     if (Qdigit2 < 9){
     Qdigit3 = (Math.abs(Qdigit1 - Qdigit2));
    }
     else
     Qdigit3 = (Math.abs(Qdigit1 - modresult));
    
     //For loops for Answer 1's 2nd digit
     
     for (int i = 0; i < A1d1; i++){
        for (int a = 0; a < chr1.length; a++) {
        if (Answer1.charAt(i) == chr1[a])
     {
         tempA++;
         break;
     }
    }
   }
     
     for (int i = 0; i < A1d1; i++){
        for (int b = 0; b < chr2.length; b++) {
        if (Answer1.charAt(i) == chr2[b])
     {
         tempA2 +=2;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A1d1; i++){
        for (int c = 0; c < chr3.length; c++) {
        if (Answer1.charAt(i) == chr3[c])
     {
         tempA3 +=3;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A1d1; i++){
        for (int d = 0; d < chr4.length; d++) {
        if (Answer1.charAt(i) == chr4[d])
     {
         tempA4 +=4;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A1d1; i++){
        for (int e = 0; e < chr5.length; e++) {
        if (Answer1.charAt(i) == chr5[e])
     {
         tempA5 +=5;
         break;
     }   
    }
   }
     
      for (int i = 0; i < A1d1; i++){
        for (int f = 0; f < chr6.length; f++) {
        if (Answer1.charAt(i) == chr6[f])
     {
         tempA6 +=6;
         break;
     }   
    }
   }
      
      for (int i = 0; i < A1d1; i++){
        for (int g = 0; g < chr7.length; g++) {
        if (Answer1.charAt(i) == chr7[g])
     {
         tempA7 +=7;
         break;
     }   
    }
   }
      
       for (int i = 0; i < A1d1; i++){
        for (int h = 0; h < chr8.length; h++) {
        if (Answer1.charAt(i) == chr8[h])
     {
         tempA8 +=8;
         break;
     }   
    }
   }
       
        for (int i = 0; i < A1d1; i++){
        for (int k = 0; k < chr9.length; k++) {
        if (Answer1.charAt(i) == chr9[k])
     {
         tempA9 +=9;
         break;
     }   
    }
   }
     System.out.println("Values for the Answers 1's Digit 2");
     System.out.println("Values of 1: " +tempA);
     System.out.println("Values of 2: " +tempA2);
     System.out.println("Values of 3: " +tempA3);
     System.out.println("Values of 4: " +tempA4);
     System.out.println("Values of 5: " +tempA5);
     System.out.println("Values of 6: " +tempA6);
     System.out.println("Values of 7: " +tempA7);
     System.out.println("Values of 8: " +tempA8);
     System.out.println("Values of 9: " +tempA9);
     
     int Adigit2 = tempA + tempA2 + tempA3 + tempA4 + tempA5 + tempA6 + tempA7 + + tempA8 + tempA9;
     
     if (Adigit2 > 9){
         modAdigit2 = Adigit2 % 10;
         modAresult = (Adigit2/10) + modAdigit2;
         
     }
     if (Adigit2 < 9){
     Adigit3 = (Math.abs(A1d1 - Adigit2));
    }
     else
      Adigit3 = (Math.abs(A1d1 - modAresult));
     
     
     //For loop for Answer's 2 2nd digit A2d1
     for (int i = 0; i < A2d1; i++){
        for (int a = 0; a < chr1.length; a++) {
        if (Answer2.charAt(i) == chr1[a])
     {
         tempB++;
         break;
     }
    }
   }
     
     for (int i = 0; i < A2d1; i++){
        for (int b = 0; b < chr2.length; b++) {
        if (Answer2.charAt(i) == chr2[b])
     {
         tempB2 +=2;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A2d1; i++){
        for (int c = 0; c < chr3.length; c++) {
        if (Answer2.charAt(i) == chr3[c])
     {
         tempB3 +=3;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A2d1; i++){
        for (int d = 0; d < chr4.length; d++) {
        if (Answer2.charAt(i) == chr4[d])
     {
         tempB4 +=4;
         break;
     }   
    }
   }
     
     for (int i = 0; i < A2d1; i++){
        for (int e = 0; e < chr5.length; e++) {
        if (Answer2.charAt(i) == chr5[e])
     {
         tempB5 +=5;
         break;
     }   
    }
   }
     
      for (int i = 0; i < A2d1; i++){
        for (int f = 0; f < chr6.length; f++) {
        if (Answer2.charAt(i) == chr6[f])
     {
         tempB6 +=6;
         break;
     }   
    }
   }
      
      for (int i = 0; i < A2d1; i++){
        for (int g = 0; g < chr7.length; g++) {
        if (Answer2.charAt(i) == chr7[g])
     {
         tempB7 +=7;
         break;
     }   
    }
   }
      
       for (int i = 0; i < A2d1; i++){
        for (int h = 0; h < chr8.length; h++) {
        if (Answer2.charAt(i) == chr8[h])
     {
         tempB8 +=8;
         break;
     }   
    }
   }
       
        for (int i = 0; i < A2d1; i++){
        for (int k = 0; k < chr9.length; k++) {
        if (Answer2.charAt(i) == chr9[k])
     {
         tempB9 +=9;
         break;
     }   
    }
   }
     System.out.println("Values for the Answers 2's Digit 2");
     System.out.println("Values of 1: " +tempB);
     System.out.println("Values of 2: " +tempB2);
     System.out.println("Values of 3: " +tempB3);
     System.out.println("Values of 4: " +tempB4);
     System.out.println("Values of 5: " +tempB5);
     System.out.println("Values of 6: " +tempB6);
     System.out.println("Values of 7: " +tempB7);
     System.out.println("Values of 8: " +tempB8);
     System.out.println("Values of 9: " +tempB9);
     
     int Bdigit2 = tempB + tempB2 + tempB3 + tempB4 + tempB5 + tempB6 + tempB7 + + tempB8 + tempB9;
     
     if (Bdigit2 > 9){
         modBdigit2 = Bdigit2 % 10;
         modBresult = (Bdigit2/10) + modBdigit2;
          
     }
     if (Bdigit2 < 9){
     Bdigit3 = (Math.abs(A2d1 - Bdigit2));
    }
     else
      Bdigit3 = (Math.abs(A2d1 - modBresult));
     
     
     //Collecting Sum of question and 1st answer
     SumA3 = Adigit3 + Qdigit3;
     System.out.println("SumA3: " + SumA3);
     System.out.println("SumA3: " + Adigit3);
     System.out.println("SumA3: " + Qdigit3);
     if (SumA3 > 9){
         modSum3 = SumA3 % 10;
         System.out.println("modSum: " + modSum3);
         modSumA2 = SumA3/10;
        }
     
     if (Adigit2 > 9 && Qdigit2 > 9){
          System.out.println("SumA3: " + modAresult);
          System.out.println("SumA3: " + modresult);
          System.out.println("SumA3: " + modSumA2);
          System.out.println("SumA3: " + SumA3);
         SumA2 = modAresult + modresult + modSumA2;
         System.out.println("sum1stA " + SumA2);
     }
     else{
        SumA2 = Adigit2 + Qdigit2 + modSumA2; 
        System.out.println("sum2ndA " + SumA2);
     }
     
      if (SumA2 > 9){
         modSum2 = SumA2 % 10;
         System.out.println("modSum2: " + modSum2);
         modSumA1 = SumA2/10;
        }
     
     SumA1 = A1d1 + Qdigit1 + modSumA1;
     System.out.println("SumA1: " + SumA1);
     if (SumA1 > 9){
         modSum1 = SumA1 % 10;
         SumA1 = (SumA1/10) + modSum1;
         System.out.println("True Sum Digit 1: "+ SumA1); 
     }
     
     //Collecting Sum of question and 2nd answer
     SumB3 = Bdigit3 + Qdigit3;
     System.out.println("SumB3: " + SumB3);
     if (SumB3 > 9){
         modS3 = SumB3 % 10;
         System.out.println("modSum: " + modS3);
         modSumB2 = SumB3/10;
        }
     if (Adigit2 > 9 && Qdigit2 > 9){
          System.out.println("SumB3: " + modAresult);
          System.out.println("SumB3: " + modresult);
          System.out.println("SumB3: " + modSumA2);
          System.out.println("SumB3: " + SumA3);
         SumA2 = modBresult + modresult + modSumB2;
         System.out.println("sum1stB " + SumB2);
     }
     else{
        SumB2 = Bdigit2 + Qdigit2 + modSumB2; 
        System.out.println("sum2ndB " + SumB2);
     }
     SumB2 = Bdigit2 + Qdigit2 + modSumB2;
      if (SumB2 > 9){
         modS2 = SumB2 % 10;
         System.out.println("modSum: " + modS2);
         modSumB1 = SumB2/10;
        }
     
     SumB1 = A2d1 + Qdigit1 + modSumB1;
     if (SumB1 > 9){
         modS1 = SumB1 % 10;
         SumB1 = (SumB1/10) + modS1;
         System.out.println("True Sum Digit 1: "+ SumB1); 
     }
     
     if (Qdigit1 == SumA1 || Qdigit2 == SumA2 || Qdigit3 == SumA3 || A1d1 == SumA1 || Adigit2 == SumA2 ||Adigit3 == SumA3)
         System.out.println("Compatiable"); 
     else
         System.out.println("Not Compatiable"); 
     
     if (Qdigit1 == SumB1 || Qdigit2 == SumB2 || Qdigit3 == SumB3 || A2d1 == SumB1 || Bdigit2 == SumB2 || Bdigit3 == SumB3)
         System.out.println("Compatiable"); 
     else
         System.out.println("Not Compatiable"); 
     
    System.out.println("Question Digit 1: "+ Qdigit1); 
    System.out.println("Question Digit 2: "+ Qdigit2);
    System.out.println("Question Digit 3: "+ Qdigit3);
    System.out.println("Answer Digit 1: "+ A1d1); 
    System.out.println("Answer Digit 2: "+ Adigit2); 
    System.out.println("Answer Digit 3: "+ Adigit3);    
    System.out.println("Answer 2 Digit 1: "+ A2d1); 
    System.out.println("Answer 2 Digit 2: "+ Bdigit2); 
    System.out.println("Answer 2 Digit 3: "+ Bdigit3); 
    System.out.println("Question is: " + Question);
    System.out.println("1st Answer is: " + Answer1);
    System.out.println("2nd Answer is: " + Answer2);
     
    
    }
}
