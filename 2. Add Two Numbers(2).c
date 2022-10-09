/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    int counter = 0, counter1 = 0, counter2 = 0;
    struct ListNode *l3;
    l3 = (struct ListNode *)malloc(sizeof(struct ListNode));
    memcpy(&l3, &l1, sizeof(l3));
    while(l3 != NULL){
        l3 = l3->next;
        counter1++;
    }
    memcpy(&l3, &l2, sizeof(l3));
    while(l3 != NULL){
        l3 = l3->next;
        counter2++;
    }


    int n;

    struct ListNode* l4;
    l4 = (struct ListNode *)malloc(sizeof(struct ListNode));
    memcpy(&l3, &l4, sizeof(l3));
    if(counter1>=counter2){
        while(l1 != NULL || l2 != NULL || counter == 1){
            n = counter;
            if(l2 != NULL){
                n = l1->val + l2->val + counter;
                l2 = l2->next;
            }
            else
                if(l1 != NULL)n = l1->val + counter;
                
            if(l1 != NULL)l1 = l1->next;
            counter = n/10;
            l4->val = n%10;
            
            if(l1 == NULL && l2 == NULL && counter == 0)break;
            l4->next = (struct ListNode *)malloc(sizeof(struct ListNode));
            l4 = l4->next;
        }
    }
    if(counter1<counter2){
        while(l1 != NULL || l2 != NULL || counter == 1){
            n = counter;
            if(l1 != NULL){
                n = l1->val + l2->val + counter;
                l1 = l1->next;
            }
             else
                if(l2 != NULL)n = l2->val + counter;
                
            if(l2 != NULL)l2 = l2->next;
            counter = n/10;
            l4->val = n%10;
            
            if(l1 == NULL && l2 == NULL && counter == 0)break;
            l4->next = (struct ListNode *)malloc(sizeof(struct ListNode));
            l4 = l4->next;
        }

    }
    l4->next = NULL;
    return l3;
}
