package com.utils;

 class Sum2NumbersInList {

	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		    ListNode dummyHead = new ListNode(0);
		    ListNode p = l1, q = l2, curr = dummyHead;
		    int carry = 0;
		    while (p != null || q != null) {
		        int x = (p != null) ? p.val : 0;
		        int y = (q != null) ? q.val : 0;
		        int sum = carry + x + y;
		        carry = sum / 10;
		        curr.next = new ListNode(sum % 10);
		        curr = curr.next;
		        if (p != null) p = p.next;
		        if (q != null) q = q.next;
		    }
		    if (carry > 0) {
		        curr.next = new ListNode(carry);
		    }
		    return dummyHead.next;
		} 
//	 
//    public static ListNode addTwoNumbersBruteForce(ListNode l1, ListNode l2) {
//    	
//    	int s1 = l1.val,
//    	s2 = l2.val;
//    	
//    	
//    	while (l1 != null || l2 != null){
//    		if (l1 != null) {
//    			s1 +=s1 + l1.val * 10;
//    			l1 = l1.next;
//    		
//    		}
//    		if (l2 != null) {
//    			s2+=s2 + l2.val * 10;
//    			l2 = l2.next;
//    		}
//    	}
//    	
//    	int sum = s1+s2;
//    	ListNode result = new ListNode(sum % 10);
//    	ListNode re = result;
//    	sum = sum / 10;
//    	do {
//        	ListNode res = new ListNode(sum % 10);
//        	re.next = res;
//        	re = re.next;
//    	}
//    	while (sum != 0);
//		return result;
//        
//    }
    
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode result = addTwoNumbers (l1, l2);
		System.out.println(result.val);

	}
 }
 

