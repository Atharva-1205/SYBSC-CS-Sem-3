def gcd(a,b):
    if(b==0):
        return a
    else:
        return gcd(b,a%b)
print("Find GCD of 2 numbers")
a=int(input("Enter 1st number:"))
b=int(input("Enter 2nd number:"))
GCD=gcd(a,b)
print("GCD of",a,"and",b,"is",GCD)