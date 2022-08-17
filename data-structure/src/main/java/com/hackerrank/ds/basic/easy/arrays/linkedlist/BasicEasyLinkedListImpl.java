package com.hackerrank.ds.basic.easy.arrays.linkedlist;

public class BasicEasyLinkedListImpl implements IBasicEasyLinkedlist {

	/* Create link list */
	public LNode createList(int a[]) {
		LNode head = null;
		LNode tail = null;
		for (int i = 0; i < a.length; i++) {
			if (head == null)
				tail = head = new LNode(a[i]);
			else {
				tail.next = new LNode(a[i]);
				tail = tail.next;
			}
		}
		return head;
	}

	/* Print the Elements of a Linked List */
	@Override
	public void printLinkedList(LNode head) {

		while (head != null) {
			System.out.println(head.d);
			head = head.next;
		}
	}

	/* Insert a node at the head of a linked list */
	@Override
	public LNode insertNodeAtHead(LNode llist, int data) {

		LNode newHead = new LNode(data);
		newHead.next = llist;
		return newHead;
	}

	/* Delete a Node */
	@Override
	public LNode deleteNode(LNode llist, int position) {
		LNode x = llist;
		if (position == 0) {
			LNode t = llist;
			llist = llist.next;
			t.next = null;
			t = null;
			return llist;
		}
		for (int i = 1; i < position; x = x.next, i++)
			;
		LNode y = x.next;
		x.next = y.next;
		y.next = null;
		y = null;
		return llist;
	}

	/* Print in Reverse */
	@Override
	public void reversePrint(LNode llist) {
		if (llist == null)
			return;
		else
			reversePrint(llist.next);
		System.out.println(llist.d);
	}

	/* Compare two linked lists */
	@Override
	public boolean compareLists(LNode head1, LNode head2) {

		LNode h1 = head1;
		LNode h2 = head2;
		while (h1 != null && h2 != null) {
			if (h1.d != h2.d)
				return false;
			h1 = h1.next;
			h2 = h2.next;
		}
		return h1 == null && h2 == null;
	}

	/* Get Node Value */
	@Override
	public int getNode(LNode llist, int positionFromTail) {
		LNode x = llist;
		int len = 0;
		while (x != null) {
			len++;
			x = x.next;
		}
		LNode y = llist;
		for (int i = 1; i < len - positionFromTail; y = y.next, i++)
			;
		return y.d;
	}

	/* Find Merge Point of Two Lists */
	@Override
	public int findMergeNode(LNode head1, LNode head2) {
		LNode x = head1;
		LNode y = head2;
		int diff;
		int d1 = 0;
		int d2 = 0;
		while (x != null) {
			d1++;
			x = x.next;
		}
		while (y != null) {
			d2++;
			y = y.next;
		}
		x = head1;
		y = head2;
		if (d1 > d2) {
			diff = d1 - d2;
			while (diff-- != 0)
				x = x.next;
		} else if (d2 > d1) {
			diff = d2 - d1;
			while (diff-- != 0)
				y = y.next;
		}
		while (x!= y) {
			x = x.next;
			y = y.next;
		}
		return x.d;
	}
}
