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
    reverse(){
        let temp = this.head
        this.head=this.tail
        this.tail=temp

        let next = temp.next
        let pre = null
        for(let i=0;i<this.length;i++){
            next=temp.next;
            temp.next = pre;
            pre=temp;
            temp=next
        }
        return this.head
    }
}
const Linkedlist= new SinglyLinkedList(10)
Linkedlist.push(20)
Linkedlist.push(30)
Linkedlist.push(40)
const Res=Linkedlist.reverse()
console.log(JSON.stringify(Res))