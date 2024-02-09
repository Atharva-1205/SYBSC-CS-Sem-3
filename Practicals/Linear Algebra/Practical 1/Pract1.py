import sys
import matplotlib.pyplot as plt
S={2+3j}
print("Menu")
print("1.Addition of complex number")
print("2.Conjugate of complex number")
print("3.Plotting a complex number")
print("4.Translating a complex number")
print("5.Exit")
c="yes"
while(c=="yes"):
    choice=int(input("Enter the operation you want to perform: "))
    if choice==1:
        a=complex(input("Enter 1st no.: "))
        b=complex(input("Enter 2nd no.: "))
        add=a+b
        print("Addition: ",add)
    elif choice==2:
        n=complex(input("Enter the complex number to find conjugate: "))
        print("Conjugate: ",n.conjugate())
    elif choice==3:
        X=[x.real for x in S]
        Y=[x.imag for x in S]
        plt.plot(X,Y,"ro")
        plt.xlabel("Real axis")
        plt.ylabel("Imaginary axis")
        plt.title("Plotting a complex number")
        plt.show()
    elif choice==4:
        t=complex(input("Enter complex number: "))
        plot=[x+t for x in S]
        print(plot)
        X=[x.real for x in plot]
        Y=[x.imag for x in plot]
        plt.scatter(X,Y,label="Star",marker="*",color="green",s=30)
        plt.xlabel("Real axis")
        plt.ylabel("Imaginary axis")
        plt.title("Translating a complex number")
        plt.show()
    elif choice==5:
        sys.exit()
    else:
        print("Incorrect input")
