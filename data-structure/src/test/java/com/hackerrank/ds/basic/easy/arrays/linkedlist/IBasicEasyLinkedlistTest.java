package com.hackerrank.ds.basic.easy.arrays.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IBasicEasyLinkedlistTest {

	private IBasicEasyLinkedlist ibel = null;

	@Before
	public void init() {
		ibel = new BasicEasyLinkedListImpl();
	}

	/* Print the Elements of a Linked List */
	@Test
	public void printLinkedListTest() {
		int a[] = { 1, 2, 3, 4, 5 };
		ibel.printLinkedList(ibel.createList(a));
	}

	/* Insert a node at the head of a linked list */
	@Test
	public void insertNodeAtHeadTest() {
		LNode n1 = ibel.insertNodeAtHead(null, 1);
		LNode n2 = ibel.insertNodeAtHead(n1, 2);
		LNode n3 = ibel.insertNodeAtHead(n2, 3);
		LNode n4 = ibel.insertNodeAtHead(n3, 4);
		LNode n5 = ibel.insertNodeAtHead(n4, 5);
		ibel.printLinkedList(n5);

	}

	/* Delete a Node */
	@Test
	public void deleteNodeTest() {
		int a[] = { 1, 2, 3, 4, 5 };
		LNode head = ibel.deleteNode(ibel.createList(a), 0);
		ibel.printLinkedList(head);
	}

	/* Print in Reverse */
	@Test
	public void reversePrintTest() {
		int a[] = { 1, 2, 3, 4, 5 };
		ibel.reversePrint(ibel.createList(a));
	}

	/* Compare two linked lists */
	@Test
	public void compareListsTest() {
		int a[] = { 1, 2, 3, 4, 5 };
		Assert.assertTrue(ibel.compareLists(ibel.createList(a), ibel.createList(a)) == true);

	}

	/* Get Node Value */
	@Test
	public void getNodeTest() {
		int a[] = { 1, 2, 3, 4, 5 };
		Assert.assertTrue(ibel.getNode(ibel.createList(a), 0) == 5);
	}

	/* Find Merge Point of Two Lists */
	@Test
	public void findMergeNodeTest() {
		int a[] = { 1, 2, 3, 4, 9, 7, 8 };
		int b[] = { 5, 6 };
		LNode head1 = ibel.createList(a);
		LNode head2 = ibel.createList(b);
		head2.next.next = head1.next.next.next.next;

		Assert.assertTrue(ibel.findMergeNode(head1, head2) == 9);
	}
}
