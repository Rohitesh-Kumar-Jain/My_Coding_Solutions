/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* head=NULL;
        ListNode* cur;
        int carry=0;
        
        if(l1==NULL || (l1->val==0 && l1->next==NULL)) return l2;
        if(l2==NULL || (l2->val==0 && l2->next==NULL)) return l1;
        
        while(l1!=NULL || l2!=NULL){
            
            if(l1==NULL){
                ListNode* temp= new ListNode();
                temp->val= l2->val + carry;
                carry= (temp->val >9)? 1:0;
                temp->val=(temp->val)%10;
                cur->next=temp;
                cur=temp;
                l2=l2->next; 
                
                if(l1==NULL && l2==NULL && carry==1){
                ListNode* temp= new ListNode();
                temp->val=1;
                cur->next=temp;
                cur=temp;
                }
                continue;
            }
            
            if(l2==NULL){
                ListNode* temp= new ListNode();
                temp->val= l1->val + carry;
                carry= (temp->val >9)? 1:0;
                temp->val=(temp->val)%10;
                cur->next=temp;
                cur=temp;
                l1=l1->next;
                
                if(l1==NULL && l2==NULL && carry==1){
                ListNode* temp= new ListNode();
                temp->val=1;
                cur->next=temp;
                cur=temp;
                }
                
                continue;
            }
             
            ListNode* temp= new ListNode();
            temp->val= l1->val + l2->val + carry;
            carry= (temp->val > 9)? 1:0;
            temp->val= (temp->val)%10;
            
            if(head==NULL){
                head=temp;
                cur=head;
            }
            else{
                cur->next= temp;
                cur=temp;
            }
            l1=l1->next;
            l2=l2->next;
            if(l1==NULL && l2==NULL && carry==1){
                ListNode* temp= new ListNode();
                temp->val=1;
                cur->next=temp;
                cur=temp;
            }
        }
        return head;
    }
};