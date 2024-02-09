class Node:
    def __init__(self,my_data):
        self.prev=None
        self.data=my_data
        self.next=None
class double_list:
    def __init__(self):
        self.head=None
        self.tail=None
    def add_data(self,my_data):
        new_node=Node(my_data)
        if(self.head==None):
            self.head=self.tail=new_node;
            self.head.previous=None;
            self.tail.next=None;
        else:
            self.tail.next=new_node;
            new_node.previous=self.tail;
            self.tail=new_node;
            self.tail.next=None;
    def print_it(self):
        curr = self.head
        if(self.head==None):
            print("The list is empty")
            return
        print("The node in the doubly linked list are :")
        while curr !=None:
            print(curr.data)
            curr=curr.next
my_instance=double_list()
print("Elements are being added to the doubly linked list")
my_instance.add_data(10)
my_instance.add_data(24)
my_instance.add_data(54)
my_instance.add_data(77)
my_instance.add_data(92)
my_instance.print_it()
