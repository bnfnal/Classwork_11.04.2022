# Classwork_11.04.2022

## **Task 1: Sum of Digits / Digital Root**

### **Class:** 
                DRoot
### **Function:**   
                int digital_root(int n) 

### **Task:**

Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. 
The input will be a non-negative integer.

### **Examples:**


        16  -->  1 + 6 = 7
       942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
    493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2


### **Favorite solution:**


    public class DRoot 
    {
       public static int digital_root(int n) 
       {
          while(n > 9)
          {
          n = n/10 + n % 10;
          }
       return(n);
       }
    }
    


## **Task 2: Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!**

### **Class:** 
                SumDigPower
### **Function:**   
                sumDigPow(long a, long b)  

### **Task:**

The number 89 is the first integer with more than one digit that fulfills the property partially introduced in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.
In effect: 89 = 8^1 + 9^2
The next number in having this property is 135.
See this property again: 135 = 1^1 + 3^2 + 5^3
We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b] (inclusive) 
and outputs a list of the sorted numbers in the range that fulfills the property described above.

### **Examples:**


    sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
    sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
    sum_dig_pow(90, 100) == []


### **Favorite solution:**


    class SumDigPower 
    {
      public static List<Long> sumDigPow(long a, long b) 
      {
         List<Long> res = new ArrayList<>();
         List<Long> single = Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 89L, 135L, 175L, 518L, 598L, 1306L, 1676L, 2427L, 2646798L);
         for (long d : single) 
         {
             if (d >= a && d <= b) 
             {
                 res.add(d);
              }
         }
         return res;
       }
    }
    

## **Task 3: Multiples of 3 or 5**

### **Class:** 
                Solution
### **Function:**   
                solution(int number)  

### **Task:**

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
Note: If the number is a multiple of both 3 and 5, only count it once.
Courtesy of projecteuler.net (Problem 1)

### **Favorite solution:**


    public class Solution 
    {
       public int solution(int number) 
       {
          int sum=0;
          for (int i=0; i < number; i++)
          {
              if (i%3==0 || i%5==0){sum+=i;}
           }
          return sum;
       }
    }
    
    
