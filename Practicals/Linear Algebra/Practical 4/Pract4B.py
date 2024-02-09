R = int(input("Enter the number of rows:"))
C = int(input("Enter the number of columns:"))
matrix = []
for i in range(R):
    a = []
    for j in range(C):
        a.append(int(input()))
    matrix.append(a)
for i in range(R):
        for j in range(C):
            print(matrix[i][j], end="")
        print()
print("Rows:")
for i in range(len(matrix)):
    print(matrix[i])
print("Cols")
col = []
for j in range(C):
    b = []
    for i in range(R):
        b.append(matrix[i][j])
    col.append(b)
    print(col)
Scalar = int(input("Enter the scalar to be multiplied"))
Sca = []
for i in range(R):
    m = []
    for j in range(C):
        C = Scalar*matrix[i][j]
        m.append(m)
    Sca.append(m)
print(Sca)
print("The transpose of the given matrix is:")
for i in range(C):
    for i in range(R):
        print(matrix[i][j], end="")
print()
