# a single node of a singly linked list
class Node:
    #constructer
    def __init__ (self,data = None,next=None):
        self.data = data
        self.next = next
# A LINKED LIST CLASS WITH A SINGLE HEAD NODE
class LinkedList:
    def __init__ (self):
        self.head = None
# INSERTION METHOD FOR THE LINKED LIST
    def insert(self,data):
        newNode = Node(data)
        if(self.head):
            current = self.head
            while(current.next):
                current =  current.next
            current.next = newNode
        else:
            self.head = newNode
# PRINT METHOD FOR LINKED LIST
    def printLL(self):
        current = self.head
        while(current):
            print( current.data)
            current =  current.next
# SINGLY LINKED LIST WITH INSERTION AND PRINT METHODS
LL = LinkedList()
LL.insert(3)
LL.insert(4)
LL.insert(5)
LL.printLL()
