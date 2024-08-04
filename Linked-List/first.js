class Node{
    constructor(val){
        this.val= val;
        this.next= null;
    }
}
class SinglyLinkedlist{
    constructor(val){
        const newNode = new Node(val)
        this.head= newNode;
        this.tail=this.head;
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
    pop(){
        if(!this.head)undefined
        let temp = this.head;
        pre = this. head;
        while(temp.next){
            pre=temp;
            temp=temp.next;
        }
        this.tail=pre;
        this.tail.next=null;
        this.length = this.length-1;
        if(this.length == 0){
            this.head=null
            this.tail=null
        }
        return this; 

    }
    shift(){
        if(!this.head)undefined
        let temp = this.head
        this.head= this.head.next;
        temp.next=null
        this.length--;
        if(this.length==0){
            this.head=null;
            this.head=null;
        }
        console.log(JSON.stringify(this.head) )
        return this;
        
    }
    get(idx){
        if(idx<0 || idx>=this.length){
            return undefined;
        }
        let temp=this.head;
        for(let i=0; i<idx;i++){
            temp = temp.next 
        }
        return temp;
    }
    set(idx,val){
        let temp=this.get(idx)
        if(temp){
            temp.value=val;
            return true
        }
        return false

    }
    insert(idx,val){
        if(idx===0) return this.unshift(val)
        if(idx===this.length) return this.shift(val)
        const newNode = new Node(val)
        const temp = this.get(idx-1);
        
        newNode.next = temp.next.next
        temp.next=newNode
        this.length++
    }
    remove(idx){
        if(idx===0) return this.shift()
        if(idx === this.length-1) return this.pop()
        const before = this.get(idx-1)
        const temp= before.next
        before.next=temp.next;
        temp.next=null;
        this.length--
        return temp;
    }
    reverse(){
        let temp = this.head
        this.head=this.tail
        this.tail=temp
        let next=temp.next
        let pre=null

        for(let i=0;i<this.length;i++){
           next =  temp.next
           temp.next=pre
           pre=temp
           temp=next
        }
    }
    middleEle(){
        let slow = this.head
        let fast = this.head
        while(fast && fast.next){
            slow=slow.next
            fast= fast.next.next
        }
        return slow
    }
}
const Linkedlist = new SinglyLinkedlist(20)
// console.log(JSON.stringify(Linkedlist));
const SecondNode = Linkedlist.push(30);
Linkedlist.push(40)
Linkedlist.push(50)
Linkedlist.push(60)
Linkedlist.push(70)


// Linkedlist.shift()
// Linkedlist.shift()
// Linkedlist.insert(3, 100)
Linkedlist.remove(1)

// console.log(shift)
const middle = Linkedlist.middleEle()
console.log("middleElement")
console.log( JSON.stringify(middle))
console.log(JSON.stringify(Linkedlist));