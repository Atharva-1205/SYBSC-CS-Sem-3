def dotProduct(b,v):
    pro=0
    for i in range(len(b)):
        s=b[i]*v[i]
        pro=pro+s
    return pro
b=[]
v=[]
n=int(input("How many elements you want?:"))
print("Enter ",n,"values for b:")
for i in range (n):
    l=int(input())
    b.append(l)
print("Enter ",n,"values for v:")  
for i in range(n):
    m=int(input())
    v.append(m)
print("b:",b)
print("v:",v)
pro=dotProduct(b,v)/dotProduct(v,v)
new=[]
for i in range(len(v)):
    new.append(v[i]*pro)
print("Projection of vector:",new)
