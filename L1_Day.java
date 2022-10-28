public class L1_Day{

    // ListNode class
    public class ListNode {
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
    }

    public class LinkedList{
       ListNode head;
       ListNode tail;
       int size;

       // addLast T: O(1), S:O(1)
       void addLast(int data){
           ListNode node=new ListNode(data);
           if(this.head==null){
              this.head=this.tail=node;
           } else{
             this.tail.next=node;
             this.tail=node;
           }
           this.size++;
       }

       // display T: O(N), S:O(1)
       void display(LinkedList head){
         ListNode curr=this.head;
         while(curr != null){
            System.out.println(curr.val +" ");
            curr=curr.next;
         }
       }

      // T:O(1), S:(1)    
       void removeFirst(){
          if(this.size==0){
            System.out.println("List is empty");
            return;
          }

          ListNode newHead=head.next;
          head.next=null;
          this.head=newHead;
          this.size--;

          if(this.size==0){  // list size=1
            this.head=this.tail=null;
          }
       }




       // HOMEWORK
       public int getFirst(){
        
      }
  
      public int getLast(){
        
      }
  
      public int getAt(int idx){
        
      }
    }


    public static void main(String[] args){

        LinkedList mylist=new LinkedList();
        mylist.addLast(10);

        mylist.addLast(20);
        mylist.addLast(30);
        mylist.addLast(40);

    }
}