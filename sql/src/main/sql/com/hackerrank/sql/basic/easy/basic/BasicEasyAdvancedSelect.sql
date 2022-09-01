/*Type of Triangle*/
/*Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. Output one of the following statements for each record in the table:

Equilateral: It's a triangle with  sides of equal length.
Isosceles: It's a triangle with  sides of equal length.
Scalene: It's a triangle with  sides of differing lengths.
Not A Triangle: The given values of A, B, and C don't form a triangle.
*/


select case
        when A+B<=C or B+C<=A or A+C<=B THEN 'Not A Triangle'
        when A=B and B=C and C=A THEN 'Equilateral'
        when A<>B and B<>C and C<>A then 'Scalene'
        else 'Isosceles'
        end
from triangles;