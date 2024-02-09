u=[]
v=[]
au=[]
bv=[]
final=[]
n1=int(input("Enter the no of elements to be entered in both u and v:"))
for i in range(n1):
    ele=int(input("Enter the element for u:"))
    u.append(ele)
for i in range(n1):
    ele=int(input("Enter the element for v:"))
    v.append(ele)
print("Elements of vector u \n",u)
print("Elements of vector v \n",v)
print("Menu")
print("1.vector addition")
print("2.Dot Product")
print("3.Exit")
while(True):
    choice=int(input("Enter the operation you want to perform"))
    if(choice==1):
        a=int(input("Enter the element for a:"))
        b=int(input("Enter the element for b:"))
        for i in range(len(u)):
            mul=a*u[i]
            au.append(mul)
        print("Scalar multiplication of vector u with a:  \n",au)
        for i in range(len(v)):
            mul=b*v[i]
            bv.append(mul)
        print("Scalar multiplication of vector v with b:  \n",bv)
        for i in range(len(u)):
            sum=au[i]+bv[i]
            final.append(sum)
        print("Vector addition of au and bv: \n",final)
    elif(choice==2):
        p=[]
        for i in range(len(u)):
            mul=u[i]*v[i]
            p.append(mul)
        print("Vector multiplication of u and v: \n",p)
        dot=0
        for i in range(len(p)):
            dot=dot+p[i]
        print("dot product if u and v:",dot)
    elif(choice==3):
        break
    else:
        print("Incorrect Input")
