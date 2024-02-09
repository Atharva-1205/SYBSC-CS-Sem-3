import numpy as ny
r=int(input("Enter no of rows:"))
c=int(input("Enter no of columns:"))
print("Enter",r*c,"elements of matrix:")
A=[[int(input())for j in range(c)]for i in range(r)]
a=ny.matrix(A)
print("Matrix A: \n",a)
d=ny.linalg.det(a)
print("Determinant of A:",d)
if d==0:
    print("Matrix is not invertible")
else:
    inv=a.getI()
    print("Inverse of matrix A: \n",inv)