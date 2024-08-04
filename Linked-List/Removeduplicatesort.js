class Node{
    constructor(val){
        this.val= val
        this.next=null
    }
}

class SinglyLinkedList{
    constructor(val){
        const newNode = new Node(val)
        this.head= newNode
        this.tail= newNode
        this.length=1;
    }
    push(val){
        const newNode = new Node(val);
        if(!this.head){
            this.head= newNode;
            this.tail = this.head;
            this.length=1;
        }else{
            
            this.tail.next= newNode
            this.tail= newNode;
            this.length++;
        }
        return this;
    }
    remove(){
        let temp= this.head;
        
        while(temp.next!=null && temp!=null){
            if(temp.val===temp.next.val){
                
                temp.next=temp.next.next
                this.length--
            }else{
                temp=temp.next
            }
        }
        
        
    }

    
}

const Linkedlist= new SinglyLinkedList(10)
Linkedlist.push(10)
Linkedlist.push(20)
Linkedlist.push(30)
Linkedlist.push(30)
Linkedlist.push(40)
Linkedlist.remove()
console.log(JSON.stringify(Linkedlist))
