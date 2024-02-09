import numpy as np
R=int(input("Enter number of rows:"))
C=int(input("Enter number of columns:"))
matrix=[]
for i in range(R):
    a=[]
    for j in range(C):
        a.append(int(input()))
    matrix.append(a)
for i in range(R):
    for j in range(C):
        print(matrix[i][j],end=" ")
    print()
print("Rows:")
for i in range(len(matrix)):
    print(matrix[i])
print("Cols:")
col=[]
for j in range(C):
    b=[]
    for i in range(R):
        b.append(matrix[i][j])
        col.append(b)
print(col)
w,v=np.linalg.eig(matrix)
print("Printing the eigen value of the given square array: \n",w)
print("Printing the eigen vector of the given square array: \n",v)
