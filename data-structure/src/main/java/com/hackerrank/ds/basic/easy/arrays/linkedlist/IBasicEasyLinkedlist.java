package com.hackerrank.ds.basic.easy.arrays.linkedlist;

public interface IBasicEasyLinkedlist {

	/* Create link list */
	public LNode createList(int a[]);

	/* Print the Elements of a Linked List */
	public void printLinkedList(LNode head);

	/* Insert a node at the head of a linked list */
	public LNode insertNodeAtHead(LNode llist, int data);

	/* Delete a Node */
	public LNode deleteNode(LNode llist, int position);

	/* Print in Reverse */
	public void reversePrint(LNode llist);

	/* Compare two linked lists */
	public boolean compareLists(LNode head1, LNode head2);

	/* Get Node Value */
	public int getNode(LNode llist, int positionFromTail);

	/* Find Merge Point of Two Lists */
	public int findMergeNode(LNode head1, LNode head2);
}