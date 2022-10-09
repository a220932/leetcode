/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


int count = 0;
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* l3;
    l3 = (struct ListNode *)malloc(sizeof(struct ListNode));
    
    if(l1 == NULL && l2 == NULL && count == 0)return NULL;
    if(l1 != NULL){
        count += l1->val;
        l1 = l1->next;
    }
    if(l2 != NULL){
        count += l2->val;
        l2 = l2->next;
    }
    
    l3->val = count%10;
    count/=10;
    
    l3->next = addTwoNumbers(l1, l2);
    return l3;
}
