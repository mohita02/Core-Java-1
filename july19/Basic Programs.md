# Basic Java Programs

## 1. *Lift Problem* 

Sita gets into a lift in the ground floor. The lift that Sita gets in does not stop in all floors. 
It stops in only 3 floors numbered n1, n2 and n3. She wants to get down in the floor that is closest to n. If there are 2 choices, she always prefers to climb down the stairs rather than climbing up. Help Sita in deciding the floor she should get down from the lift.
**Input Format:**
Input consists of 4 integers corresponding to n, n1, n2 and n3.  [n1<n2<n3]
**Output Format:**
Output consists of an integer that corresponds to the floor number where she would get down.
Refer sample input and output for formatting specifications.
```
Sample Input 1:
10
4
8
15
Sample Output 1:
8
Sample Input 2:
10
4
8
12
Sample Output 2:
12
```
## 2. *Letter based Gifts Selection*

**Question**
In the gifts store, Sita finds a lot of fancy articles with letters inscribed in it. She decides to select gifts to her friends such that the first letter of their names are inscribed in the gift articles. There is a hifi-scanner  device in the gifts shop that would illumninate the articles that contain the letters fed as input. There is another interfacing device that would pick the 1st letters of all names entered by the user. Suddenly the device started malfunctioning and Gita, the owner of the shop was very tensed. Sita is a very close friend of Gita and she offers to help her in fixing this issue.
She starts rewriting the program to be embedded in the scanner like device. Can you help her out?
**Input Format:**
Input consists of 3 strings and a character. The 3 strings correspond to the names of 3 friends and the character corresponds to the letter inscribed on the gift item.
**Output Format:**
Output consists of the string 'yes' or 'no'. Output is yes when the letter in the gift item is the same as that of one of her friends. Otherwise it is no.
Assume that the input consists of only upper case letters and it is not more than 20 characters long.
```
Sample Input 1:
MAHIRL
CHITRA
DEVI
C
Sample Output 1:
yes
Sample Input 2:
MAHIRL
CHITRA
DEVI
A
Sample Output 2:
no
```

## 3. *Card Game - I*
**Question**
Patrick and Johnny started to play a new game which is played with cards. Johnny decided to play card game �I. In this game, he has to pick one card. The number present in the card will determine whether he will be a winner or not.  In the game conducted during the past 3 years, the winner card numbers were 7126, 82417914, 7687 and 6657. Johnny is an expert in data mining and he could easily infer a pattern in the winner card numbers. In the entire card numbers listed here, the sum of the odd numbers is equal to the sum of the even numbers.
So write a C program to help Johnny to be a winner using for loop.

**Input Format:**
Input consists of a single integer.
**Output Format:**
Output consists of a single line. Refer sample output for details.

 [All text in bold corresponds to input and the rest corresponds to output]
```
Sample Input and Output 1:
Enter the card picked up by Johnny:
143
Johnny will win the Card Game
 
Sample Input and Output 2:
Enter the card picked up by Johnny:
344
Johnny will not win the Card Game
```

## 4. *TARGET PRACTICE*

**Question** 
Patrick and Johnny started to play a new game. The game contains a board which consists of concentric circles. When Patrick correctly hits the center of the concentric circles, his score is equal to target score. The score gets reduced depending on where the players hit on the board. When the players hits outside the board, his score is 0. Johnny will not allow Patrick to have his food unless he reach the target score.
The players may take more turns to reach the target score.

Can you write a program to determine the number of turns a player takes to reach the target score of �n� using for loop?

**Input Format:**
Input consists of a list of positive integers. The first integer corresponds to the target score 'n'. Assume that all the other integers input are less than or equal to n.

**Output Format:**
Output consists of a single line. Refer sample output for format details.
[All text in bold corresponds to input and the rest corresponds to output.]
```
Sample Input and Output1:
Enter the target score:
100
Enter the scores taken by Patrick in each turn:
4
40
60
The number of turns is 3
 
Sample Input and Output 2:
Enter the target score:
1000
Enter the scores taken by Patrick in each turn:
1000
The number of turns is 1
```