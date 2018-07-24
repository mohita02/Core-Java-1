# Strings Declaration

1.  `String str; // Declaration of a variable`
    `str = "Hello!"; // Defination of the variable`
    `String str = "Hello!"; // Declaration and Defination in the same line.`


2.  `String str = new String("Hello !"); // Declaration and Defination using new keyword.`
3.  `char ch[] = {'H','e','l','l','o'}; // Declation and Defination using a character array`
4.  `String str = new String(variable, start, length_of_string);`
    `E.g : String s = new String(ch,0,11);`
5.  `String s1 = "Hello !";`
    `String s2 = new String(s1);`

### Methods

1.  `str.length()` : This method is used to find the length of the given string.
2.  `str.charAt()` : This is used to find the character at a specific index. We pass the index inside the brackets.
3.  `str.equals(str1)` : This is used to check content of both the strings if they are equal.
    `s1 == s2` : This is used to check references of both. This is case sensitive also.
4.  `s1.equalsIgnoreCase(s2)` : This checks the contents of both the strings and ignores the case lower and upper cases of the strings and then compares them.
5.  `s1.startsWith('H')`
6.  `s1.endsWith('o')`
7.  `s1.indexOf('e')`
8.  `s1.lastIndexOf('l')`
9.  `s1.substring(0)`
    `s1.substring(0,5)`
10. `str.concat(str1)`
11. `str1.replace(str2)`
12. `str1.trim()`
13. `str1.toLowerCase()`
14. `str1.toUpperCase()` 